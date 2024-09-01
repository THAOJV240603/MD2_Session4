public class Cat {
    //Định nghĩa trường | thuộc tính
    public String catName;
    public String color;
    public String type;
    public float weight;
    public boolean sex;

    //Constructor không tham số
    public Cat(){

    }

    //Constructor đầy đủ các tham số
    public Cat(String catName, String color, String type, float weight, boolean sex){
        this.catName = catName;
        this.color = color;
        this.type = type;
        this.weight = weight;
        this.sex = sex;
    }

    //Phương thức ăn
    //void: không trả về kiểu dữ liệu
    public void eat(){
        System.out.println(this.catName + " đang ăn");
    }

    //getter, setter

}
