package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Book_Package extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNewCustomerForm;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JTextField textField_2;
	private JLabel lblNewLabel_1_1_1;
	private JTextField textField_3;
	private JLabel lblNewLabel_1_1_1_1;
	private JTextField textField_4;
	private JLabel lblNewLabel_1_1_1_2;
	private JTextField textField_5;
	private JSeparator separator;
	private JButton btnNewButton;
	private JButton btnBack;
	private JPanel panel;
	private JLabel lblNewLabel_2;
	private JComboBox comboBox;
	private JButton btnX;
	private JButton btnBook;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Book_Package frame = new Book_Package();
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
	public Book_Package() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 919, 460);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(Color.GREEN, 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTextField());
		contentPane.add(getLblNewCustomerForm());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getTextField_2());
		contentPane.add(getLblNewLabel_1_1_1());
		contentPane.add(getTextField_3());
		contentPane.add(getLblNewLabel_1_1_1_1());
		contentPane.add(getTextField_4());
		contentPane.add(getLblNewLabel_1_1_1_2());
		contentPane.add(getTextField_5());
		contentPane.add(getSeparator());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnBack());
		contentPane.add(getPanel());
		contentPane.add(getComboBox());
		contentPane.add(getBtnX());
		contentPane.add(getBtnBook());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Username");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel.setBounds(50, 103, 116, 24);
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(209, 104, 267, 24);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblNewCustomerForm() {
		if (lblNewCustomerForm == null) {
			lblNewCustomerForm = new JLabel("BOOK PACKAGE");
			lblNewCustomerForm.setFont(new Font("Arial Black", Font.BOLD, 24));
			lblNewCustomerForm.setBounds(292, 32, 245, 32);
		}
		return lblNewCustomerForm;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Select Package");
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 15));
			lblNewLabel_1.setBounds(50, 148, 140, 24);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Total Passenger");
			lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 15));
			lblNewLabel_1_1.setBounds(50, 193, 173, 24);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(209, 194, 267, 24);
		}
		return textField_2;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("ID Number");
			lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1.setBounds(50, 237, 116, 24);
		}
		return lblNewLabel_1_1_1;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(209, 238, 267, 24);
		}
		return textField_3;
	}
	private JLabel getLblNewLabel_1_1_1_1() {
		if (lblNewLabel_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1 = new JLabel("Full Name");
			lblNewLabel_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_1.setBounds(50, 283, 116, 24);
		}
		return lblNewLabel_1_1_1_1;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(209, 284, 267, 24);
		}
		return textField_4;
	}
	private JLabel getLblNewLabel_1_1_1_2() {
		if (lblNewLabel_1_1_1_2 == null) {
			lblNewLabel_1_1_1_2 = new JLabel("Total Price ");
			lblNewLabel_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1_1_2.setBounds(50, 329, 116, 24);
		}
		return lblNewLabel_1_1_1_2;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(209, 330, 267, 24);
		}
		return textField_5;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(274, 74, 259, 24);
		}
		return separator;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Check Price");
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnNewButton.setBounds(50, 387, 158, 38);
		}
		return btnNewButton;
	}
	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
			btnBack.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnBack.setBounds(376, 387, 100, 38);
		}
		return btnBack;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(508, 102, 376, 251);
			panel.setLayout(null);
			panel.add(getLblNewLabel_2());
		}
		return panel;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Photos");
			lblNewLabel_2.setBounds(10, 10, 356, 228);
		}
		return lblNewLabel_2;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setFont(new Font("Arial Black", Font.BOLD, 16));
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"[ --- Choose Your ID ---- ]", "Citizenship", "Password", "Voter ID", "Driving License"}));
			comboBox.setBounds(209, 149, 267, 24);
		}
		return comboBox;
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
			btnX.setBackground(Color.RED);
			btnX.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnX.setBounds(854, 10, 50, 38);
		}
		return btnX;
	}
	private JButton getBtnBook() {
		if (btnBook == null) {
			btnBook = new JButton("Book");
			btnBook.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnBook.setBounds(240, 387, 100, 38);
		}
		return btnBook;
	}
}
