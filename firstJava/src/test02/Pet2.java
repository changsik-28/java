package test02;

public class Pet2 {
    public static void main(String[] args) {
        PetSet2 pet1 = new PetSet2();
        pet1.setType("강아지");
        pet1.setAge(8);

        PetSet2 pet2 = new PetSet2();
        pet2.setType("고양이");
        pet2.setAge(13);

        pet1.move();
        pet2.move();
        
        System.out.println(pet1.getType()+"는 "+ pet1.getAge()+"개월입니다");
        System.out.println(pet2.getType()+"는 "+ pet2.getAge()+"개월입니다");
    }
}
class PetSet2{
    private String type;
    private int age;

    public void move(){
        System.out.println(this.type+"가 움직입니다");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
