
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VendorTransData extends JFrame {

	private JPanel contentPane;
	private JTable table;

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
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 74, 444, 198);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setColumnHeaderView(table);
		ArrayList<String> temp = new ArrayList<>();
		String[][] ACdata;
		String [] header= {"transactionID","cost","DATE","cardNumber","paidTo"};
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 System.out.println(4);
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/creditCard?userTimezone=true&serverTimezone=UTC","root","chuhui1026");
		  Statement statement =con.createStatement();
		  System.out.println(2);
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
		  table = new AlterColor_JTable(ACdata, header);
			table.setGridColor(Color.WHITE);
			table.setColumnSelectionAllowed(true);
			table.setBorder(null);
			table.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
			table.setEnabled(false);
			table.setFocusable(false);
			table.setRowSelectionAllowed(false);
			scrollPane.setViewportView(table);
			table.setFont(new Font("Arial", Font.PLAIN, 17));
			
			JLabel lblNewLabel = new JLabel("Record");
			lblNewLabel.setBounds(171, 17, 107, 16);
			contentPane.add(lblNewLabel);
			
			JButton btnNewButton = new JButton("Back");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					VendorTransMenu next = new VendorTransMenu();
					next.setVisible(true);
					dispose();
				}
			});
			btnNewButton.setBounds(325, 12, 87, 29);
			contentPane.add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("Home");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Index_View next = new Index_View();
					next.frame.setVisible(true);
					dispose();
				}
			});
			btnNewButton_1.setBounds(325, 46, 87, 29);
			contentPane.add(btnNewButton_1);
		  
	}
}
