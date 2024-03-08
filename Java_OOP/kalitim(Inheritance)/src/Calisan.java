import org.w3c.dom.html.HTMLDListElement;

public class Calisan {
	protected String ad,soyad,eposta,telefon;
	
	public Calisan(String ad, String soyad, String eposta, String telefon) {
		this.ad = ad;
		this.soyad = soyad;
		this.eposta = eposta;
		this.telefon = telefon;
	}

	protected String giris() {
		return this.ad+" Giris Yapti ! ";
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getEposta() {
		return eposta;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	
	public static void listele(Calisan[] girisYapanlar) {
		
		for(int i=0;i<girisYapanlar.length;i++)
			System.out.println(girisYapanlar[i].giris());
		
			
	}
	

}
