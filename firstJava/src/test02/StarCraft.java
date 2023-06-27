package test02;

import java.util.Timer;
import java.util.TimerTask;

public class StarCraft {
    public static void main(String[] args) throws InterruptedException {
        Teran marin1= new Teran("마린");
        Teran medic1= new Teran("메딕");
        marin1.attack("저그");
        marin1.attack("프로토스");
        medic1.cure("마린");
        marin1.defend("저그");
        marin1.defend("저그");
        SCV scv1 = new SCV();
        scv1.run();

        Timer 돈캐기 = new Timer();
        돈캐기.scheduleAtFixedRate(scv1,1000,3000);
        Thread.sleep(5000);

        System.out.println("광물에 돈이 떨어짐...");
        돈캐기.cancel();

        Marin marin2= new Marin();
        marin2.run();

        Timer 정찰하기 = new Timer();
        정찰하기.scheduleAtFixedRate(marin2,1000,3000);

    }
}
class Teran{
    private String 유닛;
    private int 생명치=2;
    private int 레벨 = 1;
    public Teran(){
    }

    public Teran(String 유닛) {
        this.유닛 = 유닛;
        System.out.println(유닛 + "이 생성되었다");
    }

    public void attack(String 적유닛) {
        System.out.println(유닛 + "이 "+적유닛 + "를 공격한다.");
        레벨 = 레벨+1;
        if(레벨>=3){
            System.out.println(유닛 + "이 스팀팩을 장착했습니다.");
        }
    }

    public void cure(String 유닛) {
        생명치 +=1;
        System.out.println("매딕이 " + 유닛+ "을 치료했습니다.");
    }

    public void defend(String 저그) {
        System.out.println(저그+"가 "+유닛+"을 공격했습니다");
        생명치 -= 1;
        if(생명치 ==0) System.out.println(유닛+"이 죽었습니다.");
    }
}

class SCV extends TimerTask {
    @Override
    public void run() {
        System.out.println("광물을 케고 있습니다.");
    }
}

class Marin extends TimerTask {
    @Override
    public void run() {
        System.out.println("정찰을 나갑니다");
    }
}

