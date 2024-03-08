package denemeS;

import java.util.Scanner;


public class Main {

	public static void deneme(){
		System.out.println("helo madıfakı");
	}
	public static void deneme(int a) {
		System.out.println("helo dadymadıfakı");
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int bolen,bolunen;
		System.out.println("bolunen: ");
		bolunen=input.nextInt();
		System.out.println("bolen: ");
		bolen=input.nextInt();
		
		
		try {
			int sonuc=bolunen/bolen;
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			System.out.println("hata ayiklama bitti");
			
		}
		deneme();
		deneme(2); //overloading
		Deneme1 a=new Deneme1();
		a.toplamSonuc(2, 3);
	}

}
