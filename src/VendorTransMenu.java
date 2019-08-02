package project2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VendorTransMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VendorTransMenu frame = new VendorTransMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VendorTransMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("BananaBee's");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(60, 51, 293, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Groundfood");
		btnNewButton_1.setBounds(60, 81, 293, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("HouseDepot");
		btnNewButton_2.setBounds(60, 110, 293, 29);
		contentPane.add(btnNewButton_2);
		
		JLabel lblClickForThe = new JLabel("click for the transaction data of the selected vendor");
		lblClickForThe.setBounds(112, 12, 230, 16);
		contentPane.add(lblClickForThe);
		
		JButton btnNewButton_3 = new JButton("valmart");
		btnNewButton_3.setBounds(60, 145, 293, 29);
		contentPane.add(btnNewButton_3);
	}

}
