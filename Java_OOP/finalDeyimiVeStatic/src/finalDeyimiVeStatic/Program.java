package finalDeyimiVeStatic;

public class Program {

	public static void main(String[] args) {
		
		HesapMakinesi h1=new HesapMakinesi(1, 2, "red");
		
		System.out.println(h1.toplama());
		
		System.out.println(HesapMakinesi.PI);
		
		System.out.println(h1.daireAlan(10));

	}

}
