package employee.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for the central work place. 
 * It has multiple managers, and other employees. (using ArrayList).
 * @author Marcus
 *
 */
public class Workplace {
	
	private List<Manager> managers;
	private List<Employee> employees;
	private static int totalSalary; //total money spend in salaries.
	private static double overtimeSalary;  //total salary generated from overtime work.
	
	public static int calculateSalary(List<Manager> managers, List<Employee> employees) {
		int salarySum = 0;
		
		for (int i = 0; i < managers.size(); i++) {
			salarySum += managers.get(i).getSalary();
		}
		
		for (int i = 0; i < employees.size(); i++) {
			salarySum += employees.get(i).getSalary();
		}
		
		return salarySum;
	}
	
	public static double calculateOvertimeSalary(List<Employee> employees) {
		int overtimeSalary = 0;
		
		
		for (int i = 0; i < employees.size(); i++) {
			overtimeSalary += employees.get(i).getSalary() * 1.5 * employees.get(i).getOvertime();
		}
		
		
		return overtimeSalary;
	}
	
	/**
	 * new object for workplace.
	 * @param managers, list of managers in workplace
	 * @param employees, list of employees in workplace.
	 */
	public Workplace(List<Manager> managers, List<Employee> employees) {
		this.managers = managers;
		this.employees = employees;
		totalSalary= calculateSalary(managers, employees);
		overtimeSalary=calculateOvertimeSalary(employees);
	}
	
	/**
	 * 
	 * @return the list of managers in workplace.
	 */
	public List<Manager> getManagers() {
		return managers;
	}
	
	/**
	 * adds manager to the list of managers.
	 * @param manager the manager to be added.
	 */	
	public void addManager(Manager manager) {
		managers.add(manager);
	}
	
	/**
	 * 
	 * @return the list of employees.
	 */
	public List<Employee> getEmployees() {
		return employees;
	}
	
	/**
	 * adds employee to list of employees in workplace.
	 * @param employee.
	 */
	public void addEmployees(Employee employee) {
		employees.add(employee);
	}
	
	/**
	 * 
	 * @return the total salary being earned by all employees and managers.
	 */
	public int getTotalSalary() {
		return totalSalary;
	}
	
	/**
	 *  updates the total salary of all workers in the company using worker type, worker name and new worker salary.
	 *  it will not update the salary if the worker has not been added to the list, or the type is not manager or employee.
	 * @param type of worker (employee, or Manager)
	 * @param name of employee or manager
	 * @param newSalary of employee or manager.
	 */
	public void updateTotalSalary(String type, String name, int newSalary) {
		
		boolean completed = false;
		if (type == "employee" || type == "Employee") {
			for(int i = 0; i < employees.size(); i++) {
				if (employees.get(i).getName() == name ) {
					int salaryDifference = newSalary - employees.get(i).getSalary();
					employees.get(i).setSalary(newSalary);
					totalSalary += salaryDifference;
					completed = true;
				}
			}
		} else if (type == "manager" || type == "Manager") {
			for(int i = 0; i < managers.size(); i++) {
				if (managers.get(i).getName() == name ) {
					int salaryDifference = newSalary - managers.get(i).getSalary();
					managers.get(i).setSalary(newSalary);
					totalSalary += salaryDifference;
					completed = true;
				}
			}
		}else {
			System.out.println("Invalid worker type given. The total salary was not updated");
			completed = true;
		}
		
		if (completed == false) {
			System.out.println("Worker not found. The total salary was not updated.");
		}
}
	
	/**
	 * 
	 * @return salary earned in overtime work.
	 */
	public double getOvertimeSalary() {
		return overtimeSalary;
	}
	
	/**
	 * updates total overtime salary earned.
	 * @param overtimeSalary.
	 */
	public static void updateOvertime(Employee employee, int hours) {
		overtimeSalary += employee.getSalary() * 1.5 * hours;
		
	}
	
	
	

	
	
	
	
	
	
	

}
