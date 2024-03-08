package stringClass;


public class Program {

	public static void main(String[] args) {
		//char []str= {'F','U','R','K','A','N'};
		//String metin=new String(str); 
		//System.out.println(metin);
		
		
		String metin="Furkan";
		String metin2=" Terzi";
		System.out.println(metin.length());
		System.out.println(metin.concat(metin2));
		System.out.println(metin.indexOf('a'));
		System.out.println(metin.charAt(3));
		System.out.println(metin.contains("kan"));
		System.out.println(metin.endsWith("rkan"));
		System.out.println(metin.toUpperCase());
		
		
	}

}
