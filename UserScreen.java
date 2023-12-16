package com.Nikhil.chatApp.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class UserScreen extends JFrame{

		UserScreen window = new UserScreen();
		private JTextField textField;
		private JPasswordField passwordField;
	    public UserScreen() {
		setFont(new Font("Dialog", Font.PLAIN, 10));
		setResizable(false);
		setTitle("LOGIN");
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setBounds(0, 0, 436, 13);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(236, 67, 145, 31);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel useridlbl = new JLabel("USER ID");
		useridlbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		useridlbl.setBounds(104, 71, 66, 27);
		getContentPane().add(useridlbl);
		
		JLabel pwdlbl = new JLabel("PASSWORD");
		pwdlbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pwdlbl.setBounds(104, 119, 81, 27);
		getContentPane().add(pwdlbl);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(236, 119, 145, 31);
		getContentPane().add(passwordField);
		
		JButton loginbt = new JButton("LOGIN");
		loginbt.setFont(new Font("Times New Roman", Font.BOLD, 16));
		loginbt.setBounds(73, 190, 125, 31);
		getContentPane().add(loginbt);
		
		JButton registerbt = new JButton("REGISTER");
		registerbt.setFont(new Font("Times New Roman", Font.BOLD, 16));
		registerbt.setBounds(239, 190, 125, 31);
		getContentPane().add(registerbt);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

