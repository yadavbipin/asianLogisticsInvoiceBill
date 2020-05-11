package bipin.AsianLogistics.Invoice;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

public class InvoiceBill extends JFrame {
	private JTable table;
	private JTextField textCneeGst;
	private JTextField textConrGst;
	private JTextField textFeildCnNo;
	private JTextField textFeildInvoiceNo;
	private JTextField textFeildActWt;
	private JTextField textFeildTo;
	private JTextField textFeildVehNo;
	private JTextField textFeildFrom;
	private JTextField textFeildChgWt;
	private JTextField textFeildRatePerTon;
	private JTextField textFeildAmt;
	private JTextField textLu;
	private JTextField textHaultChg;
	private JTextField textGvtPen;
	private JTextField textHeiChrg;
	private JTextField textOther;
	private JTextField textTotalAmt;
	private JCheckBox checkBox;
	private JTable detailTable;
	private JDateChooser textCnDate;
	private JDateChooser textUnloadDate;
	private SimpleDateFormat dateFormat;
	private JTextField textFieldSearch;
	private JTable table_1;
	private JPanel leftPanel;
	private JPanel panelBill;
	private JPanel panelSearch;
	JLabel lblNewLabel,label_6,label_7,label_8,label_9,lblCnDateValidation,	lblFromValidation,
	lblToValidation,
	lblCnNoValidation,
	lblVehNoValidation,
	lblInvNoValidation,	lblUnlDatValidation,	lblActWeiValidation,
	lblChrgWeiValidation,
	lblRptValidation,
	lblAmtValidation,
	lblAddValidation,
	lblCgrNoValidation,
	lblCneeNoValidation;
	JLayeredPane layeredPane;
	JLabel lblDisplayLu,lblDisplayHaltChg,lblDisplayGovtPen,lblDisplayHeiChrg,lblDisplayOthers;
	int lu=0,haultChg=0,gvtPen=0,heiChrg=0,other=0,total=0;
	int addLu=0,addhaultChg=0,addgvtPen=0,addheiChrg=0,addOther=0;
	String totalAmt= null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InvoiceBill frame = new InvoiceBill();
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
	public InvoiceBill() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(100, 100, 1375, 741);
		getContentPane().setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(null);
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		mainPanel.setBackground(Color.WHITE);
		mainPanel.setBounds(0, 0, 1370, 712);
		getContentPane().add(mainPanel);
		
		leftPanel = new JPanel();
		leftPanel.setLayout(null);
		leftPanel.setBackground(Color.GRAY);
		leftPanel.setBounds(0, 0, 174, 701);
		mainPanel.add(leftPanel);
		
		JButton button = new JButton("PROFILE");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Cambria", Font.BOLD, 15));
		button.setBackground(Color.GRAY);
		button.setBounds(0, 385, 174, 60);
		leftPanel.add(button);
		
