
public class Main {
	//Abstraction (Soyutlama) == Akademisyenden nesne üretmek sacma bu yüzden nesne üretmeyi engellememiz lazim(bkz feyza)
	public static void main(String[] args) {
		Calisan furkan =new Calisan("furkan", "terzi","f@gmail.com", "05456345987");
		
		
		//Akamdemisyen feyza =new Akamdemisyen("feyza", "terzi", "fe@gmail.com", "4254", "ogretim uyesi", "8", "matematik 1");
		//abstractlandı
		
		OgretimUyesi erkan=new OgretimUyesi("erkan", "terzi", "e@gmail.com", "12312", "arastirma görevlisi", "8", "fizik1", "ars. grv");
		
		
		BilgiIslem aynur =new BilgiIslem("aynur", "terzi", "sada@gmail.com", "1231", "sada", null, args, null, null);
		
		
		OgretimUyesi ahmet=new OgretimUyesi("ahmet", null, null, null, null, null, null, "Profesor");
		
		
		Calisan mehmet =new Asistan("mehmet", null, null, null, null, null, null, null);
		//polymorphism(cok bicimlilik)
		
		Asistan mustafAsistan=new Asistan("mustafa", null, null, null, null, null, null, null);
		
		Calisan [] girisListesi= {furkan,erkan,aynur,ahmet,mehmet}; 
		Calisan.listele(girisListesi);
		
		ahmet.derseGir();
		mustafAsistan.derseGir();
	}

}
