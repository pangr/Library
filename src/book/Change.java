package book;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Change extends JPanel{
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JLabel label5;
	JLabel label6;
	JTextField text1;
	JTextField text2;
	JTextField text3;
	JTextField text4;
	JTextField text5;
	JTextField text6;
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JButton button;
	JButton button2;
	public Change(){
		setLayout(new BorderLayout());
		panel.setLayout(new FlowLayout());
		panel2.setLayout(new GridLayout(5,2));
		label1 = new JLabel("编号");
		label2 = new JLabel("书名");
		label3 = new JLabel("作者");
		label4 = new JLabel("出版社");
		label5 = new JLabel("出版日期");
		label6 = new JLabel("输入修改书名");
		text1 = new JTextField(8);
		text2 = new JTextField(8);
		text3 = new JTextField(8);
		text4 = new JTextField(8);
		text5 = new JTextField(8);
		text6 = new JTextField(9);
	    button = new JButton("查询");
	    button2 = new JButton("修改");
		panel2.add(label1);
		panel2.add(text1);
		panel2.add(label2);
		panel2.add(text2);
		panel2.add(label3);
		panel2.add(text3);
		panel2.add(label4);
		panel2.add(text4);
		panel2.add(label5);
		panel2.add(text5);
		panel.add(label6);
		panel.add(text6);
		panel.add(button);
		panel3.add(button2);
		add(panel,BorderLayout.NORTH);
		add(panel2,BorderLayout.CENTER);
		add(panel3,BorderLayout.SOUTH);
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
	public JTextField gettext6(){
		return text6;
	}
	public JButton getbutton2(){
		return button2;
	}
}
