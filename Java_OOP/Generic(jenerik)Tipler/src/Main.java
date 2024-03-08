import java.util.*;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>();
		a.add(19);
		a.add(20);

		for (Integer obj : a) {
			System.out.println(obj.doubleValue());
		}

		HashMap<Integer, String> c = new HashMap<>();

		c.put(1, "adana");
		c.put(6, "ankara");
		c.put(34, "istanbul");

		for (Integer i : c.keySet()) {
			System.out.println("key: " + i + " -value: " + c.get(i));
		}
		for (String s : c.values()) {
			System.out.println(s);
		}
		
		
		

	}

}
