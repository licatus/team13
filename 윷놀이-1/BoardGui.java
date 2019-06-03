package 윷놀이;

import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

public class BoardGui extends JFrame {

	private JPanel contentPane;
	ImageIcon board;
    JScrollPane scrollPane;
    int state = 0;
    int horse = 0;
    String str1 = "1번 - ";
    JLabel logf = new JLabel("1번- \uC737 \uB358\uC9C0\uAE30");
    JLabel logy = new JLabel("윷을 던져주세요");
    JLabel[] nlb = new JLabel[42];
    JLabel[] psc = new JLabel[8];
    JButton[] jbt = new JButton[5];

	/**
	 * Create the frame.
	 */
	public BoardGui(int pn, int hn) {
		psc[4] = new JLabel("0");
		psc[5] = new JLabel("0");
		psc[6] = new JLabel("0");
	    psc[7] = new JLabel("0");

	    
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
        nlb[i].setFont(new Font("굴림", Font.PLAIN, 58));
        nlb[i].setOpaque(true);  
        nlb[i].setVisible(false);
        panel.add(nlb[i]);
        }
        
        for(int j = 6;j<11;j++) {
        nlb[j] = new JLabel("0");
        nlb[j].setBounds(835 - 79*j, 40, 37, 55);
        nlb[j].setBackground(Color.RED);
        nlb[j].setFont(new Font("굴림", Font.PLAIN, 58));
        nlb[j].setOpaque(true); 
        nlb[j].setVisible(false);
        panel.add(nlb[j]);    
        }
        
        for(int k = 11;k<16;k++) {
        nlb[k] = new JLabel("0");
        nlb[k].setBounds(38, -740 + 78*k, 37, 55);
        nlb[k].setBackground(Color.RED);
        nlb[k].setFont(new Font("굴림", Font.PLAIN, 58));
        nlb[k].setOpaque(true); 
        nlb[k].setVisible(false);
        panel.add(nlb[k]);    
            }
        
        for(int w = 16;w<21;w++) {
        nlb[w] = new JLabel("0");
        nlb[w].setBounds(-1140 + 79*w, 430, 37, 55);
        nlb[w].setBackground(Color.RED);
        nlb[w].setFont(new Font("굴림", Font.PLAIN, 58));
        nlb[w].setOpaque(true);
        nlb[w].setVisible(false);
        panel.add(nlb[w]);
        }
        
        for(int y = 26;y<31;y++) {
        nlb[y] = new JLabel("0");
        nlb[y].setBounds(245 - 70*(y-28), 230+(y-28)*70, 37, 55);
        nlb[y].setBackground(Color.RED);
        nlb[y].setFont(new Font("굴림", Font.PLAIN, 58));
        nlb[y].setOpaque(true);  
        nlb[y].setVisible(false);
        panel.add(nlb[y]);
        }
        
        for(int p = 36;p<42;p++) {
        nlb[p] = new JLabel("0");
        nlb[p].setBounds(245 + 70*(p-38), 230 + 70*(p-38), 37, 55);
        nlb[p].setBackground(Color.RED);
        nlb[p].setFont(new Font("굴림", Font.PLAIN, 58));
        nlb[p].setOpaque(true);  
        nlb[p].setVisible(false);
        panel.add(nlb[p]);
        }
        
        
        jbt[0] = new JButton("1번 말");
        jbt[0].setBounds(520, 320, 150, 40);
        jbt[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				horse = 1;
			}
		});
        
        jbt[1] = new JButton("2번 말");
        jbt[1].setBounds(520, 360, 150, 40);
        jbt[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				horse = 2;
			}
		});
        
        jbt[2] = new JButton("3번 말");
        jbt[2].setBounds(520, 400, 150, 40);
        jbt[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				horse = 3;
			}
		});
        
        jbt[3] = new JButton("4번 말");
        jbt[3].setBounds(520, 440, 150, 40);
        jbt[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				horse = 4;
			}
		});
        
        jbt[4] = new JButton("5번 말");
        jbt[4].setBounds(520, 480, 150, 40);
        jbt[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				horse = 5;
			}
		});
        
        for(int i = 0; i<hn; i++)
	    {
	    	contentPane.add(jbt[i]);
	    }
        
        JButton btnNewButton = new JButton("랜덤");
        btnNewButton.setBounds(520, 220, 75, 100);
        contentPane.add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				state = 1;
			}
		});
        
        JButton btnNewButton0 = new JButton("선택");
        btnNewButton0.setBounds(595, 220, 75, 100);
        contentPane.add(btnNewButton0);
        
        logf.setFont(new Font("굴림", Font.BOLD, 18));
        logf.setBounds(520, 120, 150, 70);
        
        contentPane.add(logf);
        
        psc[0] = new JLabel("1번 player");
        psc[0].setBounds(520, 10, 75, 25);
        psc[1] = new JLabel("2번 player");
        psc[1].setBounds(520, 35, 75, 25);
        psc[2] = new JLabel("3번 player");
        psc[2].setBounds(520, 60, 75, 25);
        psc[3] = new JLabel("4번 player");
        psc[3].setBounds(520, 85, 75, 25);
        psc[4].setBounds(595, 10, 75, 25);
        psc[5].setBounds(595, 35, 75, 25);
        psc[6].setBounds(595, 60, 75, 25);
        psc[7].setBounds(595, 85, 75, 25);
        
	    for(int i = 0; i<pn; i++)
	    {
	    	contentPane.add(psc[i]);
	    	contentPane.add(psc[i+4]);
	    }
        
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
		case 1 : psc[3].setText(score);
		break;
		case 2 : psc[4].setText(score);
		break;
		case 3 : psc[5].setText(score);
		break;
		case 4 : psc[6].setText(score);
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
				nlb[position].setFont(new Font("굴림", Font.PLAIN, 58));
				break;
			case 2:
				nlb[position].setFont(new Font("굴림", Font.PLAIN, 29));
				break;
			case 3:
				nlb[position].setFont(new Font("굴림", Font.PLAIN, 19));
				break;
			case 4:
				nlb[position].setFont(new Font("굴림", Font.PLAIN, 14));
				break;
			case 5:
				nlb[position].setFont(new Font("굴림", Font.PLAIN, 11));
				break;
			case 6:
				nlb[position].setFont(new Font("굴림", Font.PLAIN, 9));
				
			}
		}
	}
	public void setlogy(int j) {
		switch(j){
		case -1:
		logy.setText("백도가 나왔습니다");
		break;
		case 1:
			logy.setText("도가 나왔습니다");
			break;
		case 2:
			logy.setText("개가 나왔습니다");
			break;
		case 3:
			logy.setText("걸이 나왔습니다");
			break;
		case 4:
			logy.setText("윷이 나왔습니다");
			break;
		case 5:
			logy.setText("모가 나왔습니다");
			break;
		}
		
	}
	public void remove(int position) {
		nlb[position].setVisible(false);
	}
}
