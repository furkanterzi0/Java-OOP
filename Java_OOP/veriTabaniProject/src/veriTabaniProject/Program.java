package veriTabaniProject;

import java.sql.*;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws SQLException {
		Scanner input = new Scanner(System.in);
		String id, parola, id1, parola1;
		while (true) {

			System.out.println("Giris yapmak icin 1 - Kayit olmak icin 2 - Cikis yapmak icin 0 Tuslayin");
			int secim = input.nextInt();
			if (secim == 1) {
				Giris g = new Giris();
				g.girisIslemi();
				break;

			} else if (secim == 2) {
				while (true) {
					System.out.print("Kullanici Adi: ");
					id = input.next();
					System.out.print("Parola: ");
					parola = input.next();
					if (id.length() < 4 || parola.length() < 4) {
						System.out.println("***Kullanici adi veya parola 4 karakterden kisa olamaz***");
					} else {
						Kayit k = new Kayit(id, parola);
						k.kayitIslemi();
						break;
					}

				}

			} else if (secim == 0) {
				System.out.println("\n***CIKIS YAPILIYOR***");
				break;
			} else {
				System.out.println("\n***Hatali Tuslama TEKRAR DENEYIN***\n");
			}

		}

	}

}
