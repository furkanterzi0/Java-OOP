
public class Program {
	static boolean palindromKontrol(int a)
	{
		int tersSayi=0,kalan,temp;
		temp=a;
		while(temp!=0)
		{
			kalan=temp%10;
			tersSayi=tersSayi*10+kalan;
			temp/=10;
		}
		System.out.println(tersSayi);
		if(a==tersSayi)
			return true;
		else
			return false;
		
		
	}
/*
	static void palindromKontrol(int a)
	{
		int bok=a;
		int sayac=0;
		int birler,onlar,yuzler,binler,onbinler,yuzbinler;
		birler=bok%10;
		bok/=10;
		onlar=bok%10;
		bok/=10;
		yuzler=bok%10;
		bok/=10;
		binler=bok%10;
		bok/=10;
		onbinler=bok%10;
		bok/=10;
		yuzbinler=bok%10;
		
		if(binler<1 && yuzler<1 && onbinler<1 && yuzbinler<1)
		{
			int d[]=new int[2];
			d[0]= birler;
			d[1]= onlar;
			
			if(d[0]==d[1])
				System.out.println(a);
			
		} 
		else if(binler<1 &&  onbinler<1 && binler<1 && yuzler>=1 && yuzbinler<1)
		{
			int d[]=new int[2];
			d[0]= yuzler;
			d[1]=onlar;
			
			int db[]=new int[2];
			db[0]= birler;
			db[1]= onlar;
			
			if(d[0]==db[0] && d[1]==db[1])
				System.out.println(a);
			
		}
		
		else if(onbinler<1 && yuzler>=0 && onlar>=0 && binler>=1 && birler>=0 && yuzbinler<1)
		{
			int d[]=new int[2];
			d[0]= binler;
			d[1]=yuzler;
			//1001
			int db[]=new int[2];
			db[0]= birler;
			db[1]= onlar;
			
			if(d[0]==db[0] && d[1]==db[1])
				System.out.println(a);
				
			
		}
		else if(yuzbinler<1 && onbinler>=1 && binler>=0 && yuzler>=0 && onlar>=0 && birler>=0 )
		{
			int d[]=new int[3];
			d[0]= onbinler;
			d[1]= binler;
			d[2]= yuzler;
			
			int db[]=new int[3];
			db[0]= birler;
			db[1]= onlar;
			db[2]= yuzler;
			
			if(d[0]==db[0] && d[1]==db[1]&&d[2]==db[2])
				System.out.println(a);	
			
		}
		
		
	}
	*/
	public static void main(String[] args) {
		
		System.out.println(palindromKontrol(125));
		
		
		/*System.out.println("1'den 100000'e kadar olan palindromik sayilar:");
		for(int i=1;i<100000;i++)
		{
			//palindromKontrol(i);
		}*/
	}

}
