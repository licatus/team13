package 윷놀이;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class SetGameGui extends JFrame {

	private JPanel contentPane;
	private JTextField ptext;
	private JTextField htext ;
	static int getp = 0;
	static int geth= 0;
	static int z = 0;

	
	public SetGameGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ptext = new JTextField();
		ptext.setFont(new Font("굴림", Font.BOLD, 12));
		ptext.setBounds(100, 12, 70, 20);
		contentPane.add(ptext);
		ptext.setColumns(10);
		
		JLabel plabel = new JLabel("사람 수");
		plabel.setFont(new Font("굴림", Font.PLAIN, 15));
		plabel.setBounds(12, 12, 60, 20);
		contentPane.add(plabel);
		
		JLabel hlabel = new JLabel("말 수 ");
		hlabel.setFont(new Font("굴림", Font.PLAIN, 15));
		hlabel.setBounds(12, 42, 60, 20);
		contentPane.add(hlabel);
		
		htext = new JTextField();
		htext.setFont(new Font("굴림", Font.BOLD, 12));
		htext.setBounds(100, 42, 70, 20);
		contentPane.add(htext);
		htext.setColumns(10);
		
		JButton startbutton = new JButton("게임시작");
		startbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			getp= Integer.parseInt(ptext.getText());
			geth = Integer.parseInt(htext.getText());
				z = 1;
				dispose();
			}
		});
		startbutton.setFont(new Font("굴림", Font.BOLD, 10));
		startbutton.setBounds(50, 80, 100, 24);
		contentPane.add(startbutton);
	}
	public static void pause() {
		while(z==0)
		{
			System.out.print("");
		}
	}
}
