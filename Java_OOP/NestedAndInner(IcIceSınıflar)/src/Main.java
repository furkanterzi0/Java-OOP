import java.nio.channels.NonWritableChannelException;
import java.time.Year;

public class Main {

	public static void main(String[] args) {
		// Nested Class (iç içe siniflar)
		//Inner Class (iç siniflar)
			//-static
		   //-non static
		//Local Class (yerel siniflar)
		//ananymous class(anonim siniflar)
		
		NonStatic n=new NonStatic();
		n.run();
		System.out.println("--");
		NonStatic.Inner inner = n.new Inner();
		inner.run();
		System.out.println("--");
		
		Static.Inner s=new Static.Inner(); //static sınıfına erismek icin üst siniftan nesne uretmeye gerek yok nonstatic'de var ama
		s.run();
		
		Local l=new Local();
		l.run();
		
		Anonim a=new Anonim() {
			public void run() {
				System.out.println("anonim sinifina ait run metodu");
			}
			public void print() {
				System.out.println("print");
			}
		};
		a.run();
		a.print();

	}

}
