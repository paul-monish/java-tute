package SwingExample;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//class Addition extends JFrame implements ActionListener{
//	JLabel l;
//	JTextField t1;
//	JTextField t2;
//	public Addition() {
//		t1=new JTextField(20);
//		t2=new JTextField(20);
//		JButton b=new JButton("+");
//		l=new JLabel("Result");
//		add(t1);
//		add(t2);
//		add(b);
//		add(l);
//	
//		b.addActionListener(this);
//		
//		setLayout(new FlowLayout());
//		setVisible(true);
//		setSize(400,400);	
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		int num1=Integer.parseInt(t1.getText()) ;
//		int num2=Integer.parseInt(t2.getText()) ;
//		int res=num1+num2;
//		l.setText(res+ "");
//		
//	}
//}

class Addition extends JFrame{

	public Addition() {
		JTextField t1=new JTextField(20);
		JTextField t2=new JTextField(20);
		JButton b=new JButton("+");
		JButton b1=new JButton("-");
		JLabel l=new JLabel("");
		add(t1);
		add(t2);
		add(b);
		add(b1);
		add(l);
		b.addActionListener((e) ->{
				int num1=Integer.parseInt(t1.getText()) ;
				int num2=Integer.parseInt(t2.getText()) ;
				int res=num1+num2;
				l.setText(res+ "");
			}
		);
		b1.addActionListener((e) ->{
			int num1=Integer.parseInt(t1.getText()) ;
			int num2=Integer.parseInt(t2.getText()) ;
			int res=num1-num2;
			l.setText(res+ "");
		}
		);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);	
	}

	
}
public class Calculator {

	public static void main(String[] args) {
		new Addition();
	}

}


void paint(Graphics g) {
	g.drawString("hello", 10, 15);
}
