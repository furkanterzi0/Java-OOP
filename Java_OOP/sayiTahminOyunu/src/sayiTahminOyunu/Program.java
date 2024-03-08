package sayiTahminOyunu;

import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int tahmin;
		Random rn=new Random();
		int rnd=rn.nextInt(30);
		Scanner input = new Scanner(System.in); 
		System.out.println(rnd);
		for(int i=5;i>0;i--)
		{
			System.out.println("Tahmin: ");
			tahmin=input.nextInt();
			if(tahmin>rnd)
				System.out.println("Dusuk deger girin");
			else if(tahmin<rnd)
				System.out.println("Buyuk deger girin");
			else
			{
				System.out.println("tebrikler");
				break;
			}
				
			System.out.println("\n \nkalan hak: "+(i-1)+"\n");
		}
		
		
	}

}
