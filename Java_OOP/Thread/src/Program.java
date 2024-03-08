
public class Program {

	public static void main(String[] args) {
		//thread-(tired) aynı anda birden fazla islem yapmak icin kullanılır
		
		Islemler i1=new Islemler("ilk");
		Thread t1=new Thread(i1);
		
		Islemler i2=new Islemler("Son");
		Thread t2=new Thread(i2);
		
		t1.start();
		t2.start();
	}

}
