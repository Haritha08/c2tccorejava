package Assignement_1;

public class ForWhileDoWhile_20 {

	public static void main(String[] args) {
		for(int i=1,j=1; i<10||j<10;i++,j++)
		  { 
			  j++;
			  System.out.println("i="+i+" and j="+j); 
		  }
			  int i=1,j=1;
			  while(i<10 || j<10)
			  { 
				  i++; j++;
			      System.out.println("i="+i+" and j="+j); 
			  }	
			do {
				i++;
				j++;
				System.out.println("i=" + i + " and j=" + j);
			    } while (i < 10 || j < 10);
		}
	}