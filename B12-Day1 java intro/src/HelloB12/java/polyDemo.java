package HelloB12.java;

public class polyDemo {
	public void add(int x,int y)
	{
		System.out.println(x+y);
	}
	public void add(int x,int y,int z)
	{
		System.out.println(x+y+z);
	}
	public void add(int a,int x,int y,int z)
	{
		System.out.println(a+x+y+z);
	}

	public static void main(String[] args) {
		polyDemo obj=new polyDemo();
		obj.add(4, 10);
		obj.add(4,10,15);
		obj.add(4, 10, 15, 20);

	}

}
