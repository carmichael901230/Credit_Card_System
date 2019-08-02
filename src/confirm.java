package project2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class confirm extends JFrame {
 
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public confirm(Calendar s) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 368, 208);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>transaction success, <br>thank you for shoping</html>");
		lblNewLabel.setBounds(42, 34, 248, 54);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShopsInterface next =new ShopsInterface(s);
				next.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(52, 107, 205, 29);
		contentPane.add(btnNewButton);
	}

}