		JButton button_1 = new JButton("SEARCH");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panelSearch);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Cambria", Font.BOLD, 15));
		button_1.setBackground(Color.GRAY);
		button_1.setBounds(0, 248, 174, 60);
		leftPanel.add(button_1);
		
		JButton button_2 = new JButton("SETTINGS");
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Cambria", Font.BOLD, 15));
		button_2.setBackground(Color.GRAY);
		button_2.setBounds(0, 514, 174, 60);
		leftPanel.add(button_2);
		
		JButton button_3 = new JButton("DASHBOARD");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panelBill);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Cambria", Font.BOLD, 15));
		button_3.setBackground(Color.GRAY);
		button_3.setBounds(0, 118, 174, 60);
		leftPanel.add(button_3);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(175, 0, 1185, 700);
		mainPanel.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		panelBill = new JPanel();
		panelBill.setLayout(null);
		layeredPane.add(panelBill, "name_358865031875590");
		
		JLabel label = new JLabel("To Address");
		label.setBounds(315, 18, 68, 14);
		panelBill.add(label);
		
		JLabel label_1 = new JLabel("Bill Date");
		label_1.setBounds(814, 18, 130, 14);
		panelBill.add(label_1);
		
		JLabel label_2 = new JLabel("Consigner Gst No");
		label_2.setBounds(814, 62, 130, 14);
		panelBill.add(label_2);
		
		textCneeGst = new JTextField();
		textCneeGst.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				lblCneeNoValidation.setText("");
			}
		});
		textCneeGst.setColumns(10);
		textCneeGst.setBounds(954, 104, 202, 20);
		panelBill.add(textCneeGst);
		
		JLabel label_3 = new JLabel("Consignee Gst No");
		label_3.setBounds(814, 107, 130, 14);
		panelBill.add(label_3);
		
		textConrGst = new JTextField();
		textConrGst.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				lblCgrNoValidation.setText("");
			}
		});
		textConrGst.setColumns(10);
		textConrGst.setBounds(954, 59, 202, 20);
		panelBill.add(textConrGst);
		
		textTotalAmt = new JTextField();
		textTotalAmt.setEditable(false);
		textTotalAmt.setColumns(10);
		textTotalAmt.setBounds(1015, 526, 124, 20);
		panelBill.add(textTotalAmt);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(383, 18, 223, 95);
		panelBill.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				lblAddValidation.setText("");
			}
		});
		scrollPane.setViewportView(textArea);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		
		JLabel totalAmtLabel = new JLabel("Total Amount");
		totalAmtLabel.setBounds(912, 529, 86, 14);
		panelBill.add(totalAmtLabel);
		
		JDateChooser textBillDate = new JDateChooser();
		textBillDate.setBounds(954, 12, 202, 20);
		panelBill.add(textBillDate);
		
		JButton button_6 = new JButton("Save");
		button_6.setBounds(885, 565, 89, 23);
		panelBill.add(button_6);
		
		JButton generateBill = new JButton("Generate Bill");
		generateBill.setBounds(1015, 565, 124, 23);
		panelBill.add(generateBill);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(293, 158, 882, 105);
		panelBill.add(scrollPane_1);
		
		detailTable = new JTable();
		detailTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C/N Date", "C/N No", "Invoice No", "From", "To", "Vehicle No", "Unloading Date", "Actual Weight", "Charge Weight", "Rate Per Ton", "Amount"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, true, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		detailTable.getColumnModel().getColumn(6).setPreferredWidth(86);
		detailTable.getColumnModel().getColumn(7).setPreferredWidth(80);
		detailTable.getColumnModel().getColumn(8).setPreferredWidth(85);
		scrollPane_1.setViewportView(detailTable);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(531, 249, 101, 14);
		panelBill.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 12, 277, 677);
		panelBill.add(panel);
		panel.setLayout(null);
		
		textFeildAmt = new JTextField();
		textFeildAmt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				lblAmtValidation.setText("");
			}
		});
		textFeildAmt.setBounds(140, 586, 127, 20);
		panel.add(textFeildAmt);
		textFeildAmt.setColumns(10);
		
		JLabel amtlabe = new JLabel("Amount");
		amtlabe.setBounds(18, 588, 112, 15);
		panel.add(amtlabe);
		amtlabe.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textFeildRatePerTon = new JTextField();
		textFeildRatePerTon.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				lblRptValidation.setText("");
			}
		});
		textFeildRatePerTon.setBounds(140, 523, 127, 20);
		panel.add(textFeildRatePerTon);
		textFeildRatePerTon.setText("");
		textFeildRatePerTon.setColumns(10);
		
		JLabel raPTonlabel = new JLabel("Rate Per Ton");
		raPTonlabel.setBounds(24, 525, 98, 15);
		panel.add(raPTonlabel);
		raPTonlabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textFeildChgWt = new JTextField();
		textFeildChgWt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//lblChrgWeiValidation.setText("");
