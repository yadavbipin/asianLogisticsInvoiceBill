package bipin.AsianLogistics.Invoice;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import java.awt.GridLayout;
import javax.swing.JLayeredPane;
import javax.swing.JSeparator;
import javax.swing.ScrollPaneConstants;
import javax.swing.JCheckBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Profile extends JFrame {
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Profile frame = new Profile();
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
	public Profile() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(116, 98, 507, 219);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(152, 96, 165, 78);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Addition"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model =(DefaultTableModel)table.getModel();
				model.addRow(new Object[] {
						textField.getText()
				});
			int totalAmt=0;
			for(int i=0;i<table.getRowCount();i++) {
				 totalAmt=Integer.parseInt((String)table.getValueAt(i, 0));
				 totalAmt+=totalAmt;
			}
			
			System.out.println(totalAmt);
			}
			});
		btnNewButton.setBounds(357, 131, 89, 23);
		panel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(103, 27, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		
	}
}
