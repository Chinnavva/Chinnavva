class Fan 
{
	int no_of_wings;
	String brand;
	String colour;
	int cost;
	void rotate()
	{
		System.out.println("fan is rotating in clockwise");
	}
	void blowsAir()
	{
		System.out.println("fan is blowing cool air");
	}
}
class FanApp
{
	public static void main(String[] args)
	{
		Fan f1=new Fan();
		Fan f2=new Fan();
		f1.rotate();
		f1.blowsAir();
		f2.rotate();
		f2.blowsAir();
		new Fan().blowsAir();
	}
}



