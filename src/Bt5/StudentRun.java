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
            System.out.println("======== MENU ========\n" + "1. Hiển thị danh sách tất cả sinh viên\n" +
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
                    for(Student student : list) {
                        student.displayData();
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Sai lựa chọn");
            }
        }while(true);

    }
}
