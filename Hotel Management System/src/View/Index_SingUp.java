package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Index_SingUp extends JFrame {
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JPanel contentPane_1;
	private JLabel lblNewLabel_1;
	private JLabel lblEmail;
	private JLabel lblPassword;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JButton btnSingup;
	private JSeparator separator;
	private JLabel lblNumber;
	private JTextField textField_2;
	private JLabel lblPassword_2;
	private JTextField textField_3;
	private JLabel lblSecurityQuestion;
	private JLabel lblAnswer;
	private JTextField textField_4;
	private JLabel lblAddress;
	private JTextField textField_5;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index_SingUp frame = new Index_SingUp();
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
	public Index_SingUp() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 40, 1402, 774);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getContentPane_1_1());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Hotel Management System");
			lblNewLabel.setFont(new Font("Elephant", Font.BOLD, 46));
			lblNewLabel.setBounds(400, 26, 679, 110);
		}
		return lblNewLabel;
	}
	private JPanel getContentPane_1_1() {
		if (contentPane_1 == null) {
			contentPane_1 = new JPanel();
			contentPane_1.setLayout(null);
			contentPane_1.setForeground(Color.WHITE);
			contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane_1.setBackground(Color.DARK_GRAY);
			contentPane_1.setBounds(400, 146, 654, 490);
			contentPane_1.add(getLblNewLabel_1_1());
			contentPane_1.add(getLblEmail_1());
			contentPane_1.add(getLblPassword_1());
			contentPane_1.add(getTextField_2());
			contentPane_1.add(getTextField_1_1());
			contentPane_1.add(getBtnNewButton_1());
			contentPane_1.add(getBtnSingup_1());
			contentPane_1.add(getSeparator_1());
			contentPane_1.add(getLblNumber());
			contentPane_1.add(getTextField_2_1());
			contentPane_1.add(getLblPassword_2());
			contentPane_1.add(getTextField_3());
			contentPane_1.add(getLblSecurityQuestion());
			contentPane_1.add(getLblAnswer());
			contentPane_1.add(getTextField_4());
			contentPane_1.add(getLblAddress());
			contentPane_1.add(getTextField_5());
			contentPane_1.add(getComboBox());
		}
		return contentPane_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("SingUp");
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 32));
			lblNewLabel_1.setBounds(280, 20, 154, 35);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblEmail_1() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Full Name");
			lblEmail.setForeground(Color.WHITE);
			lblEmail.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblEmail.setBounds(60, 86, 103, 35);
		}
		return lblEmail;
	}
	private JLabel getLblPassword_1() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Email ID");
			lblPassword.setForeground(Color.WHITE);
			lblPassword.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblPassword.setBounds(60, 134, 103, 35);
		}
		return lblPassword;
	}
	private JTextField getTextField_2() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(224, 138, 367, 26);
		}
		return textField;
	}
	private JTextField getTextField_1_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(224, 89, 367, 26);
		}
		return textField_1;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Register");
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnNewButton.setBackground(new Color(220, 20, 60));
			btnNewButton.setBounds(261, 425, 127, 32);
		}
		return btnNewButton;
	}
	private JButton getBtnSingup_1() {
		if (btnSingup == null) {
			btnSingup = new JButton("Login");
			btnSingup.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Index().setVisible(true);
					dispose();
				}
			});
			btnSingup.setForeground(Color.WHITE);
			btnSingup.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnSingup.setBackground(new Color(220, 20, 60));
			btnSingup.setBounds(455, 425, 117, 32);
		}
		return btnSingup;
	}
	private JSeparator getSeparator_1() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(247, 68, 187, 20);
		}
		return separator;
	}
	private JLabel getLblNumber() {
		if (lblNumber == null) {
			lblNumber = new JLabel("Mobile No");
			lblNumber.setForeground(Color.WHITE);
			lblNumber.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNumber.setBounds(60, 179, 103, 35);
		}
		return lblNumber;
	}
	private JTextField getTextField_2_1() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(224, 183, 367, 26);
		}
		return textField_2;
	}
	private JLabel getLblPassword_2() {
		if (lblPassword_2 == null) {
			lblPassword_2 = new JLabel("Password");
			lblPassword_2.setForeground(Color.WHITE);
			lblPassword_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblPassword_2.setBounds(60, 224, 103, 35);
		}
		return lblPassword_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(224, 228, 367, 26);
		}
		return textField_3;
	}
	private JLabel getLblSecurityQuestion() {
		if (lblSecurityQuestion == null) {
			lblSecurityQuestion = new JLabel("Security Question");
			lblSecurityQuestion.setForeground(Color.WHITE);
			lblSecurityQuestion.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblSecurityQuestion.setBounds(60, 269, 154, 35);
		}
		return lblSecurityQuestion;
	}
	private JLabel getLblAnswer() {
		if (lblAnswer == null) {
			lblAnswer = new JLabel("Answer");
			lblAnswer.setForeground(Color.WHITE);
			lblAnswer.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblAnswer.setBounds(60, 314, 103, 35);
		}
		return lblAnswer;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(224, 318, 367, 26);
		}
		return textField_4;
	}
	private JLabel getLblAddress() {
		if (lblAddress == null) {
			lblAddress = new JLabel("Address");
			lblAddress.setForeground(Color.WHITE);
			lblAddress.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblAddress.setBounds(60, 359, 103, 35);
		}
		return lblAddress;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(224, 363, 367, 26);
		}
		return textField_5;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(224, 273, 367, 26);
		}
		return comboBox;
	}
}
