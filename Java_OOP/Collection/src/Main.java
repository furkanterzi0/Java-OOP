import java.awt.event.ItemEvent;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		HashSet h=new HashSet();
		h.add("12");
		h.add("1223");
		h.add("122");
		h.add(12);
		h.add(true);
		
		h.add(null);
		
		h.remove("12");
		
		//Iterator itr=h.iterator();
		//while(itr.hasNext()) {
			//System.out.println(itr.next());
		//}
		
		h.forEach(item -> System.out.println(item+" "));

	}

}
