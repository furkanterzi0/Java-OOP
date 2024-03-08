import java.util.*;

public class LinkedHMap {

	public static void main(String[] args) {
		LinkedHashMap ogr=new LinkedHashMap();
		
		ogr.put("ali", 80);
		ogr.put("veli", 90);
		ogr.put("mehmet", 50);
		
		Set set=ogr.entrySet();
		
		Iterator i=set.iterator();
		
		while(i.hasNext()) {
			Map.Entry item=(Map.Entry) i.next();
			System.out.println(item.getKey()+" -> "+item.getValue());
		}
	
	}
}
