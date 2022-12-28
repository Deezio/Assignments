package Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student() {}
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", cgpa=" + cgpa + "]";
	}
}




class Sort implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getCgpa()-o2.getCgpa()!=0)
		{
			return Double.compare(o2.getCgpa(),o1.getCgpa());
		}
		else if(o2.getFname().compareTo(o1.getFname())>0) {
			return o1.getFname().compareTo(o2.getFname());
		}
		else
			return (o1.getId()-o2.getId());
	}
	
}



public class Sorting {
	public static void main(String args[])
	{
		ArrayList<Student> a=new ArrayList<>();
		a.add(new Student(1,"rumpa",3.81));
		a.add(new Student(2,"aashia",3.6));
		a.add(new Student(3,"samisha",3.6));
		a.add(new Student(4,"samara",3.84));
		a.add(new Student(5,"samara",3.6));
		a.add(new Student(6,"fahim",8.9));
		Collections.sort(a,new Sort());
		
		Iterator<Student> i=a.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next());
			System.out.println();
		}
		
	}
}

