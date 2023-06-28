class Patient
{
	int id;
	String name;
	String disease;
	int phno;
	String address;





	void eat()
	{
		System.out.println("Patient is eating fruits");
	}
	void sleep()
	{
		System.out.println("Patient is sleeping");
	}
	void admit()
	{
		System.out.println("Patient got admitted");
	}
	void getTreatment()
	{
		System.out.println("Patient treatment given by doctor");
	}
	void discharge()
	{
		System.out.println("Patient is getting discharged");
	}
}
class HospitalApp
{
	public static void main(String[] args)
	{
		Patient p1=new Patient();
		p1.eat();
		p1.sleep();
		p1.admit();
		p1.getTreatment();
		p1.discharge();
		p1.id=108;
		p1.name="Kashi";
		p1.name="Kashi";
		p1.disease="Fever";
		p1.phno=98989;
		p1.address="Bangalore";
		System.out.println(p1.id);
		System.out.println(p1.name);
		System.out.println(p1.disease);
		System.out.println(p1.phno);
		System.out.println(p1.address);
	Patient p2=new Patient();
	p2.eat();
	p2.sleep();
	p2.admit();
	p2.getTreatment();
	p2.discharge();
	p2.id=109;
	p2.name="mounesh";
	p2.disease="Asthma";
	p2.phno=969696;
	p2.address="Mudhol";
	System.out.println(p2.id);
	System.out.println(p2.name);
	System.out.println(p2.disease);
	System.out.println(p2.phno);
	System.out.println(p2.address);
	}
}









