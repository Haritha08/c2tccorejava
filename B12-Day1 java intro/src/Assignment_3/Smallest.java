package Assignment_3;

import java.util.Scanner;

public class Smallest {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x,y,z;
		System.out.println("Please enter 3 values");
		x=s.nextInt();
		y=s.nextInt();
		z=s.nextInt();
		if(x<y&&x<z)
		{
			System.out.println("x is smallest "+x);
			
		}
		else if(y<x&&y<z)
		{
			System.out.println("y is smallest "+y);
			
		}
		else
		{
			System.out.println("z is smallest "+z);
		}
	}

}
