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

public class Customer_check_out extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JTextField textField;
	private JLabel lblRoomNumber;
	private JLabel lblMobileNumber;
	private JTextField textField_1;
	private JButton btnAllotRoom;
	private JButton btnClear;
	private JTextField textField_2;
	private JLabel lblRoomNumber_1;
	private JLabel lblMobileNumber_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblRoomNumber_2;
	private JLabel lblMobileNumber_2;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel lblRoomNumber_3;
	private JLabel lblMobileNumber_3;
	private JTextField textField_7;
	private JLabel lblRoomNumber_5;
	private JTextField textField_8;
	private JButton btnSearch;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_check_out frame = new Customer_check_out();
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
	public Customer_check_out() {
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
			panel.add(getLblRoomNumber_5());
			panel.add(getTextField_8());
			panel.add(getBtnSearch());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("CUSTOMER CHECK OUT");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel.setBounds(40, 16, 299, 54);
		}
		return lblNewLabel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBounds(40, 113, 1296, 498);
			panel_1.setLayout(null);
			panel_1.add(getTextField_4());
			panel_1.add(getLblRoomNumber_1());
			panel_1.add(getLblRoomNumber_1_1());
			panel_1.add(getTextField_1());
			panel_1.add(getBtnAllotRoom());
			panel_1.add(getBtnClear());
			panel_1.add(getTextField_2());
			panel_1.add(getLblRoomNumber_1_3());
			panel_1.add(getLblMobileNumber_1());
			panel_1.add(getTextField_3());
			panel_1.add(getTextField_4_1());
			panel_1.add(getLblRoomNumber_2());
			panel_1.add(getLblMobileNumber_2());
			panel_1.add(getTextField_5_1());
			panel_1.add(getTextField_6_1());
			panel_1.add(getLblRoomNumber_3());
			panel_1.add(getLblMobileNumber_3());
			panel_1.add(getTextField_7_1());
			panel_1.add(getScrollPane());
		}
		return panel_1;
	}
	private JTextField getTextField_4() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(33, 72, 262, 26);
		}
		return textField;
	}
	private JLabel getLblRoomNumber_1() {
		if (lblRoomNumber == null) {
			lblRoomNumber = new JLabel("Customer Name");
			lblRoomNumber.setForeground(Color.BLACK);
			lblRoomNumber.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblRoomNumber.setBounds(34, 30, 176, 35);
		}
		return lblRoomNumber;
	}
	private JLabel getLblRoomNumber_1_1() {
		if (lblMobileNumber == null) {
			lblMobileNumber = new JLabel("Price Per Day");
			lblMobileNumber.setForeground(Color.BLACK);
			lblMobileNumber.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblMobileNumber.setBounds(34, 123, 157, 35);
		}
		return lblMobileNumber;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(33, 165, 262, 26);
		}
		return textField_1;
	}
	private JButton getBtnAllotRoom() {
		if (btnAllotRoom == null) {
			btnAllotRoom = new JButton("Check Out");
			btnAllotRoom.setForeground(Color.WHITE);
			btnAllotRoom.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnAllotRoom.setBackground(new Color(220, 20, 60));
			btnAllotRoom.setBounds(33, 212, 127, 32);
		}
		return btnAllotRoom;
	}
	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton("Clear");
			btnClear.setForeground(Color.WHITE);
			btnClear.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnClear.setBackground(new Color(220, 20, 60));
			btnClear.setBounds(197, 212, 98, 32);
		}
		return btnClear;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(347, 72, 262, 26);
		}
		return textField_2;
	}
	private JLabel getLblRoomNumber_1_3() {
		if (lblRoomNumber_1 == null) {
			lblRoomNumber_1 = new JLabel("Customer Name");
			lblRoomNumber_1.setForeground(Color.BLACK);
			lblRoomNumber_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblRoomNumber_1.setBounds(348, 30, 176, 35);
		}
		return lblRoomNumber_1;
	}
	private JLabel getLblMobileNumber_1() {
		if (lblMobileNumber_1 == null) {
			lblMobileNumber_1 = new JLabel("Price Per Day");
			lblMobileNumber_1.setForeground(Color.BLACK);
			lblMobileNumber_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblMobileNumber_1.setBounds(348, 123, 157, 35);
		}
		return lblMobileNumber_1;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(347, 165, 262, 26);
		}
		return textField_3;
	}
	private JTextField getTextField_4_1() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(672, 72, 262, 26);
		}
		return textField_4;
	}
	private JLabel getLblRoomNumber_2() {
		if (lblRoomNumber_2 == null) {
			lblRoomNumber_2 = new JLabel("Customer Name");
			lblRoomNumber_2.setForeground(Color.BLACK);
			lblRoomNumber_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblRoomNumber_2.setBounds(673, 30, 176, 35);
		}
		return lblRoomNumber_2;
	}
	private JLabel getLblMobileNumber_2() {
		if (lblMobileNumber_2 == null) {
			lblMobileNumber_2 = new JLabel("Price Per Day");
			lblMobileNumber_2.setForeground(Color.BLACK);
			lblMobileNumber_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblMobileNumber_2.setBounds(673, 123, 157, 35);
		}
		return lblMobileNumber_2;
	}
	private JTextField getTextField_5_1() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(672, 165, 262, 26);
		}
		return textField_5;
	}
	private JTextField getTextField_6_1() {
		if (textField_6 == null) {
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(995, 72, 262, 26);
		}
		return textField_6;
	}
	private JLabel getLblRoomNumber_3() {
		if (lblRoomNumber_3 == null) {
			lblRoomNumber_3 = new JLabel("Customer Name");
			lblRoomNumber_3.setForeground(Color.BLACK);
			lblRoomNumber_3.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblRoomNumber_3.setBounds(996, 30, 176, 35);
		}
		return lblRoomNumber_3;
	}
	private JLabel getLblMobileNumber_3() {
		if (lblMobileNumber_3 == null) {
			lblMobileNumber_3 = new JLabel("Price Per Day");
			lblMobileNumber_3.setForeground(Color.BLACK);
			lblMobileNumber_3.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblMobileNumber_3.setBounds(996, 123, 157, 35);
		}
		return lblMobileNumber_3;
	}
	private JTextField getTextField_7_1() {
		if (textField_7 == null) {
			textField_7 = new JTextField();
			textField_7.setColumns(10);
			textField_7.setBounds(995, 165, 262, 26);
		}
		return textField_7;
	}
	private JLabel getLblRoomNumber_5() {
		if (lblRoomNumber_5 == null) {
			lblRoomNumber_5 = new JLabel("Room Number");
			lblRoomNumber_5.setForeground(Color.BLACK);
			lblRoomNumber_5.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblRoomNumber_5.setBounds(443, 60, 146, 35);
		}
		return lblRoomNumber_5;
	}
	private JTextField getTextField_8() {
		if (textField_8 == null) {
			textField_8 = new JTextField();
			textField_8.setColumns(10);
			textField_8.setBounds(604, 64, 146, 28);
		}
		return textField_8;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("Search");
			btnSearch.setForeground(Color.WHITE);
			btnSearch.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnSearch.setBackground(new Color(220, 20, 60));
			btnSearch.setBounds(771, 64, 105, 28);
		}
		return btnSearch;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(33, 271, 1224, 205);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"ID", "Name", "Mobile Number", "Nationality", "Gender", "Email", "ID Proof", "Address", "Check In Date", "Room Number", "Bed", "Room Type", "Price Per Day"
				}
			));
		}
		return table;
	}
}
