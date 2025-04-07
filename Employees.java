
public class Employees {

    private String name;
    private int age;
    protected double salary;

    public Employees(String names, int ages, double salary) {

        this.name = names;
        this.age = ages;
        this.salary = salary;

    }

    //Behaviors 
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;

    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary() {
        this.salary *= 1.2;
    }

    public static void main(String[] args) {
        Employees emp = new Employees("Dave V. Besorio", 19, 600000);
        System.out.println("\n");
        System.out.println(">>>>>Salary:<<<<<");
        System.out.println("\n");
        System.out.println("name: " + emp.getName());
        System.out.println("Age: " + emp.age);
        System.out.println("Salary: " + emp.salary);

        emp.raiseSalary();
        System.out.println("New salary raise after raise: " + emp.getSalary());
    }

}
