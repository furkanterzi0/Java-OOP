import java.util.*;
public class HashMapp {

	public static void main(String[] args) {
		// clear() icindekilerin hepsini siler
		// get(object key) anahtara karsılık gelen objeyi dondurur
		// put(object key,object value) anahtar-deger ikilisini kayıt eder
		HashMap b=new HashMap();
		
		b.put("tr", "turkiye");
		b.put("abd", "Amerika Birleşik Devletleri");
		b.put("alm", "almanya");
		
		Set s=b.entrySet();
		Iterator i= s.iterator();
		
		while(i.hasNext()) {
			Map.Entry item= (Map.Entry) i.next();
			System.out.println(item.getKey()+"->"+item.getValue());
		}
		

	}

}
