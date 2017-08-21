import java.util.Arrays;
import java.util.Comparator;

import org.apache.commons.lang3.builder.ToStringBuilder;

class Student implements Comparable<Student>
{
	Integer id;
	String name;
	Double cgpa;
	
	Student(Integer id,String name,Double cgpa)
	{
	    this.id=id;
	    this.name=name;
	    this.cgpa=cgpa;
	}
	@Override
	public String toString()
	{
		return "\ncgpa= "+cgpa+"\nname= "+name+"\ncgpa= "+cgpa;
	}
		
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.cgpa.compare(this.cgpa, o.cgpa);
	}
}

class SortByName implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
	
}

public class CompareableDemo {

	public static void main(String[] args) {
		Student s1=new Student(2,"Divyas",6.4);
		Student s2=new Student(1,"Divya",7.4);
		Student s3=new Student(5,"Div",8.4);
		Student s4=new Student(6,"Divyash",9.9);
		Student s11[]=new Student[]{s1,s2,s3,s4,new Student(0,"Ram",4.4)};
		Arrays.sort(s11);
		System.out.println(Arrays.toString(s11));
	
		Arrays.sort(s11,new SortByName());
		System.out.println(Arrays.toString(s11));
		
	}

}
