package payroll;

public class Manager extends Employee {

    protected int teamSize;
    protected double leadershipBonus;

    public Manager(String name, String employeeId, double baseSalary,
                   int teamSize, double leadershipBonus) {
        super(name, employeeId, baseSalary);
        this.teamSize = teamSize;
        this.leadershipBonus = leadershipBonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + leadershipBonus;
    }

    @Override
    public String getRole() {
        return "Manager";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Team Size     : " + teamSize);
        System.out.printf("Leadership Bonus : $%.2f%n", leadershipBonus);
    }
}