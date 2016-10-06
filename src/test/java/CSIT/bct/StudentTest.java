package CSIT.bct;

import junit.framework.TestCase;

public class StudentTest extends TestCase {

	
	public Student students;  
	

	   // assigning the values
	   protected void setUp(){
	     
		   students = new Student ( 13492098, "Niamh", "Walsh", "11-01-94", 22 );
	   }

	   // test method to add two values
	   public void testAdd(){
	      String result = "Niamh22";
	      assertTrue(result.equals(students.getUsername()));
	 
	   }
	}

