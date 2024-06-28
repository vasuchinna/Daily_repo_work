package Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<Car> cars = new HashSet<>();
		Scanner scanner = new Scanner(System.in);

		
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter Car Name: ");
			String name = scanner.nextLine();
			System.out.print("Enter Car Number: ");
			String number = scanner.nextLine();
			Car car = new Car(name, number);

			if (!cars.add(car)) {
				System.out.println("Duplicate car entry is not allowed.");
			} else {
				System.out.println("Car added: " + car);
			}
		}

		
		System.out.println("Cars List: ");
		for (Car car : cars) {
			System.out.println(car);
		}

		
		System.out.print("Enter Car Name to find: ");
		String findName = scanner.nextLine();
		System.out.print("Enter Car Number to find: ");
		String findNumber = scanner.nextLine();

		Car toFind = new Car(findName, findNumber);
		if (cars.contains(toFind)) {
			System.out.println("Car found...!!!");
		} else {
			System.out.println("Car not found.");
		}

		scanner.close();
	}
}
