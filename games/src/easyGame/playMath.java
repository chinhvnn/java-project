//Author: LE VAN CHINH
//CODE TO FUNNY

package easyGame;

//import library SWING
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JProgressBar;

//CREAT CLASS EXTENDS JFRAM (SWING)/ KHỞI TẠO CLASS KẾ THỪA JFRAME (SWING)
public class playMath extends JFrame {

	private JPanel contentPane;// Khai báo biến khung các frame
	private JLabel Question, lbPoint;
	private JButton btnNew, btnTrue, btnFalse;
	private JProgressBar progressBar;
	
	private int a, b, c, timeCount, point=0;
	javax.swing.Timer time;
	private boolean playing = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {//
			public void run() {
				try {
					playMath frame = new playMath();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public playMath() {
		setTitle("Học toán vui - Chinhvnn");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("HỌC TOÁN VUI");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(38, 11, 356, 31);
		title.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(title);
		
		Question = new JLabel("...");
		Question.setHorizontalAlignment(SwingConstants.CENTER);
		Question.setHorizontalTextPosition(SwingConstants.CENTER);
		Question.setBackground(Color.GRAY);
		Question.setBounds(38, 102, 356, 53);
		Question.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(Question);
		
		progressBar = new JProgressBar();
		progressBar.setBounds(38, 53, 356, 14);
		contentPane.add(progressBar);
		
		btnNew = new JButton("TRÒ CHƠI MỚI");
		btnNew.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNew.setBounds(155, 220, 121, 30);
		contentPane.add(btnNew);
		
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				load();
			}
		});
		
		btnTrue = new JButton("ĐÚNG");
		btnTrue.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTrue.setVisible(playing);
		btnTrue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check()==true) {
					checkPoint();
				}
				else loseGame();
			}
		});
		btnTrue.setBounds(104, 166, 101, 43);
		contentPane.add(btnTrue);
		
		btnFalse = new JButton("SAI");
		btnFalse.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnFalse.setVisible(playing);
		btnFalse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check()==false) {
					checkPoint();
				}
				else loseGame();
			}
		});
		btnFalse.setBounds(224, 166, 101, 43);
		contentPane.add(btnFalse);
		
		lbPoint = new JLabel("ĐIỂM: 0");
		lbPoint.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbPoint.setHorizontalAlignment(SwingConstants.CENTER);
		lbPoint.setBounds(38, 71, 356, 20);
		contentPane.add(lbPoint);
	}

	public void load() {
		// TODO Auto-generated method stub
		Random rd = new Random();
		a = rd.nextInt(9)+1;
		b = rd.nextInt(9)+1;
		c = rd.nextInt(2)+ (a+b);
		Question.setText(a+" + "+b+" = "+c);
		playing = true;
		btnNew.setVisible(false);
		timeCount = 100;
		time = new javax.swing.Timer(50, new loadTimecount());
		time.start();
		btnTrue.setVisible(playing);
		btnFalse.setVisible(playing);
	}
	public void loseGame() {
		// TODO Auto-generated method stub
		time.stop();
		timeCount = 100;
		Question.setText("THUA RỒI! ĐIỂM:"+point+"");
		playing = false;
		btnNew.setVisible(true);
		btnTrue.setVisible(playing);
		btnFalse.setVisible(playing);
		point = 0;
		lbPoint.setText("ĐIỂM: "+point);
	}
	public class loadTimecount implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (timeCount > 0) {
				progressBar.setValue(timeCount--);
			}
			else { 
				loseGame();
				}
		}
	}
	public boolean check(){
		if (a+b==c) {
			return true;
		}else return false;
	}
	public void checkPoint() {
		point++;
		lbPoint.setText("ĐIỂM: "+point);
		time.stop();
		load();
	}
}
