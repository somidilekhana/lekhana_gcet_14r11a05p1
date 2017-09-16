import java.util.Date;
import java.util.Arrays;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation extends Student {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) throws IllegalArgumentException {
		// Add your implementation here
		try{
			if(students.length== NULL)
			{
				IllegalArgumentException e=new IllegalArgumentException();
				throw e;
			}
		}
		catch(IllegalArgumentException)
		{
			
		}
		
		
	}

	@Override
	public Student getStudent(int index) throws IllegalArgumentException {
		// Add your implementation here
		try{
			if(index<0 || index>students.length )
			{
				IllegalArgumentException e=new IllegalArgumentException();
				throw e;
			}
		}
		catch(IllegalArgumentException)
		{
			
		}
		return null;
	}

	@Override
	public void setStudent(Student student, int index) throws IllegalArgumentException {
		// Add your implementation here
		try
		{
			if(student==NULL||index<0 || index>students.length)
			{
				IllegalArgumentException e=new IllegalArgumentException();
				throw e;
			}
			else
			{
				int i=Arrays.binarySearch(students,student);
				Student temp=students[index];
				students[index]=students[i];
				students[i]=temp;
			}
		}
		catch(IllegalArgumentException)
		{
			
		}
	}

	@Override
	public void addFirst(Student student) throws IllegalArgumentException {
		// Add your implementation here
		try
		{
			if(student==NULL)
			{
				IllegalArgumentException e=new IllegalArgumentException();
				throw e;
			}
			else
			{
				int l=students.length;
				Student temp[]=new Student[l];
				students[0]=student;
				for(int i=1;i<l;i++)
				{
					students[i]=temp[i-1];
				}
			}
		}
		catch(IllegalArgumentException)
		{
			
		}
	}

	@Override
	public void addLast(Student student) throws IllegalArgumentException {
		// Add your implementation here
		try
		{
			if(student==NULL)
			{
				IllegalArgumentException e=new IllegalArgumentException();
				throw e;
			}
			else
			{
				int l=students.length;
				students[l+1]=student;
			}
		}
		catch(IllegalArgumentException)
		{
			
		}
	}

	@Override
	public void add(Student student, int index) throws IllegalArgumentException {
		// Add your implementation here
		try
		{
			if(student==NULL||index<0 || index>students.length)
			{
				IllegalArgumentException e=new IllegalArgumentException();
				throw e;
			}
			else
			{
				students[index]=student;
			}
		}
		catch(IllegalArgumentException)
		{
			
		}
	}

	@Override
	public void remove(int index) throws IllegalArgumentException {
		// Add your implementation here
		try
		{
			if(index<0 || index>students.length)
			{
				IllegalArgumentException e=new IllegalArgumentException();
				throw e;
			}
			else
			{


			}
		}
		catch(IllegalArgumentException)
		{
		}
	}

	@Override
	public void remove(Student student) throws IllegalArgumentException {
		// Add your implementation here
		try
		{
			if(student==NULL)
			{
				IllegalArgumentException e=new IllegalArgumentException();
				throw e;
			}
		}
		catch(IllegalArgumentException)
		{
		}
		try
		{
			int l=students.length;
				List list=new ArrayList(Arrays.asList(students));
				list.remove(student);
				Arrays.fill(students,NULL);
				Student[] temp=list.toArray();
				for(int i=0;i<temp.length;i++)
				{
				students[i]=temp[i];
				}
				if(l!=students.length)
				{
					IllegalArgumentException e=new IllegalArgumentException();
					throw e;
				}
		}
		catch(IllegalArgumentException)
		{
			System.out.println("Student not exist");
		}
	}

	@Override
	public void removeFromIndex(int index) throws IllegalArgumentException {
		// Add your implementation here
		try
		{
			if(index<0 || index>students.length)
			{
				IllegalArgumentException e=new IllegalArgumentException();
				throw e;
			}
			else
			{
				int l=students.length;
				Student[] temp= new Student[l];
				for(int i=0;i<l;i++)
				{
					temp[i]=students[i];
				}
				Arrays.fill(students,NULL);
				for(int i=0;i<=index;i++)
				{
					students[i]=temp[i];
				}
			}
		}
		catch(IllegalArgumentException)
		{
		}
	}

	@Override
	public void removeFromElement(Student student) throws IllegalArgumentException {
		// Add your implementation here
		try
		{
			if(student==NULL)
			{
				IllegalArgumentException e=new IllegalArgumentException();
				throw e;
			}
			else
			{
				int i=Arrays.binarySearch(students,student);
				List list=new ArrayList(Arrays.asList(students));
				for(int l=i+1;l<students.length;l++)
				{
				list.remove(l);
				}
				Arrays.fill(students,NULL);
				Student[] temp=list.toArray();
				for(int i=0;i<temp.length;i++)
				{
				students[i]=temp[i];
				}
			}
		}
		catch(IllegalArgumentException)
		{
		}
	}

	@Override
	public void removeToIndex(int index) throws IllegalArgumentException {
		// Add your implementation here
		try
		{
			if(index<0 || index>students.length)
			{
				IllegalArgumentException e=new IllegalArgumentException();
				throw e;
			}
			else
			{
				List list=new ArrayList(Arrays.asList(students));
				for(int l=0;l<index;l++)
				{
				list.remove(l);
				}
				Arrays.fill(students,NULL);
				Student[] temp=list.toArray();
				for(int i=0;i<temp.length;i++)
				{
				students[i]=temp[i];
				}
			}
		}
		catch(IllegalArgumentException)
		{
		}
	}

	@Override
	public void removeToElement(Student student) throws IllegalArgumentException {
		// Add your implementation here
		if(student==NULL)
		{
			IllegalArgumentException e=new IllegalArgumentException();
			throw e;
		}
		else
		{
			int l=Arrays.binarySearch(students,student);
			List list=new ArrayList(Arrays.asList(students));
			for(int i=0;i<l;i++)
			{
				list.remove(l);
			}
			Arrays.fill(students,NULL);
			Student[] temp=list.toArray();
			for(int i=0;i<temp.length;i++)
			{
			students[i]=temp[i];
			}
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}