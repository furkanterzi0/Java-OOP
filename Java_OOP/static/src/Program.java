
public class Program {

	public static void main(String[] args) {
		Student furkan= new Student("furkan", 17158);
		Student mehmet= new Student("mehmet", 123);
		
		System.out.println(Student.sayi());
		Student.exit();
		System.out.println(Student.sayi());
		
		int []dizi= new int[2];
		dizi[0]=furkan.id;
		dizi[1]=mehmet.id;
		
		System.out.println(Student.ortalama(dizi));
	}

}
