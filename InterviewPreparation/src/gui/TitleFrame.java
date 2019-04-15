package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TitleFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TitleFrame frame = new TitleFrame();
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
	public TitleFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnJobList = new JButton("Job list");
		btnJobList.setBounds(10, 117, 89, 23);
		contentPane.add(btnJobList);
		
		JButton btnApplications = new JButton("Applications");
		btnApplications.setBounds(10, 151, 89, 23);
		contentPane.add(btnApplications);
		
		JButton btnEditDetails = new JButton("Edit Details");
		btnEditDetails.setBounds(10, 185, 89, 23);
		contentPane.add(btnEditDetails);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogout.setBounds(10, 11, 89, 23);
		contentPane.add(btnLogout);
		
		JLabel lblNewLabel = new JLabel("userName");
		lblNewLabel.setBounds(344, 15, 57, 14);
		contentPane.add(lblNewLabel);
	}

}
