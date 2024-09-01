package Bt4;

public class FanRun {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, 10, "Màu vàng");
        Fan fan2 = new Fan(2, false, 5, "Màu xanh");

        //Hiển thị các đối tượng
        System.out.println(fan1.toString() + "\n");
        System.out.println(fan2.toString());
    }
}
