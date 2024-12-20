package furtagram;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument.BranchElement;

import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class kayitOl extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kayitOl frame = new kayitOl();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
	public void exit() {
		this.setVisible(false);
	}
	/**
	 * Create the frame.
	 */
	public kayitOl() {
		setTitle("Furtagram Hesap Oluştur");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		getContentPane().setLayout(null);
		Image img = new ImageIcon(this.getClass().getResource("/electric_lamborghini_hypercar_yacht-wallpaper-1920x1080.jpg"))
				.getImage();
				
						JLabel photo2 = new JLabel("");
						photo2.setBounds(0, 0, 214, 142);
						Image img2 = new ImageIcon(this.getClass().getResource("/DDD.PNG")).getImage();
						
						JButton btnNewButton_1 = new JButton("Giriş Ekranına Dön");
						btnNewButton_1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								furtagram f=new furtagram();
								JProgressBar j=new JProgressBar(0,2000);
								j.setBounds(250,411,200,33);
								j.setValue(0);
								j.setStringPainted(true);
								for(int i=0;i<=2000;i+=20) {
									j.setValue(i);
									try {
										Thread.sleep(3);
									} catch (InterruptedException es) {
										// TODO Auto-generated catch block
										es.printStackTrace();
									}
								}
								getContentPane().add(j);
								f.setVisible(true);
								exit();
							}
						});
						btnNewButton_1.setBounds(275, 420, 199, 32);
						getContentPane().add(btnNewButton_1);
						
						JButton btnNewButton = new JButton("Kaydol");
						btnNewButton.setBounds(250, 370, 237, 35);
						getContentPane().add(btnNewButton);
						
						JCheckBox chckbxNewCheckBox = new JCheckBox("Furtagram Verilerimi Kullanabilir");
						chckbxNewCheckBox.setBackground(new Color(220, 220, 220));
						chckbxNewCheckBox.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 11));
						chckbxNewCheckBox.setBounds(250, 327, 237, 25);
						getContentPane().add(chckbxNewCheckBox);
						
						textField_1 = new JTextField();
						textField_1.setFont(new Font("SansSerif", Font.BOLD, 13));
						textField_1.setColumns(10);
						textField_1.setBounds(315, 290, 134, 25);
						getContentPane().add(textField_1);
						
						JLabel code = new JLabel("wfVCDg");
						code.setForeground(new Color(255, 255, 0));
						code.setFont(new Font("Tahoma", Font.PLAIN, 16));
						code.setBounds(247, 290, 68, 25);
						getContentPane().add(code);
						
						JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Belirtmek İstemiyorum");
						rdbtnNewRadioButton_2.setBackground(new Color(220, 220, 220));
						rdbtnNewRadioButton_2.setSelected(true);
						rdbtnNewRadioButton_2.setBounds(377, 245, 151, 21);
						getContentPane().add(rdbtnNewRadioButton_2);
						
						JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Kadın");
						rdbtnNewRadioButton_1.setBackground(new Color(220, 220, 220));
						rdbtnNewRadioButton_1.setBounds(315, 245, 65, 21);
						getContentPane().add(rdbtnNewRadioButton_1);
						
						JRadioButton rdbtnNewRadioButton = new JRadioButton("Erkek");
						rdbtnNewRadioButton.setBackground(new Color(220, 220, 220));
						rdbtnNewRadioButton.setBounds(250, 245, 65, 21);
						ButtonGroup bt=new ButtonGroup();
						bt.add(rdbtnNewRadioButton);
						bt.add(rdbtnNewRadioButton_1);
						bt.add(rdbtnNewRadioButton_2);
						getContentPane().add(rdbtnNewRadioButton);
						photo2.setIcon(new ImageIcon(img2));
						getContentPane().add(photo2);
				
				passwordField = new JPasswordField();
				passwordField.setFont(new Font("SansSerif", Font.BOLD, 13));
				passwordField.setBounds(250, 205, 200, 25);
				getContentPane().add(passwordField);
				
				JLabel lblifre = new JLabel("Şifre");
				lblifre.setForeground(new Color(255, 255, 0));
				lblifre.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblifre.setBounds(150, 200, 90, 30);
				getContentPane().add(lblifre);
				
				textField = new JTextField();
				textField.setFont(new Font("SansSerif", Font.BOLD, 13));
				textField.setColumns(10);
				textField.setBounds(250, 155, 200, 25);
				getContentPane().add(textField);
				
				JLabel lblNewLabel = new JLabel("Kullanıcı Adı");
				lblNewLabel.setForeground(new Color(255, 255, 0));
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblNewLabel.setBounds(150, 150, 90, 30);
				getContentPane().add(lblNewLabel);
				
				
				JLabel lblNewLabel_1 = new JLabel("FURTAGRAM KAYIT");
				lblNewLabel_1.setForeground(new Color(255, 128, 0));
				lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
				lblNewLabel_1.setBounds(245, 5, 441, 117);
				getContentPane().add(lblNewLabel_1);
		
				JLabel photo = new JLabel("");
				photo.setVerticalAlignment(SwingConstants.TOP);
				photo.setBounds(0, 0, 686, 463);
				photo.setIcon(new ImageIcon(img));
				photo.setBounds(0, 0, 686, 463);
				getContentPane().add(photo);
		

	}
}
