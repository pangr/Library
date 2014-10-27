package book;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Namecheck extends JPanel{
	JTextArea textArea;
	JLabel label;
	JLabel label6;
	
	JTextField text6;
	JPanel panel = new JPanel();
	JScrollPane panel2;
	JPanel panel3 = new JPanel();
	JButton button;
	public Namecheck(){
		setLayout(new BorderLayout());
		panel.setLayout(new FlowLayout());
		panel3.setLayout(new GridLayout(1,1));
		label = new JLabel("结果");
		label6 = new JLabel("输入书名");
		textArea = new JTextArea(6,1);
		textArea.setLineWrap(true);
		panel2 = new JScrollPane(textArea);
		text6 = new JTextField(9);
	    button = new JButton("查询");
		panel.add(label6);
		panel.add(text6);
		panel.add(button);
		panel3.add(panel2);
		add(panel,BorderLayout.NORTH);
		add(panel3,BorderLayout.SOUTH);
		setVisible(false);
	}
	public JButton getbutton(){
		return button;
	}
	public JTextField gettext(){
		return text6;
	}
	public JTextArea getarea(){
		return textArea;
	}
}
