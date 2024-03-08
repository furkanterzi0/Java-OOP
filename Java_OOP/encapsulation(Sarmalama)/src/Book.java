
public class Book {
	private String name,author,publisher;
	private int numberOfPage;
	
	Book(String name,String author,String publisher,int numberOfPage){
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		if(numberOfPage < 1)
			this.numberOfPage=1;
		else 
			this.numberOfPage=numberOfPage;
	}
	
	public int getNumberOfPager() {
		return this.numberOfPage;
	}
	public void setNumberOfPage(int a) {
		if(a<1)
		{
			System.out.println("sayfa sayisi 1'den kucuk olamaz");
			this.numberOfPage=1;
		}
			
		else
			this.numberOfPage= a;
	}
	
	public String getName() {
		return this.name;
	}

	public String getAuthor() {
		return author;
	}

	
	
}

