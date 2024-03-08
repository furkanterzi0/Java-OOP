
public class Program {

	//f(1)=1 f(2)=1 f(3)= 2 ...       f(x)=f(x-1)+f(x-2)
	static int fibonacci(int a)
	{
		if(a==1 || a==2)
			return 1;
			
		else	
			return fibonacci(a-1)+fibonacci(a-2);
			
	}
	public static void main(String[] args) {
		System.out.println("fibonacci sayi dizisinin ilk 10 elemani:");
		for(int i=0;i<10;i++)
			System.out.println("f("+ (i+1) +"):"+ fibonacci(i+1));
	}

}
