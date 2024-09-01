import java.util.Scanner;

public class Circle {
    //Định nghĩa trường
    private float radius;
    private String color;

    //Constructor không tham số
    public Circle() {
    }

    //Constructor đầy đủ tham số
    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Phương thức nhập thông tin hình tròn
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính:");
        this.radius = sc.nextFloat();
        System.out.println("Nhập màu sắc:");
        this.color = sc.next();
    }

    //Phương thức hiển thị thông tin
    public void displayData(){
        System.out.println("Thông tin hình tròn: ");
        System.out.println("Bán kính: "+ this.radius);
        System.out.println("Màu sắc: "+ this.color);
    }

    //Phương thức trả về chu vi hình tròn
    public void chuvi(){
        float PI = 3.14f;
        float c = 2 * PI * radius;
        System.out.printf("Chu vi của hình tròn là: %.2f \n", c);
    }

    //Phương thức trả về diện tích hình tròn
    public void dientich(){
        float PI = 3.14f;
        float s = PI * radius * radius;
        System.out.printf("Diện tích của hình tròn là: %.2f", s);
    }
}
