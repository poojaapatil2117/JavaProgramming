package Interface;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

class Student
{
	private String nm;
	private double StuPer;
	
	public Student(String nm,double StuPer)
	{
		this.nm = nm;
		this.StuPer=StuPer;
	}
	
	public String Getnm()
	{
		return nm;
	}
	
	public double GetPer()
	{
		return StuPer;
	}
	
	public String toString()
	{
		return "[Name : "+nm+ ":- Percentage : "+StuPer+"]";
	}
}
public class PriorityExampleOnStuPer {

	public static void main(String[] args) {
		
			Queue<Student> prq = new PriorityQueue<>(new StudentPer());
			
			prq.add(new Student("Rohit",98.18));
			prq.add(new Student("virat",88.45));
			prq.add(new Student("Shubhaman",79.76));
			prq.add(new Student("Dinesh",78.44));
			prq.add(new Student("Rishab",95.41));
			
			System.out.println("Original Array : "+prq);
	}
}
class StudentPer implements Comparator<Student>
{
	public int compare(Student s1, Student s2) {
		return Double.compare(s1.GetPer(), s2.GetPer());
	}
}
