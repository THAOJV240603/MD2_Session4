package Bt4;

public class Fan {
    //Định nghĩa trường
    //Khai báo hằng final
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    //Trường speed có kiểu số nguyên (private int) để xác định tốc độ quạt, mặc định là SLOW
    private int speed = 1;
    //Trường on có kiểu private boolean để xác định quạt đang bật hay tắt, mặc định là false (tắt)
    private boolean on = false;
    //Trường radius có kiểu private double để xác định bán kính quạt, giá trị mặc định là 5
    private double radius = 5;
    //Trường color có kiểu dữ liệu private String để xác định màu quạt, mặc định là blue
    private String color = "blue";

    //Constructor không tham số
    public Fan() {
    }

    //Constructor đầy đủ tham số
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    //Các getter và setter cho các thuộc tính
    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Phương thức trả về chuỗi chứa thông tin của quạt
    public String toString() {
        String trangthai = "";
        if (this.isOn()) {
            trangthai += ("Quạt đang chạy \n");
            trangthai += ("Tốc độ: " + this.getSpeed() + " km/h \n");
        }else{
            trangthai += ("Quạt đang tắt \n");
        }
        trangthai += ("Màu sắc: " + this.getColor() + "\n");
        trangthai += ("Bán kính quạt: " + this.getRadius());
        return trangthai;
    }
}
