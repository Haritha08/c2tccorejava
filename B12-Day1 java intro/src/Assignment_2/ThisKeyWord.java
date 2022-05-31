package Assignment_2;

public class ThisKeyWord {
	int instVar;

	 ThisKeyWord(int instVar){
	        this.instVar = instVar;
	        System.out.println("this reference = " + this);
	    }

	public static void main(String[] args) {
		ThisKeyWord obj = new ThisKeyWord(8);
        System.out.println("object reference = " + obj);
    }

	}

