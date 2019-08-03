import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.AbstractAction;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class housedepot extends vendor{
   double cost[]= {2.3,4.5,6.5,10.0,12.0,12.5};
   int    amount[]= {0,0,0,0,0,0};
   double total=0.0;
   String shopName="thehousedepot";
   Calendar s;
   public JFrame frame;
	JLabel ti84lable;
		JLabel tabslable ;
		JLabel presharpenedlable ;
		JLabel drylable ;
		JLabel collegelable ;
		JLabel fileFolderlable ;
		JLabel lbti84 ;
		JLabel lbdry ;
		JLabel lbpresharpened ;
		JLabel lbFileFolder ;
		JLabel lbcollege ;
		JLabel lbtabs ;
		JLabel ti84costlb ;
		JLabel tabscostlb ;
		JLabel presharcostlb ;
		JLabel fileFoldercostlb ;
		JLabel collegecostlb ;
		JLabel drycostlb ;	
		JLabel totalCost;
     	JLabel lblTotal;
     	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					housedepot window = new housedepot();
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
	public housedepot(Calendar x) {
		s=x;
		initialize();
	}
    public housedepot(int [] amount,Calendar x) {
    	this.amount=amount;
    	s=x;
    	initialize();
    }
	public housedepot() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 685, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		for(int i=0;i<cost.length;i++) {
			total+=cost[i]*amount[i];
		}
		
		JButton btnNewButton_1 = new JButton("Check Out");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckOut temp = new CheckOut(cost,amount,shopName,s);
				temp.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(565, 449, 100, 65);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnNewButton_2.setBounds(376, 449, 75, 65);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnChangeStore = new JButton("change store");
		btnChangeStore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Shops_View next= new Shops_View(s);
				next.setVisible(true);
				frame.dispose();
			}
		});
		btnChangeStore.setBounds(456, 449, 100, 65);
		frame.getContentPane().add(btnChangeStore);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(Color.PINK, 1, true));
		panel.setBounds(20, 70, 166, 143);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("<html>Farrow Brown<br>Accent Ottoman<br></html>\n\n");
		label.setBounds(18, 6, 130, 70);
		panel.add(label);
		label.setHorizontalAlignment(SwingConstants.LEFT);
		
		JButton ti84BTNjian = new JButton("-");
		ti84BTNjian.setBounds(6, 87, 50, 50);
		panel.add(ti84BTNjian);
		
		JButton ti84BTN = new JButton("+");
		ti84BTN.setBounds(110, 87, 50, 50);
		panel.add(ti84BTN);
		
		ti84lable = new JLabel(""+amount[0]);
		ti84lable.setBounds(58, 86, 50, 50);
		panel.add(ti84lable);
		ti84lable.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel = new JLabel("$ "+cost[0]);
		lblNewLabel.setBounds(110, 70, 61, 16);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(Color.PINK, 1, true));
		panel_1.setBounds(20, 370, 166, 143);
		frame.getContentPane().add(panel_1);
		
		JLabel lblpostitTabsWith = new JLabel("<html>Foldable Storage<br>Cube/Ottoman<br>Charcoal Gary</html>");
		lblpostitTabsWith.setHorizontalAlignment(SwingConstants.LEFT);
		lblpostitTabsWith.setBounds(6, 6, 130, 81);
		panel_1.add(lblpostitTabsWith);
		
		JButton tabsBTN = new JButton("+");
		tabsBTN.setBounds(110, 87, 50, 50);
		panel_1.add(tabsBTN);
		
		tabslable = new JLabel(""+amount[3]);
		tabslable.setHorizontalAlignment(SwingConstants.CENTER);
		tabslable.setBounds(57, 86, 50, 50);
		panel_1.add(tabslable);
		
		JButton tabsBTNjian = new JButton("-");
		tabsBTNjian.setBounds(6, 87, 50, 50);
		panel_1.add(tabsBTNjian);
		
		JLabel label_5 = new JLabel("$ "+cost[5]);
		label_5.setBounds(105, 71, 61, 16);
		panel_1.add(label_5);
		tabsBTNjian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(amount[3]>0)
					amount[3]--;
				    refresh();
			}
		});
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(Color.PINK, 1, true));
		panel_2.setBounds(198, 370, 166, 143);
		frame.getContentPane().add(panel_2);
		
		JLabel lblexpoLowOdor = new JLabel("<html>Pflster Brea 3-Piece<br>Bath Accessory Kit<br>in Brushed Nickel</html>");
		lblexpoLowOdor.setHorizontalAlignment(SwingConstants.LEFT);
		lblexpoLowOdor.setBounds(6, 6, 130, 70);
		panel_2.add(lblexpoLowOdor);
		
		JButton dryBTNjian = new JButton("-");
		dryBTNjian.setBounds(6, 87, 50, 50);
		panel_2.add(dryBTNjian);
		
		drylable = new JLabel(""+amount[4]);
		drylable.setHorizontalAlignment(SwingConstants.CENTER);
		drylable.setBounds(57, 86, 50, 50);
		panel_2.add(drylable);
		drylable.setHorizontalTextPosition(SwingConstants.CENTER);
		
		JButton dryBTN = new JButton("+");
		dryBTN.setBounds(110, 87, 50, 50);
		panel_2.add(dryBTN);
		
		JLabel label_4 = new JLabel("$ "+cost[4]);
		label_4.setBounds(110, 72, 61, 16);
		panel_2.add(label_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(Color.PINK, 1, true));
		panel_3.setBounds(20, 220, 166, 143);
		frame.getContentPane().add(panel_3);
		
		JLabel lblstudentsGuideTo = new JLabel("<html>Chocolate Champion and<br>Motion Loveseat</html>");
		lblstudentsGuideTo.setHorizontalAlignment(SwingConstants.LEFT);
		lblstudentsGuideTo.setBounds(6, 6, 130, 67);
		panel_3.add(lblstudentsGuideTo);
		
		JButton collegeBTNjian = new JButton("-");
		collegeBTNjian.setBounds(6, 87, 50, 50);
		panel_3.add(collegeBTNjian);
		
		collegelable = new JLabel(""+amount[5]);
		collegelable.setBounds(58, 86, 50, 50);
		panel_3.add(collegelable);
		collegelable.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton collegeBNT = new JButton("+");
		collegeBNT.setBounds(110, 87, 50, 50);
		panel_3.add(collegeBNT);
		
		JLabel label_2 = new JLabel("$ "+cost[2]);
		label_2.setBounds(105, 70, 61, 16);
		panel_3.add(label_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(Color.PINK, 1, true));
		panel_4.setBounds(198, 70, 166, 143);
		frame.getContentPane().add(panel_4);
		
		JLabel lblSoftyellow = new JLabel("<html>Elements Sillicone<br>Tool<br>(set of 8)</html>");
		lblSoftyellow.setHorizontalAlignment(SwingConstants.LEFT);
		lblSoftyellow.setBounds(6, 6, 130, 81);
		panel_4.add(lblSoftyellow);
		
		JButton presharpenedBTNjian = new JButton("-");
		presharpenedBTNjian.setBounds(6, 87, 50, 50);
		panel_4.add(presharpenedBTNjian);
		
		presharpenedlable = new JLabel(""+amount[1]);
		presharpenedlable.setBounds(59, 86, 50, 50);
		panel_4.add(presharpenedlable);
		presharpenedlable.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton presharpenedBNT = new JButton("+");
		presharpenedBNT.setBounds(110, 87, 50, 50);
		panel_4.add(presharpenedBNT);
		
		JLabel label_1 = new JLabel("$ "+cost[1]);
		label_1.setBounds(105, 71, 61, 16);
		panel_4.add(label_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(Color.PINK, 1, true));
		panel_5.setBounds(198, 220, 166, 143);
		frame.getContentPane().add(panel_5);
		
		JLabel lblsmeadManilaFile = new JLabel("<html>450 Thread Count<br>Fitted Sheet<br></html>");
		lblsmeadManilaFile.setHorizontalAlignment(SwingConstants.LEFT);
		lblsmeadManilaFile.setBounds(6, 6, 130, 60);
		panel_5.add(lblsmeadManilaFile);
		
		JButton fileFolderBTN = new JButton("+");
		fileFolderBTN.setBounds(111, 87, 49, 50);
		panel_5.add(fileFolderBTN);
		
		JButton fileFolderBTNjian = new JButton("-");
		fileFolderBTNjian.setBounds(6, 87, 50, 50);
		panel_5.add(fileFolderBTNjian);
		
		fileFolderlable = new JLabel(""+amount[2]);
		fileFolderlable.setBounds(59, 86, 50, 50);
		panel_5.add(fileFolderlable);
		fileFolderlable.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_3 = new JLabel("$ "+cost[3]);
		label_3.setBounds(115, 72, 61, 16);
		panel_5.add(label_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(380, 70, 285, 367);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("shopping cart");
		lblNewLabel_6.setBounds(90, 6, 87, 25);
		panel_6.add(lblNewLabel_6);
		
		lbti84 = new JLabel("Accent Ottoman x "+amount[0]);
		lbti84.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lbti84.setHorizontalAlignment(SwingConstants.CENTER);
		lbti84.setBounds(6, 37, 171, 35);
		panel_6.add(lbti84);
		
		lbFileFolder = new JLabel("Fitted Sheet x "+amount[1]);
		lbFileFolder.setBackground(Color.WHITE);
		lbFileFolder.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lbFileFolder.setHorizontalAlignment(SwingConstants.CENTER);
		lbFileFolder.setBounds(47, 179, 130, 35);
		panel_6.add(lbFileFolder);
		
		lbcollege = new JLabel("Motion Loveseat  x "+amount[2]);
		lbcollege.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lbcollege.setHorizontalAlignment(SwingConstants.CENTER);
		lbcollege.setBounds(6, 131, 171, 35);
		panel_6.add(lbcollege);
		
		lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setBounds(6, 319, 130, 35);
		panel_6.add(lblTotal);
		
		ti84costlb = new JLabel("$ "+(cost[0]*amount[0]));
		ti84costlb.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		ti84costlb.setHorizontalAlignment(SwingConstants.CENTER);
		ti84costlb.setBounds(183, 38, 96, 35);
		panel_6.add(ti84costlb);
		
		fileFoldercostlb = new JLabel("$ "+(cost[1]*amount[1]));
		fileFoldercostlb.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		fileFoldercostlb.setHorizontalAlignment(SwingConstants.CENTER);
		fileFoldercostlb.setBounds(183, 179, 96, 35);
		panel_6.add(fileFoldercostlb);
		
		collegecostlb = new JLabel("$ "+(cost[2]*amount[2]));
		collegecostlb.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		collegecostlb.setHorizontalAlignment(SwingConstants.CENTER);
		collegecostlb.setBounds(183, 131, 96, 35);
		panel_6.add(collegecostlb);
		
		totalCost = new JLabel("$ "+total);
		totalCost.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		totalCost.setHorizontalAlignment(SwingConstants.CENTER);
		totalCost.setBounds(183, 322, 96, 35);
		panel_6.add(totalCost);
		
		lbpresharpened = new JLabel("Sillicone Tool x "+amount[3]);
		lbpresharpened.setBounds(6, 84, 171, 35);
		panel_6.add(lbpresharpened);
		lbpresharpened.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lbpresharpened.setHorizontalAlignment(SwingConstants.CENTER);
		
		lbdry = new JLabel("Bath Accessory Kit x "+amount[4]);
		lbdry.setBounds(6, 272, 171, 35);
		panel_6.add(lbdry);
		lbdry.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lbdry.setHorizontalTextPosition(SwingConstants.CENTER);
		lbdry.setHorizontalAlignment(SwingConstants.CENTER);
		
		lbtabs = new JLabel("Storage Cube x "+amount[5]);
		lbtabs.setBounds(6, 225, 171, 35);
		panel_6.add(lbtabs);
		lbtabs.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lbtabs.setHorizontalAlignment(SwingConstants.CENTER);
		
		presharcostlb = new JLabel("$ "+(cost[3]*amount[3]));
		presharcostlb.setBounds(183, 84, 96, 35);
		panel_6.add(presharcostlb);
		presharcostlb.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		presharcostlb.setHorizontalAlignment(SwingConstants.CENTER);
		
		drycostlb = new JLabel("$ "+(cost[5]*amount[5]));
		drycostlb.setBounds(183, 275, 96, 35);
		panel_6.add(drycostlb);
		drycostlb.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		drycostlb.setHorizontalAlignment(SwingConstants.CENTER);
		
		tabscostlb = new JLabel("$ "+(cost[3]*amount[3]));
		tabscostlb.setBounds(183, 226, 96, 35);
		panel_6.add(tabscostlb);
		tabscostlb.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		tabscostlb.setHorizontalAlignment(SwingConstants.CENTER);
		fileFolderBTNjian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(amount[2]>0)
					amount[2]--;
				    refresh();
			}
		});
		fileFolderBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amount[2]++;
				refresh();
				System.out.println(amount[2]);
				System.out.println(cost[2]);
			}
		});
		presharpenedBNT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amount[1]++;
				refresh();
			}
		});
		presharpenedBTNjian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(amount[1]>0)
					amount[1]--;
				    refresh();
			}
		});
		collegeBNT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amount[5]++;
				refresh();
			}
		});
		collegeBTNjian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(amount[5]>0)
					amount[5]--;
				    refresh();
			}
		});
		dryBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amount[4]++;
				refresh();
			}
		});
		dryBTNjian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(amount[4]>0)
					amount[4]--;
				    refresh();
			}
		});
		tabsBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amount[3]++;
				refresh();
			}
		});
		ti84BTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amount[0]++;
				refresh();
			}
		});
		ti84BTNjian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(amount[0]>0)
					amount[0]--;
				refresh();
			}
		});
		
	}
	
	
	//refresh
	public  void refresh() {
		ti84lable.setText(""+amount[0]);
		
		tabslable.setText(""+amount[3]);
		
		presharpenedlable.setText(""+amount[1]);
		
		drylable.setText(""+amount[4]);
		
		collegelable.setText(""+amount[5]) ;
		
		fileFolderlable.setText(""+amount[2]) ;
		
		lbti84.setText("Accent Ottoman x "+amount[0]);
		
		lbdry.setText("Dry Erase Markers x "+amount[4]) ;
		
	    lbpresharpened.setText("Sillicone Tool x "+amount[1]) ;
		
		lbFileFolder.setText("File Folder x "+amount[2]) ;
		
		lbcollege.setText("Motion Loveseat  x "+amount[5]) ;
		
		lbtabs.setText("Storage Cube x "+amount[3]) ;
		
		
		double temp = (amount[0]*cost[0]);
		temp = Math.round(temp);
        ti84costlb.setText("$ "+temp);
		
		tabscostlb.setText("$ "+(amount[3]*cost[3]));
		
		presharcostlb.setText("$ "+(amount[1]*cost[1]));
		
		drycostlb.setText("$ "+(amount[4]*cost[4]));
		
		collegecostlb.setText("$ "+(amount[5]*cost[5])) ;
		
		fileFoldercostlb.setText("$ "+(amount[2]*cost[2])) ;
		
		temp = ((amount[0]*cost[0])+(amount[3]*cost[3])+(amount[1]*cost[1])+(amount[4]*cost[4])+(amount[2]*cost[2])+(amount[5]*cost[5]));
		temp = Math.round(temp);
		totalCost.setText("$ "+ temp);
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