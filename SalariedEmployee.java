package pkgfinal.exam;

public class SalariedEmployee extends Employee{
    private double salary;

    public SalariedEmployee(double salary, String name, int num) {
        super(name, num);
        this.salary = salary;
    }

    @Override
    public double getPayAmount() {
        return salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + super.toString() + "salary=" + salary + '}';
    } 
}
