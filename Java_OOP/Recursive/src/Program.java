import javax.sql.rowset.JoinRowSet;

public class Program {
	

	static int f(int a)
	{
		if(a==1)
			return 1;
		else
			return a+f(a-1);
	
	}
	public static void main(String[] args) {
		// f(x)=f(x-1)+x
		for(int i=1;i<=10;i++)
		{
			System.out.println("f("+i+")="+f(i));
		}
		
	}

}
