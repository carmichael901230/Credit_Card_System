

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VendorTransMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public VendorTransMenu(String loginUser,Calendar s) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("BananaBee's");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VendorTransData next;
				try {
					next = new VendorTransData("bananabees",s,loginUser);
					next.setVisible(true);
					dispose();
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(60, 51, 293, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Groundfood");
		btnNewButton_1.setBounds(60, 81, 293, 29);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				VendorTransData next;
				try {
					next = new VendorTransData("groundfood",s,loginUser);
					next.setVisible(true);
					dispose();
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		JButton btnNewButton_2 = new JButton("HouseDepot");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				VendorTransData next;
				try {
					next = new VendorTransData("thehousedepot",s,loginUser);
					next.setVisible(true);
					dispose();
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_2.setBounds(60, 110, 293, 29);
		contentPane.add(btnNewButton_2);
		
		JLabel lblClickForThe = new JLabel("click for the transaction data of the selected vendor");
		lblClickForThe.setBounds(112, 12, 230, 16);
		contentPane.add(lblClickForThe);
		
		JButton btnNewButton_3 =new JButton("valmart");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				VendorTransData next;
				try {
					next = new VendorTransData("valmart",s,loginUser);
					next.setVisible(true);
					dispose();
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3.setBounds(60, 145, 293, 29);
		contentPane.add(btnNewButton_3);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SuperHome_View next= new SuperHome_View(loginUser, s);
				
			}
		});
		btnBack.setBounds(278, 217, 75, 29);
		contentPane.add(btnBack);
		
		JButton btnNewButton_4 = new JButton("Home");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(354, 217, 75, 29);
		contentPane.add(btnNewButton_4);
	}
}
