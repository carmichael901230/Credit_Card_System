
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VendorTransData extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public VendorTransData(String shopName) throws ClassNotFoundException, SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		ArrayList<String> temp = new ArrayList<>();
		String[][] ACdata;
		String [] header= {"transactionID","cost","DATE","cardNumber","paidTo"};
		 Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/creditCard?userTimezone=true&serverTimezone=UTC","root","chuhui1026");
		  Statement statement =con.createStatement();
		  ResultSet data=statement.executeQuery("SELECT * FROM transaction WHERE paidTo ='"+ shopName +"' ");
		  while(data.next()) {
			  temp.add(data.getString("paidTo"));
		  }
		  ACdata=new String[temp.size()][5];
		  int i=0;
		  data=statement.executeQuery("SELECT * FROM transaction WHERE paidTo ='"+ shopName +"' ");
		  while(data.next()) {
			  ACdata[i][0]=data.getString("transactionID");
			  ACdata[i][1]=data.getString("cost");
			  ACdata[i][2]=data.getString("DATE");
			  ACdata[i][3]=data.getString("cardNumber");
			  ACdata[i][4]=data.getString("paidTo");
			  i++;
		  }
		  
	}

}
