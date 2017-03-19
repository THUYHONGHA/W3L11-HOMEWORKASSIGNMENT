package problem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {
	
	/**
		Returns a list of Employees whose social security number is on the input list socSecNums
		and whose salary is > 80000. The list must be ordered by social security number,
		from lowest to highest. To sort, you must use a Collections sorting method
		and you must define your own Comparator to be used to compare Employees by ssn. 
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//IMPLEMENT
		List<Employee> e= new ArrayList<Employee>();
		for(String ssn: socSecNums){
			if(ssn!=null){
				if(table.get(ssn)!=null){
					if(table.get(ssn).getSalary()>80000)
						e.add(table.get(ssn));
				}				
			}			
		}
		//can also use this way
	/*	for(String a: table.keySet()){
			if(table.get(a)!=null){
				if(table.get(a).getSalary()>80000)
					e.add(table.get(a));
			}
		}*/
		Collections.sort(e, new Employee());
		return e;
		
	}
	
	 
	
	
}
