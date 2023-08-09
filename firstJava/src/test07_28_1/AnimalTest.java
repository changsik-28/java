package test07_28_1;

class Animal{
    public void move(){
        System.out.println("동물이 움직입니다");
    }
}

class Human extends Animal{
    public void move(){
        System.out.println("사람이 두발로 걷습니다.");
    }
    public void readBook(){
        System.out.println("사람이 책을 읽습니다");
    }
}

class Tiger extends Animal{
    public void move(){
        System.out.println("호랑이가 네발로 뜁니다.");
    }
    public void hunding(){
        System.out.println("호랑이가 사냥을 합니다");
    }
}

class Eagle extends Animal{
    public void move(){
        System.out.println("독수리가 하늘을 납니다.");
    }
    public void flying(){
        System.out.println("하늘을 날아갑니다");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.moveAnimal(new Tiger());
        test.moveAnimal(new Human());
        test.moveAnimal(new Eagle());
        test.moveAnimal(new Animal());

    }
    public void moveAnimal(Animal animal){
        animal.move();
        if(animal instanceof Human){
            Human human = (Human)animal;//명시적 형변환, 하위클래스의 형(Human) 으로 변환
            human.readBook();
        }else if(animal instanceof  Tiger){
            Tiger tiger = (Tiger)animal;
            tiger.hunding();
        }else if(animal instanceof Eagle){
            Eagle eagle = (Eagle)animal;
            eagle.flying();
        }
    }
}
