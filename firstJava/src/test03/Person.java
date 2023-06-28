package test03;

public class Person {
    String name;
    int age;
    public Person(){
        this("이름없음",1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person getPerson(){
        return this;
    }

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name);
        System.out.println(p.age);
        p.name="양창식";
        p.age=28;
        System.out.println(p.name);
        System.out.println(p.age);

        Person p2=new Person("유민정",20);
        System.out.println(p2.name);
        System.out.println(p2.age);

    }
}
