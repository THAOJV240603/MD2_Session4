package Bt3;

public class QuadraticEquation {
    //Định nghĩa trường
    private double a, b, c;

    //Constructor không tham số
    public QuadraticEquation() {
    }

    //Constructor đầy đủ tham số
    public QuadraticEquation(double a, double b, double c) {
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

    //Phương thức tính Delta
    public double getDiscriminant(){
        return b*b-4*a*c;
    }

    //Phương thức trả về nghiệm thứ nhất
    public double getRoot1(){
        if(this.getDiscriminant()<0) return 0;
        return ((-b+Math.sqrt(this.getDiscriminant()))/(2*a));
    }

    //Phương thức trả về nghiệm thứ 2
    public double getRoot2(){
        if(this.getDiscriminant()<0) return 0;
        return ((-b-Math.sqrt(this.getDiscriminant()))/(2*a));
    }
}
