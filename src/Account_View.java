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
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.border.LineBorder;
import java.awt.Cursor;
import javax.swing.JTable;

public class Account_View extends JFrame {

	private Color Color_navy = new Color(0,73,118);
	
	private JFrame frame;
	private JTable table;
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Account_View frame = new Account_View();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Account_View(int cardNumber) {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(120, 120, 800, 600);
		frame.getContentPane().setBackground(Color.WHITE);
		setContentPane(frame.getContentPane());
		SpringLayout springLayout = new SpringLayout();
		SpringLayout sl_contentPane = new SpringLayout();
		frame.getContentPane().setLayout(sl_contentPane);
		
		JPanel brandPanel = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, brandPanel, 10, SpringLayout.NORTH, frame.getContentPane());
		sl_contentPane.putConstraint(SpringLayout.WEST, brandPanel, 274, SpringLayout.WEST, frame.getContentPane());
		brandPanel.setBackground(Color.WHITE);
		frame.getContentPane().add(brandPanel);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setAlignmentY(Component.TOP_ALIGNMENT);
		Image logo = new ImageIcon(Login_View.class.getResource("bankLogo.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		lblLogo.setIcon(new ImageIcon(logo));
		
		JLabel lblCapital = new JLabel("Capital");
		lblCapital.setForeground(new Color(0, 73, 118));
		lblCapital.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 25));
		
		JLabel lblTwo = new JLabel("Two");
		lblTwo.setVerticalAlignment(SwingConstants.TOP);
		lblTwo.setForeground(new Color(0, 73, 118));
		lblTwo.setFont(new Font("Gabriola", Font.ITALIC, 30));
		GroupLayout gl_brandPanel = new GroupLayout(brandPanel);
		gl_brandPanel.setHorizontalGroup(
			gl_brandPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 216, Short.MAX_VALUE)
				.addComponent(lblLogo)
				.addGroup(gl_brandPanel.createSequentialGroup()
					.addGap(47)
					.addComponent(lblCapital, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_brandPanel.createSequentialGroup()
					.addGap(153)
					.addComponent(lblTwo, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
		);
		gl_brandPanel.setVerticalGroup(
			gl_brandPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 50, Short.MAX_VALUE)
				.addComponent(lblLogo)
				.addGroup(gl_brandPanel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblCapital, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_brandPanel.createSequentialGroup()
					.addGap(21)
					.addComponent(lblTwo, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
		);
		brandPanel.setLayout(gl_brandPanel);
		
		JPanel infoPanel = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, infoPanel, 66, SpringLayout.NORTH, frame.getContentPane());
		sl_contentPane.putConstraint(SpringLayout.WEST, infoPanel, 0, SpringLayout.WEST, frame.getContentPane());
		sl_contentPane.putConstraint(SpringLayout.SOUTH, infoPanel, 223, SpringLayout.NORTH, frame.getContentPane());
		sl_contentPane.putConstraint(SpringLayout.EAST, infoPanel, 0, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(infoPanel);
		infoPanel.setLayout(null);
		
		JLabel lblCurrent = new JLabel("Current Balance");
		lblCurrent.setBounds(312, 16, 162, 15);
		lblCurrent.setForeground(Color.WHITE);
		lblCurrent.setFont(new Font("Arial", Font.BOLD, 18));
		infoPanel.add(lblCurrent);
		
		JLabel lblCreditCard = new JLabel("Credit Card");
		lblCreditCard.setBounds(10, 10, 190, 41);
		lblCreditCard.setForeground(Color.WHITE);
		infoPanel.add(lblCreditCard);
		lblCreditCard.setFont(new Font("Arial", Font.PLAIN, 35));
		
		JLabel lblBackgroundImg = new JLabel("");
		lblBackgroundImg.setBounds(0, 0, 776, 157);
		Image wave_background = new ImageIcon(Account_View.class.getResource("navy_background.png")).getImage().getScaledInstance(776, 157, Image.SCALE_SMOOTH);
		lblBackgroundImg.setIcon(new ImageIcon(wave_background));
		
		JLabel lblCardnumber = new JLabel("cardNumber");
		lblCardnumber.setAlignmentY(15.0f);
		lblCardnumber.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCardnumber.setForeground(Color.WHITE);
		lblCardnumber.setBounds(20, 55, 117, 15);
		infoPanel.add(lblCardnumber);
		
		JLabel lblBalance = new JLabel("balance");
		lblBalance.setForeground(new Color(255, 255, 255));
		lblBalance.setFont(new Font("Arial", Font.BOLD, 35));
		lblBalance.setBounds(325, 35, 142, 41);
		infoPanel.add(lblBalance);
		
		JLabel lblDollarSign = new JLabel("$");
		lblDollarSign.setForeground(Color.WHITE);
		lblDollarSign.setFont(new Font("Arial", Font.PLAIN, 25));
		lblDollarSign.setBounds(310, 30, 15, 41);
		infoPanel.add(lblDollarSign);
		
		JLabel lblAvaliableBalance = new JLabel("Available  Credit");
		lblAvaliableBalance.setForeground(Color.WHITE);
		lblAvaliableBalance.setFont(new Font("Arial", Font.PLAIN, 18));
		lblAvaliableBalance.setBounds(318, 135, 142, 15);
		infoPanel.add(lblAvaliableBalance);
		
		JLabel lblDollarSign_2 = new JLabel("$");
		lblDollarSign_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDollarSign_2.setForeground(Color.WHITE);
		lblDollarSign_2.setFont(new Font("Arial", Font.PLAIN, 25));
		lblDollarSign_2.setBounds(320, 110, 15, 23);
		infoPanel.add(lblDollarSign_2);
		
		JLabel lblCredit = new JLabel("remain");
		lblCredit.setHorizontalAlignment(SwingConstants.CENTER);
		lblCredit.setForeground(Color.WHITE);
		lblCredit.setFont(new Font("Arial", Font.PLAIN, 25));
		lblCredit.setBounds(325, 110, 129, 23);
		infoPanel.add(lblCredit);
		
		JButton btnMakePayment = new JButton("Make a Payment");
		btnMakePayment.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMakePayment.setForeground(Color.WHITE);
		btnMakePayment.setBounds(582, 45, 170, 48);
		infoPanel.add(btnMakePayment);
		btnMakePayment.setBackground(Color.BLACK);
		btnMakePayment.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
		btnMakePayment.setFont(new Font("Arial", Font.BOLD, 18));
		btnMakePayment.setFocusable(false);
		btnMakePayment.setContentAreaFilled(false);
		
		JLabel lblCreditLine = new JLabel("Credit Line");
		lblCreditLine.setForeground(Color.WHITE);
		lblCreditLine.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCreditLine.setBounds(600, 130, 74, 15);
		infoPanel.add(lblCreditLine);
		
		JLabel lblCreditAmt = new JLabel("$creditline");
		lblCreditAmt.setForeground(Color.WHITE);
		lblCreditAmt.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCreditAmt.setBounds(680, 130, 74, 15);
		infoPanel.add(lblCreditAmt);
		
		
		infoPanel.add(lblBackgroundImg);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.SOUTH, infoPanel);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, frame.getContentPane());
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, 0, SpringLayout.SOUTH, frame.getContentPane());
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, 776, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		
		JLabel lblTransactions = new JLabel("Transactions");
		lblTransactions.setFont(new Font("Arial", Font.BOLD, 25));
		lblTransactions.setBounds(10, 5, 176, 30);
		lblTransactions.setForeground(Color.BLACK);
		panel.add(lblTransactions);
		

