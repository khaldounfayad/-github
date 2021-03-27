package pkgfinal.exam;

public class CommissionEmployee extends SalariedEmployee implements Comparable<CommissionEmployee>{
    private double sales;
    private double rate;

    public CommissionEmployee(double sales, double rate, double salary, String name, int num) {
        super(salary, name, num);
        this.sales = sales;
        this.rate = rate;
    }

    @Override
    public double getPayAmount() {
        return super.getPayAmount() + (sales*rate);
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" + super.toString() + "sales=" + sales + ", rate=" + rate + '}';
    }
    
    @Override
    public int compareTo(CommissionEmployee o) {
        if (getPayAmount()>o.getPayAmount())
            return 1;
        else if (getPayAmount()<o.getPayAmount())
            return -1;
        else 
            return 0;
    }
}