//				char c = e.getKeyChar();
//				if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE) {
//					getToolkit().beep();
//					lblChrgWeiValidation.setText("* Enter only numeric digits(0-9)");
//				}else {
//					lblChrgWeiValidation.setText("");
//				}
				String value = textFeildChgWt.getText();
				int l= value.length();
				if(e.getKeyChar() >='0' && e.getKeyChar() <= '9') {
					textFeildChgWt.setEditable(true);
					lblChrgWeiValidation.setText("");
				}else {
					
					lblChrgWeiValidation.setText("* Enter only numeric digits(0-9)");
				//	textFeildChgWt.setEditable(false);
				}
			}
		});
		textFeildChgWt.setBounds(140, 466, 127, 20);
		panel.add(textFeildChgWt);
		textFeildChgWt.setText("");
		textFeildChgWt.setColumns(10);
		
		JLabel chgWgtlabel = new JLabel("Charge Weight");
		chgWgtlabel.setBounds(18, 468, 112, 15);
		panel.add(chgWgtlabel);
		chgWgtlabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel actWgtlabel = new JLabel("Actual Weight");
		actWgtlabel.setBounds(18, 411, 110, 15);
		panel.add(actWgtlabel);
		actWgtlabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textUnloadDate = new JDateChooser();
		textUnloadDate.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				lblUnlDatValidation.setText("");
			}
		});
		textUnloadDate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblUnlDatValidation.setText("");
			}
		});
		textUnloadDate.setBounds(140, 313, 127, 20);
		panel.add(textUnloadDate);
		
		JLabel unloadDatelabel = new JLabel("Unloading Date");
		unloadDatelabel.setBounds(18, 313, 112, 20);
		panel.add(unloadDatelabel);
		unloadDatelabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textFeildVehNo = new JTextField();
		textFeildVehNo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				lblVehNoValidation.setText("");
			}
		});
		textFeildVehNo.setBounds(140, 244, 127, 20);
		panel.add(textFeildVehNo);
		textFeildVehNo.setText("");
		textFeildVehNo.setColumns(10);
		
		JLabel vehNolabel = new JLabel("Vehicle No");
		vehNolabel.setBounds(18, 249, 97, 15);
		panel.add(vehNolabel);
		vehNolabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textFeildTo = new JTextField();
		textFeildTo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				lblToValidation.setText("");
			}
		});
		textFeildTo.setBounds(140, 199, 127, 20);
		panel.add(textFeildTo);
		textFeildTo.setText("");
		textFeildTo.setColumns(10);
		
		JLabel tolabel = new JLabel("To");
		tolabel.setBounds(20, 201, 73, 15);
		panel.add(tolabel);
		tolabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textFeildActWt = new JTextField();
		textFeildActWt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String value = textFeildActWt.getText();
				int l= value.length();
				if(e.getKeyChar() >='0' && e.getKeyChar() <= '9') {
					textFeildActWt.setEditable(true);
					lblActWeiValidation.setText("");
				}else {
					textFeildActWt.setEditable(true);
					lblActWeiValidation.setText("* Enter only numeric digits(0-9)");
				}
