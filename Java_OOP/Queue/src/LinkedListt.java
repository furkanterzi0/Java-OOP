import java.util.*;
public class LinkedListt {

	public static void main(String[] args) {
		
			Queue q=new LinkedList();
			q.add("Deniz");
			q.add("mehmet");
			
			
			q.offer("Ali");
			q.offer("Damla");
			
			System.out.println("remove(): "+q.remove());
			
			System.out.println("kuyrugun birincisi: "+q.peek());
			
			q.forEach( i -> System.out.println(i+" "));
			
		
	}

}
