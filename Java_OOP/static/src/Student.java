
public class Student {
	public String name;
	public int id;
	private static int counter=0;
	
	Student(String name,int id){
		this.name=name;
		this.id=id;
		Student.counter++;
	}
	public static void exit() {
		Student.counter--;
		
	}
	public static int sayi() {
		return Student.counter;
	}
	public static double ortalama(int []dizi) {
		return(dizi[0]+dizi[1])/2;
	}
}
