package 윷놀이;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.Font;

public class WinnerGui extends JFrame {

	private JPanel contentPane;

	public  WinnerGui(int i) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(270, 270, 200, 100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		String str = Integer.toString(i);
		str = "승자 플레이어" + str;
		
		JLabel WinnerLabel = new JLabel("New label");
		WinnerLabel.setFont(new Font("굴림", Font.BOLD, 24));
		WinnerLabel.setText(str);
		contentPane.add(WinnerLabel, "name_896204713956490");
	}

}
