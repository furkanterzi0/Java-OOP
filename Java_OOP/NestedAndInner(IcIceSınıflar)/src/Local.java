
public class Local {

	public void run() {

		class Yerel { // bu class yerel(local) class ve sadece run metodunun altında bu class'a
						// erisebilirim.
			int a;

			Yerel(int a) {
				this.a = a;
			}

			public void print() {
				System.out.println(a);
			}
		}
		Yerel y=new Yerel(10);
		y.print();
	}
}
