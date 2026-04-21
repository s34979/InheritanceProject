public class Tester extends Employee {

    private boolean automationTester;
    private int scenarioCount;

    public Tester(String employeeId, String firstName, String lastName, double baseSalary,
                  boolean automationTester, int scenarioCount) {

        super(employeeId, firstName, lastName, baseSalary);
        this.automationTester = automationTester;
        this.scenarioCount = scenarioCount;
    }

    @Override
    public double calculateMonthlyCost() {
        return getBaseSalary() + (scenarioCount * 50);
    }

    @Override
    public String introduceYourself() {
        return super.introduceYourself() + " I am a Tester";
    }
}
