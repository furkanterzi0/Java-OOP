package palindromikKelimeler;

public class Program {

	public static void main(String[] args) {
		
		String ad="ada",tmp="";
		
		for(int i=(ad.length()-1);i>=0;i--)
		{
			tmp+=ad.charAt(i);
		}
		if(tmp.equals(ad)) //equlas stringlerde esittir demek
			System.out.println("polindromik");
		else
			System.out.println("polindromik degil");
	}

}
