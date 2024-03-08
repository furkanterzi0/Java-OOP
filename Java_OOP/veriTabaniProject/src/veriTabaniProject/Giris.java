package veriTabaniProject;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Giris {

	public Giris() {

	}

	public void girisIslemi() throws SQLException {
		Scanner input = new Scanner(System.in);
		int sayac = 0;
		ArrayList<String> ids = new ArrayList<>();
		ArrayList<String> parolas = new ArrayList<>();
		Connection c = DriverManager.getConnection("jdbc:mariadb://localhost:3306/kullanici?user=root&password=123");
		Statement st = c.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM kullanicibilgileri");
		while (rs.next()) {
			int i = 0;
			ids.add(i, rs.getString("id"));
			parolas.add(i, rs.getString("parola"));

			i++;
			sayac++;
		}
		while (true) {

			System.out.print("Kullanici Adi: ");
			String ii = input.next();
			System.out.print("Parola: ");
			String pp = input.next();
			int ka = (sayac - 1);
			for (int d = 0; d < sayac; d++) {
				if (ii.equals(ids.get(d)) && pp.equals(parolas.get(d))) {
					System.out.println("\n***Giris Basarili***\n");
					ka++;
					break;

				} else if (ka == d) {
					System.out.println("Kullanici Adi veya Parola hatali");
				}

			}
			if (ka >= sayac)
				break;
		}
	}
}
