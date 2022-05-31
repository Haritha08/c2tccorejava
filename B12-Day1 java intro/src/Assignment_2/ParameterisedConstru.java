package Assignment_2;

public class ParameterisedConstru {
	String languages;

	  // constructor accepting single value
	 ParameterisedConstru(String lang) {
	    languages = lang;
	    System.out.println(languages + " Programming Language");
	  }

	public static void main(String[] args) {
		ParameterisedConstru obj1 = new ParameterisedConstru("Java");
		ParameterisedConstru obj2 = new ParameterisedConstru("Python");
		ParameterisedConstru obj3 = new ParameterisedConstru("C");

	}

}
