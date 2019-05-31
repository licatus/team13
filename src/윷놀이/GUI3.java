package ¿∑≥Ó¿Ã;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI3 extends JFrame {

	private JPanel contentPane;
	private final JButton btnNewButton_5 = new JButton("\uBC31\uB3C4");
	int Yut = 0;

	public GUI3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(790, 250, 100, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\uB3C4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		    Yut = 1;
			}
		});
		btnNewButton.setBounds(0, 0, 95, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uAC1C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Yut = 2;
			}
		});
		btnNewButton_1.setBounds(95, 0, 95, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uAC78");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Yut = 3;
			}
		});
		btnNewButton_2.setBounds(0, 35, 95, 35);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uC737");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Yut = 4;
			}
		});
		btnNewButton_3.setBounds(95, 35, 95, 35);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\uBAA8");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Yut = 5;
			}
		});
		btnNewButton_4.setBounds(0, 70, 95, 35);
		contentPane.add(btnNewButton_4);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Yut = -1;
			}
		});
		btnNewButton_5.setBounds(95, 70, 95, 35);
		contentPane.add(btnNewButton_5);
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
