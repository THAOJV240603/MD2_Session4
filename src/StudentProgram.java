public class StudentProgram {
    public static void main(String[] args) {
        //Khởi tạo đối tượng sinh viên sv1
        Student student1 = new Student();

        student1.setStudentName("Đức Mai");
        student1.showInfor();

        //Khởi tạo đối tượng sinh viên sv2 thông qua Constructor có tham số
        Student student2 = new Student("Ngọc Mai", "B001", 18);
        System.out.println("Tên của đối tượng student2 là "+student2.getStudentName());
        student2.showInfor();
    }
}
