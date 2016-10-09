package CSIT.bct;

import org.joda.time.*;

public class Student {

      private String fname;
      private String sname;
      private String DOB;
      private int Age;
      public int id;
      public String username; 
      private LocalDate lod;
      
      public Student (int sid, String ffname, String ssname, String pDOB, int age)
   
      { 
    	  fname = ffname;
    	  sname = ssname;
    	  DOB = pDOB;
    	  id = sid;
    	  Age = age;
    	  setUSername();
      }
      
  
      
      public String getFirstname ()
      {
    	  
    	  return fname;
    	  
      }
      
      public String getSurname ()
      {
    	  
    	  return sname;
    	  
      }
      
      public int getID ()
      {
    	  
    	  return id;
    	  
      }
      
      public String DateOB ()
      {
    	  
    	  return DOB;
    	  
      }
      
      public void setUSername ()
      
      {
    	  username = fname+Age;
      }
      
      public String getUsername ()
      
      {
    	  return username;
      }
      
     public String toString() {
    	 return ""+id;
     }
}


      
     



