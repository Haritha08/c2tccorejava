package HelloB12.java;

public class DemoConArgs {
	int num;
	public DemoConArgs()
	{
		num=7;
	}
	public DemoConArgs(int n)
	{
		num=n;
	}

	public static void main(String[] args) {
		DemoConArgs obj=new DemoConArgs(8);
		System.out.println("The value of num "+obj.num);
	}

}
