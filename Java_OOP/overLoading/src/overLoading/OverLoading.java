package overLoading;

public class OverLoading { // isimleri aynı parametre sayisi farklı 
	
	static int add(int a,int b)
	{	
		System.out.println("1. metot");
		return a+b;
	}
	static int add(int a,int b,int c)
	{
		System.out.println("2. metot");
		return a+b+c;
	}
	static double add(int a,int b,int c,double d)
	{
		System.out.println("3. metot");
		return a+b+c+d;
	}
	public static void main(String[] args) {
		System.out.println(add(3 , 5));
		System.out.println(add(3 , 5 , 6));
		System.out.println(add(3 , 5, 6, 7.3));

	}

}
