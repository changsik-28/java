package test04;

public class PetTest {
    public static void main(String[] args) {
        Pet pet1= new Pet("강아지",8);
        Pet pet2= new Pet("고양이",13);
        pet1.move();
        pet2.move();

        System.out.println(pet1.getType() + "는 " + pet1.getAge() +"개월입니다.");
        System.out.println(pet2.getType() + "는 " + pet2.getAge() +"개월입니다.");

    }
}
