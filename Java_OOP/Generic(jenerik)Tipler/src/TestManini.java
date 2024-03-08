
public class TestManini {

	public static void main(String[] args) {
		Test<Integer> i=new Test<Integer>(15);
		System.out.println(i.getObj());
		
		Test<String>f=new Test<String>("furkan");
		System.out.println(f.getObj());
		
		Test2<Integer, String> a=new Test2<Integer, String>(1, "adana");
		a.print();
		
		Integer[] intArr= {1,2,3,4};
		Double[] doubleArr= {1.1,2.1,3.1};
		Character[]chaArr= {'K','O','D'};
		
		System.out.println("----------------");
		
		genericMethod(chaArr);
		genericMethod(intArr);
		genericMethod(doubleArr);
	}
	
	public static <E> void genericMethod(E[] arr) {
		for (E item : arr) {
			System.out.println(item);
		}
	}
}
