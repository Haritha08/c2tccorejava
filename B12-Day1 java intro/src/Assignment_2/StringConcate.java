package Assignment_2;

public class StringConcate {

	public static void main(String[] args) {
		String first = "Java ";
	    System.out.println("First String: " + first);

	    // create second
	    String second = "Programming";
	    System.out.println("Second String: " + second);

	    // join two strings
	    String joinedString = first.concat(second);
	    System.out.println("Joined String: " + joinedString);

	}

}