//				try {
//					lblActWeiValidation.setText("");
//					int ActWt = Integer.parseInt(textFeildActWt.getText());
//				}catch(NumberFormatException ne) {
//					lblActWeiValidation.setText("Invalid Number");
//				}
			}
		});
		textFeildActWt.setBounds(140, 409, 127, 20);
		panel.add(textFeildActWt);
		textFeildActWt.setText("");
		textFeildActWt.setColumns(10);
		
		JLabel invoicelabel = new JLabel("Invoice  No");
		invoicelabel.setBounds(18, 107, 91, 15);
		panel.add(invoicelabel);
		invoicelabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textFeildInvoiceNo = new JTextField();
		textFeildInvoiceNo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				lblInvNoValidation.setText("");
			}
		});
		textFeildInvoiceNo.setBounds(140, 102, 127, 20);
		panel.add(textFeildInvoiceNo);
		textFeildInvoiceNo.setText("");
		textFeildInvoiceNo.setColumns(10);
		
		JLabel label_5 = new JLabel("C/N No");
		label_5.setBounds(10, 58, 43, 14);
		panel.add(label_5);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textFeildCnNo = new JTextField();
		textFeildCnNo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				lblCnNoValidation.setText("");
				
			}
		});
		textFeildCnNo.setBounds(140, 56, 127, 20);
		panel.add(textFeildCnNo);
		textFeildCnNo.setColumns(10);
		
		JLabel label_4 = new JLabel("C/N Date");
		label_4.setBounds(10, 11, 91, 14);
		panel.add(label_4);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		
		
		
		textCnDate = new JDateChooser();
		textCnDate.addInputMethodListener(new InputMethodListener() {
			public void caretPositionChanged(InputMethodEvent event) {
			}
			public void inputMethodTextChanged(InputMethodEvent event) {
				if(textCnDate.getDate() != null)
					lblCnDateValidation.setText("");
			}
		});
		textCnDate.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(textCnDate.getDate() != null)
				lblCnDateValidation.setText("");
			}
		});
		textCnDate.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(textCnDate.getDate() != null)
				lblCnDateValidation.setText("");
			}
		});
		
		textCnDate.setBounds(140, 11, 127, 20);
		panel.add(textCnDate);
		
		lblCnDateValidation = new JLabel("");
		lblCnDateValidation.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCnDateValidation.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblCnDateValidation.setForeground(Color.RED);
		lblCnDateValidation.setBounds(10, 31, 257, 20);
		panel.add(lblCnDateValidation);
		
		lblToValidation = new JLabel("");
		lblToValidation.setHorizontalAlignment(SwingConstants.TRAILING);
		lblToValidation.setForeground(Color.RED);
		lblToValidation.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblToValidation.setBounds(10, 218, 257, 15);
		panel.add(lblToValidation);
		
		lblVehNoValidation = new JLabel("");
		lblVehNoValidation.setHorizontalAlignment(SwingConstants.TRAILING);
		lblVehNoValidation.setForeground(Color.RED);
		lblVehNoValidation.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblVehNoValidation.setBounds(18, 275, 257, 15);
		panel.add(lblVehNoValidation);
		
		lblCnNoValidation = new JLabel("");
		lblCnNoValidation.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCnNoValidation.setForeground(Color.RED);
		lblCnNoValidation.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblCnNoValidation.setBounds(10, 78, 257, 15);
		panel.add(lblCnNoValidation);
		
		lblInvNoValidation = new JLabel("");
		lblInvNoValidation.setHorizontalAlignment(SwingConstants.TRAILING);
		lblInvNoValidation.setForeground(Color.RED);
		lblInvNoValidation.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblInvNoValidation.setBounds(10, 127, 257, 15);
		panel.add(lblInvNoValidation);
		
		lblUnlDatValidation = new JLabel("");
		lblUnlDatValidation.setHorizontalAlignment(SwingConstants.TRAILING);
		lblUnlDatValidation.setForeground(Color.RED);
		lblUnlDatValidation.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblUnlDatValidation.setBounds(10, 344, 257, 15);
		panel.add(lblUnlDatValidation);
		
		lblActWeiValidation = new JLabel("");
		lblActWeiValidation.setHorizontalAlignment(SwingConstants.TRAILING);
		lblActWeiValidation.setForeground(Color.RED);
		lblActWeiValidation.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblActWeiValidation.setBounds(10, 440, 257, 15);
		panel.add(lblActWeiValidation);
		
		lblChrgWeiValidation = new JLabel("");
		lblChrgWeiValidation.setHorizontalAlignment(SwingConstants.TRAILING);
		lblChrgWeiValidation.setForeground(Color.RED);
		lblChrgWeiValidation.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblChrgWeiValidation.setBounds(10, 494, 257, 15);
		panel.add(lblChrgWeiValidation);
		
		lblRptValidation = new JLabel("");
		lblRptValidation.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRptValidation.setForeground(Color.RED);
		lblRptValidation.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblRptValidation.setBounds(18, 547, 257, 15);
		panel.add(lblRptValidation);
		
		lblAmtValidation = new JLabel("");
		lblAmtValidation.setHorizontalAlignment(SwingConstants.TRAILING);
		lblAmtValidation.setForeground(Color.RED);
		lblAmtValidation.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblAmtValidation.setBounds(10, 616, 257, 15);
		panel.add(lblAmtValidation);
		
		lblFromValidation = new JLabel("");
		lblFromValidation.setBounds(10, 175, 257, 15);
		panel.add(lblFromValidation);
		lblFromValidation.setHorizontalAlignment(SwingConstants.TRAILING);
		lblFromValidation.setForeground(Color.RED);
		lblFromValidation.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		
		textFeildFrom = new JTextField();
		textFeildFrom.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				lblFromValidation.setText("");
			}
		});
		textFeildFrom.setBounds(140, 145, 127, 23);
		panel.add(textFeildFrom);
		textFeildFrom.setColumns(10);
		
		JLabel fromlabel = new JLabel("From");
		fromlabel.setBounds(18, 153, 91, 15);
		panel.add(fromlabel);
		fromlabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textOther = new JTextField();
		textOther.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				label_9.setText(textOther.getText());
				other=Integer.parseInt(textOther.getText());
			}
		});
		textOther.setBounds(446, 475, 127, 20);
		panelBill.add(textOther);
		textOther.setColumns(10);
		
		JLabel lblOthers = new JLabel("Others");
		lblOthers.setBounds(293, 478, 46, 14);
		panelBill.add(lblOthers);
		
		textHeiChrg = new JTextField();
		textHeiChrg.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			label_8.setText(textHeiChrg.getText());
			heiChrg=Integer.parseInt(textHeiChrg.getText());
			//heiChrg=0;
			}
		});
		textHeiChrg.setBounds(446, 427, 127, 20);
		panelBill.add(textHeiChrg);
		textHeiChrg.setColumns(10);
		
		JLabel lblHeiChrg = new JLabel("Height Charges");
		lblHeiChrg.setBounds(293, 433, 91, 14);
		panelBill.add(lblHeiChrg);
		
		textGvtPen = new JTextField();
		textGvtPen.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				label_7.setText(textGvtPen.getText());
				gvtPen=Integer.parseInt(textGvtPen.getText());
				//gvtPen=0;
			}
		});
		textGvtPen.setBounds(446, 382, 127, 20);
		panelBill.add(textGvtPen);
		textGvtPen.setColumns(10);
		
		JLabel lblGovtPen = new JLabel("Goverrnment Penalty");
		lblGovtPen.setBounds(293, 385, 123, 14);
		panelBill.add(lblGovtPen);
		
		textHaultChg = new JTextField();
		textHaultChg.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				label_6.setText(textHaultChg.getText());
				haultChg=Integer.parseInt(textHaultChg.getText());
				//haultChg=0;
			}
		});
		textHaultChg.setBounds(446, 335, 127, 20);
		panelBill.add(textHaultChg);
		textHaultChg.setText("");
		textHaultChg.setColumns(10);
		
		JLabel lblHaltChg = new JLabel("Haulting Charges");
		lblHaltChg.setBounds(293, 338, 97, 14);
		panelBill.add(lblHaltChg);
		
		textLu = new JTextField();
		textLu.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				lblNewLabel.setText(textLu.getText());
				lu=Integer.parseInt(textLu.getText());
				//lu=0;
			}
		});
		textLu.setBounds(446, 291, 127, 20);
		panelBill.add(textLu);
		textLu.setColumns(10);
		
		JLabel lblLu = new JLabel("L/U");
		lblLu.setBounds(293, 294, 46, 14);
		panelBill.add(lblLu);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(1015, 385, 125, 14);
		panelBill.add(lblNewLabel);
		
		label_6 = new JLabel("New label");
		label_6.setBounds(1015, 402, 125, 14);
		panelBill.add(label_6);
		
		label_7 = new JLabel("New label");
		label_7.setBounds(1015, 433, 125, 14);
		panelBill.add(label_7);
		
		label_8 = new JLabel("New label");
		label_8.setBounds(1014, 464, 125, 14);
		panelBill.add(label_8);
		
		label_9 = new JLabel("New label");
		label_9.setBounds(1015, 489, 125, 14);
		panelBill.add(label_9);
		
		lblAddValidation = new JLabel("");
		lblAddValidation.setHorizontalAlignment(SwingConstants.TRAILING);
		lblAddValidation.setForeground(Color.RED);
		lblAddValidation.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblAddValidation.setBounds(349, 124, 257, 15);
		panelBill.add(lblAddValidation);
		
		lblCgrNoValidation = new JLabel("");
		lblCgrNoValidation.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCgrNoValidation.setForeground(Color.RED);
		lblCgrNoValidation.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblCgrNoValidation.setBounds(899, 81, 257, 15);
		panelBill.add(lblCgrNoValidation);
		
		lblCneeNoValidation = new JLabel("");
		lblCneeNoValidation.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCneeNoValidation.setForeground(Color.RED);
		lblCneeNoValidation.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblCneeNoValidation.setBounds(899, 127, 257, 14);
		panelBill.add(lblCneeNoValidation);
		
		JButton button_5 = new JButton("Clear");
		button_5.setBounds(470, 526, 103, 23);
		panelBill.add(button_5);
		
		JButton buttonAdd = new JButton("Add");
		buttonAdd.setBounds(292, 526, 98, 23);
		panelBill.add(buttonAdd);
		
		JLabel lblBillDate = new JLabel("");
		lblBillDate.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblBillDate.setForeground(Color.RED);
		lblBillDate.setBounds(954, 34, 202, 14);
		panelBill.add(lblBillDate);
		
		JButton btnDeleteTableRow = new JButton("Delete Row");
		btnDeleteTableRow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				DefaultTableModel model= (DefaultTableModel) detailTable.getModel();
				int SelectedRowIndex = detailTable.getSelectedRow();
				model.removeRow(SelectedRowIndex);
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null, "Please Select Row from table to delete!",null , JOptionPane.CANCEL_OPTION);
			}
			}
		});
		btnDeleteTableRow.setBounds(1015, 274, 124, 23);
		panelBill.add(btnDeleteTableRow);
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textLu.getText().isEmpty() ) {
					lu=0;
					totalAmt=String.valueOf(total+lu+haultChg+gvtPen+heiChrg+other);
					textTotalAmt.setText(String.valueOf(totalAmt));
				}else {
					totalAmt=String.valueOf(total+lu+haultChg+gvtPen+heiChrg+other);
					textTotalAmt.setText(String.valueOf(totalAmt));
				}
				if(textHaultChg.getText().isEmpty()) {
					haultChg=0;	
					totalAmt=String.valueOf(total+lu+haultChg+gvtPen+heiChrg+other);
					textTotalAmt.setText(String.valueOf(totalAmt));
				}else {
					totalAmt=String.valueOf(total+lu+haultChg+gvtPen+heiChrg+other);
					textTotalAmt.setText(String.valueOf(totalAmt));
				}
				if(textGvtPen.getText().isEmpty()) {
					gvtPen=0;
					totalAmt=String.valueOf(total+lu+haultChg+gvtPen+heiChrg+other);
					textTotalAmt.setText(String.valueOf(totalAmt));
				}else {
					totalAmt=String.valueOf(total+lu+haultChg+gvtPen+heiChrg+other);
					textTotalAmt.setText(String.valueOf(totalAmt));
				}
				if(textHeiChrg.getText().isEmpty()) {
					heiChrg=0;
					totalAmt=String.valueOf(total+lu+haultChg+gvtPen+heiChrg+other);
					textTotalAmt.setText(String.valueOf(totalAmt));
				}else {
					totalAmt=String.valueOf(total+lu+haultChg+gvtPen+heiChrg+other);
					textTotalAmt.setText(String.valueOf(totalAmt));
				}
				if(textOther.getText().isEmpty()) {
					other=0;
					totalAmt=String.valueOf(total+lu+haultChg+gvtPen+heiChrg+other);
					textTotalAmt.setText(String.valueOf(totalAmt));
				}else {
					totalAmt=String.valueOf(total+lu+haultChg+gvtPen+heiChrg+other);
					textTotalAmt.setText(String.valueOf(totalAmt));
				}

				
				
				 if(textCnDate.getDate() == null && textFeildCnNo.getText().trim().isEmpty() && textFeildInvoiceNo.getText().trim().isEmpty() && textFeildFrom.getText().trim().isEmpty() && textFeildTo.getText().trim().isEmpty() && textFeildVehNo.getText().trim().isEmpty() && textUnloadDate.getDate()==null && textFeildActWt.getText().trim().isEmpty()   && textFeildChgWt.getText().trim().isEmpty() && textFeildRatePerTon.getText().trim().isEmpty() && textFeildAmt.getText().trim().isEmpty() && textArea.getText().trim().isEmpty() || textBillDate.getDate()==null || textConrGst.getText().trim().isEmpty() || textCneeGst.getText().trim().isEmpty()) {
					lblCnDateValidation.setText("Cn Date cannot be empty");
					lblCnNoValidation.setText("CN no cannot be empty");
					lblInvNoValidation.setText("Invoice Number cannot be empty");
					lblFromValidation.setText("From cannot be empty");
					lblToValidation.setText("To cannot be empty");
					lblVehNoValidation.setText("Vehicle Number cannot be empty");
					lblUnlDatValidation.setText("Unloading date cannot be empty");
					lblActWeiValidation.setText("Actual weight cannot be empty");
					lblChrgWeiValidation.setText("Charge weight cannot be empty");
					lblRptValidation.setText("Rate Per Ton cannot be empty");
					lblAmtValidation.setText("Amount cannot be empty");
					lblAddValidation.setText("Address cannot be empty");
					lblBillDate.setText("Bill Date Cannot be empty");
					lblCgrNoValidation.setText("Consigner GST Number Cannot be empty");
					lblCneeNoValidation.setText("Consignee GST Number cannot be empty");
					
					JOptionPane.showMessageDialog(null, "All values cannnot be empty", "Error", JOptionPane.ERROR_MESSAGE);
				}else if(textBillDate.getDate()== null) {
					lblBillDate.setText("Bill Date cannot be empty");
					JOptionPane.showMessageDialog(null, "Address cannnot be empty", "Error", JOptionPane.ERROR_MESSAGE);
				}else if(textConrGst.getText().trim().isEmpty()) {
					lblCgrNoValidation.setText("Consigner GST Number Cannot be empty");
					JOptionPane.showMessageDialog(null, "Consigner no be empty", "Error", JOptionPane.ERROR_MESSAGE);
				}else if(textCneeGst.getText().trim().isEmpty()) {
					lblCneeNoValidation.setText("Consignee GST Number cannot be empty");
					JOptionPane.showMessageDialog(null, "Consignee no cannnot be empty", "Error", JOptionPane.ERROR_MESSAGE);
				}else if(textCnDate.getDate() == null) {
					lblCnDateValidation.setText("Cn Date cannot be empty");
					JOptionPane.showMessageDialog(null, "cn Date cannnot be empty", "Error", JOptionPane.ERROR_MESSAGE);
				}else if(textFeildCnNo.getText().trim().isEmpty()) {
					lblCnNoValidation.setText("CN no cannot be empty");
					JOptionPane.showMessageDialog(null, "cn no cannnot be empty", "Error", JOptionPane.ERROR_MESSAGE);
				}else if(textFeildInvoiceNo.getText().trim().isEmpty()) {
					lblInvNoValidation.setText("Invoice Number cannot be empty");
					JOptionPane.showMessageDialog(null, "Invoice NO cannnot be empty", "Error", JOptionPane.ERROR_MESSAGE);
				}else if(textFeildFrom.getText().trim().isEmpty()) {
					lblFromValidation.setText("From cannot be empty");
					JOptionPane.showMessageDialog(null, "From cannnot be empty", "Error", JOptionPane.ERROR_MESSAGE);
				}else if(textFeildTo.getText().trim().isEmpty()) {
					lblToValidation.setText("To cannot be empty");
					JOptionPane.showMessageDialog(null, "TO cannnot be empty", "Error", JOptionPane.ERROR_MESSAGE);
				}else if( textFeildVehNo.getText().trim().isEmpty()) {
					lblVehNoValidation.setText("Vehicle Number cannot be empty");
					JOptionPane.showMessageDialog(null, "Vehicle Number cannnot be empty", "Error", JOptionPane.ERROR_MESSAGE);
				}else if(textUnloadDate.getDate()==null) {
					lblUnlDatValidation.setText("Unloading date cannot be empty");
					JOptionPane.showMessageDialog(null, "Unloading Date cannnot be empty", "Error", JOptionPane.ERROR_MESSAGE);
				}else if(textFeildActWt.getText().trim().isEmpty()) {
					lblActWeiValidation.setText("Actual weight cannot be empty");
					JOptionPane.showMessageDialog(null, "Actual weight cannnot be empty", "Error", JOptionPane.ERROR_MESSAGE);
				}else if(textFeildChgWt.getText().trim().isEmpty()) {
					lblChrgWeiValidation.setText("Charge weight cannot be empty");
					JOptionPane.showMessageDialog(null, "Charge weight cannnot be empty", "Error", JOptionPane.ERROR_MESSAGE);
				}else if(textFeildRatePerTon.getText().trim().isEmpty()) {
					lblRptValidation.setText("Rate Per Ton cannot be empty");
					JOptionPane.showMessageDialog(null, "Rate Per Ton cannnot be empty", "Error", JOptionPane.ERROR_MESSAGE);
				}else if(textFeildAmt.getText().trim().isEmpty()) {
					lblAmtValidation.setText("Amount cannot be empty");
					JOptionPane.showMessageDialog(null, "Amount cannnot be empty", "Error", JOptionPane.ERROR_MESSAGE);
				}else if(textArea.getText().isEmpty()) {
					lblAddValidation.setText("Address cannot be empty");
					JOptionPane.showMessageDialog(null, "Address cannnot be empty", "Error", JOptionPane.ERROR_MESSAGE);
				
				}else {
						dateFormat = new SimpleDateFormat("yyyy-MM-dd");
						String theCnDate = dateFormat.format(textCnDate.getDate());
						String theUnloadDate = dateFormat.format(textUnloadDate.getDate());
						
						DefaultTableModel model =(DefaultTableModel)detailTable.getModel();
						model.addRow(new Object[] {
								theCnDate ,
								textFeildCnNo.getText(),
								textFeildInvoiceNo.getText(),
								textFeildActWt.getText(),
								textFeildTo.getText(),
								textFeildVehNo.getText(),
								theUnloadDate,
								textFeildFrom.getText(),
								textFeildChgWt.getText(),
								textFeildRatePerTon.getText(),
								textFeildAmt.getText()
								
						});
					
						
						textCnDate.setCalendar(null);
						textFeildCnNo.setText("");
						textFeildInvoiceNo.setText("");
						textFeildInvoiceNo.setText("");
						textFeildActWt.setText("");
						textFeildTo.setText("");
						textUnloadDate.setCalendar(null);
						textFeildVehNo.setText("");
						textFeildFrom.setText("");
						textFeildChgWt.setText("");
						textFeildRatePerTon.setText("");
						textFeildAmt.setText("");
					
						
						int totalAmttable = 0;
						for(int i=0;i<detailTable.getRowCount();i++) {
							totalAmttable=Integer.parseInt((String)detailTable.getValueAt(i, 10));
						}
						total+=totalAmttable;
						
				     totalAmt=String.valueOf(total+lu+haultChg+gvtPen+heiChrg+other);
					textTotalAmt.setText(String.valueOf(totalAmt));
					
	
						
								
	
				
			}	
			}
		});
		
		panelSearch = new JPanel();
		layeredPane.add(panelSearch, "name_378695458106227");
		panelSearch.setLayout(null);
		
		textFieldSearch = new JTextField();
		textFieldSearch.setBounds(139, 11, 848, 37);
		panelSearch.add(textFieldSearch);
		textFieldSearch.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(994, 11, 135, 37);
		panelSearch.add(btnSearch);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(10, 11, 119, 37);
		panelSearch.add(btnBack);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 71, 1149, 534);
		panelSearch.add(scrollPane_2);
		
		table_1 = new JTable();
		scrollPane_2.setViewportView(table_1);
		
		
			
		}
	}
