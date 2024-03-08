package processData;

public class Program {

	static void islem(int a)
	{	
		a=a*10;
		System.out.println(a);
	
	}
	
	
	
	public static void main(String[] args) {
		int data=10;
		System.out.println("process öncesi deger: "+data);
		System.out.println("process sonrası deger:");
		islem(data);
		

	}



	

}
