package 윷놀이;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class YutGui extends JFrame {

	private JPanel contentPane;
	private final JButton backdobtn = new JButton("백도");
	int Yut = 0;

	public YutGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(790, 250, 220, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton dobtn = new JButton("도");
		dobtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		    Yut = 1;
			}
		});
		dobtn.setBounds(0, 0, 95, 35);
		contentPane.add(dobtn);
		
		JButton gaebtn = new JButton("개");
		gaebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Yut = 2;
			}
		});
		gaebtn.setBounds(95, 0, 95, 35);
		contentPane.add(gaebtn);
		
		JButton gulbtn = new JButton("걸");
		gulbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Yut = 3;
			}
		});
		gulbtn.setBounds(0, 35, 95, 35);
		contentPane.add(gulbtn);
		
		JButton yutbtn = new JButton("윷");
		 yutbtn .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Yut = 4;
			}
		});
		 yutbtn .setBounds(95, 35, 95, 35);
		contentPane.add( yutbtn );
		
		JButton mobtn = new JButton("모");
		mobtn .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Yut = 5;
			}
		});
		mobtn .setBounds(0, 70, 95, 35);
		contentPane.add(mobtn );
		mobtn .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Yut = -1;
			}
		});
		backdobtn .setBounds(95, 70, 95, 35);
		contentPane.add(backdobtn );
	}
	int selYut() {
		Yut = 0;
		
		setVisible(true);
		while(Yut == 0) {
			System.out.print("");
		}
		setVisible(false);
		return Yut;
	}
}
