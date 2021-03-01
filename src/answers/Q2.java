package answers;

class Member{
	String name;
	int age;
	String phone_number;
	String address; 
	double salary;
	
	void printSalary() {
		System.out.println("Salary: "+this.salary);
	}
}

class Employee extends Member{
	String specialization;
}

class Manager extends Member{
	String department;
}

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		Manager manager = new Manager();
		
		employee.name = "Maxwell";
		employee.age = 30;
		employee.phone_number = "+233 245678999";
		employee.address = "AD-456, New Street";
		employee.salary = 25600.56;
		
		manager.name = "Isaac";
		manager.age = 39;
		manager.phone_number = "+233 345657794";
		manager.address = "HY-456, Yellow Street";
		manager.salary = 45000.99;
		
		System.out.println("Employee's Info: ");
		System.out.println("Name: "+employee.name);
		System.out.println("Age: "+employee.age);
		System.out.println("Phone Number: "+employee.phone_number);
		System.out.println("Address: "+employee.address);
		System.out.println("Salary: "+employee.salary);
		
		System.out.println();
		System.out.println();
		System.out.println("Manager's Info: ");
		System.out.println("Name: "+manager.name);
		System.out.println("Age: "+manager.age);
		System.out.println("Phone Number: "+manager.phone_number);
		System.out.println("Address: "+manager.address);
		System.out.println("Salary: "+manager.salary);

	}

}
