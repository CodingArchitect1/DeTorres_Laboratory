
public class Salesperson extends Employees {

    private double commissionPercetage;

    public Salesperson(String name, double salary, int age, double commissionPercetage) {
        super(name, age, salary);
        this.commissionPercetage = commissionPercetage;
    }

    public double getCommisionPercentage() {
        return this.commissionPercetage;
    }

    public void raiseCommission() {
        if (this.commissionPercetage < .30) {
            this.commissionPercetage = this.commissionPercetage * 1.2;

        }
    }
}
