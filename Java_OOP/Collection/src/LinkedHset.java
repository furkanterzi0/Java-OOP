import java.awt.event.ItemEvent;
import java.util.LinkedHashSet;

public class LinkedHset {

	public static void main(String[] args) {
	
		LinkedHashSet gunler=new LinkedHashSet();  //normal hassetten tek farkı ilk giren ilk cıkar FIFO
		gunler.add("Pazartesi");
		gunler.add("Sali");
		gunler.add("Carsam");
		gunler.add("Persembe");
		gunler.add("Cuma");
		gunler.add("Cumartesi");
		gunler.add("Pazar");
		
		gunler.forEach(item -> System.out.print(item+","));
	
	}
}
