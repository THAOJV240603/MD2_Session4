public class Program {
    public static void main(String[] args) {
        //Khởi tạo đối tượng cat1 từ Class Cat
        Cat cat1 = new Cat();

        //Khởi tạo đối tượng cat2 từ Class Cat
        Cat cat2 = new Cat("Tom", "Xám", "Mèo hoạt hình", 20, true);

        //Truy cập vào thuộc tính và phương thức của đối tượng
        //objectName.property || objectName.methodName()

        //Truy cập và gán giá trị cho thuộc tính catName của đối tượng cat1
        cat1.catName = "Mèo Mướp";
        cat1.color = "Xám trắng";
        cat1.weight = 3;
        cat1.type = "Mèo Ta";
        cat1.sex = false;

        //Truy cập vào phương thức ăn của đối tượng cat1
        cat1.eat();

        //Truy cập vào phương thức ăn của đối tượng cat2
        cat2.eat();
    }
}
