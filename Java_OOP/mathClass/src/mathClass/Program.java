package mathClass;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		System.out.println(Math.min(1, 5));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.random());
		System.out.println(Math.round(5.6));
		
		Random rnd = new Random();
		System.out.println(rnd.nextInt(10));
	}

}
