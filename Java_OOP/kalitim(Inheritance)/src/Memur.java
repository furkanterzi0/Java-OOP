
public class Memur extends Calisan {
	String bolum,gorevler;
	String[] dersler;
	public Memur(String ad, String soyad, String eposta, String telefon, String bolum, String gorevler,String[] dersler) {
		super(ad, soyad, eposta, telefon);
		this.bolum = bolum;
		this.gorevler = gorevler;
		this.dersler = dersler;
	}
	public String giris() { //overriding(metot ezme)
		return super.giris()+ " (B KAPISINDAN) ";
	}
	public String getBolum() {
		return bolum;
	}
	public void setBolum(String bolum) {
		this.bolum = bolum;
	}
	public String getGorevler() {
		return gorevler;
	}
	public void setGorevler(String gorevler) {
		this.gorevler = gorevler;
	}
	public String[] getDersler() {
		return dersler;
	}
	public void setDersler(String[] dersler) {
		this.dersler = dersler;
	}
	
	
}
