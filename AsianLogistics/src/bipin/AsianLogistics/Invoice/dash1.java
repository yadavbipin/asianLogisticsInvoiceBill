package bipin.AsianLogistics.Invoice;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JTable;
import com.toedter.calendar.JDateChooser;

public class dash1 extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTable table;
	private JTable table_2;
	private JTable table_3;

	/**
	 * Create the panel.
	 */
	public dash1() {
		setLayout(null);
		
		JPanel billpanel = new JPanel();
		billpanel.setBounds(0, 0, 1168, 372);
		add(billpanel);
		billpanel.setLayout(null);
		
		JLabel label = new JLabel("To Address");
		label.setBounds(331, 105, 68, 14);
		billpanel.add(label);
		
		JLabel label_1 = new JLabel("Bill Date");
		label_1.setBounds(742, 105, 130, 14);
		billpanel.add(label_1);
		
		JLabel label_2 = new JLabel("Consigner Gst No");
		label_2.setBounds(742, 135, 130, 14);
		billpanel.add(label_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(882, 132, 86, 20);
		billpanel.add(textField);
		
		JLabel label_3 = new JLabel("Consignee Gst No");
		label_3.setBounds(742, 169, 130, 14);
		billpanel.add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(882, 166, 86, 20);
		billpanel.add(textField_1);
		
		JLabel label_4 = new JLabel("C/N Date");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_4.setBounds(10, 88, 112, 14);
		billpanel.add(label_4);
		
		JLabel label_5 = new JLabel("C/N No");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_5.setBounds(10, 121, 43, 14);
		billpanel.add(label_5);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(132, 116, 113, 20);
		billpanel.add(textField_2);
		
		JLabel label_6 = new JLabel("Invoice  No");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_6.setBounds(10, 152, 112, 15);
		billpanel.add(label_6);
		
		textField_3 = new JTextField();
		textField_3.setText("");
		textField_3.setColumns(10);
		textField_3.setBounds(132, 149, 113, 20);
		billpanel.add(textField_3);
		
		JLabel label_7 = new JLabel("From");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_7.setBounds(10, 182, 112, 15);
		billpanel.add(label_7);
		
		textField_4 = new JTextField();
		textField_4.setText("");
		textField_4.setColumns(10);
		textField_4.setBounds(132, 180, 113, 20);
		billpanel.add(textField_4);
		
		JLabel label_8 = new JLabel("To");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_8.setBounds(10, 216, 112, 15);
		billpanel.add(label_8);
		
		textField_5 = new JTextField();
		textField_5.setText("");
		textField_5.setColumns(10);
		textField_5.setBounds(132, 213, 113, 20);
		billpanel.add(textField_5);
		
		JLabel label_9 = new JLabel("Vehicle No");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_9.setBounds(10, 248, 112, 15);
		billpanel.add(label_9);
		
		textField_6 = new JTextField();
		textField_6.setText("");
		textField_6.setColumns(10);
		textField_6.setBounds(132, 246, 113, 20);
		billpanel.add(textField_6);
		
		JLabel label_10 = new JLabel("Unloading Date");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_10.setBounds(10, 277, 112, 15);
		billpanel.add(label_10);
		
		JLabel label_11 = new JLabel("Actual Weight");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_11.setBounds(10, 306, 112, 15);
		billpanel.add(label_11);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(132, 304, 113, 20);
		billpanel.add(textField_7);
		
		JLabel label_12 = new JLabel("Charge Weight");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_12.setBounds(10, 337, 112, 15);
		billpanel.add(label_12);
		
		textField_8 = new JTextField();
		textField_8.setText("");
		textField_8.setColumns(10);
		textField_8.setBounds(132, 335, 113, 20);
		billpanel.add(textField_8);
		
		JLabel label_13 = new JLabel("Rate Per Ton");
		label_13.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_13.setBounds(10, 368, 80, 15);
		billpanel.add(label_13);
		
		textField_9 = new JTextField();
		textField_9.setText("");
		textField_9.setColumns(10);
		textField_9.setBounds(132, 366, 113, 20);
		billpanel.add(textField_9);
		
		JLabel label_14 = new JLabel("Amount");
		label_14.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_14.setBounds(10, 399, 112, 15);
		billpanel.add(label_14);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(132, 397, 113, 20);
		billpanel.add(textField_10);
		
		JButton button = new JButton("Add");
		button.setBounds(10, 455, 112, 23);
		billpanel.add(button);
		
		JButton button_1 = new JButton("Clear");
		button_1.setBounds(132, 455, 113, 23);
		billpanel.add(button_1);
		
		JLabel label_15 = new JLabel("L/U");
		label_15.setBounds(297, 249, 69, 14);
		billpanel.add(label_15);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(437, 246, 86, 20);
		billpanel.add(textField_11);
		
		JLabel label_16 = new JLabel("Haulting Charges");
		label_16.setBounds(297, 278, 102, 14);
		billpanel.add(label_16);
		
		textField_12 = new JTextField();
		textField_12.setText("");
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(437, 278, 86, 20);
		billpanel.add(textField_12);
		
		JLabel label_17 = new JLabel("Government penalty");
		label_17.setBounds(297, 307, 110, 14);
		billpanel.add(label_17);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(437, 304, 86, 20);
		billpanel.add(textField_13);
		
		JLabel label_18 = new JLabel("Height Charges");
		label_18.setBounds(297, 338, 98, 14);
		billpanel.add(label_18);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(437, 335, 86, 20);
		billpanel.add(textField_14);
		
		JLabel label_19 = new JLabel("Others");
		label_19.setBounds(297, 369, 77, 14);
		billpanel.add(label_19);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(437, 366, 86, 20);
		billpanel.add(textField_15);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(283, 203, 904, 2);
		billpanel.add(separator);
		
		textField_16 = new JTextField();
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBounds(1025, 439, 130, 20);
		billpanel.add(textField_16);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(409, 102, 223, 95);
		billpanel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setWrapStyleWord(true);
		
		JLabel label_20 = new JLabel("Total Amount");
		label_20.setBounds(915, 442, 86, 14);
		billpanel.add(label_20);
		
		JCheckBox checkBox = new JCheckBox("Include Extra Charges");
		checkBox.setBackground(Color.WHITE);
		checkBox.setBounds(276, 213, 150, 23);
		billpanel.add(checkBox);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(132, 82, 113, 20);
		billpanel.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(132, 277, 113, 20);
		billpanel.add(dateChooser_1);
		
		JDateChooser dateChooser_2 = new JDateChooser();
		dateChooser_2.setBounds(877, 99, 91, 20);
		billpanel.add(dateChooser_2);
		
		
		
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(194, 489, 961, 152);
		billpanel.add(scrollPane1);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C/N Date", "C/N No", "Invoice  No", "From", "To", "Vehicle No", "Unloading Date", "Actual weight", "Charge Weight", "Rate Per Ton", "Amount"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_3.getColumnModel().getColumn(6).setPreferredWidth(87);
		table_3.getColumnModel().getColumn(8).setPreferredWidth(84);
		scrollPane1.setViewportView(table_3);
		
		JButton button_2 = new JButton("Save");
		button_2.setBounds(934, 650, 89, 23);
		billpanel.add(button_2);
		
		JButton button_3 = new JButton("Print");
		button_3.setBounds(1049, 650, 83, 23);
		billpanel.add(button_3);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(265, 420, 640, 58);
		billpanel.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"L/U", "Haulting Charges", "Governmet Penalty", "Height Charges", "Others"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, true, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_2.getColumnModel().getColumn(1).setPreferredWidth(94);
		table_2.getColumnModel().getColumn(2).setPreferredWidth(109);
		table_2.getColumnModel().getColumn(3).setPreferredWidth(87);
		scrollPane_2.setViewportView(table_2);

	}
}
