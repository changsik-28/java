package abstractex07_28;

public class DeskTop extends Computer{
    @Override
    public void display() {
        System.out.println("데스크탑 디스플레이어");
    }

    @Override
    public void typing() {
        System.out.println("데스크탑 타이핑");
    }

    @Override
    public void turnon() {
        System.out.println("데스크탑에서 전원을 켰다.");
    }
}
