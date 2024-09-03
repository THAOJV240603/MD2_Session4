package Bt5;

import java.util.Scanner;

public class Student {
    //Định nghĩa trường
    private String studentID;
    private String studentName;
    private int age;
    private boolean gender;
    private String address;
    private String phone;

    //Constructor không tham số
    public Student() {
    }

    //Constructor đầy đủ tham số
    public Student(String studentID, String studentName, int age, boolean gender, String address, String phone) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    //Getter và Setter
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //Phương thức nhập thông tin của sinh viên
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        this.studentID = sc.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        this.studentName = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập giới tính: ");
        this.gender = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Nhập địa chỉ: ");
        this.address = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        this.phone = sc.nextLine();
        System.out.print("\n");
    }

    //Phương thức hiển thị thông tin của sinh viên
    public void displayData(){
        System.out.println("Thông tin của sinh viên:");
        System.out.println("Mã sinh viên: " + this.studentID);
        System.out.println("Họ và tên: " + this.studentName);
        System.out.println("Tuổi: " + this.age);
        System.out.println("Giới tính: " + (this.gender ? "Nam" : "Nữ"));
        System.out.println("Địa chỉ: " + this.address);
        System.out.println("Số điện thoại: " + this.phone);
    }
}
