
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.border.LineBorder;
import java.awt.Cursor;

public class Bank_View extends JFrame {

	private Color Color_navy = new Color(0,73,118);
	
	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Home_View frame = new Home_View();
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
	public Bank_View(ResultSet loginUser) {
		contentPane = new JPanel();

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		SpringLayout springLayout = new SpringLayout();
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JPanel brandPanel = new JPanel();
		brandPanel.setBackground(Color.WHITE);
		contentPane.add(brandPanel);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setAlignmentY(Component.TOP_ALIGNMENT);
		Image logo = new ImageIcon(Login_View.class.getResource("bankLogo.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		lblLogo.setIcon(new ImageIcon(logo));
		
		JLabel lblCapital = new JLabel("Capital");
		lblCapital.setForeground(Color_navy);
		springLayout.putConstraint(SpringLayout.EAST, lblCapital, 183, SpringLayout.WEST, brandPanel);
		lblCapital.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 25));
		
		JLabel lblTwo = new JLabel("Two");
		lblTwo.setForeground(Color_navy);
		lblTwo.setVerticalAlignment(SwingConstants.TOP);
		lblTwo.setFont(new Font("Gabriola", Font.ITALIC, 30));
		GroupLayout gl_brandPanel = new GroupLayout(brandPanel);
		gl_brandPanel.setHorizontalGroup(
			gl_brandPanel.createParallelGroup(Alignment.LEADING)
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
				.addComponent(lblLogo)
				.addGroup(gl_brandPanel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblCapital, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_brandPanel.createSequentialGroup()
					.addGap(21)
					.addComponent(lblTwo, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
		);
		brandPanel.setLayout(gl_brandPanel);
		
		JPanel welcomPanel = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, welcomPanel, 66, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, welcomPanel, 0, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, welcomPanel, 0, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, welcomPanel, 166, SpringLayout.NORTH, contentPane);
		contentPane.add(welcomPanel);
		SpringLayout sl_welcomPanel = new SpringLayout();
		welcomPanel.setLayout(sl_welcomPanel);
		
		// greeting message depending on time
		JLabel lblGreeting = new JLabel("place holder");
		sl_welcomPanel.putConstraint(SpringLayout.NORTH, lblGreeting, 45, SpringLayout.NORTH, welcomPanel);
		sl_welcomPanel.putConstraint(SpringLayout.EAST, lblGreeting, -270, SpringLayout.EAST, welcomPanel);
		lblGreeting.setForeground(Color.BLACK);
		lblGreeting.setFont(new Font("Calibri Light", Font.PLAIN, 25));
		Calendar c = Calendar.getInstance();
		int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
		String greetingStr = null;
		if(timeOfDay >= 3 && timeOfDay < 12){
		    greetingStr = "Good Morning";      
		}else if(timeOfDay >= 12 && timeOfDay < 17){
			greetingStr = "Good Afternoon";
		}else{
			greetingStr =  "Good Evening";
		}
		String firstName= null;
		String username = null;
		try {
			firstName = loginUser.getString("firstName");
			username = loginUser.getString("accountID");
			lblGreeting.setText(greetingStr+", "+firstName);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		welcomPanel.add(lblGreeting);
		
		JPanel cardPanel = new JPanel();
		cardPanel.setBackground(Color.WHITE);
		cardPanel.setLayout(new GridLayout(2, 2, 10, 10)); 
		sl_contentPane.putConstraint(SpringLayout.NORTH, cardPanel, 183, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, cardPanel, -10, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, cardPanel, 50, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, cardPanel, -50, SpringLayout.EAST, contentPane);
		
		JLabel lblgreetingBackground = new JLabel();
		Image greetingImg = new ImageIcon(Login_View.class.getResource("greeting_background.png")).getImage().getScaledInstance(776, 100, Image.SCALE_SMOOTH);
		lblgreetingBackground.setIcon(new ImageIcon(greetingImg));
		
		sl_welcomPanel.putConstraint(SpringLayout.NORTH, lblgreetingBackground, 0, SpringLayout.NORTH, welcomPanel);
		sl_welcomPanel.putConstraint(SpringLayout.WEST, lblgreetingBackground, 0, SpringLayout.WEST, welcomPanel);
		sl_welcomPanel.putConstraint(SpringLayout.SOUTH, lblgreetingBackground, 0, SpringLayout.SOUTH, welcomPanel);
		sl_welcomPanel.putConstraint(SpringLayout.EAST, lblgreetingBackground, 0, SpringLayout.EAST, welcomPanel);
		welcomPanel.add(lblgreetingBackground);
		contentPane.add(cardPanel);
		
		// drop down menu
		Object choice[] = {
				username,
				new JSeparator(JSeparator.HORIZONTAL),
				"<html><strong>Profile</strong></html>", 
				new JSeparator(JSeparator.HORIZONTAL),
				"<html><strong>Security</strong></html>", 
				new JSeparator(JSeparator.HORIZONTAL),
				"<html><strong>Sign Out<strong></html>"};
		JComboBox comboBox = new JComboBox(choice);
		sl_contentPane.putConstraint(SpringLayout.EAST, brandPanel, -77, SpringLayout.WEST, comboBox);
		sl_contentPane.putConstraint(SpringLayout.EAST, comboBox, 40, SpringLayout.EAST, cardPanel);
		sl_contentPane.putConstraint(SpringLayout.WEST, comboBox, -153, SpringLayout.EAST, cardPanel);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, comboBox, 54, SpringLayout.NORTH, contentPane);
		comboBox.setForeground(Color.WHITE);
		comboBox.setFont(new Font("Arial", Font.PLAIN, 20));
		comboBox.setBackground(new Color(29, 132, 199));
		ComboBoxRenderer renderer= new ComboBoxRenderer();
	    renderer.setPreferredSize(new Dimension(125, 30));
	    comboBox.setRenderer(renderer);
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					if (((String)e.getItem()).contains("Profile")) {
						System.out.println("Go to Profile");
					}
					else if (((String)e.getItem()).contains("Security")) {
						System.out.println("Go to Security");
					}
					else if (((String)e.getItem()).contains("Sign Out")) {
						Login_View back = new Login_View();
						back.setVisible(true);
						dispose();
						
					}
				}
			}
		});
		
		sl_contentPane.putConstraint(SpringLayout.NORTH, comboBox, 20, SpringLayout.NORTH, contentPane);
		contentPane.add(comboBox);
		
		JButton btnBack = new JButton("< Back");
		btnBack.setForeground(Color_navy);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnBack, -631, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, brandPanel, 125, SpringLayout.EAST, btnBack);
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Index_View back = new Index_View();
				back.frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnBack, 8, SpringLayout.NORTH, brandPanel);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnBack, 24, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnBack, -10, SpringLayout.SOUTH, brandPanel);
		btnBack.setOpaque(false);
		btnBack.setFont(new Font("Arial", Font.PLAIN, 25));
		btnBack.setFocusable(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorder(new LineBorder(Color_navy, 2, true));
		btnBack.setBackground(Color.WHITE);
		contentPane.add(btnBack);
		
		// display all credit card on cardPanel (dynamically)
		ArrayList<JPanel> cardList = new ArrayList<>();
		try {
			String userID = loginUser.getString("id");
			// DataBase connect
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/credit_card_system?userTimezone=true&serverTimezone=UTC","root","wang87067835");  
			Statement stmt = con.createStatement();
			ResultSet cardRes = stmt.executeQuery("SELECT * FROM credit_cards WHERE cardHolder = "+userID);
			
			while (cardRes.next()) {
				int cardNum = Integer.parseInt(cardRes.getString("cardNumber"));
				String lastNum = String.format("%04d", cardNum);
				String balanceStr = String.format("%.2f", Double.parseDouble(cardRes.getString("creditLimit")) - Double.parseDouble(cardRes.getString("remainCredit")));
				JPanel panel_1 = new JPanel();
				panel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				panel_1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						try {
							cardRes.close();
							stmt.close();
							con.close();
						}
						catch(Exception err) {
							err.printStackTrace();
						}
						finally {
							Account_View acc_view = new Account_View(loginUser, cardNum);
							acc_view.setVisible(true);
							dispose();
						}
					}
				});
				cardPanel.add(panel_1);
				
				JLabel lblBg = new JLabel("");
				lblBg.setBounds(0, 0, 676, 175);
				Image wave_background = new ImageIcon(Account_View.class.getResource("navy_background.png")).getImage().getScaledInstance(776, 175, Image.SCALE_SMOOTH);
				lblBg.setIcon(new ImageIcon(wave_background));
				panel_1.setLayout(null);
				
				
				JLabel lblCreditCard = new JLabel("Credit Card");
				lblCreditCard.setFont(new Font("Arial", Font.PLAIN, 30));
				lblCreditCard.setForeground(Color.WHITE);
				
				lblCreditCard.setBounds(10, 22, 155, 45);
				panel_1.add(lblCreditCard);
				
				JLabel lblCardNum = new JLabel("..."+lastNum);
				lblCardNum.setFont(new Font("Arial", Font.PLAIN, 20));
				lblCardNum.setForeground(Color.WHITE);
				lblCardNum.setBounds(174, 24, 62, 24);
				panel_1.add(lblCardNum);
				
				JLabel lbl$sign = new JLabel("$");
				lbl$sign.setFont(new Font("Arial", Font.BOLD, 30));
				lbl$sign.setForeground(Color.WHITE);
				lbl$sign.setBounds(28, 60, 17, 36);
				panel_1.add(lbl$sign);
				
				JLabel lblBalance = new JLabel(balanceStr);
				lblBalance.setFont(new Font("Arial", Font.BOLD, 50));
				lblBalance.setForeground(Color.WHITE);
				lblBalance.setBounds(50, 59, 250, 59);
				panel_1.add(lblBalance);
				
				JLabel lblCurrentBalance = new JLabel("Current Blanace");
				lblCurrentBalance.setFont(new Font("Arial", Font.PLAIN, 20));
				lblCurrentBalance.setBounds(30, 111, 146, 24);
				lblCurrentBalance.setForeground(Color.WHITE);
				panel_1.add(lblCurrentBalance);
				
				panel_1.add(lblBg);
				
			}
			for (int i=0; i<cardList.size(); i++) {
				cardPanel.add(cardList.get(i));
			}
		}
		catch (Exception e1) {
			e1.printStackTrace();
		}
		
		
	}
}
