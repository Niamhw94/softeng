package CSIT.bct;

import java.util.ArrayList;

import org.joda.time.*;

public class Course {
	
	private String CourseName;
	private LocalDate SDate;
	private LocalDate EDate;
	private ArrayList<Module> MList;
	
	
	public Course (String cName, LocalDate sdate, LocalDate edate, ArrayList<Module> mlist)
	{
		
		CourseName= cName;
		SDate = sdate;
		EDate = edate;
		MList = mlist;
		
	}
	
	public String getCourseName()
	
	{
		return CourseName;
	}
	
	public LocalDate getStartDate ()
	{
		return SDate;
	}
	
	
	public LocalDate getEndDate ()
	{
		return EDate;
	}
	
	
	public ArrayList<Module> getModuleList ()
	{
		return MList;
	}

}


	

