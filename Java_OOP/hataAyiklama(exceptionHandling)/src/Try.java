import java.util.Scanner;
import javax.sound.midi.Soundbank;

public class Try {

	public static void main(String[] args) {
      Scanner input =new Scanner(System.in);
	  System.out.println("Program Basladi");
	  	int a=0,b;
	  	int []arr=new int[3];
		try {
			a=2/1;	//dene eger bir sorun varsa yakala  --- 
			 arr[2]=10;
			 b=input.nextInt();
			
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage()+ " (by 0 hatasi)");
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString()+" (array hatasi)");
		}catch (Exception e) { //butun exceptionlari kontorl eder
			System.out.println("bir hata var\n(Hata):\n"+e.toString());
		}finally {  //sonunda kesinlikle calisir
			System.out.println("hata ayiklama bitti");
		}
		
	  
	  
	 
	 
	  
	  
		System.out.println("Program Bitti");

	}

}
