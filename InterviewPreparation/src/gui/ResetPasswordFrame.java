package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ResetPasswordFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtEmailAddress;
	private JTextField txtResetKey;
	private JTextField txtPassword;
	private JTextField txtRetypePassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResetPasswordFrame frame = new ResetPasswordFrame();
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
	public ResetPasswordFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmailAddress = new JLabel("Email Address");
		lblEmailAddress.setBounds(25, 68, 78, 14);
		contentPane.add(lblEmailAddress);
		
		JLabel lblResetKey = new JLabel("Reset Key");
		lblResetKey.setBounds(25, 95, 72, 14);
		contentPane.add(lblResetKey);
		
		txtEmailAddress = new JTextField();
		txtEmailAddress.setBounds(113, 65, 160, 20);
		contentPane.add(txtEmailAddress);
		txtEmailAddress.setColumns(10);
		
		txtResetKey = new JTextField();
		txtResetKey.setColumns(10);
		txtResetKey.setBounds(113, 92, 160, 20);
		contentPane.add(txtResetKey);
		
		JButton btnSendResetKey = new JButton("Send Reset Key");
		btnSendResetKey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSendResetKey.setBounds(78, 203, 114, 23);
		contentPane.add(btnSendResetKey);
		
		JButton btnResetPassword = new JButton("Reset Password");
		btnResetPassword.setBounds(202, 203, 114, 23);
		contentPane.add(btnResetPassword);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				LogInFrame l = new LogInFrame();
				l.main(null);
			}
		});
		btnBack.setBounds(25, 11, 114, 23);
		contentPane.add(btnBack);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(113, 119, 160, 20);
		contentPane.add(txtPassword);
		
		txtRetypePassword = new JTextField();
		txtRetypePassword.setColumns(10);
		txtRetypePassword.setBounds(113, 146, 160, 20);
		contentPane.add(txtRetypePassword);
		
		JLabel lblNewpassword = new JLabel("NewPassword");
		lblNewpassword.setBounds(25, 122, 72, 14);
		contentPane.add(lblNewpassword);
		
		JLabel lblRetypePassword = new JLabel("Retype Password");
		lblRetypePassword.setBounds(25, 149, 72, 14);
		contentPane.add(lblRetypePassword);
	}
	
	public void close() { 
	    this.setVisible(false);
	    this.dispose();
	}
	
	
}
