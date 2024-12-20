package furtagram;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.mariadb.jdbc.plugin.Codec;

import java.awt.Window.Type;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.management.MBeanAttributeInfo;
import javax.security.auth.login.LoginContext;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.security.Identity;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

public class furtagram extends JFrame {

	private JPanel contentPane;
	private JTextField id;
	private JPasswordField pass;
	private JTextField dCode;

	/**
	 * Launch the application.
	 * 
	 * @throws SQLException
	 */
	public static void main(String[] args) throws SQLException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					furtagram frame = new furtagram();
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
	public static String verificationCode() {

		ArrayList<String> a = new ArrayList<>();
		a.add("aCrTXe");
		a.add("bxTGHB");
		a.add("zCWFfs");
		a.add("dbmJFW");
		a.add("tpOFKd");
		a.add("wfVCDg");
		a.add("FwfFAw");
		a.add("FsxRxd");
		a.add("EmfKRs");
		a.add("ÇfkwOW");
		a.add("FÇsfFg");
		a.add("E262e2");
		a.add("2F92Br");
		a.add("2042LD");
		a.add("w20Fe0");
		a.add("Fe2sf4");
		a.add("FsnW2d");
		a.add("En52tA");

		Random rnd = new Random();
		int s = rnd.nextInt(18);

		return a.get(s);

	}

	public Boolean loginCheck(String id, String password) throws SQLException {
		ArrayList<String> idArray = new ArrayList<>();
		ArrayList<String> parolaArray = new ArrayList<>();
		Connection c = DriverManager.getConnection("jdbc:mariadb://localhost:3306/kullanici?user=root&password=123");
		Statement st = c.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM kullanicibilgileri");

		int count = 0;
		while (rs.next()) {
			int i = 0;
			idArray.add(i, rs.getString("id"));
			parolaArray.add(i, rs.getString("parola"));

			i++;
		}
		for (int j = 0; j < idArray.size(); j++) {
			if (id.equals(idArray.get(j)) && password.equals(parolaArray.get(j))) {
				count++;
			}

		}
		if (count >= 1)
			return true;
		else
			return false;

	}

	/**
	 * Create the frame.
	 */
	public furtagram() {
		setType(Type.UTILITY);
		setTitle("Furtagram Giriş");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel photo2 = new JLabel("New label");
		photo2.setBounds(0, 0, 214, 142);
		Image img2=new ImageIcon(this.getClass().getResource("/DDD.PNG")).getImage();
		photo2.setIcon(new ImageIcon(img2));
		contentPane.add(photo2);
		
		JLabel lblNewLabel_1 = new JLabel("FURTAGRAM GİRİŞ");
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_1.setBounds(245, 5, 441, 117);
		contentPane.add(lblNewLabel_1);

		JLabel code = new JLabel(verificationCode());
		code.setForeground(new Color(255, 0, 0));
		code.setFont(new Font("Tahoma", Font.PLAIN, 16));
		code.setBounds(250, 258, 68, 25);
		contentPane.add(code);

		JLabel mb = new JLabel("");
		mb.setForeground(new Color(64, 128, 128));
		mb.setBounds(289, 414, 205, 30);
		contentPane.add(mb);

		JLabel lblNewLabel = new JLabel("Kullanıcı Adı");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(150, 150, 90, 30);
		contentPane.add(lblNewLabel);

		id = new JTextField();
		id.setFont(new Font("SansSerif", Font.BOLD, 13));
		id.setBounds(250, 155, 200, 25);
		contentPane.add(id);
		id.setColumns(10);

		JLabel lblifre = new JLabel("Şifre");
		lblifre.setForeground(new Color(255, 0, 0));
		lblifre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblifre.setBounds(150, 210, 90, 30);
		contentPane.add(lblifre);

		pass = new JPasswordField();
		pass.setBounds(250, 215, 200, 25);
		contentPane.add(pass);

		dCode = new JTextField();
		dCode.setFont(new Font("SansSerif", Font.BOLD, 13));
		dCode.setColumns(10);
		dCode.setBounds(316, 260, 134, 25);
		contentPane.add(dCode);

		JButton btnGiris = new JButton("Gİriş Yap");
		btnGiris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = new String(pass.getText());
				boolean control = code.getText().equals(dCode.getText());

				try {
					if (loginCheck(id.getText(), password) == true && control == true) {
						JOptionPane.showMessageDialog(null, "Giriş Yapıldı");
						mb.setText("*** GİRİŞ YAPILDI ***");
					} else if (loginCheck(id.getText(), password) == false && control == true) {
						JOptionPane.showMessageDialog(null, "Kullanıcı Adı veya Şifre Hatalı", "Hata",
								JOptionPane.ERROR_MESSAGE);
						mb.setText("");
					} else if (loginCheck(id.getText(), password) == true && control == false) {
						JOptionPane.showMessageDialog(null, "Doğrulama Kodu Hatalı", "Hata", JOptionPane.ERROR_MESSAGE);
						mb.setText("");
					} else if (loginCheck(id.getText(), password) == false && control == false) {
						JOptionPane.showMessageDialog(null, "Giriş Bilgileri ve Doğrulama Kodu Hatalı", "Hata",
								JOptionPane.ERROR_MESSAGE);
						mb.setText("");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnGiris.setBounds(250, 312, 200, 40);
		contentPane.add(btnGiris);

		JButton btnYeniHesapOlutur = new JButton("Yeni Hesap Oluştur");
		btnYeniHesapOlutur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kayitOl k=new kayitOl();
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
				contentPane.add(j);
				k.setVisible(true);
				exit();
				
			}
		});
		btnYeniHesapOlutur.setBounds(279, 374, 150, 30);
		contentPane.add(btnYeniHesapOlutur);
		
		JLabel photo = new JLabel("");
		photo.setFont(new Font("Segoe UI", Font.BOLD, 13));
		photo.setVerticalAlignment(SwingConstants.BOTTOM);
		Image img=new ImageIcon(this.getClass().getResource("/pexels-eberhard-grossgasteiger-1367192.jpg")).getImage();
		photo.setIcon(new ImageIcon(img));
		photo.setBounds(0, 0, 686, 463);
		contentPane.add(photo);
		
	}
}
