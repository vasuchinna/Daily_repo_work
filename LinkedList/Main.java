package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LinkedList<Employee> employees = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter Employee ID: ");
			int id = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Enter Employee Name: ");
			String name = scanner.nextLine();
			employees.add(new Employee(id, name));
		}

		System.out.println("Employees List: ");
		for (Employee emp : employees) {
			System.out.println(emp);
		}

		System.out.print("Enter Employee ID to remove: ");
		int removeId = scanner.nextInt();

		Employee toRemove = null;
		for (Employee emp : employees) {
			if (emp.getId() == removeId) {
				toRemove = emp;
				break;
			}
		}

		if (toRemove != null) {
			employees.remove(toRemove);
			System.out.println("Employee removed succesfully");
		} else {
			System.out.println("Employee not found.");
		}

		System.out.println("Updated Employees List: ");
		for (Employee emp : employees) {
			System.out.println(emp);
		}

		scanner.close();
	}

}
