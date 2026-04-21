import java.util.ArrayList;

public class ProjectTeam {

    private String projectName;
    private ArrayList<Employee> employees;
    //Task 4 implementation

    public ProjectTeam(String projectName) {
        this.projectName = projectName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void printTeamMembers() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public double calculateTotalCost() {
        double total = 0;
        for (Employee e : employees) {
            total += e.getBaseSalary();
        }
        return total;
    }

    public Employee findById(String employeeId) {
        for (Employee e : employees) {
            if (e.getEmployeeId().equals(employeeId)) {
                return e;
            }
        }
        return null;
    }

    public void printDevelopers() {
        for (Employee e : employees) {
            if (e instanceof Developer) {
                System.out.println(e);
            }
        }
    }

    public void printAutomationTesters() {
        for (Employee e : employees) {
            if (e instanceof Tester) {
                System.out.println(e);
            }
        }
    }
}
