public class Student {
    private String studentName;
    private String studentCode;
    private int age;

    //Constructor không tham số
    public Student(){
    }

    //Constructor đầy đủ tham số
    public Student(String studentName, String studentCode, int age){
        this.studentName = studentName;
        this.studentCode = studentCode;
        this.age = age;
    }

    //Phương thức thì để public, thuộc tính thfi luôn luôn để private
    public void showInfor(){
        System.out.println("Thông tin sinh viên");
        System.out.println("Tên sinh viên: " + this.studentName);
        System.out.println("Mã sinh viên: " + this.studentCode);
        System.out.println("Tuổi: " + this.age);
    }

    //Phương thức setter
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    //Phương thức getter
    //Có trả về giá trị nên dùng String
    public String getStudentName(){
        return this.studentName;
    }
}
