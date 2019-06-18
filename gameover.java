import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gameover extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtYouWin;
	private JTextField yourScore;
	private JTextField opponentsScore;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			gameover dialog = new gameover();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public void ret(int u,int p)
	{
		yourScore.setText(" "+u);
		opponentsScore.setText(" "+p);
	}
	public gameover() {
		getContentPane().setBackground(new Color(128, 0, 128));
		getContentPane().setForeground(new Color(128, 128, 0));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 434, 1);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			Panel panel = new Panel();
			panel.setBounds(212, 10, 212, 256);
			contentPanel.add(panel);
		}
		{
			txtYouWin = new JTextField();
			txtYouWin.setEditable(false);
			txtYouWin.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
			txtYouWin.setForeground(new Color(0, 0, 0));
			txtYouWin.setHorizontalAlignment(SwingConstants.CENTER);
			txtYouWin.setText("YOU WIN ! ! !");
			txtYouWin.setBackground(new Color(255, 105, 180));
			txtYouWin.setBounds(21, 23, 391, 67);
			getContentPane().add(txtYouWin);
			txtYouWin.setColumns(10);
		}
		{
			JLabel lblYourScore = new JLabel("YOUR SCORE :");
			lblYourScore.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
			lblYourScore.setForeground(new Color(255, 255, 255));
			lblYourScore.setBounds(51, 137, 130, 25);
			getContentPane().add(lblYourScore);
		}
		{
			JLabel lblOpponentsScore = new JLabel("OPPONENT'S SCORE :");
			lblOpponentsScore.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
			lblOpponentsScore.setForeground(new Color(255, 255, 255));
			lblOpponentsScore.setBounds(51, 173, 180, 25);
			getContentPane().add(lblOpponentsScore);
		}
		{
			yourScore = new JTextField();
			yourScore.setEditable(false);
			yourScore.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
			yourScore.setBounds(241, 141, 86, 20);
			getContentPane().add(yourScore);
			yourScore.setColumns(10);
			//
		}
		{
			opponentsScore = new JTextField();
			opponentsScore.setEditable(false);
			opponentsScore.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
			opponentsScore.setBounds(241, 177, 86, 20);
			getContentPane().add(opponentsScore);
			opponentsScore.setColumns(10);
			//
		}
	}
	


		
	

}
