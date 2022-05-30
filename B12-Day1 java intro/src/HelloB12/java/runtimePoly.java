package HelloB12.java;
class runpoly
{
	public void show()
	{
		System.out.println("THis is parent class");
	}
}
public class runtimePoly extends runpoly {
	public void show()
	{
		System.out.println("THis is small class");
		super.show();
	}

	public static void main(String[] args) {
		runtimePoly obj=new runtimePoly();
		obj.show();
	}

}
