import com.tnsif.myInterface;

interface A1
{
	void display();
}
interface B1 extends A1
{
	int i=10;
	public static final int b=10;
	public void display();
	void print();
}
class c
{
	
}
public class InterfaceDemo1 extends c implements A1,B1,myInterface {
	public void show()
	{
		System.out.println("This is my interface");
	}
	public void display()
	{
		
	}
	public void print()
	{
		
	}
	public void display1()
	{
		System.out.println("In interface B");
	}

	public static void main(String[] args) {
		InterfaceDemo1 obj=new InterfaceDemo1();
		obj.display();
		obj.display1();
		obj.show();
		
		System.out.println(i);

	}

}
