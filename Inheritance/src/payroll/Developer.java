package payroll;

public class Developer extends Employee {

    private String programmingLanguage;
    private double projectBonus;

    public Developer(String name, String employeeId, double baseSalary,
                     String programmingLanguage, double projectBonus) {
        super(name, employeeId, baseSalary);
        this.programmingLanguage = programmingLanguage;
        this.projectBonus = projectBonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + projectBonus;
    }

    @Override
    public String getRole() {
        return "Developer (" + programmingLanguage + ")";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Project Bonus : $%.2f%n", projectBonus);
    }
}