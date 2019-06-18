import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JProgressBar;
import java.awt.TextField;
import java.awt.Cursor;

public class play extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TextField pcchoice = new TextField();
	TextField uchoice = new TextField();
	int choice,p,turns=0; 
	int user,pc;
	void game(int u)
	{
		 if(turns<=5)
		 {
		           // create instance of Random class
        Random rand = new Random();
                   // Generate random integers in range 0 to 999
        
		
		p=rand.nextInt(3);
		p++;
		
		/*if(u==2)
			rps.u=3;
		if(u==3)
			rps.u=2;*/
		String sp=new String();
		String su=new String();
		switch(u) //USER CHOICE
		{
			case  1: su="PAPER";
			       break;
			case  2: su="SCISSOR";
			       break;
			case  3: su="ROCK";
			       break;
		}
		
		//System.out.println("\n--->Your Choice :"+s);
		switch(p) //PC CHOICE
		{
			case  1: sp="PAPER";
			       break;
			case  2: sp="SCISSOR";
			       break;
			case  3: sp="ROCK";
			       break;
		}		   	   	   
		//System.out.println("\n--->Opponents choice :"+s);
		pcchoice.setText(sp);
		uchoice.setText(su);
		if(u==1&&p==3)
		{ 
	     user++;
		 //return;
		} 
		if(u==3&&p==1)
		{
		 pc++;
		 return;
		}	
		if(u>p && !(u==p))
		{
		 user++;
		}
		if(u<p && !(u==p))
		{
	      pc++;
		}
		USER.setText(""+user);
		COMP.setText(""+pc);
	}
		 else
		 {
			  if(user>pc)
			  {
			 try {
					gameover dialog = new gameover();
					dialog.ret(user,pc);
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e)
			      {
					e.printStackTrace();
				  }
			  }
			  else if(user<pc)
			  {try {
					gamepc dialog = new gamepc();
					dialog.ret(user, pc);
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			 
			  
		 }
			  else
			  {
				     
				  try {
						tie dialog = new tie();
						dialog.abc(user, pc);
						dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
						dialog.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				  
			  }  

		 }
		 }
    
	private JPanel contentPane;
	private JTextField USER;
	private JTextField COMP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					play frame = new play();
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
	public play() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1013, 669);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton ROCK = new JButton("");
		ROCK.setIcon(new ImageIcon("C:\\Users\\Sharvari Deshmukh\\Desktop\\Programs\\sd\\src\\rock.jpg"));
		ROCK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				choice=3;
				turns++;
				game(choice);
			}
		});
		ROCK.setForeground(new Color(255, 255, 0));
		ROCK.setBackground(new Color(160, 82, 45));
		ROCK.setToolTipText("ROCK");
		ROCK.setBounds(28, 356, 265, 254);
		panel.add(ROCK);
		
		JButton PAPER = new JButton("");
		PAPER.setBackground(new Color(0, 139, 139));
		PAPER.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				choice=1;
				turns++;
				game(choice);
			}
		});
		PAPER.setToolTipText("PAPER");
		PAPER.setIcon(new ImageIcon("C:\\Users\\Sharvari Deshmukh\\Desktop\\Programs\\sd\\src\\paper.jpg"));
		PAPER.setBounds(363, 356, 257, 254);
		panel.add(PAPER);
		
		JButton SCISSOR = new JButton("");
		SCISSOR.setToolTipText("SCISSORS");
		SCISSOR.setBackground(new Color(255, 0, 0));
		SCISSOR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				choice=2;
				turns++;
				game(choice);
				
			}
		});
		SCISSOR.setIcon(new ImageIcon("C:\\Users\\Sharvari Deshmukh\\Desktop\\Programs\\sd\\src\\scissor.png"));
		SCISSOR.setBounds(720, 356, 257, 254);
		panel.add(SCISSOR);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(255, 105, 180));
		panel_1.setBounds(28, 23, 449, 313);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		Panel panel_3 = new Panel();
		panel_3.setBounds(0, 0, 225, 313);
		panel_3.setBackground(new Color(102, 205, 170));
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("YOU CHOSE :");
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblNewLabel_2.setBounds(26, 24, 128, 43);
		panel_3.add(lblNewLabel_2);
		
		
		uchoice.setEditable(false);
		uchoice.setBounds(26, 99, 176, 100);
		panel_3.add(uchoice);
		
		JLabel lblNewLabel_3 = new JLabel("OPPONENT CHOSE :");
		lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblNewLabel_3.setBounds(252, 25, 154, 34);
		panel_1.add(lblNewLabel_3);
		
		
		pcchoice.setEditable(false);
		pcchoice.setBounds(252, 101, 165, 96);
		panel_1.add(pcchoice);
		
		Panel panel_2 = new Panel();
		panel_2.setBounds(516, 23, 411, 313);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("YOUR SCRORE :");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(10, 21, 157, 37);
		panel_2.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("OPPONENT :");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(222, 21, 131, 37);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		COMP = new JTextField();
		COMP.setEditable(false);
		COMP.setFont(new Font("Comic Sans MS", Font.BOLD, 36));
		COMP.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		COMP.setBackground(new Color(255, 255, 0));
		COMP.setBounds(232, 69, 131, 114);
		panel_2.add(COMP);
		COMP.setToolTipText("OPONENTS SCORE");
		COMP.setHorizontalAlignment(SwingConstants.CENTER);
		COMP.setColumns(10);
		
		USER = new JTextField();
		USER.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		USER.setEditable(false);
		USER.setFont(new Font("Comic Sans MS", Font.BOLD, 36));
		USER.setBackground(new Color(127, 255, 0));
		USER.setBounds(33, 69, 131, 114);
		panel_2.add(USER);
		USER.setToolTipText("YOUR SCORE");
		USER.setHorizontalAlignment(SwingConstants.CENTER);
		USER.setColumns(10);
	}
}
