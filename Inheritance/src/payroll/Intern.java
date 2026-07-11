package payroll;

public class Intern extends Employee {

    private double stipendDeduction;

    public Intern(String name, String employeeId, double baseSalary, double stipendDeduction) {
        super(name, employeeId, baseSalary);
        this.stipendDeduction = stipendDeduction;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() - stipendDeduction;
    }

    @Override
    public String getRole() {
        return "Intern";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Deduction     : $%.2f%n", stipendDeduction);
    }
}