import java.util.Scanner;

public class StudentBTVN {
    //Định nghĩa trường
    private String studentCode;
    private String studentName;
    private int age;
    private boolean sex;
    private float markHTML;
    private float markJavaScript;
    private float markJava;

    //Constructor không tham số
    public StudentBTVN() {
    }

    //Constructor đầy đủ tham số

    public StudentBTVN(String studentCode, String studentName, int age, boolean sex, float markHTML, float markJavaScript, float markJava) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.markHTML = markHTML;
        this.markJavaScript = markJavaScript;
        this.markJava = markJava;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
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

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public float getMarkHTML() {
        return markHTML;
    }

    public void setMarkHTML(float markHTML) {
        this.markHTML = markHTML;
    }

    public float getMarkJavaScript() {
        return markJavaScript;
    }

    public void setMarkJavaScript(float markJavaScript) {
        this.markJavaScript = markJavaScript;
    }

    public float getMarkJava() {
        return markJava;
    }

    public void setMarkJava(float markJava) {
        this.markJava = markJava;
    }

    //Phương thức nhập thông tin sinh viên
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        this.studentCode = sc.nextLine();
        System.out.println("Nhập tên sinh viên: ");
        this.studentName = sc.nextLine();
        System.out.println("Nhập tuổi sinh viên: ");
        this.age = sc.nextInt();
        System.out.println("Nhập giới tính: ");
        this.sex = sc.nextBoolean();
        System.out.println("Nhập điểm HTML: ");
        this.markHTML = sc.nextFloat();
        System.out.println("Nhập điểm JavaScript: ");
        this.markJavaScript = sc.nextFloat();
        System.out.println("Nhập điểm Java: ");
        this.markJava = sc.nextFloat();
    }

    //Phương thức hiển thị thông tin
    public void displayData(){
        System.out.println("Thông tin sinh viên: ");
        System.out.println("Mã sinh viên: " + this.studentCode);
        System.out.println("Tên sinh viên: " + this.studentName);
        System.out.println("Năm sinh: " + (2024 - this.age));
        System.out.println("Giới tính: " + (this.sex ? "Nam" : "Nữ"));
        System.out.println("Điểm HTML: " + this.markHTML);
        System.out.println("Điểm JavaScript: " + this.markJavaScript);
        System.out.println("Điểm Java: " + this.markJava);
    }

    //Phương thức xét tốt nghiệp của sinh viên
    //biết TB = (markHTML + markJavaScript + markJava)/3
    //Nếu TB > 8 in ra kết quả là Giỏi
    //Nếu TB >7 in ra kết quả là Khá
    //Nếu TB >5 in ra kết quả là TB
    //Nếu TB<5 in ra Chưa qua
    public void xetTN(){
        Float TB = (markHTML + markJava + markJavaScript)/3;
        if(TB > 8){
            System.out.println("Tốt nghiệp loại Giỏi");
        }else if(TB > 7){
            System.out.println("Tốt nghiệp loại Khá");
        }else if(TB > 5){
            System.out.println("Tốt nghiệp loại Trung bình");
        }else if(TB < 5){
            System.out.println("Chưa được tốt nghiệp");
        }
    }
}
