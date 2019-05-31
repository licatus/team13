package À·³îÀÌ;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.Font;

public class GUI4 extends JFrame {

	private JPanel contentPane;

	public GUI4(int i) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(270, 270, 200, 100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		String str = Integer.toString(i);
		str = "½ÂÀÚ ÇÃ·¹ÀÌ¾î" + str;
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 24));
		lblNewLabel.setText(str);
		contentPane.add(lblNewLabel, "name_896204713956490");
	}

}
