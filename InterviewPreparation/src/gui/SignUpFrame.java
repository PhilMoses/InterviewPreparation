package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class SignUpFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtEmailAddress;
	private JTextField txtPassword;
	private JTextField txtRetypePassword;
	private JTextField textField;
	private JTextField txtSurname;
	private JTextField txtContactNumber;
	private JTextField txtCityOrTown;
	private JTextField txtCounty;
	private JTextField txtPostCode1;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					System.out.println("Hey I worked");
					SignUpFrame frame = new SignUpFrame();
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
	public SignUpFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmailAddressLabel = new JLabel("Email Address");
		lblEmailAddressLabel.setBounds(34, 95, 73, 14);
		contentPane.add(lblEmailAddressLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(34, 120, 73, 14);
		contentPane.add(lblPassword);
		
		JLabel lblRetypePassword = new JLabel("Retype Password");
		lblRetypePassword.setBounds(34, 145, 92, 14);
		contentPane.add(lblRetypePassword);
		
		JLabel lblFirstname = new JLabel("Firstname");
		lblFirstname.setBounds(34, 170, 92, 14);
		contentPane.add(lblFirstname);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setBounds(34, 195, 92, 14);
		contentPane.add(lblSurname);
		
		JLabel lblContactNumber = new JLabel("Contact Number");
		lblContactNumber.setBounds(34, 220, 92, 14);
		contentPane.add(lblContactNumber);
		
		JLabel lblCityOrTown = new JLabel("City or Town");
		lblCityOrTown.setBounds(34, 245, 92, 14);
		contentPane.add(lblCityOrTown);
		
		JLabel lblCounty = new JLabel("County");
		lblCounty.setBounds(34, 268, 92, 14);
		contentPane.add(lblCounty);
		
		JLabel lblPostCode = new JLabel("Post Code");
		lblPostCode.setBounds(34, 293, 92, 14);
		contentPane.add(lblPostCode);
		
		txtEmailAddress = new JTextField();
		txtEmailAddress.setBounds(128, 92, 122, 20);
		contentPane.add(txtEmailAddress);
		txtEmailAddress.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(128, 117, 122, 20);
		contentPane.add(txtPassword);
		
		txtRetypePassword = new JTextField();
		txtRetypePassword.setColumns(10);
		txtRetypePassword.setBounds(128, 142, 122, 20);
		contentPane.add(txtRetypePassword);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(128, 167, 122, 20);
		contentPane.add(textField);
		
		txtSurname = new JTextField();
		txtSurname.setColumns(10);
		txtSurname.setBounds(128, 192, 122, 20);
		contentPane.add(txtSurname);
		
		txtContactNumber = new JTextField();
		txtContactNumber.setColumns(10);
		txtContactNumber.setBounds(128, 217, 122, 20);
		contentPane.add(txtContactNumber);
		
		txtCityOrTown = new JTextField();
		txtCityOrTown.setColumns(10);
		txtCityOrTown.setBounds(128, 242, 122, 20);
		contentPane.add(txtCityOrTown);
		
		txtCounty = new JTextField();
		txtCounty.setColumns(10);
		txtCounty.setBounds(128, 265, 122, 20);
		contentPane.add(txtCounty);
		
		txtPostCode1 = new JTextField();
		txtPostCode1.setColumns(10);
		txtPostCode1.setBounds(128, 290, 60, 20);
		contentPane.add(txtPostCode1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(189, 290, 60, 20);
		contentPane.add(textField_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				close();
				LogInFrame l = new LogInFrame();
				l.main(null);
				
			}
		});
		btnBack.setBounds(18, 11, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSignUp.setBounds(159, 343, 89, 23);
		contentPane.add(btnSignUp);
	}
	public void close() { 
	    this.setVisible(false);
	    this.dispose();
	}
} 