import java.util.Scanner;

public class Program 
{
	static void f(int x) // fonk (x+2)*6
	{
		int result=(x+2)*6;
		System.out.println(result);
	}
	static int pow(int a,int b)
	{
		int result=1;
		for(int i=0;i<b;i++)
			result *=a;
		return result;
	}


	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int a=input.nextInt();
		f(a);
		pow(0,0);

	}
	
}
