
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

public class valmart extends vendor{
   double cost[]= {2.3,4.5,6.5,10.0,12.0,12.5};
   int    amount[]= {0,0,0,0,0,0};
   double total=0.0;
   String shopName="bananabee's";
   Calendar s;
   public JFrame frame;
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
					valmart window = new valmart();
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
	public valmart(Calendar x) {
		s=x;
		initialize();
	}
    public valmart(int [] amount,Calendar x) {
    	this.amount=amount;
    	s=x;
    	initialize();
    }
	public valmart() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 452);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		for(int i=0;i<cost.length;i++) {
			total+=cost[i]*amount[i];
		}
		JLabel lblNewLabel = new JLabel("Sushi");
		lblNewLabel.setBounds(60, 94, 61, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Fries");
		lblNewLabel_1.setBounds(60, 186, 61, 38);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Burgur");
		lblNewLabel_2.setBounds(60, 254, 61, 38);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Pizza");
		lblNewLabel_3.setBounds(219, 94, 61, 38);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Pepsi");
		lblNewLabel_4.setBounds(219, 173, 61, 38);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("7-up");
		lblNewLabel_5.setBounds(219, 259, 61, 29);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("shopping cart");
		lblNewLabel_6.setBounds(318, 88, 87, 16);
		frame.getContentPane().add(lblNewLabel_6);
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(amount[0]>0)
					amount[0]--;
				refresh();
			}
		});
		button.setBounds(27, 132, 30, 29);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("+");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amount[1]++;
				refresh();
			}
		});
		button_1.setBounds(96, 222, 30, 29);
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
		button_2.setBounds(96, 295, 30, 29);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("+");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amount[3]++;
				refresh();
			}
		});
		button_3.setBounds(250, 132, 30, 29);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("+");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amount[4]++;
				refresh();
			}
		});
		button_4.setBounds(250, 222, 30, 29);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("+");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amount[5]++;
				refresh();
			}
		});
		button_5.setBounds(250, 295, 30, 29);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("-");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(amount[1]>0)
					amount[1]--;
				    refresh();
			}
		});
		button_6.setBounds(27, 222, 30, 29);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("-");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(amount[2]>0)
					amount[2]--;
				    refresh();
			}
		});
		button_7.setBounds(27, 295, 30, 29);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("-");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(amount[5]>0)
					amount[5]--;
				    refresh();
			}
		});
		button_8.setBounds(185, 295, 30, 29);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("-");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(amount[4]>0)
					amount[4]--;
				    refresh();
			}
		});
		button_9.setBounds(185, 222, 30, 29);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("-");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(amount[3]>0)
					amount[3]--;
				    refresh();
			}
		});
		button_10.setBounds(185, 132, 30, 29);
		frame.getContentPane().add(button_10);
		
		sushiAmount = new JLabel(""+amount[0]);
		sushiAmount.setBounds(70, 132, 30, 28);
		frame.getContentPane().add(sushiAmount);
		
		pizzaAmount = new JLabel(""+amount[3]);
		pizzaAmount.setBounds(229, 115, 30, 47);
		frame.getContentPane().add(pizzaAmount);
		
		friesAmount = new JLabel(""+amount[1]);
		friesAmount.setBounds(70, 226, 30, 16);
		frame.getContentPane().add(friesAmount);
		
		pepsiAmount = new JLabel(""+amount[4]);
		pepsiAmount.setBounds(229, 231, 30, 16);
		frame.getContentPane().add(pepsiAmount);
		
		sevenAmount = new JLabel(""+amount[5]);
		sevenAmount.setBounds(229, 300, 30, 16);
		frame.getContentPane().add(sevenAmount);
		
		burgerAmount = new JLabel(""+amount[2]);
		burgerAmount.setBounds(70, 300, 30, 16);
		frame.getContentPane().add(burgerAmount);
		
		lblSushi = new JLabel("Sushi  x "+amount[0]);
		lblSushi.setBounds(316, 116, 76, 16);
		frame.getContentPane().add(lblSushi);
		
		lblPixxs = new JLabel("Pizza x "+amount[3]);
		lblPixxs.setBounds(316, 145, 76, 16);
		frame.getContentPane().add(lblPixxs);
		
		lblFries = new JLabel("Fries  x "+amount[1]);
		lblFries.setBounds(316, 173, 76, 16);
		frame.getContentPane().add(lblFries);
		
		lblBurgur = new JLabel("Burgur x "+amount[2]);
		lblBurgur.setBounds(316, 197, 76, 16);
		frame.getContentPane().add(lblBurgur);
		
		lblup = new JLabel("7-up  x "+amount[5]);
		lblup.setBounds(316, 227, 60, 16);
		frame.getContentPane().add(lblup);
		
		lblPepsi = new JLabel("Pepsi x "+amount[4]);
		lblPepsi.setBounds(316, 254, 60, 16);
		frame.getContentPane().add(lblPepsi);
		
		sushiCost = new JLabel("$ "+(cost[0]*amount[0]));
		sushiCost.setBounds(410, 115, 61, 16);
		frame.getContentPane().add(sushiCost);
		
		pizzaCost = new JLabel("$ "+(cost[3]*amount[3]));
		pizzaCost.setBounds(410, 145, 61, 16);
		frame.getContentPane().add(pizzaCost);
		
		friesCost = new JLabel("$ "+(cost[1]*amount[1]));
		friesCost.setBounds(410, 173, 61, 16);
		frame.getContentPane().add(friesCost);
		
		burgerCost = new JLabel("$ "+(cost[2]*amount[2]));
		burgerCost.setBounds(410, 197, 61, 16);
		frame.getContentPane().add(burgerCost);
		
		sevenCost = new JLabel("$ "+(cost[5]*amount[5]));
		sevenCost.setBounds(410, 227, 61, 16);
		frame.getContentPane().add(sevenCost);
		
		pepsiCost = new JLabel("$ "+(cost[4]*amount[4]));
		pepsiCost.setBounds(410, 254, 61, 16);
		frame.getContentPane().add(pepsiCost);
		
		totalCost = new JLabel("$ "+total);
		totalCost.setBounds(410, 286, 61, 16);
		frame.getContentPane().add(totalCost);
		
		lblTotal = new JLabel("Total");
		lblTotal.setBounds(316, 286, 61, 16);
		frame.getContentPane().add(lblTotal);
		
		JButton btnNewButton_1 = new JButton("Check Out");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckOut temp = new CheckOut(cost,amount,shopName,s);
				temp.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(369, 356, 106, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnNewButton_2.setBounds(279, 356, 90, 29);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton button_11 = new JButton("+");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amount[0]++;
				refresh();
			}
		});
		button_11.setBounds(96, 132, 30, 29);
		frame.getContentPane().add(button_11);
		
		JButton btnChangeStore = new JButton("change store");
		btnChangeStore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShopsInterface next= new ShopsInterface(s);
				next.setVisible(true);
				frame.dispose();
			}
		});
		btnChangeStore.setBounds(142, 356, 117, 29);
		frame.getContentPane().add(btnChangeStore);
		
		
		
		
	}
	
	
	//refresh
	public  void refresh() {
		sushiAmount.setText(""+amount[0]);
		
		pizzaAmount.setText(""+amount[3]);
		
		friesAmount.setText(""+amount[1]);
		
		pepsiAmount.setText(""+amount[4]);
		
		sevenAmount.setText(""+amount[5]) ;
		
		burgerAmount.setText(""+amount[2]) ;
		
		lblSushi.setText("Sushi x "+amount[0]);
		
		lblPixxs.setText("Pizza x "+amount[4]) ;
		
	    lblFries.setText("Fries x "+amount[1]) ;
		
		lblBurgur.setText("Burgur x "+amount[2]) ;
		
		lblup.setText("7-up x "+amount[5]) ;
		
		lblPepsi.setText("Pepsi x "+amount[0]) ;
		
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
