package payroll;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Ruwan Bandara", "EMP001", 45000));
        employees.add(new Developer("Kasun Perera", "DEV001", 80000, "Java", 5000));
        employees.add(new Intern("Nadeesha Silva", "INT001", 30000, 2000));
        employees.add(new Manager("Dilshan Fernando", "MGR001", 120000, 8, 10000));
        employees.add(new SeniorManager("Amara Jayasuriya", "SMG001", 150000, 15, 20000, 25000));

        for (Employee employee : employees) {
            employee.displayInfo();
            System.out.println("----------------------------------");
        }
    }
}