		ArrayList<String[]> transData = new ArrayList<>();
		// DataBase connect
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/credit_card_system?userTimezone=true&serverTimezone=UTC","root","wang87067835");  
			Statement transStmt = con.createStatement();
			Statement cardStmt = con.createStatement();
			ResultSet transRes = transStmt.executeQuery("SELECT * FROM transactions WHERE cardNumber = "+ cardNumber + " ORDER BY date");
			ResultSet cardRes = cardStmt.executeQuery("SELECT * FROM credit_cards WHERE cardNumber = "+ cardNumber);
			// update credit card info
			if (cardRes.next()) {	
				lblCardnumber.setText("..."+String.format("%04d", Integer.parseInt(cardRes.getString("cardNumber"))));
				double remainCredit = Double.parseDouble(cardRes.getString("remainCredit"));
				double creditLmt = Double.parseDouble(cardRes.getString("creditLimit"));
				double balance = creditLmt - remainCredit;
				lblBalance.setText(String.format("%.2f", balance));
				lblCredit.setText(String.format("%.2f", remainCredit));
				lblCreditAmt.setText(String.format("%.2f", creditLmt));;
				
			}
			// create transaction array
			if (transRes.next()) {
				do {
					String transRow[] = new String[3];
					transRow[0] = transRes.getString("date");
					transRow[1] = transRes.getString("paidTo");
					transRow[2] = "$"+transRes.getString("cost");
					transData.add(transRow);
				} while (transRes.next());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String columns[] = {"Date", "Description", "Amout"};
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		scrollPane.setViewportBorder(null);
		scrollPane.setFocusable(false);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setFont(new Font("Arial", Font.BOLD, 20));
		scrollPane.setBounds(10, 40, 756, 216);
		
		panel.add(scrollPane);
		
		String[][] arrData = new String[transData.size()][];
		for (int i=0; i<transData.size(); i ++) {
			arrData[i] = transData.get(i);
		}
		
		table = new AlterColor_JTable(arrData, columns);
		table.setGridColor(Color.WHITE);
		table.setColumnSelectionAllowed(true);
		table.setBorder(null);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
		table.setEnabled(false);
		table.setFocusable(false);
		table.setRowSelectionAllowed(false);
		scrollPane.setViewportView(table);
		table.setFont(new Font("Arial", Font.PLAIN, 17));
		
		// table header styling
		JTableHeader header = table.getTableHeader();
		header.setFont(new Font("Arial", Font.BOLD, 20));
		header.setForeground(Color_navy);
		DefaultTableCellRenderer  renderer = (DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer();
	    renderer.setHorizontalAlignment(JLabel.LEFT);		// header alignment left
		
		for (int i=0; i<transData.size(); i++) {
			table.setRowHeight(i, 30);
		}
		
		
	}
}
