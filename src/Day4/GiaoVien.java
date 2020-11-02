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
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class GiaoVien extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiaoVien frame = new GiaoVien();
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
	public GiaoVien() {
		setTitle("Giáo Viên");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 403, 347);
		contentPane = new JPanel();
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbTKBSV = new JLabel("TKB Giáo Viên");
		lbTKBSV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbTKBSV.setForeground(Color.RED);
		lbTKBSV.setHorizontalAlignment(SwingConstants.CENTER);
		lbTKBSV.setBounds(94, 11, 174, 27);
		contentPane.add(lbTKBSV);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 39, 367, 237);
		contentPane.add(panel);
		JButton btnQuaylai = new JButton("Quay lại");
		btnQuaylai.setForeground(Color.RED);
		btnQuaylai.setBounds(154, 283, 89, 23);
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