package À·³îÀÌ;

import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

public class GUI extends JFrame {

	private JPanel contentPane;
	ImageIcon board;
    JScrollPane scrollPane;
    int state = 0;
    int horse = 0;
    String str1 = "1¹ø - ";
    JLabel logf = new JLabel("1\uBC88 - \uC737 \uB358\uC9C0\uAE30");
    JLabel logy = new JLabel("\uC737\uC744 \uB358\uC838\uC8FC\uC138\uC694");
    JLabel lblNewLabel5 = new JLabel("0");
    JLabel lblNewLabel6 = new JLabel("0");
    JLabel lblNewLabel7 = new JLabel("0");
    JLabel lblNewLabel8 = new JLabel("0");
    JLabel[] nlb = new JLabel[42];


	/**
	 * Create the frame.
	 */
	public GUI() {
	    
		board = new ImageIcon("board.png");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 20, 690, 560);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel = new JPanel() {
            public void paintComponent(Graphics g) {
                g.drawImage(board.getImage(), 0, 0, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        
        panel.setBounds(0,0,520,520);
        contentPane.add(panel);
        panel.setLayout(null);
        
        for(int i = 0;i<6;i++) {
        nlb[i] = new JLabel("0");
        nlb[i].setBounds(450, 430 - 78*i, 37, 55);
        nlb[i].setBackground(Color.RED);
        nlb[i].setFont(new Font("±¼¸²", Font.PLAIN, 58));
        nlb[i].setOpaque(true);  
        nlb[i].setVisible(false);
        panel.add(nlb[i]);
        }
        
        for(int j = 6;j<11;j++) {
        nlb[j] = new JLabel("0");
        nlb[j].setBounds(835 - 79*j, 40, 37, 55);
        nlb[j].setBackground(Color.RED);
        nlb[j].setFont(new Font("±¼¸²", Font.PLAIN, 58));
        nlb[j].setOpaque(true); 
        nlb[j].setVisible(false);
        panel.add(nlb[j]);    
        }
        
        for(int k = 11;k<16;k++) {
        nlb[k] = new JLabel("0");
        nlb[k].setBounds(38, -740 + 78*k, 37, 55);
        nlb[k].setBackground(Color.RED);
        nlb[k].setFont(new Font("±¼¸²", Font.PLAIN, 58));
        nlb[k].setOpaque(true); 
        nlb[k].setVisible(false);
        panel.add(nlb[k]);    
            }
        
        for(int w = 16;w<21;w++) {
        nlb[w] = new JLabel("0");
        nlb[w].setBounds(-1140 + 79*w, 430, 37, 55);
        nlb[w].setBackground(Color.RED);
        nlb[w].setFont(new Font("±¼¸²", Font.PLAIN, 58));
        nlb[w].setOpaque(true);
        nlb[w].setVisible(false);
        panel.add(nlb[w]);
        }
        
        for(int y = 26;y<31;y++) {
        nlb[y] = new JLabel("0");
        nlb[y].setBounds(245 - 70*(y-28), 230+(y-28)*70, 37, 55);
        nlb[y].setBackground(Color.RED);
        nlb[y].setFont(new Font("±¼¸²", Font.PLAIN, 58));
        nlb[y].setOpaque(true);  
        nlb[y].setVisible(false);
        panel.add(nlb[y]);
        }
        
        for(int p = 36;p<42;p++) {
        nlb[p] = new JLabel("0");
        nlb[p].setBounds(245 + 70*(p-38), 230 + 70*(p-38), 37, 55);
        nlb[p].setBackground(Color.RED);
        nlb[p].setFont(new Font("±¼¸²", Font.PLAIN, 58));
        nlb[p].setOpaque(true);  
        nlb[p].setVisible(false);
        panel.add(nlb[p]);
        }
        
        
        JButton btnNewButton1 = new JButton("1¹ø");
        btnNewButton1.setBounds(520, 320, 150, 40);
        contentPane.add(btnNewButton1);
        btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				horse = 1;
			}
		});
        
