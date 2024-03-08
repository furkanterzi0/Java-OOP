
public class BilgiIslem extends Memur {
	protected String gorevv,tarama;
	
	
	public BilgiIslem(String ad,String soyad,String eposta,String telefon,String bolum,String gorev,String []ders,
			String gorevv,String tarama) {
		super(ad, soyad, eposta, telefon, bolum, gorevv, ders);
		this.gorevv=gorevv;
		this.tarama=tarama;
		
	}


	public String getGorevv() {
		return gorevv;
	}


	public void setGorevv(String gorevv) {
		this.gorevv = gorevv;
	}


	public String getTarama() {
		return tarama;
	}


	public void setTarama(String tarama) {
		this.tarama = tarama;
	}
	
		
}
