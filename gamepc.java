import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class gamepc extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField Youlose;
	private JTextField yourscore;
	private JTextField pcscore;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			gamepc dialog = new gamepc();
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
		yourscore.setText(" "+u);
		pcscore.setText(" "+p);
	}
	public gamepc() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			Panel panel = new Panel();
			panel.setBackground(new Color(0, 0, 0));
			panel.setBounds(0, 0, 434, 262);
			contentPanel.add(panel);
			panel.setLayout(null);
			
			Youlose = new JTextField();
			Youlose.setHorizontalAlignment(SwingConstants.CENTER);
			Youlose.setEditable(false);
			Youlose.setToolTipText("better luck next time");
			Youlose.setText("YOU LOSE ! !");
			Youlose.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
			Youlose.setBounds(26, 34, 382, 64);
			panel.add(Youlose);
			Youlose.setColumns(10);
			
			JLabel lblYourScore = new JLabel("YOUR SCORE :");
			lblYourScore.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
			lblYourScore.setForeground(new Color(255, 255, 255));
			lblYourScore.setBounds(56, 150, 119, 20);
			panel.add(lblYourScore);
			
			JLabel lblOpponentsScor = new JLabel("OPPONENT'S SCORE:");
			lblOpponentsScor.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
			lblOpponentsScor.setForeground(new Color(255, 255, 255));
			lblOpponentsScor.setBounds(56, 181, 193, 35);
			panel.add(lblOpponentsScor);
			
			yourscore = new JTextField();
			yourscore.setEditable(false);
			yourscore.setBounds(288, 152, 86, 20);
			panel.add(yourscore);
			yourscore.setColumns(10);
			
			pcscore = new JTextField();
			pcscore.setEditable(false);
			pcscore.setBounds(288, 190, 86, 20);
			panel.add(pcscore);
			pcscore.setColumns(10);
		}
	}

}
