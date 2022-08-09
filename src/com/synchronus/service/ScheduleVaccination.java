package com.synchronus.service;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.UIManager;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import rojerusan.RSMaterialButtonRectangle;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.ButtonGroup;

import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import rojerusan.RSMetroTextPlaceHolder;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import com.toedter.components.JSpinField;
import com.toedter.calendar.JDateChooser;
import com.toedter.components.JLocaleChooser;
import com.toedter.calendar.JDayChooser;
import com.synchronus.dao.BookAppiontment;
import com.synchronus.dao.InsertIntoDataBase;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JMonthChooser;
import org.zkoss.calendar.impl.SimpleCalendarModel;
import rojeru_san.componentes.RSCalendar;
import rojeru_san.componentes.RSDateChooser;
import rojerusan.RSComboMetro;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import rojeru_san.complementos.RSButtonHover;
import javax.swing.border.CompoundBorder;

public class ScheduleVaccination extends JFrame {

	private JPanel contentPane;
	private JTextField aadharNumber;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScheduleVaccination frame = new ScheduleVaccination();
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
	@SuppressWarnings({ "deprecation", "unchecked", "rawtypes" })
	public ScheduleVaccination() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 937,500 );
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 112, 192), 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBorder(new LineBorder(new Color(0, 120, 215), 3, true));
		panel_4.setBounds(239, 78, 675, 396);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setVisible(false);
		panel_2.setBackground(new Color(102,102,255));
		panel_2.setBounds(0, 49, 220, 701);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		int x = 220;
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new LineBorder(SystemColor.window, 1, true));
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_2.setVisible(true);
				if (x==220) {
					panel_2.setSize(220,702);
					Thread thread = new Thread() {
						@Override
						public void run() {
							try {
								for (int i = 0; i <= 220; i++) {
									Thread.sleep(1);
									panel_2.setSize(i , 702);
								}
								
							} catch (Exception e2) {
								JOptionPane.showMessageDialog(null, e);
							}
						}
						
					};thread.start();
					try {
						for(int i = 150; i<=239 ; i++) {
							Thread.sleep(1);
							panel_4.setBounds(i,78,675,395);
						}
					} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				
				}
			}
		});
		lblNewLabel.setIcon(new ImageIcon(DashBoard.class.getResource("/AdminIcons/bulleted_list_32px.png")));
		lblNewLabel.setBounds(8, 9, 32, 32);
	
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Thread thread = new Thread() {
					@Override
					public void run() {
						try {
							for (int i = 220; i >= 38; i--) {
								Thread.sleep(1);
								panel_2.setSize(i , 702);
							}
							
						} catch (Exception e2) {
							JOptionPane.showMessageDialog(null, e);
						}
					}
					
				};thread.start();
				
				try {
					for(int i = 239; i>=150 ; i--) {
						Thread.sleep(1);
						panel_4.setBounds(i,78,675,395);
					}
				} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
			
		});
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1354, 49);
		panel.setBackground(new Color(102,102,255));
		contentPane.add(panel);
		panel.setLayout(null);

		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(null);
		panel_3.setBounds(0, 109, 220, 40);
		panel_2.add(panel_3);
		panel_3.setBackground(new Color(102,102,255));
		panel_3.setLayout(null);
		
		
		
		JLabel scheduleVaccination = new JLabel("Schedule Vaccination");
		scheduleVaccination.setBounds(10, 0, 200, 40);
		panel_3.add(scheduleVaccination);
		scheduleVaccination.setIcon(new ImageIcon(DashBoard.class.getResource("/AdminIcons/appointment (1).png")));
		scheduleVaccination.setForeground(Color.green);
		scheduleVaccination.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		
		JLabel lblNewLabel_1 = new JLabel("Vaccine Management System");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(77, 8, 343, 37);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Welcome,User");
		lblNewLabel_1_1.setIcon(new ImageIcon(DashBoard.class.getResource("/AdminIcons/icons8_contacts_50px_1.png")));
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(659, 0, 196, 48);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("X");
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_1_2.setBounds(911, -2, 21, 27);
		panel.add(lblNewLabel_1_2);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		
		panel.add(lblNewLabel);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(null);
		panel_3_1.setLayout(null);
		panel_3_1.setBackground(new Color(102, 102, 255));
		panel_3_1.setBounds(0, 173, 220, 40);
		panel_2.add(panel_3_1);
		
		JLabel lblNewLabel_4 = new JLabel("View Appiontments");
		lblNewLabel_4.setIcon(new ImageIcon(ScheduleVaccination.class.getResource("/AdminIcons/Dose_24px.png")));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel_4.setBounds(10, 0, 200, 40);
		panel_3_1.add(lblNewLabel_4);
		
		lblNewLabel_3.setIcon(new ImageIcon(ScheduleVaccination.class.getResource("/AdminIcons/back.png")));
		lblNewLabel_3.setBounds(196, 11, 24, 24);
		panel_2.add(lblNewLabel_3);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBorder(null);
		panel_3_2.setLayout(null);
		panel_3_2.setBackground(new Color(102, 102, 255));
		panel_3_2.setBounds(0, 46, 220, 40);
		panel_2.add(panel_3_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Home");
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new DashBoard().setVisible(true);
				dispose();
			}
		});
		lblNewLabel_2_1.setIcon(new ImageIcon(DashBoard.class.getResource("/AdminIcons/home_24px.png")));
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel_2_1.setBounds(10, 0, 200, 40);
		panel_3_2.add(lblNewLabel_2_1);
		
		JLabel aadharError = new JLabel("");
		aadharError.setVisible(false);
		aadharError.setForeground(Color.RED);
		aadharError.setBounds(492, 37, 140, 14);
		panel_4.add(aadharError);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("yyyy-MM-dd");
		dateChooser.setForeground(SystemColor.textHighlight);
		dateChooser.getCalendarButton().setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 112, 192)));
		dateChooser.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 112, 192)));
		dateChooser.setBounds(407, 142, 225, 35);
		panel_4.add(dateChooser);
		
		ButtonGroup rButtonGroup = new ButtonGroup();
		
		JRadioButton coviShield = new JRadioButton("Covi-Shield");
		coviShield.setBackground(Color.WHITE);
		rButtonGroup.add(coviShield);
		coviShield.setForeground(new Color(0,112,192));
		coviShield.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		coviShield.setBounds(407, 211, 109, 23);
		panel_4.add(coviShield);
		
		JRadioButton coVaxin = new JRadioButton("Co-Vaxin");
		coVaxin.setBackground(Color.WHITE);
		rButtonGroup.add(coVaxin);
		coVaxin.setForeground(new Color(0,112,192));
		coVaxin.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		coVaxin.setBounds(548, 211, 109, 23);
		panel_4.add(coVaxin);
		
		JComboBox centerChoose = new JComboBox();
		centerChoose.setForeground(SystemColor.textHighlight);
		centerChoose.setBorder(new LineBorder(new Color(0, 112,192)));
		centerChoose.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		centerChoose.setModel(new DefaultComboBoxModel(new String[] {"Government Polytechnic, Solapur", "Walchand College , Solapur"}));
		centerChoose.setBounds(407, 272, 225, 35);
		panel_4.add(centerChoose);
		
		JLabel lblNewLabel_2 = new JLabel("Aadhar No:");
		lblNewLabel_2.setForeground(SystemColor.textHighlight);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(407, 31, 75, 23);
		panel_4.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Select Date:");
		lblNewLabel_2_2.setForeground(SystemColor.textHighlight);
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(407, 114, 85, 23);
		panel_4.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Vaccine Type:");
		lblNewLabel_2_3.setForeground(SystemColor.textHighlight);
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblNewLabel_2_3.setBounds(407, 181, 95, 23);
		panel_4.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Center:\r\n");
		lblNewLabel_2_4.setForeground(SystemColor.textHighlight);
		lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2_4.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblNewLabel_2_4.setBounds(402, 246, 65, 23);
		panel_4.add(lblNewLabel_2_4);

		JLabel dateError = new JLabel("");
		dateError.setVisible(false);
		dateError.setForeground(Color.RED);
		dateError.setBounds(492, 123, 140, 14);
		panel_4.add(dateError);
		
		coviShield.setActionCommand("Covi-Shield");
		coVaxin.setActionCommand("Co-Vaxin");
		
		JLabel vaccineError = new JLabel("");
		vaccineError.setVisible(false);
		vaccineError.setForeground(Color.RED);
		vaccineError.setBounds(512, 185, 120, 14);
		panel_4.add(vaccineError);
		
		JLabel centerError = new JLabel("");
		centerError.setVisible(false);
		centerError.setForeground(Color.RED);
		centerError.setBounds(492, 255, 140, 14);
		panel_4.add(centerError);
		
		aadharNumber = new JTextField();
		aadharNumber.setForeground(SystemColor.textHighlight);
		aadharNumber.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		aadharNumber.setBorder(new LineBorder(new Color(0, 120, 215), 2));
		aadharNumber.setBounds(407, 62, 225, 35);
		panel_4.add(aadharNumber);
		aadharNumber.setColumns(10);
		
		
		RSButtonHover btnhvrBook = new RSButtonHover();
		btnhvrBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean aadharBoolean = false;
				boolean dateBoolean ,radiobuttonBoolean , centerBoolean;
				Pattern pattern = Pattern.compile("^[2-9]{1}[0-9]{3}[0-9]{4}[0-9]{4}$");
				Matcher matcher = pattern.matcher(aadharNumber.getText());
				if (aadharNumber.getText().isEmpty()==true) {
					aadharError.setText("Enter a Number");
					aadharError.setVisible(true);
					aadharBoolean = false;
				}else if (!(matcher.matches())) {
					aadharError.setText("Enter Number only");
					aadharError.setVisible(true);
				}else {
					aadharError.setText("");
					aadharBoolean=true;
				}
				
				if (((JTextField)dateChooser.getDateEditor().getUiComponent()).getText().isEmpty()){
					dateError.setText("*Select a Date");
					dateError.setVisible(true);
					dateBoolean = false;
				} else {
					dateError.setVisible(false);
					dateBoolean = true;
					
				}
				if ((coviShield.isSelected()==false)&&(coVaxin.isSelected()==false)) {
					vaccineError.setText("*Choose a Vaccine");
					vaccineError.setVisible(true);
					radiobuttonBoolean = false;
				} else {
					vaccineError.setVisible(false);
					radiobuttonBoolean = true;
				}
				
				if (centerChoose.getSelectedItem().equals("")) {
					centerError.setText("*Choose a Center");
					centerBoolean = false;
				}else {
					centerBoolean=true;
				}
				
				BookAppiontment bookAppiontment = new BookAppiontment();
				if (aadharBoolean&&dateBoolean&&radiobuttonBoolean&&centerBoolean) {
					ArrayList<String>arrayList = new ArrayList<String>();
					arrayList.add(aadharNumber.getText());
//					String dateString = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
					arrayList.add(((JTextField)dateChooser.getDateEditor().getUiComponent()).getText());
					arrayList.add(rButtonGroup.getSelection().getActionCommand());
					arrayList.add((String)centerChoose.getSelectedItem());
					
					
					try {
						if (bookAppiontment.getConnection()) {
							bookAppiontment.insertIntoDataBase(arrayList);
						}
						
					} catch (ClassNotFoundException e1) {
						e1.printStackTrace();
					}catch (SQLException e2) {
						e2.printStackTrace();
					}catch (Exception e2) {
						e2.printStackTrace();
					}
				}
				
			}
		});
		btnhvrBook.setText("Book");
		btnhvrBook.setBackground(SystemColor.textHighlight);
		btnhvrBook.setBorder(new CompoundBorder(new LineBorder(new Color(0, 120, 215), 2, true), new LineBorder(new Color(0, 120, 215), 2, true)));
		btnhvrBook.setBounds(407, 327, 95, 35);
		panel_4.add(btnhvrBook);
		
		RSButtonHover btnhvrClear = new RSButtonHover();
		btnhvrClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aadharNumber.setText("");
				rButtonGroup.clearSelection();
				dateChooser.setDate(null);
				centerChoose.setSelectedIndex(-1);
			}
		});
		btnhvrClear.setText("Clear");
		btnhvrClear.setBorder(new CompoundBorder(new LineBorder(new Color(0, 120, 215), 2, true), new LineBorder(new Color(0, 120, 215), 2, true)));
		btnhvrClear.setBackground(SystemColor.textHighlight);
		btnhvrClear.setBounds(537, 327, 95, 35);
		panel_4.add(btnhvrClear);
		
		JSeparator separator = new JSeparator();
		separator.setBorder(new LineBorder(new Color(0, 112, 192), 2));
		separator.setBounds(340, 0, 2, 396);
		panel_4.add(separator);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(6, 6, 331, 385);
		panel_4.add(panel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		panel_5.add(lblNewLabel_6);
		lblNewLabel_6.setIcon(new ImageIcon(ScheduleVaccination.class.getResource("/resources/3885914.jpg")));
		
		
		
	

		
//		JSpinField dateJSpinField = new JSpinField();
//		dateJSpinField.setBounds(382, 117, 41, 34);
//		dateJSpinField.setMaximum(31);
//		dateJSpinField.setMinimum(1);
//		panel_4.add(dateJSpinField);
//		
//		JSpinField dateJSpinField_1 = new JSpinField();
//		dateJSpinField_1.setMinimum(1);
//		dateJSpinField_1.setMaximum(12);
//		dateJSpinField_1.setBounds(454, 117, 41, 34);
//		panel_4.add(dateJSpinField_1);
//		
//		JSpinField dateJSpinField_2 = new JSpinField();
//		dateJSpinField_2.setMinimum(2022);
//		dateJSpinField_2.setMaximum();
//		dateJSpinField_2.setBounds(531, 117, 41, 34);
//		panel_4.add(dateJSpinField_2);
		setUndecorated(true);
		
	}
}