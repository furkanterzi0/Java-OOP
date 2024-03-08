package foreach;

public class Program {

	public static void main(String[] args) {
		int []dizi=new int[10];
		for(int i=0;i<10;i++)
			dizi[i]=i+1;
		
		for(int value : dizi)//foreach-- dizi'den value elemanına dizinin 1. elamanından baslayarak degerleri aktar
			System.out.println(value);
			
		int [][]dizi2=new int[2][2];
		dizi2[0][0]=1;
		dizi2[0][1]=2;
		dizi2[1][0]=4;
		dizi2[1][1]=7;
		for(int i=0;i<dizi2.length;i++)
		{
			for(int j=0;j<dizi2[0].length;j++)
				System.out.println(dizi2[i][j]);
		}
		
		for(int[] value2 : dizi2)
		{
			for(int value3 : value2) 
				System.out.println(value3);
				
		}
		
	}

}
