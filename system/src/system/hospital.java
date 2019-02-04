package system;

import java.awt.EventQueue;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JFormattedTextField;
import java.awt.event.InputMethodListener;
import java.awt.print.PrinterException;
import java.util.logging.Logger;
import java.awt.event.InputMethodEvent;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.text.JTextComponent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class hospital {

	protected static final String DefaultTableModel = null;
	//private static TableColumn  = null;
	private JFrame frame;
	private JTextField txtHospitalManagementSystem;
	private JTextField txtPaitentsDetails;
	private JTextField receipt;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtm;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JLabel lblReferenceNumber;
	private JLabel lblDosage;
	private JLabel lblIssueDate;
	private JLabel lblExpDate;
	private JLabel lblExpDate_1;
	private JLabel lblNameOfTablet;
	public JFrame fr;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hospital window = new hospital();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public hospital() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 1146, 749);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 10, 1116, 81);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtHospitalManagementSystem = new JTextField();
		txtHospitalManagementSystem.setEditable(false);
		txtHospitalManagementSystem.setBackground(Color.GRAY);
		txtHospitalManagementSystem.setForeground(Color.WHITE);
		txtHospitalManagementSystem.setFont(new Font("Stencil", Font.BOLD, 40));
		txtHospitalManagementSystem.setText("HOSPITAL MANAGEMENT SYSTEM");
		txtHospitalManagementSystem.setBounds(0, 0, 1116, 81);
		panel.add(txtHospitalManagementSystem);
		txtHospitalManagementSystem.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setLayout(null);
		panel_1.setBounds(828, 115, 308, 389);
		frame.getContentPane().add(panel_1);
		
		receipt =new JTextField();
		receipt.setHorizontalAlignment(SwingConstants.LEFT);
		receipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	 // .
				
			}
		});
		receipt.setBounds(10, 10, 288, 369);
		panel_1.add(receipt);
		receipt.setColumns(10);
	
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(20, 115, 798, 81);
		frame.getContentPane().add(panel_2);
		
		txtPaitentsDetails = new JTextField();
		txtPaitentsDetails.setForeground(Color.WHITE);
		txtPaitentsDetails.setBackground(Color.GRAY);
		txtPaitentsDetails.setFont(new Font("Yu Gothic UI Semibold", Font.ITALIC, 30));
		txtPaitentsDetails.setText("Paitent's Details");
		txtPaitentsDetails.setBounds(0, 0, 798, 81);
		panel_2.add(txtPaitentsDetails);
		txtPaitentsDetails.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.GRAY);
		panel_6.setLayout(null);
		panel_6.setBounds(20, 514, 321, 192);
		frame.getContentPane().add(panel_6);
		
		JButton btnNewButton = new JButton("UPDATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model=(DefaultTableModel)table_2.getModel();
			
model.addRow(new Object[] {textField_1.getText(),textField_2.getText(),txtm.getText(),textField_4.getText(),textField_5.getText(),textField_11.getText(),textField_6.getText(),textField_7.getText(),textField_8.getText(),textField_9.getText(),textField_10.getText()} );
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setBounds(10, 23, 145, 32);
		panel_6.add(btnNewButton);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnDelete.setForeground(Color.BLACK);
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDelete.setBackground(Color.YELLOW);
		btnDelete.setBounds(165, 23, 145, 32);
		panel_6.add(btnDelete);
		
		JButton btnPrescription = new JButton("PRESCRIPTION");
		btnPrescription.setVerticalAlignment(SwingConstants.TOP);
		btnPrescription.setHorizontalAlignment(SwingConstants.LEFT);
		btnPrescription.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String one=textField_1.getText();
				String two=textField_2.getText();
				String three=txtm.getText();
				String four=textField_4.getText();
				String five=textField_5.getText();
				String six=textField_6.getText();
				String seven=textField_7.getText();
				String eight=textField_8.getText();
				String nine=textField_9.getText();
				String ten=textField_10.getText();
				String eleven=textField_11.getText();
			
	    receipt.setText("\t\n PRESCRIPTION \n "
	    		+"\n Name of Patient : "+ one
	    		+"\n Sex : " + two
	    		+"\n Age : " + three
	    		+"\n Phone no : " + four
	    		+"\n Address : " + five
	    		+"\n Reference Number : " + eleven
	    		+"\n Dosage : " +six
	    		+"\n No. of Tablets : " + seven
	    		+"\n Issued Date : " + eight
	            +"\n Expiry Date : " + nine
	    		+"\n Total cost : " + ten
	    		);

			}
		});
		btnPrescription.setForeground(Color.BLACK);
		btnPrescription.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPrescription.setBackground(Color.YELLOW);
		btnPrescription.setBounds(10, 107, 145, 32);
		panel_6.add(btnPrescription);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try
				{
					receipt.print();
					
			}catch(PrinterException ex)
			{
				Logger.getLogger("ho");			}
			}
		});
		btnPrint.setForeground(Color.BLACK);
		btnPrint.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPrint.setBackground(Color.YELLOW);
		btnPrint.setBounds(165, 65, 145, 32);
		panel_6.add(btnPrint);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField_1.setText("");
				textField_2.setText("");
				txtm.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				receipt.setText("");		
			}
		});
		btnReset.setForeground(Color.BLACK);
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnReset.setBackground(Color.YELLOW);
		btnReset.setBounds(165, 107, 145, 32);
		panel_6.add(btnReset);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		
		
		
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLogin.setBackground(Color.YELLOW);
		btnLogin.setBounds(10, 65, 145, 32);
		panel_6.add(btnLogin);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExit.setForeground(Color.BLACK);
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExit.setBackground(Color.YELLOW);
		btnExit.setBounds(86, 150, 145, 32);
		panel_6.add(btnExit);
		
		table = new JTable();
		table.setForeground(Color.WHITE);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBounds(472, 133, 634, -125);
		panel_6.add(table);
		
		table_1 = new JTable();
		table_1.setForeground(new Color(0, 0, 0));
		table_1.setBounds(496, 65, -166, 94);
		panel_6.add(table_1);
		
		JLabel lblNewLabel = new JLabel("Name of tablet");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(20, 217, 111, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		//comboBox.setToolTipText("Choose");
		comboBox.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().equals("disprine"))
				{
					
					textField_11.setText("dis123");
					
					textField_6.setText("2");
					
					textField_7.setText("8");
					
					textField_8.setText("2/10/2018");
					
					textField_9.setText("2/03/2019");
					
					textField_10.setText("60");
					
				}
				if(comboBox.getSelectedItem().equals("paracetamol"))
				{
					
					textField_11.setText("para123");
					
					textField_6.setText("4");
					
					textField_7.setText("6");
					
					textField_8.setText("2/10/2018");
					
					textField_9.setText("2/03/2019");
					
					textField_10.setText("30");
					
				}
			
		
			}	});
		comboBox.setMaximumRowCount(10);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"paracetamol", "disprine"}));
		comboBox.setBounds(152, 217, 102, 31);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNameOfPaitent = new JLabel("Name of paitent");
		lblNameOfPaitent.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNameOfPaitent.setBounds(20, 258, 111, 31);
		frame.getContentPane().add(lblNameOfPaitent);
		
		JLabel lblSexmf = new JLabel("Sex (M/F)");
		lblSexmf.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSexmf.setBounds(20, 299, 111, 31);
		frame.getContentPane().add(lblSexmf);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAge.setBounds(20, 351, 111, 31);
		frame.getContentPane().add(lblAge);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPhoneNumber.setBounds(20, 392, 111, 31);
		frame.getContentPane().add(lblPhoneNumber);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAddress.setBounds(20, 433, 111, 31);
		frame.getContentPane().add(lblAddress);
		
		textField_1 = new JTextField();
		textField_1.setBounds(152, 258, 102, 31);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		String name=textField_1.getText();
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(152, 299, 102, 31);
		frame.getContentPane().add(textField_2);
		String sex=textField_2.getText();
		
		txtm = new JTextField();
		txtm.setColumns(10);
		txtm.setBounds(152, 351, 102, 31);
		frame.getContentPane().add(txtm);
		String age=txtm.getText();
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(152, 392, 102, 31);
		frame.getContentPane().add(textField_4);
	    String phone=textField_4.getText();
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(152, 433, 102, 31);
		frame.getContentPane().add(textField_5);
		 String address=textField_5.getText();
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(705, 258, 102, 31);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(705, 299, 102, 31);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(705, 351, 102, 31);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(705, 392, 102, 31);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(705, 433, 102, 31);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(705, 217, 102, 31);
		frame.getContentPane().add(textField_11);
		
		lblReferenceNumber = new JLabel("Reference Number");
		lblReferenceNumber.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblReferenceNumber.setBounds(548, 217, 111, 31);
		frame.getContentPane().add(lblReferenceNumber);
		
		lblDosage = new JLabel("Dosage");
		lblDosage.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDosage.setBounds(548, 258, 111, 31);
		frame.getContentPane().add(lblDosage);
		
		lblIssueDate = new JLabel("Number of Tablets");
		lblIssueDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIssueDate.setBounds(548, 299, 111, 31);
		frame.getContentPane().add(lblIssueDate);
		
		lblExpDate = new JLabel("Issued Date");
		lblExpDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblExpDate.setBounds(548, 351, 111, 31);
		frame.getContentPane().add(lblExpDate);
		
		lblExpDate_1 = new JLabel("Exp Date");
		lblExpDate_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblExpDate_1.setBounds(548, 392, 111, 31);
		frame.getContentPane().add(lblExpDate_1);
		
		lblNameOfTablet = new JLabel("Total Cost");
		lblNameOfTablet.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNameOfTablet.setBounds(548, 433, 111, 31);
		frame.getContentPane().add(lblNameOfTablet);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"Patients's Nsme", "Sex", "Age", "Phone", "Address", "Reference No.", "Dosage", "No. of Tablets", "Issued Date", "Expiry Date", "Total Cost"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table_2.setBounds(351, 508, 785, 198);
		frame.getContentPane().add(table_2);}	
}
	

