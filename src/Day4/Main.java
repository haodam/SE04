package Day4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Windows 10 TIMT
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textDN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 327, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbDN = new JLabel("\u0110\u0103ng nh\u1EADp");
		lbDN.setBackground(Color.CYAN);
		lbDN.setForeground(Color.RED);
		lbDN.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbDN.setHorizontalAlignment(SwingConstants.CENTER);
		lbDN.setBounds(99, 54, 108, 31);
		contentPane.add(lbDN);
		
		textDN = new JTextField();
		textDN.setBounds(52, 103, 210, 31);
		contentPane.add(textDN);
		textDN.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBackground(Color.CYAN);
		btnOk.setForeground(Color.RED);
		btnOk.setBounds(110, 164, 89, 23);
		contentPane.add(btnOk);
		
		JLabel lbLoi = new JLabel("Lỗi đăng nhập");
		lbLoi.setForeground(Color.RED);
		lbLoi.setHorizontalAlignment(SwingConstants.CENTER);
		lbLoi.setBounds(76, 145, 165, 14);
		lbLoi.setVisible(false);
		contentPane.add(lbLoi);
		
		
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String pass = textDN.getText().toString();
				if(pass.equals("")) {
					lbLoi.setVisible(true);
				}
				//pass = giaovukhoa 
				else if(pass.equals("giaovukhoa")) {
					new GiaoVuKhoa().setVisible(true);
					dispose();
				}
				//pass = sinhvien
				else if(pass.equals("sinhvien")) {
					new SinhVien().setVisible(true);
					dispose();
				}
				//pass = giaovieo
				else if(pass.equals("giaovien")) {
					new GiaoVien().setVisible(true);
					dispose();
				}else {
					lbLoi.setVisible(true);
				}
				
			}
		});
	}

    
}