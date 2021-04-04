
public class GiaiPhuongTrinhBacHai {
    double a;
    double b;
    double c;
    public GiaiPhuongTrinhBacHai(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double delta(){
    return (this.b*this.b)-(4*this.a*this.c);
    }
    public double nghiemkep(){
        return ((-this.b)/(2*a));
    }
    public double nghiemx1(){
        return ((-this.b - Math.sqrt(this.delta()))/(2*this.a));
    }
    public double nghiemx2(){
        return ((-this.b + Math.sqrt(this.delta()))/(2*this.a));
    }
}

