package project2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class CheckOut extends vendor {
  public double cost[];
  public int amount[];
  public double realCost=0;
  String shopName;
  private Calendar s;
  public String firstName;
  public String lastName;
  public String security;
  public String cardNumber;
  public String output="";
  public JLabel outPut;
  
	public JFrame frame;
	private JTextField FN;
	private JTextField LN;
	private JTextField CN;
	private JTextField SC;

	/**
	 * Launch the application.
	 */
	public CheckOut(double cost[],int[] amount,String shopName,Calendar x) {
		this.cost=cost;
		this.amount=amount;
		this.shopName=shopName;
		s=x;
		for(int i=0;i<cost.length;i++)
		   realCost+=cost[i]*amount[i];
		initialize();
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckOut window = new CheckOut();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CheckOut() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 367);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCardNumber = new JLabel("Card Number");
		lblCardNumber.setBounds(57, 186, 91, 16);
		frame.getContentPane().add(lblCardNumber);
		
		JLabel lblBalance = new JLabel("Balance:");
		lblBalance.setBounds(57, 65, 61, 16);
		frame.getContentPane().add(lblBalance);
		
		JLabel lblSecuritCode = new JLabel("Security Code");
		lblSecuritCode.setBounds(57, 219, 91, 16);
		frame.getContentPane().add(lblSecuritCode);
		
		FN = new JTextField();
		FN.setBounds(170, 100, 169, 26);
		frame.getContentPane().add(FN);
		FN.setColumns(10);
		
		LN = new JTextField();
		LN.setBounds(168, 143, 130, 26);
		frame.getContentPane().add(LN);
		LN.setColumns(10);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(shopName.contains("banana")) {
					bananabee next= new bananabee(amount,s);
					next.frame.setVisible(true);
					frame.dispose();
					}
					if(shopName.contains("valmart")) {
						valmart next= new valmart(amount,s);
						next.frame.setVisible(true);
						frame.dispose();
						}
					if(shopName.contains("groundfood")) {
						groundfood next= new groundfood(amount,s);
						next.frame.setVisible(true);
						frame.dispose();
						}
					if(shopName.contains("housedepot")) {
						housedepot next= new housedepot(amount,s);
						next.frame.setVisible(true);
						frame.dispose();
						}
				
			}
		});
		
		outPut = new JLabel(output);
		outPut.setBounds(90, 21, 285, 16);
		frame.getContentPane().add(outPut);
		
		
		
		btnCancel.setBounds(205, 274, 117, 29);
		frame.getContentPane().add(btnCancel);
		
		JButton btnPay = new JButton("Pay");
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstName=FN.getText();
				lastName=LN.getText();
				security=SC.getText();
				cardNumber=CN.getText();
				try {
					if(check(cardNumber,lastName,firstName,security)) {
						int result = charge(cardNumber,realCost,"abc");
						if(result==-1)
							output="insufficient fund,try another card or press cancel";
						else if(result==1) {
							confirm next = new confirm(s);
						    next.setVisible(true);
						    frame.dispose();
						}
						else if(result==-2)
							output="card is already expired";
					}
					else {
						output="the information you entered does not match with the database";
					}
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
				outPut.setText(output);
			}
		});
		btnPay.setBounds(327, 274, 117, 29);
		frame.getContentPane().add(btnPay);
		
		CN = new JTextField();
		CN.setBounds(170, 181, 130, 26);
		frame.getContentPane().add(CN);
		CN.setColumns(10);
		
		JLabel lblFirstjName = new JLabel("First Name");
		lblFirstjName.setBounds(57, 105, 81, 16);
		frame.getContentPane().add(lblFirstjName);
		
		JLabel lblNewLabel = new JLabel("Last Name");
		lblNewLabel.setBounds(57, 148, 80, 16);
		frame.getContentPane().add(lblNewLabel);
		
		SC = new JTextField();
		SC.setBounds(170, 214, 130, 26);
		frame.getContentPane().add(SC);
		SC.setColumns(10);
		
		JLabel balance_display = new JLabel(""+realCost);
		balance_display.setBounds(170, 65, 128, 16);
		frame.getContentPane().add(balance_display);
		
		
	}
}
