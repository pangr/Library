package book;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Clear extends JPanel{
	JLabel label;
	JTextField text;
	JButton button;
	private Panel panel = new Panel();
	Library library = new Library();
	public Clear(){
		panel.setLayout(new FlowLayout(20));
		setLayout(new BorderLayout());
		label = new JLabel("ÊéÃû");
		text = new JTextField(15);
		button = new JButton("É¾³ý");
		panel.add(label);
		panel.add(text);
		add(panel,BorderLayout.CENTER);
		add(button,BorderLayout.EAST);
		setVisible(false);
	}
    public JButton getbutton(){
    	return button;
    }
    public JTextField gettext(){
		return text;
	}
}
