import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Tazmoto extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	private ImageIcon button_image, windows_image;
	private JButton file, windows;
	private JLabel label;
	public Tazmoto()
	{
		createView();
		setSize(450,450);
		setTitle("Tazmoto");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
	}
	
	private void createView() {
		JPanel panel = new JPanel(new FlowLayout());
		getContentPane().add(panel);
		
		button_image = new ImageIcon(getClass().getResource("Button_Java.png"));
		file = new JButton(button_image);
		panel.add(file);
		
		button_image = new ImageIcon(getClass().getResource("Button_Java.png"));
		file = new JButton(button_image);
		panel.add(file);
		
		windows_image = new ImageIcon(getClass().getResource("windows.png"));
		windows = new JButton(windows_image);
		panel.add(windows);
	}

	public class MainActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
		}}
	
	public static void main(String[]args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Tazmoto().setVisible(true);
				;
			}

		});
		
	}

}
