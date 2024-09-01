public class PersonProgram {
    public static void main(String[] args) {
        Person person1 = new Person();

        //Gán giá trị cho đối tượng person
        person1.setName("Ngọc Mai");
        person1.setSex(false);
        person1.setAge(18);

        Person person2 = new Person("Lâm", true, 27);

        Person person3 = new Person("Kudou Shinichi",true, 17);

        //Truy cập lấy tên của đối tượng person2
        System.out.println("Tên là "+person2.getName());
        System.out.println("Giới tính là "+(person2.isSex() ? "Nam":"Nữ"));

        //Truy cập lấy tên của đối tượng person3
        System.out.println("Thám tử lừng danh tên là "+person3.getName());
        System.out.println("Giới tính: "+(person3.isSex() ? "Nam":"Nữ"));
        System.out.println("Tuổi: "+person3.getAge());
    }
}
