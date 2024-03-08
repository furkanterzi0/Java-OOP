
public class Islemler implements Runnable {

	String name;

	public Islemler(String name) {
		this.name = name;
		System.out.println(name+"islem olustu");
	}

	public void run() {

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(this.name + ":" + i);
				Thread.sleep(1000);//programi yavas calistirmak icin
			}
			
		} catch (InterruptedException e) {
			System.out.println(this.name+"hata");
		}
		System.out.println(name+" islem bitti");
	}

}
