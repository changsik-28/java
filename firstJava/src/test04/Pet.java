package test04;

public class Pet {
    private String type;
    private int age;
    static int count = 0;

    public Pet(String type, int age) {
        this.type = type;
        this.age = age;
    }
    static int getCount(){
        return count;
    }
    public void move(){
        System.out.println(this.type+"가 움직입니다");
    }
    public String getType(){
        return this.type;
    }
    public int getAge(){
        return this.age;
    }
}

