package employee.management.system;

public class Employee{
	
	private int id;
	private String name;
	private int vacationDays; // number of paid days off the employee has remaining.
	private int salary; // the hourly salary of the employee or manager in USD.
	private int overtime; // number of hours after end of shift the employee has worked.
	
	// employees by default start with the same overtime hours and vacation days.
	public Employee(int id, String name, int salary) {
		this.overtime=0; 
		this.vacationDays=14; 
		this.salary=salary;
		this.id=id;
		this.name=name;
		
	}
	
	//Not going to alter employee name or id. 
	// Salary is set initially can be altered later.
	// overtime and vacation days have default values and will need to be updated. 
	
	/**
	 *  called when overtime hours are earned.
	 * @param overtime,  amount of overtime hours employee has.
	 */
	public void updateOvertime(int hoursEarned) {
		this.overtime=overtime+hoursEarned;
		Workplace.updateOvertime(this, this.overtime);
	}
	
	/**
	 *  called when vacation days are used.
	 * @param vacationDays, the amount of vacation days employee has remaining.
	 */
	public void updateVacationDays(int Days) {
		this.vacationDays=vacationDays-Days;
	}
	
	/**
	 * called when overtime hours are lost at the end of the week. resets OT to 0 hours.
	 */
	public void refreshOvertime() {
		this.overtime = 0;
	}
	
	/**
	 * called at the end of the year when vacation days are reset. (Vacation days are not cumulative)
	 */
	public void refreshVacationDays() {
		this.vacationDays=14;
	}
	
	/**
	 * called when employee receives a raise or pay cut. adjusts their salary.
	 * @param salary, new salary the employee will be making.
	 */
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
	/**
	 * 
	 * @return id of employee.
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * 
	 * @return name of employee.
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return vacation days.
	 */
	public int getVacationDays() {
		return vacationDays;
	}

	/**
	 * @return salary.
	 */
	public int getSalary() {
		return salary;
	}
	
	/**
	 * 
	 * @return overtime hours.
	 */
	public int getOvertime() {
		return overtime;
	}
	
	/**
	 * overtime salary is calculated as time and a half times salary.
	 * @return the earned overtime salary of an employee 
	 */
	public double getOvertimeSalary() {
		return salary*1.5*overtime;
	}
	
	public String toString() {
		return "The Employee name is: " + name + "\n" 
				+ "They're salary is: $" + salary + "\n"
				+ "They're overtime hours worked are: " + overtime + "\n"
				+ "They're vacation days remaining are: " + vacationDays;
	}

}


