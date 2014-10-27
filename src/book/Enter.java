package book;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Enter extends JPanel {
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JLabel label5;
	JTextField text1;
	JTextField text2;
	JTextField text3;
	JTextField text4;
	JTextField text5;
	JButton button;
	public Enter() {
		setLayout(new GridLayout(6, 2, 10, 0));
		label1 = new JLabel("编号");
		label2 = new JLabel("书名");
		label3 = new JLabel("作者");
		label4 = new JLabel("出版社");
		label5 = new JLabel("出版日期");
		text1 = new JTextField(8);
		text2 = new JTextField(8);
		text3 = new JTextField(8);
		text4 = new JTextField(8);
		text5 = new JTextField(8);
		button = new JButton("录入");
		add(label1);
		add(text1);
		add(label2);
		add(text2);
		add(label3);
		add(text3);
		add(label4);
		add(text4);
		add(label5);
		add(text5);
		add(button);
		setVisible(false);
	}
	public JButton getbutton(){
		return button;
	}
	public JTextField gettext1(){
		return text1;
	}
	public JTextField gettext2(){
		return text2;
	}
	public JTextField gettext3(){
		return text3;
	}
	public JTextField gettext4(){
		return text4;
	}
	public JTextField gettext5(){
		return text5;
	}
	
}