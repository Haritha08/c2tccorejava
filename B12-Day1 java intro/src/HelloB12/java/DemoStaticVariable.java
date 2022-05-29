package HelloB12.java;

public class DemoStaticVariable {
	int SId;
	String SName;
	static String CollegeName;
	
	public static void main(String[] args) {
		DemoStaticVariable ob=new DemoStaticVariable();
		ob.SId=10;
		ob.SName="Jolly";
		DemoStaticVariable.CollegeName="VIIT";
		System.out.println(CollegeName);
	}
}



