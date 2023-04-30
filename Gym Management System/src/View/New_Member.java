package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class New_Member extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblMemberId;
	private JLabel lblMobileNumber;
	private JTextField textField_1;
	private JLabel lblNewLabel_1_1;
	private JTextField textField_2;
	private JLabel lblNewLabel_1_1_1;
	private JLabel lblNewLabel_1_1_1_1;
	private JTextField textField_4;
	private JLabel lblMotherName;
	private JTextField textField_5;
	private JLabel lblGymTime;
	private JLabel lblNewLabel_1_1_2;
	private JTextField textField_7;
	private JLabel lblNewLabel_1_1_1_2;
	private JTextField textField_8;
	private JLabel lblNewLabel_1_1_1_1_1;
	private JTextField textField_9;
	private JLabel lblNewLabel_1_2;
	private JButton btnNewButton;
	private JButton btnReset;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JButton btnX;
	private JSeparator separator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New_Member frame = new New_Member();
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
	public New_Member() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(260, 140, 1060, 620);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTextField());
		contentPane.add(getLblMemberId());
		contentPane.add(getLblMobileNumber());
		contentPane.add(getTextField_1());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getTextField_2());
		contentPane.add(getLblNewLabel_1_1_1());
		contentPane.add(getLblNewLabel_1_1_1_1());
		contentPane.add(getTextField_4());
		contentPane.add(getLblMotherName());
		contentPane.add(getTextField_5());
		contentPane.add(getLblGymTime());
		contentPane.add(getLblNewLabel_1_1_2());
		contentPane.add(getTextField_7());
		contentPane.add(getLblNewLabel_1_1_1_2());
		contentPane.add(getTextField_8());
		contentPane.add(getLblNewLabel_1_1_1_1_1());
		contentPane.add(getTextField_9());
		contentPane.add(getLblNewLabel_1_2());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnReset());
		contentPane.add(getComboBox());
		contentPane.add(getComboBox_1());
		contentPane.add(getBtnX());
		contentPane.add(getSeparator());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Full Name");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblNewLabel.setBounds(76, 88, 127, 35);
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(76, 130, 352, 28);
		}
		return textField;
	}
	private JLabel getLblMemberId() {
		if (lblMemberId == null) {
			lblMemberId = new JLabel("Member ID : 1");
			lblMemberId.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblMemberId.setBounds(76, 40, 155, 35);
		}
		return lblMemberId;
	}
	private JLabel getLblMobileNumber() {
		if (lblMobileNumber == null) {
			lblMobileNumber = new JLabel("Mobile Number");
			lblMobileNumber.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblMobileNumber.setBounds(76, 180, 172, 35);
		}
		return lblMobileNumber;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(76, 222, 352, 28);
		}
		return textField_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Email ID");
			lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblNewLabel_1_1.setBounds(76, 274, 127, 35);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(76, 314, 352, 28);
		}
		return textField_2;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("Gender");
			lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblNewLabel_1_1_1.setBounds(76, 367, 127, 35);
		}
		return lblNewLabel_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_1() {
		if (lblNewLabel_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1 = new JLabel("Father Name");
			lblNewLabel_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblNewLabel_1_1_1_1.setBounds(76, 465, 155, 35);
		}
		return lblNewLabel_1_1_1_1;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(76, 507, 352, 28);
		}
		return textField_4;
	}
	private JLabel getLblMotherName() {
		if (lblMotherName == null) {
			lblMotherName = new JLabel("Mother Name");
			lblMotherName.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblMotherName.setBounds(617, 88, 166, 35);
		}
		return lblMotherName;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(617, 130, 352, 28);
		}
		return textField_5;
	}
	private JLabel getLblGymTime() {
		if (lblGymTime == null) {
			lblGymTime = new JLabel("Gym TIme");
			lblGymTime.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblGymTime.setBounds(617, 180, 172, 35);
		}
		return lblGymTime;
	}
	private JLabel getLblNewLabel_1_1_2() {
		if (lblNewLabel_1_1_2 == null) {
			lblNewLabel_1_1_2 = new JLabel("Citizen Number ( Unique ID )");
			lblNewLabel_1_1_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblNewLabel_1_1_2.setBounds(617, 274, 307, 35);
		}
		return lblNewLabel_1_1_2;
	}
	private JTextField getTextField_7() {
		if (textField_7 == null) {
			textField_7 = new JTextField();
			textField_7.setColumns(10);
			textField_7.setBounds(617, 314, 352, 28);
		}
		return textField_7;
	}
	private JLabel getLblNewLabel_1_1_1_2() {
		if (lblNewLabel_1_1_1_2 == null) {
			lblNewLabel_1_1_1_2 = new JLabel("Age");
			lblNewLabel_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_2.setBounds(617, 367, 127, 35);
		}
		return lblNewLabel_1_1_1_2;
	}
	private JTextField getTextField_8() {
		if (textField_8 == null) {
			textField_8 = new JTextField();
			textField_8.setColumns(10);
			textField_8.setBounds(617, 409, 352, 28);
		}
		return textField_8;
	}
	private JLabel getLblNewLabel_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1 = new JLabel("Amount to Pay / Month");
			lblNewLabel_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
			lblNewLabel_1_1_1_1_1.setBounds(617, 465, 259, 35);
		}
		return lblNewLabel_1_1_1_1_1;
	}
	private JTextField getTextField_9() {
		if (textField_9 == null) {
			textField_9 = new JTextField();
			textField_9.setColumns(10);
			textField_9.setBounds(617, 507, 352, 28);
		}
		return textField_9;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("New Member");
			lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 32));
			lblNewLabel_1_2.setBounds(388, 0, 259, 64);
		}
		return lblNewLabel_1_2;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Save");
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton.setBounds(76, 554, 106, 42);
		}
		return btnNewButton;
	}
	private JButton getBtnReset() {
		if (btnReset == null) {
			btnReset = new JButton("Reset");
			btnReset.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnReset.setBounds(200, 554, 106, 42);
		}
		return btnReset;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setFont(new Font("Arial Black", Font.BOLD, 14));
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"[ -- Select Your Gender --- ]", "Male", "Female", "Lesbian"}));
			comboBox.setBounds(76, 409, 352, 28);
		}
		return comboBox;
	}
	private JComboBox getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox();
			comboBox_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"[ ---- Choose Your Gym Time ---- ]", "06 : 00 AM  --  07 : 00 AM ", "07 : 00 AM  --  08 : 00 AM ", "08 : 00 AM  --  09 : 00 AM ", "09 : 00 AM  --  10 : 00 AM "}));
			comboBox_1.setBounds(617, 222, 352, 28);
		}
		return comboBox_1;
	}
	private JButton getBtnX() {
		if (btnX == null) {
			btnX = new JButton("X");
			btnX.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnX.setForeground(Color.WHITE);
			btnX.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnX.setBackground(Color.RED);
			btnX.setBounds(1000, 10, 50, 40);
		}
		return btnX;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(380, 60, 252, 19);
		}
		return separator;
	}
}
