package test01;

public class PersonTest {
    public static  void main(String[] args) {
        Person 사람1=new Person();
        System.out.println(사람1);
        Person 사람2= new Person("김원빈",30);
        System.out.println(사람2.toString());
        System.out.println(사람2.getName());
        System.out.println(사람2.getAge());
        Person 사람3= new Person("양창식",28);
        System.out.println(사람3.toString());
        System.out.println(사람3.getName());
        System.out.println(사람3.getAge());

        Hero hero=new Hero("슈퍼맨");
        Hero hero2=new Hero("배트맨");
        hero.attack(hero2);
    }
}
