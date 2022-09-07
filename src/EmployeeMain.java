
public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Tom", 12_000, 50, true);
		Employee employee2 = new Employee("Alex", 10_000, 40, true);
		Employee employee3 = new Employee("Mike", 12_500, 3, true);
		Employee employee4 = new Employee("John", 13_000);
		
		int totalWageEmp1 =  employee1.calculateWages(20);
		int totalWageEmp2 = employee2.calculateWages(30);
		int totalWageEmp3 = employee3.calculateWages();
		int totalWageEmp4 = employee4.calculateWages();
		
		System.out.println("Total Wage of " + employee1.name + " is ₹" + totalWageEmp1);
		System.out.println("Total Wage of " + employee2.name + " is ₹" + totalWageEmp2);
		System.out.println("Total Wage of " + employee3.name + " is ₹" + totalWageEmp3);
		System.out.println("Total Wage of " + employee4.name + " is ₹" + totalWageEmp4);
		
		return;
	}
	
}
