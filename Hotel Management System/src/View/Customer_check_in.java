package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Customer_check_in extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JTextField textField;
	private JLabel lblRoomNumber;
	private JLabel lblMobileNumber;
	private JTextField textField_1;
	private JLabel lblNationality;
	private JTextField textField_2;
	private JLabel lblGender;
	private JTextField textField_3;
	private JLabel lblEmail;
	private JTextField textField_4;
	private JLabel lblId;
	private JTextField textField_5;
	private JLabel lblRoomNumber_1_1;
	private JTextField textField_6;
	private JLabel lblRoomNumber_1_2;
	private JTextField textField_7;
	private JLabel lblNoBed;
	private JLabel lblNoBed_1;
	private JLabel lblNoBed_2;
	private JTextField textField_11;
	private JLabel lblNoBed_2_1;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_1_1;
	private JButton btnAllotRoom;
	private JButton btnClear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_check_in frame = new Customer_check_in();
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
	public Customer_check_in() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(94, 130, 1375, 632);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(51, 204, 153));
			panel.setBounds(0, 0, 1374, 632);
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getPanel_1());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("CUSTOMER CHECK IN");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel.setBounds(40, 16, 278, 54);
		}
		return lblNewLabel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBounds(40, 116, 1296, 495);
			panel_1.setLayout(null);
			panel_1.add(getTextField_4());
			panel_1.add(getLblRoomNumber_1());
			panel_1.add(getLblRoomNumber_1_1());
			panel_1.add(getTextField_1());
			panel_1.add(getLblNationality());
			panel_1.add(getTextField_2());
			panel_1.add(getLblGender());
			panel_1.add(getTextField_3());
			panel_1.add(getLblEmail());
			panel_1.add(getTextField_4_1());
			panel_1.add(getLblRoomNumber_1_2());
			panel_1.add(getTextField_5());
			panel_1.add(getLblRoomNumber_1_1_1());
			panel_1.add(getTextField_6());
			panel_1.add(getLblRoomNumber_1_2_1());
			panel_1.add(getTextField_7());
			panel_1.add(getLblNoBed());
			panel_1.add(getLblNoBed_1());
			panel_1.add(getLblNoBed_2());
			panel_1.add(getTextField_11());
			panel_1.add(getLblNoBed_2_1());
			panel_1.add(getComboBox());
			panel_1.add(getComboBox_1());
			panel_1.add(getComboBox_1_1());
			panel_1.add(getBtnAllotRoom());
			panel_1.add(getBtnClear());
		}
		return panel_1;
	}
	private JTextField getTextField_4() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(22, 72, 367, 26);
		}
		return textField;
	}
	private JLabel getLblRoomNumber_1() {
		if (lblRoomNumber == null) {
			lblRoomNumber = new JLabel("Full Name");
			lblRoomNumber.setForeground(Color.BLACK);
			lblRoomNumber.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblRoomNumber.setBounds(23, 30, 144, 35);
		}
		return lblRoomNumber;
	}
	private JLabel getLblRoomNumber_1_1() {
		if (lblMobileNumber == null) {
			lblMobileNumber = new JLabel("Mobile Number");
			lblMobileNumber.setForeground(Color.BLACK);
			lblMobileNumber.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblMobileNumber.setBounds(23, 123, 157, 35);
		}
		return lblMobileNumber;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(22, 165, 367, 26);
		}
		return textField_1;
	}
	private JLabel getLblNationality() {
		if (lblNationality == null) {
			lblNationality = new JLabel("Nationality");
			lblNationality.setForeground(Color.BLACK);
			lblNationality.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNationality.setBounds(23, 215, 144, 35);
		}
		return lblNationality;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(22, 257, 367, 26);
		}
		return textField_2;
	}
	private JLabel getLblGender() {
		if (lblGender == null) {
			lblGender = new JLabel("Gender");
			lblGender.setForeground(Color.BLACK);
			lblGender.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblGender.setBounds(23, 306, 144, 35);
		}
		return lblGender;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(22, 348, 367, 26);
		}
		return textField_3;
	}
	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email");
			lblEmail.setForeground(Color.BLACK);
			lblEmail.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblEmail.setBounds(23, 397, 144, 35);
		}
		return lblEmail;
	}
	private JTextField getTextField_4_1() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(22, 439, 367, 26);
		}
		return textField_4;
	}
	private JLabel getLblRoomNumber_1_2() {
		if (lblId == null) {
			lblId = new JLabel(" ID Proof");
			lblId.setForeground(Color.BLACK);
			lblId.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblId.setBounds(457, 30, 144, 35);
		}
		return lblId;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(456, 72, 367, 26);
		}
		return textField_5;
	}
	private JLabel getLblRoomNumber_1_1_1() {
		if (lblRoomNumber_1_1 == null) {
			lblRoomNumber_1_1 = new JLabel("Address");
			lblRoomNumber_1_1.setForeground(Color.BLACK);
			lblRoomNumber_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblRoomNumber_1_1.setBounds(458, 123, 144, 35);
		}
		return lblRoomNumber_1_1;
	}
	private JTextField getTextField_6() {
		if (textField_6 == null) {
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(457, 165, 367, 26);
		}
		return textField_6;
	}
	private JLabel getLblRoomNumber_1_2_1() {
		if (lblRoomNumber_1_2 == null) {
			lblRoomNumber_1_2 = new JLabel("Check In Date ( Today )");
			lblRoomNumber_1_2.setForeground(Color.BLACK);
			lblRoomNumber_1_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblRoomNumber_1_2.setBounds(457, 215, 227, 35);
		}
		return lblRoomNumber_1_2;
	}
	private JTextField getTextField_7() {
		if (textField_7 == null) {
			textField_7 = new JTextField();
			textField_7.setColumns(10);
			textField_7.setBounds(456, 257, 367, 26);
		}
		return textField_7;
	}
	private JLabel getLblNoBed() {
		if (lblNoBed == null) {
			lblNoBed = new JLabel("No. Bed");
			lblNoBed.setForeground(Color.BLACK);
			lblNoBed.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNoBed.setBounds(902, 30, 144, 35);
		}
		return lblNoBed;
	}
	private JLabel getLblNoBed_1() {
		if (lblNoBed_1 == null) {
			lblNoBed_1 = new JLabel("Room Type");
			lblNoBed_1.setForeground(Color.BLACK);
			lblNoBed_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNoBed_1.setBounds(902, 123, 144, 35);
		}
		return lblNoBed_1;
	}
	private JLabel getLblNoBed_2() {
		if (lblNoBed_2 == null) {
			lblNoBed_2 = new JLabel("Room Number");
			lblNoBed_2.setForeground(Color.BLACK);
			lblNoBed_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNoBed_2.setBounds(902, 215, 144, 35);
		}
		return lblNoBed_2;
	}
	private JTextField getTextField_11() {
		if (textField_11 == null) {
			textField_11 = new JTextField();
			textField_11.setColumns(10);
			textField_11.setBounds(901, 348, 367, 26);
		}
		return textField_11;
	}
	private JLabel getLblNoBed_2_1() {
		if (lblNoBed_2_1 == null) {
			lblNoBed_2_1 = new JLabel("Room Price");
			lblNoBed_2_1.setForeground(Color.BLACK);
			lblNoBed_2_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNoBed_2_1.setBounds(902, 306, 144, 35);
		}
		return lblNoBed_2_1;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(902, 257, 367, 26);
		}
		return comboBox;
	}
	private JComboBox getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox();
			comboBox_1.setBounds(902, 165, 367, 26);
		}
		return comboBox_1;
	}
	private JComboBox getComboBox_1_1() {
		if (comboBox_1_1 == null) {
			comboBox_1_1 = new JComboBox();
			comboBox_1_1.setBounds(902, 72, 367, 26);
		}
		return comboBox_1_1;
	}
	private JButton getBtnAllotRoom() {
		if (btnAllotRoom == null) {
			btnAllotRoom = new JButton("Allot Room");
			btnAllotRoom.setForeground(Color.WHITE);
			btnAllotRoom.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnAllotRoom.setBackground(new Color(220, 20, 60));
			btnAllotRoom.setBounds(902, 412, 155, 32);
		}
		return btnAllotRoom;
	}
	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton("Clear");
			btnClear.setForeground(Color.WHITE);
			btnClear.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnClear.setBackground(new Color(220, 20, 60));
			btnClear.setBounds(1113, 412, 155, 32);
		}
		return btnClear;
	}
}
