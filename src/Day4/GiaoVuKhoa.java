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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;

public class GiaoVuKhoa extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiaoVuKhoa frame = new GiaoVuKhoa();
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
	public GiaoVuKhoa() {
		setTitle("Giáo Vụ Khoa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelTKB = new JPanel();
		panelTKB.setBackground(Color.LIGHT_GRAY);
		panelTKB.setBounds(244, 11, 226, 267);
		contentPane.add(panelTKB);
		panelTKB.setLayout(null);
		
		JLabel lbDSachTKB = new JLabel("Danh sách TKB");
		lbDSachTKB.setForeground(Color.RED);
		lbDSachTKB.setHorizontalAlignment(SwingConstants.CENTER);
		lbDSachTKB.setBounds(49, 25, 131, 25);
		panelTKB.add(lbDSachTKB);
		
		JButton btnXemTkb = new JButton("Xem TKB");
		btnXemTkb.setBackground(Color.CYAN);
		btnXemTkb.setForeground(Color.RED);
		btnXemTkb.setBounds(62, 40, 89, 23);
		contentPane.add(btnXemTkb);
		
		JButton btnSua = new JButton("Sửa TKB");
		btnSua.setForeground(Color.RED);
		btnSua.setBackground(Color.CYAN);
		btnSua.setBounds(62, 88, 89, 23);
		contentPane.add(btnSua);
		
		JButton btnNhap = new JButton("Nhập TKB");
		btnNhap.setForeground(Color.RED);
		btnNhap.setBackground(Color.CYAN);
		btnNhap.setBounds(62, 135, 89, 23);
		contentPane.add(btnNhap);
		
		JButton btnXoa = new JButton("Xóa TKB");
		btnXoa.setForeground(Color.RED);
		btnXoa.setBackground(Color.CYAN);
		btnXoa.setBounds(62, 184, 89, 23);
		contentPane.add(btnXoa);
		
		JButton btnQuaylai = new JButton("Quay lại");
		btnQuaylai.setForeground(Color.RED);
		btnQuaylai.setBackground(Color.CYAN);
		btnQuaylai.setBounds(62, 232, 89, 23);
		contentPane.add(btnQuaylai);
		btnQuaylai.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new Main().setVisible(true);
			}
		});
	}
}