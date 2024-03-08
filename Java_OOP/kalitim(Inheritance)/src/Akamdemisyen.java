
public abstract class Akamdemisyen extends Calisan { //abstract = soyutlama nesne uretme engellendi
	String depertman,mesai,ders;

	public Akamdemisyen(String ad, String soyad, String eposta, String telefon, String depertman, String mesai,String ders) {
		super(ad, soyad, eposta, telefon);
		this.depertman = depertman;
		this.mesai = mesai;
		this.ders = ders;
	}

	public abstract void derseGir();
	
	
	public String giris() { //overriding(metot ezme)
		return super.giris()+ " (A KAPISINDAN) ";
	}
	public String getDepertman() {
		return depertman;
	}

	public void setDepertman(String depertman) {
		this.depertman = depertman;
	}

	public String getMesai() {
		return mesai;
	}

	public void setMesai(String mesai) {
		this.mesai = mesai;
	}

	public String getDers() {
		return ders;
	}

	public void setDers(String ders) {
		this.ders = ders;
	}
	
}
