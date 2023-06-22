package test01;

public class Hero extends Person {

    public Hero(String name) {
        this.setName(name);
    }


    public void attack(Hero hero2) {
        System.out.println(hero2.getName()+"이 "+this.getName()+"을 공격하였습니다.");
    }
}
