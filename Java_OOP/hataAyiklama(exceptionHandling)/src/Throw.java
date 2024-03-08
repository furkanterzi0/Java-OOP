
public class Throw {

	public static void main(String[] args) {
		int a=0;
		if(a==0){
			System.out.println("Bolen 0'a esit olamaz ! ");
			throw new ArithmeticException("exception ! "); // throw= atmak
		}
			
		
		System.out.println("kodun devami");

	}

}
