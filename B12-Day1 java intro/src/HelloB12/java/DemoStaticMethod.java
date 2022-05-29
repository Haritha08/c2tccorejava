package HelloB12.java;

public class DemoStaticMethod {
	int SId;
	String SName;
	static String CName;
	public static void show()
	{
		System.out.println(CName);
		
	}
	public static void main(String[] args) {
		DemoStaticMethod ob=new DemoStaticMethod();
		ob.SId=10;
		ob.SName="jolly";
		System.out.println(ob.SId);
		System.out.println(ob.SName);
		DemoStaticMethod.CName="VIIT";
		DemoStaticMethod.show();
	}

}
