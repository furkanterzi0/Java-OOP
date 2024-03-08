import java.util.Queue;

public class PriorityQueue {

	public static void main(String[] args) {
		
		Queue q=new java.util.PriorityQueue();  //java util yazmasınınn sebebi classin ismi priorityqueue olmasi
		
		q.add(80);
		q.add(20);
		q.add(10);
		q.add(59);
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		

	}

}
