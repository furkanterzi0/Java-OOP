
public class Main {

	public static void main(String[] args) {
		Book b1=new Book("Icimizdeki Seytan","Sabahattin Ali", "tanımsız", 200);
		
		
		
		System.out.println(b1.getNumberOfPager());
		
		b1.setNumberOfPage(-13);
		
		System.out.println(b1.getNumberOfPager());
		
		System.out.println(b1.getName());
		System.out.println(b1.getAuthor());
	}

}
