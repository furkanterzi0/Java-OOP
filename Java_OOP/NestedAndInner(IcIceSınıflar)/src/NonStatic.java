
public class NonStatic {
	private int a=10;
	
	public class Inner{
		int a=1;
		
		public void run() {
			System.out.println(a);//1
			System.out.println(this.a);//1
			System.out.println(NonStatic.this.a); // 10
		}
	}
	
	
	public void run() {
		System.out.println(a);
		System.out.println(this.a);
		Inner ı=new Inner();
		System.out.println(ı.a);
	}
}
