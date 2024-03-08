
public class Empyolee {
	 String name;
	 double salary;
	 int workHours;
	 int hireYear;
	 double bonus;
	 double tax;
	
	public Empyolee(String name,double salary,int workHours,int hireYear) {
		this.name=name;
		this.salary =salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
	}
	public double tax()
	{
		if(salary<=1000)
			return 0;
		else
			return (salary*0.03);
	}
	public double bonus()
	{
		double extraHours = (workHours*7)-40;
		if(extraHours>0)
			return extraHours*30;
		else
			return 0.0;
	}
	public double RaiseSalary()
	{
		double workYear=2023-hireYear;
		if(workYear>=20)
			return salary+salary*0.15;
		else if(workYear<20 && workYear>=10)
			return salary+salary*0.10;
		else
			return salary+salary*0.05;
	}
	
	public void toString(Empyolee emp1) {
		System.out.println("tax: "+emp1.tax());
		System.out.println("bonus: "+emp1.bonus());
		System.out.println("raise salary: "+emp1.RaiseSalary());
		
		
	}
}
