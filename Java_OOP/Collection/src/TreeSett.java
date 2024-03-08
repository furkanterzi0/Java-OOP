import java.awt.event.ItemEvent;
import java.util.*;
public class TreeSett {

	public static void main(String[] args) {
		//tek farkı kucukten buyuge sıralar
		
		TreeSet tree=new TreeSet();
		tree.add(10);
		tree.add(1);
		tree.add(14);
		tree.add(5);
		
		try {
			tree.add(null);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		tree.forEach(item -> System.out.println(item+" "));


	}

}
