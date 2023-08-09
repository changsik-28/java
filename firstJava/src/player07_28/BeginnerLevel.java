package player07_28;

public class BeginnerLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("천천히 달립니다");
    }

    @Override
    public void jump() {
        System.out.println("Jump를 할줄 몰릅니다");
    }

    @Override
    public void turn() {
        System.out.println("Turn을 할줄 몰릅니다");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("****초보자 레벨입니다*****");
    }
}
