package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import validationFunctions.userValidation;
import java.awt.Color;

public class SignUpFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtEmailAddress;
	private JTextField txtPassword;
	private JTextField txtRetypePassword;
	private JTextField txtName;
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
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(128, 167, 122, 20);
		contentPane.add(txtName);
		
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
		txtPostCode1.setBounds(128, 290, 122, 20);
		contentPane.add(txtPostCode1);
		
		
		JLabel lblEmailError = new JLabel("*Email Can only be 255 characters long");
		lblEmailError.setForeground(Color.RED);
		lblEmailError.setBounds(271, 95, 195, 14);
		contentPane.add(lblEmailError);
		lblEmailError.setVisible(false);
		
		JLabel lblPasswordError = new JLabel("*Password can only be 45 characters long");
		lblPasswordError.setForeground(Color.RED);
		lblPasswordError.setBounds(271, 120, 222, 14);
		contentPane.add(lblPasswordError);
		lblPasswordError.setVisible(false);
		
		JLabel lblRetypePasswordError = new JLabel("*Password does not match");
		lblRetypePasswordError.setForeground(Color.RED);
		lblRetypePasswordError.setBounds(271, 145, 214, 14);
		contentPane.add(lblRetypePasswordError);
		lblRetypePasswordError.setVisible(false);
		
		JLabel lblNameError = new JLabel("*Name can only be 50 characters long");
		lblNameError.setForeground(Color.RED);
		lblNameError.setBounds(271, 170, 214, 14);
		contentPane.add(lblNameError);
		lblNameError.setVisible(false);
		
		JLabel lblSurnameError = new JLabel("*Surname can only be 50 characters long");
		lblSurnameError.setForeground(Color.RED);
		lblSurnameError.setBounds(271, 195, 214, 14);
		contentPane.add(lblSurnameError);
		lblSurnameError.setVisible(false);
		
		JLabel lblContactNumberError = new JLabel("*Contact Number must be 11 characters long");
		lblContactNumberError.setForeground(Color.RED);
		lblContactNumberError.setBounds(271, 220, 255, 14);
		contentPane.add(lblContactNumberError);
		lblContactNumberError.setVisible(false);
		
		JLabel lblCityOrTownError = new JLabel("*City or Town can only be 95 characters long");
		lblCityOrTownError.setForeground(Color.RED);
		lblCityOrTownError.setBounds(271, 245, 232, 14);
		contentPane.add(lblCityOrTownError);
		lblCityOrTownError.setVisible(false);
	
		JLabel lblCountyError = new JLabel("*County can only be 45 characters long");
		lblCountyError.setForeground(Color.RED);
		lblCountyError.setBounds(271, 268, 232, 14);
		contentPane.add(lblCountyError);
		lblCountyError.setVisible(false);
		
		JLabel lblPostCodeError = new JLabel("*Post Code can only be 8 characters long");
		lblPostCodeError.setForeground(Color.RED);
		lblPostCodeError.setBounds(271, 293, 232, 14);
		contentPane.add(lblPostCodeError);
		lblPostCodeError.setVisible(false);
		
		JLabel lblEmailError2 = new JLabel("*Email is taken please choose a different one");
		lblEmailError2.setForeground(Color.RED);
		lblEmailError2.setBounds(271, 95, 255, 14);
		contentPane.add(lblEmailError2);
		lblEmailError2.setVisible(false);
		
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
				String emailAddress = txtEmailAddress.getText();
				String password = txtPassword.getText();
				String retypePassword = txtRetypePassword.getText();
				String name = txtName.getText();
				String surname = txtSurname.getText();
				String contactNumber = txtContactNumber.getText();
				String cityOrTown = txtCityOrTown.getText();
				String county = txtCounty.getText();
				String postCode = txtPostCode1.getText();
				
				if (!userValidation.emailValidation(emailAddress)){
					lblEmailError.setVisible(true);
				}else{
					lblEmailError.setVisible(false);
				}
				
				if (!userValidation.passwordValidation(password)){
					lblPasswordError.setVisible(true);
				}else{
					lblPasswordError.setVisible(false);
				}
				
				if (!userValidation.passwordValidationRetype(password, retypePassword)){
					lblRetypePasswordError.setVisible(true);
				}else{
					lblRetypePasswordError.setVisible(false);
				}
				
				if (!userValidation.nameValidation(name)){
					lblNameError.setVisible(true);
				}else{
					lblNameError.setVisible(false);
				}
				
				if (!userValidation.nameValidation(surname)){
					lblSurnameError.setVisible(true);
				}else{
					lblSurnameError.setVisible(false);
				}
				
				if (!userValidation.contactNumberValidation(contactNumber)){
					lblContactNumberError.setVisible(true);
				}else{
					lblContactNumberError.setVisible(false);
				}
				if (!userValidation.cityOrTownValidation(cityOrTown)){
					lblCityOrTownError.setVisible(true);
				}else{
					lblCityOrTownError.setVisible(false);
				}
				if (!userValidation.countyValidation(county)){
					lblCountyError.setVisible(true);
				}else{
					lblCountyError.setVisible(false);
				}
				if (!userValidation.postCodeValidation(postCode)){
					lblPostCodeError.setVisible(true);
				}else{
					lblPostCodeError.setVisible(false);
				}
				
				if ((userValidation.emailValidation(emailAddress)) &
					(userValidation.emailValidation(password)) &
					(userValidation.passwordValidationRetype(password, retypePassword)) &
					(userValidation.nameValidation(name)) &
					(userValidation.nameValidation(surname)) &
					(userValidation.contactNumberValidation(contactNumber)) &
					(userValidation.cityOrTownValidation(cityOrTown)) &
					(userValidation.countyValidation(county)) &
					(userValidation.postCodeValidation(postCode)) 
					){
					
						try {
							Connection conn = DriverManager.getConnection("jdbc:mysql://localhost", "root", "MySql2367!");
							PreparedStatement userStmt = conn.prepareStatement( "SELECT * FROM interviewapplication.userdetails WHERE email_address =(?)");
							userStmt.setString(1, emailAddress);
							ResultSet userRs = userStmt.executeQuery();
							
							if(!(userRs.next())){
								lblEmailError2.setVisible(false);
								PreparedStatement newUserStmt = conn.prepareStatement("INSERT INTO interviewapplication.userdetails"
										+ "(email_address, password, firstname, surname, contact_number, city_or_town, county, postcode)"
										+ "VALUES((?), (?), (?), (?), (?), (?), (?), (?))");
								newUserStmt.setString(1, emailAddress);
								newUserStmt.setString(2, password);
								newUserStmt.setString(3, name);
								newUserStmt.setString(4, surname);
								newUserStmt.setString(5, contactNumber);
								newUserStmt.setString(6, cityOrTown);
								newUserStmt.setString(7, county);
								newUserStmt.setString(8, postCode);
								
								int newUserStmtRs = newUserStmt.executeUpdate();
								conn.close();
								
								JOptionPane optionPane = new JOptionPane();
								JOptionPane.showMessageDialog(optionPane, "User Added Successfully", "Login Success", JOptionPane.INFORMATION_MESSAGE); 
							}else{
								conn.close();
								JOptionPane optionPane = new JOptionPane();
								JOptionPane.showMessageDialog(optionPane, "Email Already Taken", "ERROR", JOptionPane.ERROR_MESSAGE);
								lblEmailError2.setVisible(true);
							}
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
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