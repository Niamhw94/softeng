package CSIT.bct;

import java.util.ArrayList;

import org.joda.time.*;

public class Module {

	private String ModuleName;
	private int ID;
	private ArrayList<Student> SList;
	
	public Module (String mName, int id, ArrayList<Student> Slist)
	{
	
	ModuleName = mName;
	ID=id;
	SList = Slist;
	}
		
	
	public String getModule ()
    {
  	  
  	  return ModuleName;
  	  
    }
	
	public int getID ()
	
	{
	
	return ID;
	
    }
	
	public ArrayList<Student> StudentList()
	
	{
	
	return SList;
	
    }
	
	public String toString() {
		return ModuleName;
	}
}
