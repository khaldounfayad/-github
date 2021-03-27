package pkgfinal.exam;

public abstract class Employee implements Payable{
    private String name;
    private SSN ssnum;
    private static int count;

    public Employee(String name, int num) {
        this.name = name;
        ssnum = new SSN(num);
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SSN getSsnum() {
        return ssnum;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", ssnum=" + ssnum.getNum() + '}';
    }
}
