
public class Employee {
	
	static int totalEmployees = 0;
	
	String name;
	int baseSalary;
	int hourlyRates;
	boolean isApplicableForOvertime;
	
	
	Employee(String name, int baseSalary, int hourlyRates, boolean isApplicableForOvertime){
		
		
		setName(name);
		setBaseSalary(baseSalary);
		setHourlyRates(hourlyRates);
		
		this.isApplicableForOvertime = isApplicableForOvertime;
		
		totalEmployees++;
		
		System.out.println("Total Number of Employees currently are: " + totalEmployees);
		
	}
	
	Employee(String name, int baseSalary){
		this(name, baseSalary, 0, false);
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(int baseSalary) {
		
		if(baseSalary <= 0) {
			throw new IllegalStateException("base salary should be greater than 0");
		}
		
		this.baseSalary = baseSalary;
	}


	public int getHourlyRates() {
		return hourlyRates;
	}


	public void setHourlyRates(int hourlyRates) {
		
		if(hourlyRates < 0) {
			throw new IllegalStateException("hourly rates should not be negative");
		}
		this.hourlyRates = hourlyRates;
	}


	int calculateWages() {
		
		if(this.isApplicableForOvertime) {
			throw new IllegalStateException("please enter extra hours worked by employee, as employee is eligible for over time work");
		}
		
		return this.baseSalary;
	}
	
	int calculateWages(int numberOfExtraHoursWorked) {
		
		int totalWage = 0;
		
		totalWage += this.baseSalary;
		
		if(this.isApplicableForOvertime) {
			totalWage += numberOfExtraHoursWorked * this.hourlyRates;
		}
		
		return totalWage;
	}
}
