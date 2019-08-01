import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Shops_View extends JFrame {

	private Color Color_marsh = new Color(155, 146, 60);
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Shops_View frame = new Shops_View();
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
	public Shops_View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 450);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(170, 10, 246, 55);
		contentPane.add(panel);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(0, 0, 55, 55);
		lblLogo.setAlignmentY(Component.TOP_ALIGNMENT);
		Image logo = new ImageIcon(Login_View.class.getResource("shoank_logo.png")).getImage().getScaledInstance(55, 55, Image.SCALE_DEFAULT);
		lblLogo.setIcon(new ImageIcon(logo));
		panel.add(lblLogo);
		
		JLabel lblShoank = new JLabel("S H O A N K");
		lblShoank.setVerticalAlignment(SwingConstants.TOP);
		lblShoank.setHorizontalAlignment(SwingConstants.CENTER);
		lblShoank.setForeground(new Color(155, 146, 60));
		lblShoank.setFont(new Font("Ink Free", Font.PLAIN, 25));
		lblShoank.setBounds(53, 0, 183, 24);
		panel.add(lblShoank);
		
		JLabel lblSlogan = new JLabel("Shop & Bank Two in One");
		lblSlogan.setHorizontalAlignment(SwingConstants.CENTER);
		lblSlogan.setForeground(new Color(155, 146, 60));
		lblSlogan.setFont(new Font("Arial", Font.ITALIC, 15));
		lblSlogan.setBounds(60, 30, 186, 25);
		panel.add(lblSlogan);
		
		JPanel shopsPanel = new JPanel();
		shopsPanel.setBackground(Color.WHITE);
		shopsPanel.setBounds(39, 109, 473, 294);
		contentPane.add(shopsPanel);
		shopsPanel.setLayout(new GridLayout(2, 2, 10, 10));
		
		JPanel valmartPanel = new JPanel();
		valmartPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		valmartPanel.setBackground(Color.WHITE);
		shopsPanel.add(valmartPanel);
		valmartPanel.setLayout(null);
		
		JLabel lblValmart = new JLabel();
		Image valmart_logo = new ImageIcon(Login_View.class.getResource("valmart_logo.png")).getImage().getScaledInstance(231, 46, Image.SCALE_SMOOTH);
		lblValmart.setIcon(new ImageIcon(valmart_logo));
		lblValmart.setBounds(0, 50, 231, 46);
		valmartPanel.add(lblValmart);
		
		JPanel housedepotPanel = new JPanel();
		housedepotPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		housedepotPanel.setBackground(Color.WHITE);
		shopsPanel.add(housedepotPanel);
		housedepotPanel.setLayout(null);
		
		JLabel lblHousedepot = new JLabel();
		Image housedepot_logo = new ImageIcon(Login_View.class.getResource("houseDepot_logo.png")).getImage().getScaledInstance(142, 142, Image.SCALE_SMOOTH);
		lblHousedepot.setIcon(new ImageIcon(housedepot_logo));
		lblHousedepot.setBounds(40, 0, 142, 142);
		housedepotPanel.add(lblHousedepot);
		
		JPanel bananaBeesPanel = new JPanel();
		bananaBeesPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bananaBeesPanel.setBackground(Color.WHITE);
		shopsPanel.add(bananaBeesPanel);
		bananaBeesPanel.setLayout(null);
		
		JLabel lblBananaBees = new JLabel();
		Image banbee_logo = new ImageIcon(Login_View.class.getResource("bananaBees_logo.png")).getImage().getScaledInstance(231, 88, Image.SCALE_SMOOTH);
		lblBananaBees.setIcon(new ImageIcon(banbee_logo));
		lblBananaBees.setBounds(0, 26, 231, 90);
		bananaBeesPanel.add(lblBananaBees);
		
		JPanel panel_4 = new JPanel();
		shopsPanel.add(panel_4);
		panel_4.setLayout(null);

		
		JButton btnBack = new JButton("< Back");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Index_View back = new Index_View();
				back.frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setFocusable(false);
		btnBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBack.setContentAreaFilled(false);
		btnBack.setBorder(new LineBorder(Color_marsh, 2, true));
		btnBack.setBackground(Color.WHITE);
		btnBack.setForeground(Color_marsh);
		btnBack.setFont(new Font("Arial", Font.PLAIN, 25));
		btnBack.setBounds(15, 15, 120, 35);
		contentPane.add(btnBack);
	}
}
