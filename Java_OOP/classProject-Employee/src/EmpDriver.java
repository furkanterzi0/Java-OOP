
public class EmpDriver { // mevcut yil 2023

	public static void main(String[] args) {
		
		Empyolee emp1 = new Empyolee("Furkan",7450, 8, 2003);
		System.out.println("name: "+emp1.name+"\nsalary: "+emp1.salary+"\nwork hours: "+emp1.workHours+"\nhire date: "+emp1.hireYear);
		emp1.toString(emp1);
		System.out.println("-----------------------------------");
		/*
		Empyolee emp2 = new Empyolee("Furkan",7450, 8, 2003);
		emp1.toString(emp2);
		
		Empyolee emp3 = new Empyolee("Furkan",7450, 8, 2003);
		emp1.toString(emp3);
		*/
		

	}

}
