package pkgfinal.exam;

public class MainProgram {

    public static void main(String[] args) {
       Employee [] m = new Employee[3];
       m[0] = new SalariedEmployee(2000, "Khaldoun", 2020190046);
       m[1] = new CommissionEmployee(200, 0.30, 2000, "Osama", 2020190044);
       m[2] = new CommissionEmployee(300, 0.30, 2000, "Jad", 2020190034);
       
       System.out.println("The number of employees is: " + Employee.getCount());
       for(int i=0; i<m.length; i++){
           System.out.println(m[i].getPayAmount());
           System.out.println(m[i].toString());
       }
       
        int c = ((CommissionEmployee)m[1]).compareTo((CommissionEmployee)m[2]);
        if (c==1) System.out.println(m[1].getName() + " has the bigger payment");
        else if (c==-1) System.out.println(m[2].getName() + " has the bigger payment");
        else System.out.println("Both have the same payment");
    }
}
