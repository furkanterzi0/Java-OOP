import java.util.*;
public class LinkeddList {
	// liste icinde surekli arama yapılacak iste linkedlist yerine arraylist kullanılmalı
	// arraylistin hızı = o(1)  linkedlistin hızı = o(n)    arraylist daha hizli
	// silme isleminde isi olay ve hizlar tam tersi linkedlist kullanilmali
	
	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		list.add("armut");
		list.add("cilek");
		list.add("kavun");
		
		
		list.add(1,"karpuz");
		list.set(1, "muz");
		
		list.forEach(i->System.out.println(i+" "));
	}

}
