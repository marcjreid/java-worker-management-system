package employee.management.system;

import java.util.ArrayList;
import java.util.List;


// Simple code examples that show the functionality of the workplace management system
// Specifically its ability to add managers and employees and change their attributes.
// text user interface to be added later.

public class Main {
	public static void main(String[] args) {
		Manager Lisa = new Manager(1, "Lisa", 19);
		Manager Tiffany = new Manager(2, "Tiffany", 24);
		Manager Thomas = new Manager(3, "Thomas", 22);
		
		Employee Sarah = new Employee(1, "Sarah", 15);
		Employee Robert = new Employee(2, "Robert", 17);
		Employee Bailey = new Employee(3, "Bailey", 15);
		
		List<Manager> managerList = new ArrayList<>();
		List<Employee> employeeList = new ArrayList<>();
		
		
		
		
		managerList.add(Lisa);
		managerList.add(Tiffany);
		managerList.add(Thomas);
		employeeList.add(Sarah);
		employeeList.add(Robert);
		employeeList.add(Bailey);
		
		Workplace Metco = new Workplace(managerList, employeeList);
		
		Sarah.updateOvertime(12);
		
		System.out.println("Metco gives a total salary of $" + Metco.getTotalSalary());
		System.out.println("Metco employees have total Overtime salary of $" + Metco.getOvertimeSalary());
		
		System.out.println("------Making The Company PAY SALARY------");
		
		Metco.updateTotalSalary("Employee","Jack", 17);
		System.out.println("Metco gives a total salary of $" + Metco.getTotalSalary());
		System.out.println(Sarah);
		
		
	}

}
