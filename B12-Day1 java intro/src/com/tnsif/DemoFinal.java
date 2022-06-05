package com.tnsif;

 class Final // BY using final we can't inherited the class
{
	 public void show() // By using final we can't override the method
	{
		System.out.println("With final");
	}
}
	public class DemoFinal extends Final{
	final public int i=19; // By using final we can't change the variable
	public void show()
	{
		System.out.println("Without final");
	}

	public static void main(String[] args) {
		DemoFinal ob=new DemoFinal();
        ob.show();
	}

	}
