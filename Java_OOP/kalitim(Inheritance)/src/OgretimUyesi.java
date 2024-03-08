
public class OgretimUyesi extends Akamdemisyen{
	protected String unvan;

	public OgretimUyesi(String ad, String soyad, String eposta, String telefon, String depertman, String mesai,
			String ders, String unvan) {
		super(ad, soyad, eposta, telefon, depertman, mesai, ders);
		this.unvan = unvan;
	}
	public String giris(){
		return this.unvan+" "+ super.giris();
	}

	public String getUnvan() {
		return unvan;
	}

	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}
	public void derseGir() {
		System.out.println(getUnvan()+" "+getAd()+" derse girdi");
		
	}
	

}
