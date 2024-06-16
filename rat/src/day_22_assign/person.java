package day_22_assign;

import java.util.Scanner;

public class person {
    private String name;
    private int age;
    private String gender;
    private address address;

    public person(String name, int age, String gender, address address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public address getAddress() {
        return address;
    }

    public void setAddress(address address) {
        this.address = address;
    }

   

    public void printPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address.getCity() + ", " + address.getState() + ", " + address.getPincode());
    }

  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();

        System.out.print("Enter city: ");
        String city = scanner.nextLine();

        System.out.print("Enter state: ");
        String state = scanner.nextLine();

        System.out.print("Enter pincode: ");
        String pincode = scanner.nextLine();

        address address = new address(city, state, pincode);
        person person = new person(name, age, gender, address);

        person.printPerson();
        scanner.close();
    }
}

