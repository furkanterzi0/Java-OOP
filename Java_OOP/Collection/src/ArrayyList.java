import java.util.*;

public class ArrayyList {
	// liste icinde surekli arama yapılacak iste linkedlist yerine arraylist kullanılmalı
	// arraylistin hızı = o(1)  linkedlistin hızı = o(n)    arraylist daha hizli
	// silme isleminde isi olay ve hizlar tam tersi linkedlist kullanilmali
	
	public static void main(String[] args) {
		ArrayList country=new ArrayList();
		country.add("ankara");
		country.add("kastamonu");
		country.add("izmir");
		country.add("istanbul");
		
		
		country.add(1, "manisa"); //icindekini silmiyo sırasini alıyo     icidekini silip yeni bir sey atamak icin country.set
		country.remove(4);
		
		Iterator itr=country.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		         //veya
		//country.forEach(i -> System.out.println(i+" "));
		
		
	}

}
