package Assignment_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PosNeg {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter a number");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		if(a<0)
		{
			System.out.println("Entered number is negative "+a);
		}
		else
		{
			System.out.println("Entered number is positive "+a);
		}
		

	}

}
