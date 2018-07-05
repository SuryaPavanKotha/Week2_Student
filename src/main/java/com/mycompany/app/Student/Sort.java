/**
 * @author SURYA PAVAN KOTHA
 * This class contains different classes that implements Comparable interface and so that sorting can be done
 */
package com.mycompany.app.Student;

import java.util.Collections;
import java.util.Comparator;


	class SortbyIdNo  implements Comparator<Student> 
	{
		// Used for sorting in ascending order of IdNo
	    public int compare(Student a, Student b)
	    {
	        return a.getIdNo() - b.getIdNo();
	    }
	}
	class SortbyFName implements Comparator<Student>
	{
	    // Used for sorting in ascending order of Fname
	    public int compare(Student a, Student b)
	    {
	        return a.getFName().compareTo(b.getFName());
	    }
	}
	class SortbyLName implements Comparator<Student>
	{
	    // Used for sorting in ascending order of Lname
	    public int compare(Student a, Student b)
	    {
	        return a.getLName().compareTo(b.getLName());
	    }
	}
	class SortbyBranch implements Comparator<Student>
	{
	    // Used for sorting in ascending order of Lname
	    public int compare(Student a, Student b)
	    {
	        return a.getBranch().compareTo(b.getBranch());
	    }
	}
	class SortbyYear implements Comparator<Student>
	{
	    // Used for sorting in ascending order of IdNo
	    public int compare(Student a, Student b)
	    {
	        return a.getYear() - b.getYear();
	    }
	}
	
	

