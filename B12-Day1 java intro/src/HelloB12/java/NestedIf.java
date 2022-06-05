package HelloB12.java;

public class NestedIf {

	public static void main(String[] args) {
		int x=3;
		if(x>0)
		{
			if(x>2)
			{
				System.out.println("The given number is positive and even");
			}
			else
			{
				System.out.println("The given number is positive and odd ");
			}
		}
		else
		{
			System.out.println("The given number is negative");
		}
		
	}

}
