package HelloB12.java;

abstract class animal
{
	abstract void noise();
	public void eat()
	{
		System.out.println("Every animal eats");
	}
}

public class Abs extends animal {
	public void noise()
	{
	  System.out.println("The dog barks");
	}
	public static void main(String[] args) {
		Abs obj=new Abs();
		obj.eat();
		obj.noise();

	}

}
