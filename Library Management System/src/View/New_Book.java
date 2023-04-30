package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class New_Book extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JTextField textField;
	private JLabel lblStudentId;
	private JLabel lblFullName;
	private JTextField textField_1;
	private JLabel lblFatherName;
	private JLabel lblYear;
	private JLabel lblBranch;
	private JLabel lblCourse;
	private JTextField textField_5;
	private JLabel lblFatherName_1_1;
	private JButton btnRegister;
	private JButton btnBack;
	private JComboBox comboBox_1_1_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New_Book frame = new New_Book();
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
	public New_Book() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(520, 140, 525, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new TitledBorder(new LineBorder(new Color(218, 165, 32), 2), "New Book", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(20, 20, 474, 466);
			panel.setLayout(null);
			panel.add(getTextField());
			panel.add(getLblStudentId());
			panel.add(getLblFullName());
			panel.add(getTextField_1());
			panel.add(getLblFatherName());
			panel.add(getLblYear());
			panel.add(getLblBranch());
			panel.add(getLblCourse());
			panel.add(getTextField_5());
			panel.add(getLblFatherName_1_1());
			panel.add(getBtnRegister());
			panel.add(getBtnBack());
			panel.add(getComboBox_1_1_1());
			panel.add(getTextField_2_1());
			panel.add(getTextField_3());
			panel.add(getTextField_4());
		}
		return panel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(172, 42, 263, 29);
		}
		return textField;
	}
	private JLabel getLblStudentId() {
		if (lblStudentId == null) {
			lblStudentId = new JLabel("Book ID");
			lblStudentId.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblStudentId.setBounds(21, 44, 113, 23);
		}
		return lblStudentId;
	}
	private JLabel getLblFullName() {
		if (lblFullName == null) {
			lblFullName = new JLabel("Book Name");
			lblFullName.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblFullName.setBounds(21, 94, 113, 23);
		}
		return lblFullName;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(172, 92, 263, 29);
		}
		return textField_1;
	}
	private JLabel getLblFatherName() {
		if (lblFatherName == null) {
			lblFatherName = new JLabel("Edition");
			lblFatherName.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblFatherName.setBounds(21, 144, 103, 23);
		}
		return lblFatherName;
	}
	private JLabel getLblYear() {
		if (lblYear == null) {
			lblYear = new JLabel("Book Pages");
			lblYear.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblYear.setBounds(21, 287, 113, 23);
		}
		return lblYear;
	}
	private JLabel getLblBranch() {
		if (lblBranch == null) {
			lblBranch = new JLabel("Book Price");
			lblBranch.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblBranch.setBounds(21, 237, 113, 23);
		}
		return lblBranch;
	}
	private JLabel getLblCourse() {
		if (lblCourse == null) {
			lblCourse = new JLabel("Publisher");
			lblCourse.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblCourse.setBounds(21, 187, 113, 23);
		}
		return lblCourse;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(172, 235, 263, 29);
		}
		return textField_5;
	}
	private JLabel getLblFatherName_1_1() {
		if (lblFatherName_1_1 == null) {
			lblFatherName_1_1 = new JLabel("Book Writter");
			lblFatherName_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblFatherName_1_1.setBounds(21, 334, 141, 23);
		}
		return lblFatherName_1_1;
	}
	private JButton getBtnRegister() {
		if (btnRegister == null) {
			btnRegister = new JButton("Register");
			btnRegister.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnRegister.setBounds(172, 390, 128, 35);
		}
		return btnRegister;
	}
	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
			btnBack.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnBack.setBounds(344, 390, 91, 35);
		}
		return btnBack;
	}
	private JComboBox getComboBox_1_1_1() {
		if (comboBox_1_1_1 == null) {
			comboBox_1_1_1 = new JComboBox();
			comboBox_1_1_1.setBounds(172, 140, 263, 29);
		}
		return comboBox_1_1_1;
	}
	private JTextField getTextField_2_1() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(172, 185, 263, 29);
		}
		return textField_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(172, 283, 263, 29);
		}
		return textField_3;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(172, 330, 263, 29);
		}
		return textField_4;
	}
}
