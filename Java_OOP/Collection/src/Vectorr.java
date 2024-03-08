import java.util.*;
public class Vectorr {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		//Vector v=new Vector(4); kapasiteyi gectikce  4 4 artar
		v.add("armut");
		v.add("kiraz");
		v.add("cilek");
		v.add("kavun");
		v.add("karpuz");
		
		System.out.println("boyut: "+v.size());
		System.out.println("kapasite"+v.capacity()); //ekledikce artar
		
		System.out.println(v.firstElement());
	}

}
