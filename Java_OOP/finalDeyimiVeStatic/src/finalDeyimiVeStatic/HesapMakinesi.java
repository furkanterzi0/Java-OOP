package finalDeyimiVeStatic;

public class HesapMakinesi {
	int sayi1,sayi2;
	String renk;
	final static double PI=3.14;
	
	
	
	public HesapMakinesi(int sayi1,int sayi2,String renk) {
		this.renk=renk;
		this.sayi1=sayi1;
		this.sayi2=sayi2;
		
	}
	public int toplama() {
		return sayi1+sayi2;
	}
	public double daireAlan(int r) {
		return HesapMakinesi.PI*Math.pow(r, 2);
	}
	

}
