package HelloB12.java;

class outer
{
	void show()
	{
		System.out.println("Outer Class");
	}
class inner
{
	void display()
	{
		System.out.println("inner Class");
	}
}
}
	public class DemoStaticInner {

	public static void main(String[] args) {
		outer ob=new outer();
		ob.show();
		outer.inner obj=ob.new inner();
		obj.display();
		

	}

}