        JButton btnNewButton2 = new JButton("2¹ø");
        btnNewButton2.setBounds(520, 360, 150, 40);
        contentPane.add(btnNewButton2);
        btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				horse = 2;
			}
		});
        
        JButton btnNewButton3 = new JButton("3¹ø");
        btnNewButton3.setBounds(520, 400, 150, 40);
        contentPane.add(btnNewButton3);
        btnNewButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				horse = 3;
			}
		});
        
        JButton btnNewButton4 = new JButton("4¹ø");
        btnNewButton4.setBounds(520, 440, 150, 40);
        contentPane.add(btnNewButton4);
        btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				horse = 4;
			}
		});
        
        JButton btnNewButton5 = new JButton("5¹ø");
        btnNewButton5.setBounds(520, 480, 150, 40);
        contentPane.add(btnNewButton5);
        btnNewButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				horse = 5;
			}
		});
        
        JButton btnNewButton = new JButton("·£´ý");
        btnNewButton.setBounds(520, 220, 75, 100);
        contentPane.add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				state = 1;
			}
		});
        
        JButton btnNewButton0 = new JButton("¼±ÅÃ");
        btnNewButton0.setBounds(595, 220, 75, 100);
        contentPane.add(btnNewButton0);
        
        logf.setFont(new Font("±¼¸²", Font.BOLD, 18));
        logf.setBounds(520, 120, 150, 70);
        
        contentPane.add(logf);
        
        JLabel lblNewLabel1 = new JLabel("1\uBC88");
        lblNewLabel1.setBounds(520, 10, 75, 25);
        contentPane.add(lblNewLabel1);
        
        JLabel lblNewLabel2 = new JLabel("2\uBC88");
        lblNewLabel2.setBounds(520, 35, 75, 25);
        contentPane.add(lblNewLabel2);
        
        JLabel lblNewLabel3 = new JLabel("3\uBC88");
        lblNewLabel3.setBounds(520, 60, 75, 25);
        contentPane.add(lblNewLabel3);
        
        JLabel lblNewLabel4 = new JLabel("4\uBC88");
        lblNewLabel4.setBounds(520, 85, 75, 25);
        contentPane.add(lblNewLabel4);
        
        lblNewLabel5.setBounds(595, 10, 75, 25);
        contentPane.add(lblNewLabel5);
        
        lblNewLabel6.setBounds(595, 35, 75, 25);
        contentPane.add(lblNewLabel6);
        
        lblNewLabel7.setBounds(595, 60, 75, 25);
        contentPane.add(lblNewLabel7);
        
        lblNewLabel8.setBounds(595, 85, 75, 25);
        contentPane.add(lblNewLabel8);
        
        logy.setBounds(520, 190, 150, 30);
        contentPane.add(logy);
        
        btnNewButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				state = 2;
			}
		});

	}
	int staystate() {
		state = 0;
		while(state == 0)
		{
			System.out.print("");
		}
		return state;
	}
	int stayhorse() {
		horse = 0;
		while(horse == 0)
		{
			System.out.print("");
		}
		return horse;
	}
	public void setlogf(String string) {
		logf.setText(string);
	}
	public void setlogy(String string) {
		logy.setText(string);
	}
	public void setscore(int i, int sc) {
		String score = Integer.toString(sc);
		switch(i) {
		case 1 : lblNewLabel5.setText(score);
		break;
		case 2 : lblNewLabel6.setText(score);
		break;
		case 3 : lblNewLabel7.setText(score);
		break;
		case 4 : lblNewLabel8.setText(score);
		break;
		}
		
	}
	public void refresh(int i, int position, String hn) {
		if((position>20&&position<26)||position>41) {
		}
		else
		{
			switch(i) {
			case 1: 
			nlb[position].setBackground(Color.RED);
			nlb[position].setText(hn);
			nlb[position].setVisible(true);
			break;
			case 2: 
			nlb[position].setBackground(Color.BLUE);
			nlb[position].setText(hn);
			nlb[position].setVisible(true);
			break;
			case 3: 
			nlb[position].setBackground(Color.YELLOW);
			nlb[position].setText(hn);
			nlb[position].setVisible(true);
			break;
			case 4: 
			nlb[position].setBackground(Color.GREEN);
			nlb[position].setText(hn);
			nlb[position].setVisible(true);
			break;
			}
			switch (hn.length())
			{
			case 1:
				nlb[position].setFont(new Font("±¼¸²", Font.PLAIN, 58));
				break;
			case 2:
				nlb[position].setFont(new Font("±¼¸²", Font.PLAIN, 29));
				break;
			case 3:
				nlb[position].setFont(new Font("±¼¸²", Font.PLAIN, 19));
				break;
			case 4:
				nlb[position].setFont(new Font("±¼¸²", Font.PLAIN, 14));
				break;
			case 5:
				nlb[position].setFont(new Font("±¼¸²", Font.PLAIN, 11));
				break;
			case 6:
				nlb[position].setFont(new Font("±¼¸²", Font.PLAIN, 9));
				
			}
		}
	}
	public void setlogy(int j) {
		switch(j){
		case -1:
		logy.setText("¹éµµ°¡ ³ª¿Ô½À´Ï´Ù");
		break;
		case 1:
			logy.setText("µµ°¡ ³ª¿Ô½À´Ï´Ù");
			break;
		case 2:
			logy.setText("°³°¡ ³ª¿Ô½À´Ï´Ù");
			break;
		case 3:
			logy.setText("°ÉÀÌ ³ª¿Ô½À´Ï´Ù");
			break;
		case 4:
			logy.setText("À·ÀÌ ³ª¿Ô½À´Ï´Ù");
			break;
		case 5:
			logy.setText("¸ð°¡ ³ª¿Ô½À´Ï´Ù");
			break;
		}
		
	}
	public void remove(int position) {
		nlb[position].setVisible(false);
	}
}
