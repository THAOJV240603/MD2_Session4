import java.util.Scanner;

public class NhanVien {
    //Định nghĩa trường
    private String employeeId;
    private String employeeName;
    private int age;
    private boolean gen;
    private int rate;
    private int salary;

    //Constructor không tham số
    public NhanVien() {
    }

    //Constructor đầy đủ tham số
    public NhanVien(String employeeId, String employeeName, int age, boolean gen, int rate, int salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGen() {
        return gen;
    }

    public void setGen(boolean gen) {
        this.gen = gen;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //Phương thức nhập thông tin
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên: ");
        this.employeeId = sc.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        this.employeeName = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        this.age = sc.nextInt();
        System.out.print("Nhập giới tính: ");
        this.gen = sc.nextBoolean();
        System.out.print("Nhập hệ số lương: ");
        this.rate = sc.nextInt();
    }

    //Phương thức hiển thị thông tin
    public void outputData(){
        System.out.println("Thông tin của nhân viên: ");
        System.out.println("Mã nhân viên: " + this.employeeId);
        System.out.println("Tên nhân viên: " + this.employeeName);
        System.out.println("Năm sinh: " + (2024 - this.age));
        System.out.println("Giới tính: " + (this.gen ? "Nam":"Nữ"));
        System.out.println("Hệ số lương: " + this.rate);
    }

    //Phương thức tính lương
    public void calSalary(){
        salary = rate * 1300000;
        System.out.println("Lương: " + salary);
    }
}
