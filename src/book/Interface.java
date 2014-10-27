package book;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.xml.crypto.Data;

public class Interface extends JFrame {
	JMenu menus;
    JMenu menuss;
	JMenuBar menu;
	JMenuItem item1,item2,item3;
	JMenuItem item4,item5,item6,item7;
	JButton button;
	JLabel label,label2,label3;
	JPanel pane;
	Font font;
	Enter panel1;
	Clear panel2;
	Numcheck panel3;
	Namecheck panel4;
	Authorcheck panel5;
	Presscheck panel6;
	Change panel7;
	Book book ;
	Book book2 ;
	Library library = new Library();
	String string,string2;
    
	public Interface() {
		setLayout(new FlowLayout(FlowLayout.CENTER));
		label2 = new JLabel();
		label3 = new JLabel();
		label = new JLabel("ͼ��ݹ���ϵͳ");
		font = new Font("Serif",Font.BOLD, 40);
		label.setForeground(Color.DARK_GRAY);
		label.setFont(font);
		panel1 = new Enter();
		panel2 = new Clear();
		panel3 = new Numcheck();
		panel4 = new Namecheck();
		panel5 = new Authorcheck();
		panel6 = new Presscheck();
		panel7 = new Change();
		pane = new JPanel();
		pane.setLayout(new GridLayout(3,1));
		menu = new JMenuBar();
		menus = new JMenu("�˵�");
		menuss = new JMenu("��ѯ");
		item1 = new JMenuItem("¼��");
	    item2 = new JMenuItem("ɾ��");
	    item3 = new JMenuItem("�޸�");
	    item4 = new JMenuItem("����");
	    item5 = new JMenuItem("���");
	    item6 = new JMenuItem("������");
	    item7 = new JMenuItem("����");
	    pane.setSize(450, 250);
	    menuss.add(item4);
	    menuss.add(item5);
	    menuss.add(item6);
	    menuss.add(item7);
	    menus.add(item1);
	    menus.add(item2);
	    menus.add(item3);
	    menus.add(menuss);
	    menu.add(menus);
	    add(panel1);
	    add(panel2);
	    add(panel3);
	    add(panel4);
	    add(panel5);
	    add(panel6);
	    add(panel7);
	    add(pane);
	    pane.add(label2);
	    pane.add(label);
	    pane.add(label3);
	    label.setHorizontalAlignment(SwingUtilities.CENTER);
		setJMenuBar(menu);
		item1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel1.setVisible(true);
				pane.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
			}
		});
        item2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel2.setVisible(true);
				pane.setVisible(false);
				panel1.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
			}
		});
        item5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel2.setVisible(false);
				pane.setVisible(false);
				panel1.setVisible(false);
				panel3.setVisible(true);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
			}
		});
        item4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel2.setVisible(false);
				pane.setVisible(false);
				panel1.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(true);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
			}
		});
        item7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel2.setVisible(false);
				pane.setVisible(false);
				panel1.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(true);
				panel6.setVisible(false);
				panel7.setVisible(false);
				
			}
		});
        item6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel2.setVisible(false);
				pane.setVisible(false);
				panel1.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(true);
				panel7.setVisible(false);
				
			}
		});
        item3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel2.setVisible(false);
				pane.setVisible(false);
				panel1.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(true);
			}
		});
        panel1.getbutton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (panel1.gettext1().getText().equals("") || panel1.gettext2().getText().equals("") || panel1.gettext3().getText().equals("")
						|| panel1.gettext4().getText().equals("") || panel1.gettext5().getText().equals("")) {
					JOptionPane.showMessageDialog(null, "��Ϣ����Ϊ��");
				} else
					try{
				    library.getnumlist().get(panel1.gettext1().getText()).getNum();
					JOptionPane.showMessageDialog(null, "�Ѿ������Ȿ��");
				}catch (NullPointerException e) {
					book = new Book();
					book.setNum(panel1.gettext1().getText());
					book.setName(panel1.gettext2().getText());
					book.setAuthor(panel1.gettext3().getText());
					book.setPress(panel1.gettext4().getText());
					book.setDate(panel1.gettext5().getText());
					panel1.gettext1().setText("");
					panel1.gettext2().setText("");
					panel1.gettext3().setText("");
					panel1.gettext4().setText("");
					panel1.gettext5().setText("");
					library.addBook(book);
					JOptionPane.showMessageDialog(null, "¼��ɹ�");
				}
			}
		});
        panel7.getbutton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (panel7.gettext6().getText().equals("")) {
					JOptionPane.showMessageDialog(null, "������Ҫ�޸ĵ���");
				} else {
					try{
					book2 = new Book();
					book2 = library.getnamelist().get(panel7.gettext6().getText());
					panel7.gettext1().setText(book2.getNum());
					panel7.gettext2().setText(book2.getName());
					panel7.gettext3().setText(book2.getAuthor());
					panel7.gettext4().setText(book2.getPress());
					panel7.gettext5().setText(book2.getDate());
					library.removeBook(panel7.gettext6().getText());
					}catch(NullPointerException e){
						JOptionPane.showMessageDialog(null, "û���Ȿ��");
					}
				}
			}
		});
        panel7.getbutton2().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(panel7.gettext1().getText().equals("") || panel7.gettext2().getText().equals("") || panel7.gettext3().getText().equals("")
						|| panel7.gettext4().getText().equals("") || panel7.gettext5().getText().equals("")){
					JOptionPane.showMessageDialog(null, "������Ҫ�޸ĵ���");
				}else{
				book = new Book();
				book.setNum(panel7.gettext1().getText());
				book.setName(panel7.gettext2().getText());
				book.setAuthor(panel7.gettext3().getText());
				book.setPress(panel7.gettext4().getText());
				book.setDate(panel7.gettext5().getText());
				panel7.gettext1().setText("");
				panel7.gettext2().setText("");
				panel7.gettext3().setText("");
				panel7.gettext4().setText("");
				panel7.gettext5().setText("");
				panel7.gettext6().setText("");
				library.addBook(book);
				JOptionPane.showMessageDialog(null, "�޸ĳɹ�");
			}
				}
		});
        panel2.getbutton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(panel2.gettext().getText().equals("")){
					JOptionPane.showMessageDialog(null, "������Ҫɾ��������");
				}else if (library.removeBook(panel2.gettext().getText())) {
					     panel2.gettext().setText("");
						JOptionPane.showMessageDialog(null, "ɾ���ɹ�");
					}else {
						JOptionPane.showMessageDialog(null, "û���Ȿ��");
					}
			}
		});
        panel3.getbutton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (panel3.gettext().getText().equals("")) {
					JOptionPane.showMessageDialog(null, "������Ҫ��ѯ������");
				} else {
					try{
						book2 = new Book();
						book2 = library.getnumlist().get(panel3.gettext().getText());
						panel3.getarea().setText(book2.toString());
						panel3.gettext().setText("");
						}catch(NullPointerException e1){
							JOptionPane.showMessageDialog(null, "û�������ŵ���");
						}
				}
			}
		});
        panel4.getbutton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (panel4.gettext().getText().equals("")) {
					JOptionPane.showMessageDialog(null, "������Ҫ��ѯ������");
				} else {
					try{
						book2 = new Book();
						book2 = library.getnamelist().get(panel4.gettext().getText());
						panel4.getarea().setText(book2.toString());
						panel4.gettext().setText("");
						}catch(NullPointerException e1){
							JOptionPane.showMessageDialog(null, "û��������ֵ���");
						}
				}
			}
		});
        panel5.getbutton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				string = new String();
				if (panel5.gettext().getText().equals("")) {
					JOptionPane.showMessageDialog(null, "������Ҫ��ѯ���������");
				} else {
					try{
						Vector<Book>books = library.getauthorlist().get(panel5.gettext().getText());
						for(Book book:books ){
							string = string + book.toString();
						}
						panel5.getarea().setText(string);
						panel5.gettext().setText("");
						}catch(NullPointerException e1){
							JOptionPane.showMessageDialog(null, "û��������ߵ���");
						}
				}
			}
		});
        panel6.getbutton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				string2 = new String();
				if (panel6.gettext().getText().equals("")) {
					  JOptionPane.showMessageDialog(null, "������Ҫ��ѯ����ĳ�����");
				} else {
					try{
					Vector<Book> books = library.getpresslist().get(panel6.gettext().getText());
						for(Book book4 : books){
							string2 = string2 + book4.toString();
						}
						panel6.getarea().setText(string2);
						panel6.gettext().setText("");
						}catch(NullPointerException e1){
							JOptionPane.showMessageDialog(null, "û��������������");
						}
				}
			}
		});
		pane.setVisible(true);
	}
	
    public static void main(String[] args){
		Interface interface1 = new Interface();
		interface1.setSize(400,250);
		interface1.setVisible(true);
		interface1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
}
