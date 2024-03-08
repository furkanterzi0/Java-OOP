package erisimBelirleyiciler;

public class Car {

	private int enginePower,model;
	public int speed; //butun dosyalardan erisilebilir
	protected String color; // bu ve alt sınıflardan erisilebilir(kendine public)
	
	Car(){
	
		this.model=2022;
		this.enginePower=270;
		this.speed=140;
		this.color="black";
		
	}
	private  void print()
	{
		System.out.println(model);
	}
	
	protected void run()
	{
		print();
	}
	
	
}
