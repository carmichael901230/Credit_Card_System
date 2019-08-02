
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.Choice;

public class groundfood extends vendor{
   double cost[]= {2.3,4.5,6.5,10.0,12.0,12.5};
   int    amount[]= {0,0,0,0,0,0};
   double total=0.0;
   String shopName="groundfood";
   public JFrame frame;
   private Calendar startedTime;
	private final Action action = new SwingAction();
		JLabel sushiAmount;
		JLabel pizzaAmount ;
		JLabel friesAmount ;
		JLabel pepsiAmount ;
		JLabel sevenAmount ;
		JLabel burgerAmount ;
		JLabel lblSushi ;
		JLabel lblPixxs ;
		JLabel lblFries ;
		JLabel lblBurgur ;
		JLabel lblup ;
		JLabel lblPepsi ;
		JLabel sushiCost ;
		JLabel pizzaCost ;
		JLabel friesCost ;
		JLabel burgerCost ;
		JLabel sevenCost ;
		JLabel pepsiCost ;	
		JLabel totalCost;
     	JLabel lblTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					groundfood window = new groundfood();
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
    public groundfood(int [] amount) {
    	this.amount=amount;
    	initialize();
    }
	public groundfood() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		for(int i=0;i<cost.length;i++) {
			total+=cost[i]*amount[i];
		}
		JLabel lblNewLabel = new JLabel("sushi");
		lblNewLabel.setBounds(39, 31, 61, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("fries");
		lblNewLabel_1.setBounds(39, 123, 61, 38);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("burgur");
		lblNewLabel_2.setBounds(39, 191, 61, 38);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("pizza");
		lblNewLabel_3.setBounds(198, 31, 61, 38);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("pepsi");
		lblNewLabel_4.setBounds(198, 110, 61, 38);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("7-up");
		lblNewLabel_5.setBounds(198, 196, 61, 29);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("shopping cart");
		lblNewLabel_6.setBounds(297, 25, 87, 16);
		frame.getContentPane().add(lblNewLabel_6);
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(amount[0]>0)
					amount[0]--;
				refresh();
			}
		});
		button.setBounds(6, 69, 30, 29);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("+");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amount[1]++;
				refresh();
			}
		});
		button_1.setBounds(75, 159, 30, 29);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("+");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amount[2]++;
				refresh();
				System.out.println(amount[2]);
				System.out.println(cost[2]);
			}
		});
		button_2.setBounds(75, 232, 30, 29);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("+");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amount[3]++;
				refresh();
			}
		});
		button_3.setBounds(229, 69, 30, 29);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("+");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amount[4]++;
				refresh();
			}
		});
		button_4.setBounds(229, 159, 30, 29);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("+");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amount[5]++;
				refresh();
			}
		});
		button_5.setBounds(229, 232, 30, 29);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("-");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(amount[1]>0)
					amount[1]--;
				    refresh();
			}
		});
		button_6.setBounds(6, 159, 30, 29);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("-");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(amount[2]>0)
					amount[2]--;
				    refresh();
			}
		});
		button_7.setBounds(6, 232, 30, 29);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("-");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(amount[5]>0)
					amount[5]--;
				    refresh();
			}
		});
		button_8.setBounds(164, 232, 30, 29);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("-");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(amount[4]>0)
					amount[4]--;
				    refresh();
			}
		});
		button_9.setBounds(164, 159, 30, 29);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("-");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(amount[3]>0)
					amount[3]--;
				    refresh();
			}
		});
		button_10.setBounds(164, 69, 30, 29);
		frame.getContentPane().add(button_10);
		
		sushiAmount = new JLabel(""+amount[0]);
		sushiAmount.setBounds(49, 69, 30, 28);
		frame.getContentPane().add(sushiAmount);
		
		pizzaAmount = new JLabel(""+amount[3]);
		pizzaAmount.setBounds(208, 52, 30, 47);
		frame.getContentPane().add(pizzaAmount);
		
		friesAmount = new JLabel(""+amount[1]);
		friesAmount.setBounds(49, 163, 30, 16);
		frame.getContentPane().add(friesAmount);
		
		pepsiAmount = new JLabel(""+amount[4]);
		pepsiAmount.setBounds(208, 168, 30, 16);
		frame.getContentPane().add(pepsiAmount);
		
		sevenAmount = new JLabel(""+amount[5]);
		sevenAmount.setBounds(208, 237, 30, 16);
		frame.getContentPane().add(sevenAmount);
		
		burgerAmount = new JLabel(""+amount[2]);
		burgerAmount.setBounds(49, 237, 30, 16);
		frame.getContentPane().add(burgerAmount);
		
		lblSushi = new JLabel("Sushi  x "+amount[0]);
		lblSushi.setBounds(295, 53, 76, 16);
		frame.getContentPane().add(lblSushi);
		
		lblPixxs = new JLabel("Pizza x "+amount[3]);
		lblPixxs.setBounds(295, 82, 76, 16);
		frame.getContentPane().add(lblPixxs);
		
		lblFries = new JLabel("Fries  x "+amount[1]);
		lblFries.setBounds(295, 110, 76, 16);
		frame.getContentPane().add(lblFries);
		
		lblBurgur = new JLabel("burgur x "+amount[2]);
		lblBurgur.setBounds(295, 134, 76, 16);
		frame.getContentPane().add(lblBurgur);
		
		lblup = new JLabel("7-up  x "+amount[5]);
		lblup.setBounds(295, 164, 60, 16);
		frame.getContentPane().add(lblup);
		
		lblPepsi = new JLabel("pepsi x "+amount[4]);
		lblPepsi.setBounds(295, 191, 60, 16);
		frame.getContentPane().add(lblPepsi);
		
		sushiCost = new JLabel("$ "+(cost[0]*amount[0]));
		sushiCost.setBounds(389, 52, 61, 16);
		frame.getContentPane().add(sushiCost);
		
		pizzaCost = new JLabel("$ "+(cost[3]*amount[3]));
		pizzaCost.setBounds(389, 82, 61, 16);
		frame.getContentPane().add(pizzaCost);
		
		friesCost = new JLabel("$ "+(cost[1]*amount[1]));
		friesCost.setBounds(389, 110, 61, 16);
		frame.getContentPane().add(friesCost);
		
		burgerCost = new JLabel("$ "+(cost[2]*amount[2]));
		burgerCost.setBounds(389, 134, 61, 16);
		frame.getContentPane().add(burgerCost);
		
		sevenCost = new JLabel("$ "+(cost[5]*amount[5]));
		sevenCost.setBounds(389, 164, 61, 16);
		frame.getContentPane().add(sevenCost);
		
		pepsiCost = new JLabel("$ "+(cost[4]*amount[4]));
		pepsiCost.setBounds(389, 191, 61, 16);
		frame.getContentPane().add(pepsiCost);
		
		totalCost = new JLabel("$ "+total);
		totalCost.setBounds(389, 223, 61, 16);
		frame.getContentPane().add(totalCost);
		
		lblTotal = new JLabel("Total");
		lblTotal.setBounds(295, 223, 61, 16);
		frame.getContentPane().add(lblTotal);
		
		JButton btnNewButton_1 = new JButton("Check Out");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckOut temp = new CheckOut(cost,amount,shopName);
				temp.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(348, 293, 106, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnNewButton_2.setBounds(258, 293, 90, 29);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton button_11 = new JButton("+");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amount[0]++;
				refresh();
			}
		});
		button_11.setBounds(75, 69, 30, 29);
		frame.getContentPane().add(button_11);
		
		
		
		
	}
	
	
	//refresh
	public  void refresh() {
		sushiAmount.setText(""+amount[0]);
		
		pizzaAmount.setText(""+amount[3]);
		
		friesAmount.setText(""+amount[1]);
		
		pepsiAmount.setText(""+amount[4]);
		
		sevenAmount.setText(""+amount[5]) ;
		
		burgerAmount.setText(""+amount[2]) ;
		
		lblSushi.setText("Sushi x"+amount[0]);
		
		lblPixxs.setText("Pizza x"+amount[4]) ;
		
	    lblFries.setText("Fries x"+amount[1]) ;
		
		lblBurgur.setText("Burgur x"+amount[2]) ;
		
		lblup.setText("7-up x"+amount[5]) ;
		
		lblPepsi.setText("Pepsi x"+amount[0]) ;
		
        sushiCost.setText("$ "+(amount[0]*cost[0]));
		
		pizzaCost.setText("$ "+(amount[3]*cost[3]));
		
		friesCost.setText("$ "+(amount[1]*cost[1]));
		
		pepsiCost.setText("$ "+(amount[4]*cost[4]));
		
		sevenCost.setText("$ "+(amount[5]*cost[5])) ;
		
		burgerCost.setText("$ "+(amount[2]*cost[2])) ;
		
		totalCost.setText("$ "+((amount[0]*cost[0])+(amount[3]*cost[3])+(amount[1]*cost[1])+(amount[4]*cost[4])+(amount[2]*cost[2])+(amount[5]*cost[5])));
	}
	public void reset(){
		for(int i=0;i<cost.length;i++)
		   amount[i]=0;
		refresh();
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
