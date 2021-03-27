package pkgfinal.exam;

public class SSN {
    private int num;

    public SSN(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (!(obj instanceof SSN)) return false;
        SSN s = (SSN) obj;
        return getNum()==s.getNum();
        }
}
