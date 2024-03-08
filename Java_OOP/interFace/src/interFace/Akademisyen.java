package interFace;

public class Akademisyen implements ICalisan {

		private String adSoyad,bolum,gorevler;

		public Akademisyen(String adSoyad, String bolum, String gorevler) {
			this.adSoyad = adSoyad;
			this.bolum = bolum;
			this.gorevler = gorevler;
		}
		public void giris() {
			System.out.println("giris yapildi");
			
		}

		public void cikis() {
			System.out.println("cikis yapildi");
			
		}

		public boolean yemek(int saat) {
			System.out.println("yemek yendi");
			return true;
		}
		
		
		public String getAdSoyad() {
			return adSoyad;
		}

		public void setAdSoyad(String adSoyad) {
			this.adSoyad = adSoyad;
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
}
