package Bt5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRun {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        //In Menu
        do{
            System.out.println("\n======== MENU ========\n" + "1. Hiển thị danh sách tất cả sinh viên\n" +
                    "2. Thêm mới sinh viên\n" +
                    "3. Sửa thông tin sinh viên dựa vào mã sinh viên\n" +
                    "4. Xóa sinh viên dựa vào mã sinh viên\n" +
                    "5. Thoát");
            System.out.println("Mời bạn chọn 1 -> 5");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    //Hiển thị danh sách sinh viên
                    System.out.println("------ Danh sách sinh viên ------");
                    System.out.printf("%-10s %-20s %-10s %-15s %-20s %-20s\n", "MSSV", "Họ và tên", "Tuổi", "Giới tính", "Địa chỉ", "Số điện thoại");
                    for(Student student : list) {
                        student.displayData();
                    }
                    break;
                case 2:
                    //Thêm mới sinh viên
                    System.out.println("Nhập số lượng sinh viên muốn thêm: ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        //Khởi tạo đối tượng sinh viên
                        Student student = new Student();
                        System.out.println("Sinh viên thứ " + (i + 1)+": ");

                        //Gọi phương thức nhập thông tin sv
                        student.inputData();

                        //add student vào list
                        list.add(student);
                    }
                    break;
                case 3:
                    break;
                case 4:
                    //Xóa sv dựa vào mã sv

                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Sai lựa chọn");
            }
        }while(true);

    }
}
