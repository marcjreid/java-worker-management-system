package employee.management.system;

/**
 * This class keeps tracks of information regarding Managers.
 * It records the Manager's name, id, salary.
 * @author Marcus
 *
 */

	public class Manager {
		private int id;
		private String name;
		private int salary; // the hourly salary of the employee or manager.



/**
 * 
 * @param id, id number for a Manager.
 * @param name, Manager's name.
 * @param salary, manager's salary.
 */

	public Manager(int id, String name, int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

/**
 * 
 * @return manager name.
 */
	public String getName() {
		return name;
	}

/**
 * 
 * @return the Manager id.
 */
	public int getId() {
		return id;
	}

/**
 * 
 * @return Manager salary.
 */
	public int getSalary() {
		return salary;
	}

/**
 * 
 * @param sets salary when Managers receives raise or pay cut.
 */
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
	public String toString() {
		return "The Manager name is: " + name + "\n" 
				+ "They're salary is: $" + salary + "\n";
	}


}
