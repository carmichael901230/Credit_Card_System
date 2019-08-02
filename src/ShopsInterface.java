
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class ShopsInterface extends JFrame {
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopsInterface window = new ShopsInterface(Calendar.getInstance());
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public ShopsInterface(Calendar s) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("BananaBee's");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bananabee next = new bananabee(s);
				next.frame.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBounds(28, 75, 117, 73);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("TheHouseDepot");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				housedepot next = new housedepot(s);
				next.frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(28, 160, 117, 73);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Valmart");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valmart next = new valmart(s);
				next.frame.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_2.setBounds(173, 74, 117, 73);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Groundfood");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				groundfood next = new groundfood(s);
				next.frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(327, 74, 117, 73);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("click the shop button for visit");
		lblNewLabel.setBounds(106, 22, 257, 16);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_5 = new JButton("go back");
		btnNewButton_5.setBounds(327, 204, 117, 29);
		contentPane.add(btnNewButton_5);
	}

}
