
public class Asistan extends Akamdemisyen {
	protected String yuksekLisans;

	public Asistan(String ad, String soyad, String eposta, String telefon, String depertman, String mesai, String ders,
			String yuksekLisans) {
		super(ad, soyad, eposta, telefon, depertman, mesai, ders);
		this.yuksekLisans = yuksekLisans;
	}

	public String getYuksekLisans() {
		return yuksekLisans;
	}

	public void setYuksekLisans(String yuksekLisans) {
		this.yuksekLisans = yuksekLisans;
	}

	public void derseGir() {
		System.out.println("Asistan "+getAd()+" derse girdi");
		
	}
	
	
}
