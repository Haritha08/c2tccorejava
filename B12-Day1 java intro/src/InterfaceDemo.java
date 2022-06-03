
interface A
{
   void display(); //abstract public void display();
}
interface B
{
	void display1();
}
	public class InterfaceDemo implements A,B{
		public void display()
		{
			System.out.println("In interface A");
		}
		public void display1()
		{
			System.out.println("In interface B");
		}

	public static void main(String[] args) {
		InterfaceDemo obj=new InterfaceDemo();
		obj.display();
		obj.display1();


	}

}
