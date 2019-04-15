package gui;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class LogInFrame {

	private JFrame frame;
	private JTextField txtUserName;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				
				try {
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost", "root", "MySql2367!");
					LogInFrame window = new LogInFrame();
					window.frame.setVisible(true);
					
					conn.close();
				} catch (Exception e) {
					System.err.println(e);
					//JOptionPane optionPane = new JOptionPane();
					//JOptionPane.showMessageDialog(optionPane, "Couldn't connect to database " + e, "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LogInFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(){
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUserName = new JLabel("Username");
		lblUserName.setBounds(21, 119, 80, 14);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(21, 160, 80, 14);
		frame.getContentPane().add(lblPassword);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(116, 116, 132, 20);
		frame.getContentPane().add(txtUserName);
		txtUserName.setColumns(10);
		
		txtPassword = new JPasswordField(20);
		txtPassword.setBounds(116, 157, 132, 20);
		frame.getContentPane().add(txtPassword);
		
		JLabel lblEmailError = new JLabel("* Email Address is Incorrect or doesn't exist");
		lblEmailError.setForeground(Color.RED);
		lblEmailError.setBounds(21, 135, 283, 14);
		frame.getContentPane().add(lblEmailError);
		lblEmailError.setVisible(false);
		
		JLabel lblPasswordError = new JLabel("*Password Incorrect");
		lblPasswordError.setForeground(Color.RED);
		lblPasswordError.setBounds(21, 181, 132, 14);
		lblPasswordError.setVisible(false);
		frame.getContentPane().add(lblPasswordError);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String emailAddress = txtUserName.getText();
					String password = txtPassword.getText();
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost", "root", "MySql2367!");
					PreparedStatement userStmt = conn.prepareStatement( "SELECT * FROM interviewapplication.userdetails WHERE email_address =(?)");
					userStmt.setString(1, emailAddress);
					ResultSet userRs = userStmt.executeQuery();

					if(userRs.next()){
						lblEmailError.setVisible(false);
						PreparedStatement passwordStmt = conn.prepareStatement( "SELECT * FROM interviewapplication.userdetails WHERE email_address =(?) AND password =(?)");
						passwordStmt.setString(1, emailAddress);
						passwordStmt.setString(2, password);
						ResultSet passwordRs = passwordStmt.executeQuery();
						
						if(passwordRs.next()){
							JOptionPane optionPane = new JOptionPane();
							JOptionPane.showMessageDialog(optionPane, "Login successful!", "Login Success", JOptionPane.INFORMATION_MESSAGE);
							lblPasswordError.setVisible(false);
							
						}else{
							lblPasswordError.setVisible(true);
							
						}
						
					}else{
						System.out.println("Email Address does not exist ");
						lblPasswordError.setVisible(true);
						lblEmailError.setVisible(true);
						
					}
					
					conn.close();
				}catch(Exception e){
					System.err.println(e);
					//JOptionPane optionPane = new JOptionPane();
					//JOptionPane.showMessageDialog(optionPane, "Couldn't connect to database", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnLogin.setBounds(10, 229, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(314, 229, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				close();
				SignUpFrame s = new SignUpFrame();
				s.main(null);
				
				System.out.println("Successful");
			
			}
		});
		btnSignUp.setBounds(116, 229, 89, 23);
		frame.getContentPane().add(btnSignUp);
		
		
		
		JButton btnForgotPassword = new JButton("Reset Login");
		btnForgotPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				ResetPasswordFrame rp = new ResetPasswordFrame();
				rp.main(null);
				
			}
		});
		btnForgotPassword.setBounds(215, 229, 89, 23);
		frame.getContentPane().add(btnForgotPassword);
	} 
	
	public void close() { 
	    this.frame.setVisible(false);
	    this.frame.dispose();
	}
	
	
	
	
}
