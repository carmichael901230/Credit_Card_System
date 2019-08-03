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
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class CheckOut extends vendor {
	private Color Color_green = new Color(0, 188, 65);
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
  public JLabel lblError;
  
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
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 550, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 0, 515, 70);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(134, 10, 246, 55);
		panel.add(panel_3);
		
		JLabel label_1 = new JLabel("R I K I B U Y");
		label_1.setVerticalAlignment(SwingConstants.TOP);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(0, 188, 65));
		label_1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 25));
		label_1.setBounds(53, 0, 183, 24);
		panel_3.add(label_1);
		
		JLabel label_2 = new JLabel("BUY All You Wanna Buy");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(new Color(0, 188, 65));
		label_2.setFont(new Font("Franklin Gothic Medium", Font.ITALIC, 15));
		label_2.setBounds(60, 30, 176, 25);
		panel_3.add(label_2);
		
		JLabel label_3 = new JLabel("R");
		label_3.setOpaque(true);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Arial Black", Font.BOLD, 45));
		label_3.setBackground(new Color(0, 188, 65));
		label_3.setAlignmentY(0.0f);
		label_3.setBounds(0, 0, 55, 55);
		panel_3.add(label_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 80, 327, 273);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCardNumber = new JLabel("Card Number");
		lblCardNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblCardNumber.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCardNumber.setBounds(0, 130, 100, 15);
		panel_1.add(lblCardNumber);
		
		JLabel lblSecuritCode = new JLabel("CCV");
		lblSecuritCode.setHorizontalAlignment(SwingConstants.LEFT);
		lblSecuritCode.setFont(new Font("Arial", Font.PLAIN, 15));
		lblSecuritCode.setBounds(0, 208, 83, 15);
		panel_1.add(lblSecuritCode);
		
		FN = new JTextField();
		FN.setBounds(0, 75, 150, 30);
		panel_1.add(FN);
		FN.setColumns(10);
		
		LN = new JTextField();
		LN.setBounds(174, 75, 150, 30);
		panel_1.add(LN);
		LN.setColumns(10);
		
		CN = new JTextField();
		CN.setBounds(0, 150, 324, 30);
		panel_1.add(CN);
		CN.setColumns(10);
		
		JLabel lblFirstjName = new JLabel("First Name");
		lblFirstjName.setHorizontalAlignment(SwingConstants.LEFT);
		lblFirstjName.setFont(new Font("Arial", Font.PLAIN, 15));
		lblFirstjName.setBounds(0, 55, 93, 15);
		panel_1.add(lblFirstjName);
		
		JLabel lblNewLabel = new JLabel("Last Name");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(174, 54, 93, 15);
		panel_1.add(lblNewLabel);
		
		SC = new JTextField();
		SC.setBounds(0, 230, 100, 30);
		panel_1.add(SC);
		SC.setColumns(10);
		
		JLabel lblPaymentInfomation = new JLabel("Payment Infomation");
		lblPaymentInfomation.setBackground(Color.WHITE);
		lblPaymentInfomation.setFont(new Font("Arial", Font.BOLD, 20));
		lblPaymentInfomation.setBounds(0, 0, 240, 30);
		panel_1.add(lblPaymentInfomation);
		
		lblError = new JLabel(output);
		lblError.setForeground(Color.RED);
		lblError.setBounds(0, 28, 328, 16);
		panel_1.add(lblError);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(339, 80, 187, 273);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Arial", Font.BOLD, 18));
		lblTotal.setBounds(45, 226, 75, 20);
		panel_2.add(lblTotal);
		
		JLabel balance_display = new JLabel("$ "+String.format("%.2f",realCost));
		balance_display.setHorizontalAlignment(SwingConstants.RIGHT);
		balance_display.setFont(new Font("Arial", Font.PLAIN, 15));
		balance_display.setBounds(100, 59, 75, 15);
		panel_2.add(balance_display);
		
		JLabel lblSummary = new JLabel("Summary");
		lblSummary.setFont(new Font("Arial", Font.BOLD, 20));
		lblSummary.setBounds(0, 0, 135, 30);
		panel_2.add(lblSummary);
		
		JLabel lblSubtotal = new JLabel("Subtotal");
		lblSubtotal.setFont(new Font("Arial", Font.PLAIN, 15));
		lblSubtotal.setBounds(45, 53, 63, 27);
		panel_2.add(lblSubtotal);
		
		JLabel lblShipping = new JLabel("Shipping");
		lblShipping.setFont(new Font("Arial", Font.PLAIN, 15));
		lblShipping.setBounds(45, 94, 63, 27);
		panel_2.add(lblShipping);
		
		JLabel lblFree = new JLabel("FREE");
		lblFree.setFont(new Font("Arial", Font.PLAIN, 15));
		lblFree.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFree.setBounds(120, 97, 57, 20);
		panel_2.add(lblFree);
		
		JLabel lblTax = new JLabel("Taxes");
		lblTax.setFont(new Font("Arial", Font.PLAIN, 15));
		lblTax.setBounds(45, 136, 63, 27);
		panel_2.add(lblTax);
		
		JLabel label = new JLabel("$ 0.00");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Arial", Font.PLAIN, 15));
		label.setBounds(120, 139, 57, 20);
		panel_2.add(label);
		
		JLabel lblValTotal = new JLabel("$ "+String.format("%.2f",realCost));
		lblValTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblValTotal.setFont(new Font("Arial", Font.PLAIN, 15));
		lblValTotal.setBounds(100, 231, 75, 15);
		panel_2.add(lblValTotal);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(Color_green);
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Arial", Font.BOLD, 20));
		btnCancel.setBounds(296, 363, 120, 35);
		frame.getContentPane().add(btnCancel);
		
		JButton btnPay = new JButton("Pay");
		btnPay.setBackground(Color_green);
		btnPay.setForeground(Color.WHITE);
		btnPay.setFont(new Font("Arial", Font.BOLD, 20));
		btnPay.setBounds(426, 363, 100, 35);
		frame.getContentPane().add(btnPay);
		
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstName=FN.getText();
				lastName=LN.getText();
				security=SC.getText();
				String cardStr = CN.getText();
				int cardInt = Integer.parseInt(cardStr.substring(cardStr.length()-4));
				cardNumber = cardInt+"";
				try {
					if(check(cardNumber,lastName,firstName,security)) {
						// System.out.println(cardNumber+" "+lastName+" "+firstName+" "+security);
						int result = charge(cardNumber,realCost,shopName);
						if(result==-1)
							output="Insufficient Fund";
						else if(result==1) {
							confirm next = new confirm(s);
						    next.setVisible(true);
						    frame.dispose();
						}
						else if(result==-2)
							output="Credit card expired";
					}
					else {
						output="We can't find your infomation";
					}
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
				lblError.setText(output);
			}
		});
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
		
		
	}
}
