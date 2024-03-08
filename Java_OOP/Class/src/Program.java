
public class Program {

	public static void main(String[] args) {
		HesapMakinesi makine1 = new HesapMakinesi(1,2);
	
		HesapMakinesi makine2 = new HesapMakinesi(1,3);
		
		System.out.println(makine1.toplama());
		System.out.println(makine2.toplama());

	}

}
