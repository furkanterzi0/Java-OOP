package veriTabaniProject1;

import java.sql.*;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws Exception{
		
		int secim;
		
		Scanner input=new Scanner(System.in);
		System.out.println("GİRİS YAPMAK İCİN (1) KAYIT OLMAK İCİN (2) TUŞLAYINIZ");
		secim=input.nextInt();
		if(secim==1) {
			
		}
		else if(secim==2) {
			String id,parola;
			System.out.println("id: ");
			id=input.nextLine();
			System.out.println("parola: ");
			parola=input.nextLine();
			Kayit k=new Kayit(id, parola);
			
			k.KayitIslemi();
		}
		
		
		

	}

}
