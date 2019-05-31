package ¿∑≥Ó¿Ã;

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

public class GUI2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	static int x = 0;
	static int y = 0;
	static int z = 0;

	
	public GUI2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 80, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("±º∏≤", Font.BOLD, 12));
		textField.setBounds(100, 12, 70, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\uC0AC\uB78C \uC218");
		lblNewLabel.setFont(new Font("±º∏≤", Font.PLAIN, 15));
		lblNewLabel.setBounds(12, 12, 60, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uB9D0 \uC218");
		lblNewLabel_1.setFont(new Font("±º∏≤", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(12, 42, 60, 20);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("±º∏≤", Font.BOLD, 12));
		textField_1.setBounds(100, 42, 70, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("\uAC8C\uC784 \uC2DC\uC791");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = Integer.parseInt(textField.getText());
				y = Integer.parseInt(textField_1.getText());
				z = 1;
				dispose();
			}
		});
		btnNewButton.setFont(new Font("±º∏≤", Font.BOLD, 10));
		btnNewButton.setBounds(50, 80, 80, 24);
		contentPane.add(btnNewButton);
	}
	public static void pause() {
		while(z==0)
		{
			System.out.print("");
		}
	}
}
