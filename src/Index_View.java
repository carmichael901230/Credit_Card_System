import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Index_View extends JFrame {

	private JPanel contentPane;
	
	private Color Color_marsh = new Color(155, 146, 60);

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Index_View frame = new Index_View();
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
	public Index_View(ResultSet loginUser) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.white);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel logoPanel = new JPanel();
		logoPanel.setLayout(null);
		logoPanel.setBackground(Color.WHITE);
		logoPanel.setBounds(150, 10, 246, 55);
		contentPane.add(logoPanel);
		
		JLabel lblLogo = new JLabel("");
		Image logo = new ImageIcon(Login_View.class.getResource("shoank_logo.png")).getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH);
		lblLogo.setIcon(new ImageIcon(logo));
		lblLogo.setAlignmentY(0.0f);
		lblLogo.setBounds(0, 0, 55, 55);
		logoPanel.add(lblLogo);
		
		JLabel lblShoank = new JLabel("S H O A N K");
		lblShoank.setVerticalAlignment(SwingConstants.TOP);
		lblShoank.setHorizontalAlignment(SwingConstants.CENTER);
		lblShoank.setForeground(new Color(155, 146, 60));
		lblShoank.setFont(new Font("Ink Free", Font.PLAIN, 25));
		lblShoank.setBounds(53, 0, 183, 24);
		logoPanel.add(lblShoank);
		
		JLabel lblSlogan = new JLabel("Shop & Bank Two in One");
		lblSlogan.setHorizontalAlignment(SwingConstants.CENTER);
		lblSlogan.setForeground(new Color(155, 146, 60));
		lblSlogan.setFont(new Font("Arial", Font.PLAIN, 15));
		lblSlogan.setBounds(60, 30, 186, 25);
		logoPanel.add(lblSlogan);
		
		JPanel greetingPanel = new JPanel();
		greetingPanel.setBackground(Color.WHITE);
		greetingPanel.setBounds(10, 96, 566, 55);
		contentPane.add(greetingPanel);
		greetingPanel.setLayout(null);
		
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
		
		JLabel lblGreetings = new JLabel(greetingStr+", ");
		lblGreetings.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGreetings.setFont(new Font("Candara", Font.ITALIC, 25));
		lblGreetings.setForeground(Color.BLACK);
		lblGreetings.setBounds(131, 10, 156, 35);
		greetingPanel.add(lblGreetings);
		
		String firstName = null;
		try {
			firstName = loginUser.getString("firstName");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		JLabel lblUserName = new JLabel(firstName);
		lblUserName.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 25));
		lblUserName.setBounds(297, 10, 184, 35);
		greetingPanel.add(lblUserName);
		
		JPanel selectPanel = new JPanel();
		selectPanel.setBackground(Color.WHITE);
		selectPanel.setBounds(10, 161, 566, 192);
		contentPane.add(selectPanel);
		selectPanel.setLayout(null);
		
		JPanel shopBtnPanel = new JPanel();
		shopBtnPanel.setBackground(Color.WHITE);
		shopBtnPanel.setBorder(new LineBorder(new Color(155, 146, 60), 4, true));
		shopBtnPanel.setBounds(10, 41, 257, 87);
		selectPanel.add(shopBtnPanel);
		shopBtnPanel.setLayout(null);
		
		JButton btnShopping = new JButton("Shopping");
		btnShopping.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnShopping.setBackground(Color_marsh);
				btnShopping.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnShopping.setBackground(Color.white);
				btnShopping.setForeground(Color_marsh);
			}
		});
		btnShopping.setBorderPainted(false);
		btnShopping.setBackground(Color.WHITE);
		btnShopping.setFont(new Font("Courier New", Font.BOLD, 30));
		btnShopping.setForeground(Color_marsh);
		btnShopping.setFocusable(false);
		btnShopping.setBounds(5, 6, 246, 75);
		shopBtnPanel.add(btnShopping);
		
		JPanel bankBtnPanel = new JPanel();
		bankBtnPanel.setLayout(null);
		bankBtnPanel.setBorder(new LineBorder(new Color(155, 146, 60), 4, true));
		bankBtnPanel.setBackground(Color.WHITE);
		bankBtnPanel.setBounds(300, 41, 257, 87);
		selectPanel.add(bankBtnPanel);
		
		JButton btnBanking = new JButton("Banking");
		btnBanking.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnBanking.setBackground(Color_marsh);
				btnBanking.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnBanking.setBackground(Color.white);
				btnBanking.setForeground(Color_marsh);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Home_View openFrame = new Home_View(loginUser);
				openFrame.setVisible(true);
				dispose();
			}
		});
		btnBanking.setForeground(new Color(155, 146, 60));
		btnBanking.setFont(new Font("Courier New", Font.BOLD, 30));
		btnBanking.setFocusable(false);
		btnBanking.setBorderPainted(false);
		btnBanking.setBackground(Color.WHITE);
		btnBanking.setBounds(5, 6, 246, 75);
		bankBtnPanel.add(btnBanking);
	}
}
