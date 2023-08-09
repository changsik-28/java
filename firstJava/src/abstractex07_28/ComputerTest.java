package abstractex07_28;


public class ComputerTest {
    public static void main(String[] args) {
        //추상 클래스는 모든 메서드가 구현되지 않으면 인스턴스를 생성할 수 없다.
//        Computer c1 = new Computer();
        Computer c2= new DeskTop();
//        Computer c3 = new NoteBook();
        Computer c4 = new MyNoteBook();

        c2.display();
        c4.display();
        c4.typing();
    }
}
