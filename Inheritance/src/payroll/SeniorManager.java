package payroll;

public class SeniorManager extends Manager {

    private double stockOptions;

    public SeniorManager(String name, String employeeId, double baseSalary,
                         int teamSize, double leadershipBonus, double stockOptions) {
        super(name, employeeId, baseSalary, teamSize, leadershipBonus);
        this.stockOptions = stockOptions;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + stockOptions;
    }

    @Override
    public String getRole() {
        return "Senior Manager (Team of " + teamSize + ")";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Stock Options : $%.2f%n", stockOptions);
    }
}