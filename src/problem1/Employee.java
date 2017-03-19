package problem1;

import java.util.Comparator;

//DO NOT MODIFY IN ANY WAY
public class Employee implements Comparator<Employee>{
	private String name;
	private int salary;
	private String ssn;
	public Employee(String name, int salary, String ssn) {
		this.name = name;
		this.salary = salary;
		this.ssn=ssn;
	}
	public Employee(){}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override 
	public String toString() { //DO NOT MODIFY
		return "(" + ssn + ": " + name + ", " + salary + ")" ;
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Employee)) return false;
		Employee e = (Employee)ob;
		return e.ssn.equals(ssn);
	}
	
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getSsn().compareToIgnoreCase(o2.getSsn())>0)
			return 1;
		if(o1.getSsn().compareToIgnoreCase(o2.getSsn())<0)
			return -1;
		return 0;
	}
	 		
}
