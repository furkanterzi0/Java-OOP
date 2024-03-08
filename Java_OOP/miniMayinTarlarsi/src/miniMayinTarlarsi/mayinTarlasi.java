package miniMayinTarlarsi;

import java.util.Random;
import java.util.Scanner;

public class mayinTarlasi {
	int satir, sutun;

	public mayinTarlasi(int satir, int sutun) {
		this.satir = satir;
		this.sutun = sutun;
	}

	public void start() {
		int sayi, hak = 1;
		int sayac = 0;
		int d;
		int s = 1, h = 1;
		Scanner input = new Scanner(System.in);
		int secimSatir, secimSutun;
		int[][] dizi = new int[satir][sutun];
		int[][] dizi2 = new int[satir][sutun];

		for (int i = 0; i < satir; i++) {
			for (int j = 0; j < sutun; j++) {
				Random rnd = new Random();
				sayi = rnd.nextInt(-1, 4);
				if (sayi != 0)
					dizi[i][j] = sayi;
				else
					dizi[i][j] = i + 1;
				if (dizi[i][j] == -1)
					sayac++;

			}
		}
		System.out.println(sayac);
		for (int a = 0; a < satir; a++) {
			for (int b = 0; b < sutun; b++) {
				System.out.print(dizi[a][b] + " ");
			}
			System.out.println("\n");
		}

		System.out.println("-------------------------");
		for (int i = 0; i < satir; i++) {
			System.out.print("|  ");
			for (int j = 0; j < sutun; j++) {
				dizi2[i][j] = 0;
				System.out.print(dizi2[i][j] + "  ");
				if (j == sutun - 1)
					System.out.print("  |");
			}

			System.out.println("\n");
		}
		System.out.print("-------------------------\n");

		while (s > 0) {

			System.out.print("secmek istediginiz satir: ");
			secimSatir = input.nextInt();
			System.out.print("secmek istediginiz sutun: ");
			secimSutun = input.nextInt();

			dizi2[secimSatir][secimSutun] = dizi[secimSatir][secimSutun];

			System.out.println("-------------------------");
			for (int i = 0; i < satir; i++) {
				System.out.print("|  ");
				for (int j = 0; j < sutun; j++) {
					System.out.print(dizi2[i][j] + "  ");
					if (j == sutun - 1)
						System.out.print("  |");
				}

				System.out.println("\n");
			}
			System.out.print("-------------------------\n");

			if (dizi[secimSatir][secimSutun] == -1) {
				hak++;
				System.out.println("PATLADI\nkalan hak:" + (6 - hak) + "\n");

			}

			if (dizi[secimSatir][secimSutun] != -1) {
				System.out.println("");
			}

			if (hak == 3)// hak -1
			{
				System.out.println("game over");
				break;
			}

			s++;

			d = (satir * sutun) - sayac;
			if ((d + (hak - 1)) == s - 1) {
				System.out.println("kazandin");
				break;
			}

		}

		System.out.println(" SONUC:\n-------------------------");
		for (int i = 0; i < satir; i++) {
			System.out.print("|  ");
			for (int j = 0; j < sutun; j++) {
				System.out.print(dizi[i][j] + "  ");
				if (j == sutun - 1)
					System.out.print("  |");
			}

			System.out.println("\n");
		}
		System.out.print("  -------------------------\n");

	}

}
