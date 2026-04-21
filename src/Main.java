public class Main {
    public static void main(String[] args) {

        Employee e1 = new Developer("E101", "Anna", "May", 12000, "Java", 4);
        Employee e2 = new Tester("E201", "Peter", "Fox", 9800, true, 25);

        System.out.println(e1.introduceYourself());
        System.out.println(e2.introduceYourself());

        System.out.println(e1.calculateMonthlyCost());
        System.out.println(e2.calculateMonthlyCost());

        if (e1 instanceof Developer) {
            Developer dev = (Developer) e1;
            dev.printTechnologies();
        }
    }
}
