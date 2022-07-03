package com.tnsif.lambda;

@FunctionalInterface
interface shape
{
	void draw();
}

public class Demo2Lambda {

	public static void main(String[] args)
	{
		shape circle=()->System.out.println("This is a draw method for circle");
		shape rect=()->System.out.println("This is a draw method for rectangle ");
		shape triangle=()->System.out.println("This is a draw method for triangle ");


		circle.draw();
		rect.draw();
		triangle.draw();

	}

}
