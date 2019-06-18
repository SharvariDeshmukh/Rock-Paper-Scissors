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

public class tie extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtItsATie;
	private JTextField yourscore;
	private JTextField pcscore;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			tie dialog = new tie();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void abc(int u,int p)
	{
		yourscore.setText(" "+u);
		pcscore.setText(" "+p);
	}

	/**
	 * Create the dialog.
	 */
	public tie() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			Panel panel = new Panel();
			panel.setBackground(new Color(0, 139, 139));
			panel.setBounds(0, 0, 434, 262);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				txtItsATie = new JTextField();
				txtItsATie.setEditable(false);
				txtItsATie.setHorizontalAlignment(SwingConstants.CENTER);
				txtItsATie.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
				txtItsATie.setForeground(new Color(255, 255, 255));
				txtItsATie.setText("IT's A TIE !!");
				txtItsATie.setBackground(new Color(112, 128, 144));
				txtItsATie.setBounds(10, 23, 414, 77);
				panel.add(txtItsATie);
				txtItsATie.setColumns(10);
			}
			{
				JLabel lblNewLabel = new JLabel("YOUR SCORE :");
				lblNewLabel.setForeground(new Color(255, 255, 255));
				lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
				lblNewLabel.setBounds(45, 152, 134, 34);
				panel.add(lblNewLabel);
			}
			{
				JLabel pcscore = new JLabel("OPPONENT'S SCORE :");
				pcscore.setForeground(new Color(255, 255, 255));
				pcscore.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
				pcscore.setBounds(45, 197, 217, 34);
				panel.add(pcscore);
			}
			{
				yourscore = new JTextField();
				yourscore.setEditable(false);
				yourscore.setBounds(261, 161, 86, 20);
				panel.add(yourscore);
				yourscore.setColumns(10);
			}
			{
				pcscore = new JTextField();
				pcscore.setEditable(false);
				pcscore.setBounds(261, 206, 86, 20);
				panel.add(pcscore);
				pcscore.setColumns(10);
			}
		}
	}

}
