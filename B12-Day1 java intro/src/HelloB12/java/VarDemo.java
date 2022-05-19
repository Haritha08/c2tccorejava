package HelloB12.java;

public class VarDemo {
	int a=10; //instance variable
	int b=20;
	int c=a+b;
    static int e=40;//static variable
	public static void main(String[] args) 
	{
		int d=30; //local variable
	  VarDemo obj=new VarDemo();
      System.out.println("The sum is"+obj.c);
      System.out.println(d);
      System.out.println(VarDemo.e);
	}

}
