package HelloB12.java;

public class StudentDemo {
	public int max(int x,int y)
	{
		if(x>y)
			return x;
		else
			return y;
	}

	public static void main(String[] args) {
		StudentDemo s=new StudentDemo();
		int a =s.max(20,30);
		System.out.println("The number is "+a);
	}

}
