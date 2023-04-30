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

public class Manage_Room extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JPanel panel_1_1;
	private JScrollPane scrollPane;
	private JTable table;
	private JTextField textField;
	private JLabel lblRoomNumber;
	private JLabel lblRoomType;
	private JLabel lblBed;
	private JTextField textField_3;
	private JLabel lblRoomPrice;
	private JButton btnAddRoom;
	private JComboBox comboBox;
	private JComboBox comboBox_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manage_Room frame = new Manage_Room();
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
	public Manage_Room() {
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
			panel.add(getPanel_1_1());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("MANAGE ROOM");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblNewLabel.setBounds(40, 16, 201, 54);
		}
		return lblNewLabel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBounds(40, 71, 650, 540);
			panel_1.setLayout(null);
			panel_1.add(getScrollPane());
		}
		return panel_1;
	}
	private JPanel getPanel_1_1() {
		if (panel_1_1 == null) {
			panel_1_1 = new JPanel();
			panel_1_1.setBounds(800, 71, 512, 540);
			panel_1_1.setLayout(null);
			panel_1_1.add(getTextField());
			panel_1_1.add(getLblRoomNumber());
			panel_1_1.add(getLblRoomType());
			panel_1_1.add(getLblBed());
			panel_1_1.add(getTextField_3());
			panel_1_1.add(getLblRoomPrice());
			panel_1_1.add(getBtnAddRoom());
			panel_1_1.add(getComboBox());
			panel_1_1.add(getComboBox_1());
		}
		return panel_1_1;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 10, 630, 520);
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
					"Room Number", "Room Type", "Bed", "Price", "Status"
				}
			));
		}
		return table;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(73, 74, 367, 26);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblRoomNumber() {
		if (lblRoomNumber == null) {
			lblRoomNumber = new JLabel("Room Number");
			lblRoomNumber.setBounds(74, 30, 144, 35);
			lblRoomNumber.setForeground(Color.BLACK);
			lblRoomNumber.setFont(new Font("Arial Black", Font.BOLD, 16));
		}
		return lblRoomNumber;
	}
	private JLabel getLblRoomType() {
		if (lblRoomType == null) {
			lblRoomType = new JLabel("Room Type");
			lblRoomType.setForeground(Color.BLACK);
			lblRoomType.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblRoomType.setBounds(74, 127, 144, 35);
		}
		return lblRoomType;
	}
	private JLabel getLblBed() {
		if (lblBed == null) {
			lblBed = new JLabel("No. Bed");
			lblBed.setForeground(Color.BLACK);
			lblBed.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblBed.setBounds(74, 235, 104, 35);
		}
		return lblBed;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(73, 382, 367, 26);
		}
		return textField_3;
	}
	private JLabel getLblRoomPrice() {
		if (lblRoomPrice == null) {
			lblRoomPrice = new JLabel("Room Price");
			lblRoomPrice.setForeground(Color.BLACK);
			lblRoomPrice.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblRoomPrice.setBounds(74, 338, 144, 35);
		}
		return lblRoomPrice;
	}
	private JButton getBtnAddRoom() {
		if (btnAddRoom == null) {
			btnAddRoom = new JButton("Add Room");
			btnAddRoom.setForeground(Color.WHITE);
			btnAddRoom.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnAddRoom.setBackground(new Color(220, 20, 60));
			btnAddRoom.setBounds(73, 442, 155, 32);
		}
		return btnAddRoom;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(73, 170, 367, 26);
		}
		return comboBox;
	}
	private JComboBox getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox();
			comboBox_1.setBounds(73, 280, 367, 26);
		}
		return comboBox_1;
	}
}
