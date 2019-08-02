package project2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class vendor {
	public static void main(String[]args) throws SQLException, ClassNotFoundException {
	
	}
  public int charge(String cardNumber,double amount,String shopName) throws SQLException, ClassNotFoundException {
	  Calendar today = Calendar.getInstance();
	  SimpleDateFormat convert=new SimpleDateFormat("yyyy-mm-dd hh-mm-ss");
	  String  edate;
	  Calendar exdate =  Calendar.getInstance();
	  double availableBalance;
	  double newBalance;
	 try { 
		 Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/creditCard?userTimezone=true&serverTimezone=UTC","root","chuhui1026");
	  Statement statement =con.createStatement();
	  ResultSet data = statement.executeQuery("SELECT expireDate,remainCredit FROM credit_cards WHERE cardNumber='"+cardNumber+"'");
	  data.next();
	  edate=data.getString("expireDate");
	 exdate.set(Integer.parseInt(edate.substring(0,4)),Integer.parseInt(edate.substring(5, 7))-1
			 ,Integer.parseInt(edate.substring(8,10)));
	 if(today.before(exdate)) {
	  availableBalance=Double.parseDouble(data.getString("remainCredit"));
		  if(availableBalance<amount) {
			  return -1;
		  }
		  else {
			  newBalance=availableBalance-amount;
			  statement.executeUpdate("UPDATE credit_cards set remainCredit = '"+ newBalance+"' WHERE cardNumber='"+cardNumber+"'");
			  statement.executeUpdate("INSERT INTO transaction (`cost`,`cardNumber`,`paidTo`) Values( '" +amount+  "' , '"+cardNumber+"' , '"+shopName+"' )");
			  return  1;
		  }
	  }
	 else {
		 return -2;
	 }
	 }
  catch(Exception e) {
	  e.printStackTrace();;
  	}
	return 0;
}
  public boolean check(String cardNumber,String lastName,String firstName,String security) throws SQLException, ClassNotFoundException {
	 try { 
		 String id;
		 Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/creditCard?userTimezone=true&serverTimezone=UTC","root","chuhui1026");
	  Statement statement =con.createStatement();
	  
	  ResultSet data = statement.executeQuery("SELECT id from users WHERE firstName= '"+firstName+"' AND lastName='"+lastName+"'");
	  if(!data.next())
		  return false;
	  else {
		  id=data.getString("id");
		  data=	statement.executeQuery("SELECT cardNumber,securityCode FROM credit_cards WHERE cardHolder='"+id+"'");
	      while(data.next()) {
	    	  if(data.getString("cardNumber").equals(cardNumber)&&data.getString("securityCode").equals(security))
	    		  return true;
	    	  return false;
	  	}
	 }
	 }
  catch(Exception e) {
	  e.printStackTrace();;
	  return false;
  	}
	return false;
  }
}