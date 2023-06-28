package test03;

public class Teacher {
    String name;
    int money;

    public Teacher(String name, int money) {
        this.name = name;
        this.money = money;
    }
    public void takeBus(Bus bus){
        bus.take(1000);
        this.money-=1000;
    }
    public void takeSubway(Subway subway){
        subway.take(1200);
        this.money-=1200;
    }

    public void showInfo() {
        System.out.println(name+"님의 남은돈은 "+money+"원 입니다");
    }
}


