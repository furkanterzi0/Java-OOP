
public class Guvenlik extends Memur {
	String belge;

	public Guvenlik(String ad, String soyad, String eposta, String telefon, String bolum, String gorevler,
			String[] dersler, String belge) {
		super(ad, soyad, eposta, telefon, bolum, gorevler, dersler);
		this.belge = belge;
	}

	public String getBelge() {
		return belge;
	}

	public void setBelge(String belge) {
		this.belge = belge;
	}
	
}
