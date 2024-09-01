package Bt3;

import java.util.Scanner;

public class QuadraticEquationRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.print("Nhập a = ");
        a = sc.nextDouble();
        System.out.print("Nhâp b = ");
        b = sc.nextDouble();
        System.out.print("Nhập c = ");
        c = sc.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        if(equation.getDiscriminant() < 0){
            System.out.println("Phương trình vô nghiệm");
        }else if(equation.getDiscriminant() == 0){
            System.out.println("Phương trình có nghiệm kép x1 = x2 = " + equation.getRoot1());
        }else{
            System.out.println("Phương trình có 2 nghiệm riêng biệt:");
            System.out.printf("Delta = %.2f \n", equation.getDiscriminant());
            System.out.printf("x1 = %.2f \n", equation.getRoot1());
            System.out.printf("x2 = %.2f", equation.getRoot2());
        }
    }
}
