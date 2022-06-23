import java.util.Iterator;
import java.util.PriorityQueue;


class Student implements Comparable<Student>
{
	private int rank;
	private String name;
	public Student(String name,int rank) {
		super();
		this.rank = rank;
		this.name = name;
	}
	public int compareTo(Student st)
	{
		if(rank<st.rank)
		return -1;
		else if(rank>st.rank)
			return 1;
		return 0;
	}
	public String toString()
	{
		String result="Student name:" +name+ ",Student rank" +rank;
		return result;
	}
	
}


public class Demopriorityqueue {

	public static void main(String[] args) {
		PriorityQueue<Student> pq=new PriorityQueue<>();
		pq.add(new Student("a",5));
		pq.add(new Student("c",1));
		pq.add(new Student("d",3));
		pq.add(new Student("b",2));
		pq.add(new Student("e",4));
		
		Iterator<Student> it=pq.iterator();
		while(it.hasNext())
		{
			System.out.println("The items in queue: "+pq.poll().toString());	
		}
		

	}

}
