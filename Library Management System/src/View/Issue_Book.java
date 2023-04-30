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
import com.toedter.calendar.JDateChooser;

public class Issue_Book extends JFrame {

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
	private JTextField textField_2;
	private JLabel lblFatherName_1_1;
	private JComboBox comboBox_1_1_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton btnSearch;
	private JPanel panel_1;
	private JTextField textField_6;
	private JLabel lblStudentId_1;
	private JLabel lblFullName_1;
	private JTextField textField_7;
	private JLabel lblFatherName_1;
	private JTextField textField_8;
	private JLabel lblYear_1;
	private JLabel lblBranch_1;
	private JLabel lblCourse_1;
	private JTextField textField_9;
	private JLabel lblFatherName_1_1_1;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_1_1;
	private JButton btnSearch_1;
	private JLabel lblFatherName_1_1_1_1;
	private JButton btnIssue;
	private JButton btnBack_1;
	private JDateChooser dateChooser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Issue_Book frame = new Issue_Book();
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
	public Issue_Book() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(200, 140, 1229, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getPanel_1());
		contentPane.add(getBtnIssue());
		contentPane.add(getBtnBack_1());
		contentPane.add(getLblFatherName_1_1_1_1());
		contentPane.add(getDateChooser());
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 191, 255), 2), "Book Detail", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(24, 54, 574, 387);
			panel.add(getTextField());
			panel.add(getLblStudentId());
			panel.add(getLblFullName());
			panel.add(getTextField_1());
			panel.add(getLblFatherName());
			panel.add(getLblYear());
			panel.add(getLblBranch());
			panel.add(getLblCourse());
			panel.add(getTextField_2());
			panel.add(getLblFatherName_1_1());
			panel.add(getComboBox_1_1_1());
			panel.add(getTextField_3());
			panel.add(getTextField_4());
			panel.add(getTextField_5());
			panel.add(getBtnSearch());
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
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(172, 235, 263, 29);
		}
		return textField_2;
	}
	private JLabel getLblFatherName_1_1() {
		if (lblFatherName_1_1 == null) {
			lblFatherName_1_1 = new JLabel("Book Writter");
			lblFatherName_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblFatherName_1_1.setBounds(21, 334, 141, 23);
		}
		return lblFatherName_1_1;
	}
	private JComboBox getComboBox_1_1_1() {
		if (comboBox_1_1_1 == null) {
			comboBox_1_1_1 = new JComboBox();
			comboBox_1_1_1.setBounds(172, 140, 263, 29);
		}
		return comboBox_1_1_1;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(172, 185, 263, 29);
		}
		return textField_3;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(172, 283, 263, 29);
		}
		return textField_4;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(172, 330, 263, 29);
		}
		return textField_5;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("Search");
			btnSearch.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnSearch.setBounds(447, 42, 108, 29);
		}
		return btnSearch;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 191, 255), 2), "Student Detail", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_1.setBounds(618, 54, 570, 387);
			panel_1.add(getTextField_6());
			panel_1.add(getLblStudentId_1());
			panel_1.add(getLblFullName_1());
			panel_1.add(getTextField_7());
			panel_1.add(getLblFatherName_1());
			panel_1.add(getTextField_8());
			panel_1.add(getLblYear_1());
			panel_1.add(getLblBranch_1());
			panel_1.add(getLblCourse_1());
			panel_1.add(getTextField_9());
			panel_1.add(getLblFatherName_1_1_1());
			panel_1.add(getComboBox());
			panel_1.add(getComboBox_1());
			panel_1.add(getComboBox_1_1());
			panel_1.add(getBtnSearch_1());
		}
		return panel_1;
	}
	private JTextField getTextField_6() {
		if (textField_6 == null) {
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(172, 42, 263, 29);
		}
		return textField_6;
	}
	private JLabel getLblStudentId_1() {
		if (lblStudentId_1 == null) {
			lblStudentId_1 = new JLabel("Student ID");
			lblStudentId_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblStudentId_1.setBounds(21, 44, 113, 23);
		}
		return lblStudentId_1;
	}
	private JLabel getLblFullName_1() {
		if (lblFullName_1 == null) {
			lblFullName_1 = new JLabel("Full Name");
			lblFullName_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblFullName_1.setBounds(21, 94, 113, 23);
		}
		return lblFullName_1;
	}
	private JTextField getTextField_7() {
		if (textField_7 == null) {
			textField_7 = new JTextField();
			textField_7.setColumns(10);
			textField_7.setBounds(172, 92, 263, 29);
		}
		return textField_7;
	}
	private JLabel getLblFatherName_1() {
		if (lblFatherName_1 == null) {
			lblFatherName_1 = new JLabel("Father Name");
			lblFatherName_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblFatherName_1.setBounds(21, 144, 141, 23);
		}
		return lblFatherName_1;
	}
	private JTextField getTextField_8() {
		if (textField_8 == null) {
			textField_8 = new JTextField();
			textField_8.setColumns(10);
			textField_8.setBounds(172, 140, 263, 29);
		}
		return textField_8;
	}
	private JLabel getLblYear_1() {
		if (lblYear_1 == null) {
			lblYear_1 = new JLabel("Year");
			lblYear_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblYear_1.setBounds(21, 287, 91, 23);
		}
		return lblYear_1;
	}
	private JLabel getLblBranch_1() {
		if (lblBranch_1 == null) {
			lblBranch_1 = new JLabel("Branch");
			lblBranch_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblBranch_1.setBounds(21, 237, 91, 23);
		}
		return lblBranch_1;
	}
	private JLabel getLblCourse_1() {
		if (lblCourse_1 == null) {
			lblCourse_1 = new JLabel("Course");
			lblCourse_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblCourse_1.setBounds(21, 187, 113, 23);
		}
		return lblCourse_1;
	}
	private JTextField getTextField_9() {
		if (textField_9 == null) {
			textField_9 = new JTextField();
			textField_9.setColumns(10);
			textField_9.setBounds(172, 235, 263, 29);
		}
		return textField_9;
	}
	private JLabel getLblFatherName_1_1_1() {
		if (lblFatherName_1_1_1 == null) {
			lblFatherName_1_1_1 = new JLabel("Semester");
			lblFatherName_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblFatherName_1_1_1.setBounds(21, 334, 113, 23);
		}
		return lblFatherName_1_1_1;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(172, 330, 263, 29);
		}
		return comboBox;
	}
	private JComboBox getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox();
			comboBox_1.setBounds(172, 283, 263, 29);
		}
		return comboBox_1;
	}
	private JComboBox getComboBox_1_1() {
		if (comboBox_1_1 == null) {
			comboBox_1_1 = new JComboBox();
			comboBox_1_1.setBounds(172, 185, 263, 29);
		}
		return comboBox_1_1;
	}
	private JButton getBtnSearch_1() {
		if (btnSearch_1 == null) {
			btnSearch_1 = new JButton("Search");
			btnSearch_1.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnSearch_1.setBounds(445, 42, 108, 29);
		}
		return btnSearch_1;
	}
	private JLabel getLblFatherName_1_1_1_1() {
		if (lblFatherName_1_1_1_1 == null) {
			lblFatherName_1_1_1_1 = new JLabel("Date of Issue");
			lblFatherName_1_1_1_1.setBounds(645, 467, 141, 23);
			lblFatherName_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		}
		return lblFatherName_1_1_1_1;
	}
	private JButton getBtnIssue() {
		if (btnIssue == null) {
			btnIssue = new JButton("Issue");
			btnIssue.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnIssue.setBounds(796, 522, 128, 35);
		}
		return btnIssue;
	}
	private JButton getBtnBack_1() {
		if (btnBack_1 == null) {
			btnBack_1 = new JButton("Back");
			btnBack_1.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnBack_1.setBounds(968, 522, 91, 35);
		}
		return btnBack_1;
	}
	private JDateChooser getDateChooser() {
		if (dateChooser == null) {
			dateChooser = new JDateChooser();
			dateChooser.setBounds(796, 463, 263, 29);
		}
		return dateChooser;
	}
}
