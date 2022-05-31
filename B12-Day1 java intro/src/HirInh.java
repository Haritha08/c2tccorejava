class Department
{
	int deptid;
	String deptname;
}
class CSE extends Department
{
	int totalintake=120;
}
class MCA extends Department
{
	int totalintake=60;
}
class IT extends Department
{
	int totalintake=60;
}
public class HirInh {

	public static void main(String[] args) {
		CSE obj=new CSE();
		MCA ob=new MCA();
		IT obj1=new IT();
		
		System.out.println(obj.deptid=10);
		System.out.println(obj.deptname="IT");
		System.out.println(obj.totalintake);
		

	}

}
