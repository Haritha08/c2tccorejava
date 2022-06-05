package Assignment_3;
import java.util.*;

public class DaysMonths {

	public static void main(String[] args) {
		System.out.println("Enter a month name");
		Scanner s=new Scanner(System.in);
		String i=s.nextLine();
		switch(i)
		{
			case "Jan":
				System.out.println("31");
				break;
			case "Feb":
				System.out.println("29");
				break;
			case "Mar":
				System.out.println("31");
				break;
			case "Apr":
				System.out.println("30");
				break;
			case "May":
				System.out.println("31");
				break;
			case "Jun":
				System.out.println("30");
				break;
			case "Jul":
				System.out.println("31");
				break;
			case "Aug":
				System.out.println("31");
				break;
			case "Sep":
				System.out.println("30");
				break;
			case "Oct":
				System.out.println("31");
				break;
			case "Nov":
				System.out.println("30");
				break;
			case "Dec":
				System.out.println("31");
				break;
			default:
				System.out.println("Invalid");
			
				
		}
		
		

	}

}
