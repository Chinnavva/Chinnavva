class Employee
{
	int ssn;
	String name;
	String gender;
	int montlySalary;
	void eat()
	{
		System.out.println("Employee is eating food");
	}
	void sleep()
	{
		System.out.println("Employee is sleeping");
	}
	void employeeWork()
	{
		System.out.println("Employee is working");
	}
}
class EmployeeApp

{
	public static void main(String[] args)
	{
		Employee neela=new Employee();
		neela.eat();
		neela.sleep();
		neela.employeeWork();
		neela.ssn=174;
		neela.name="Neela";
		neela.gender="Female";
		neela.montlySalary= 90000;
		System.out.println(neela.ssn);
		System.out.println(neela.name);
		System.out.println(neela.gender);
		System.out.println(neela.montlySalary);
	}
}











