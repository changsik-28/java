package test05;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer = new DeskTop();
        computer.display();
        computer.turnOff();

        NoteBook myNote= new MyNoteBook();
        myNote.turnOff();
        DeskTop computer2 = new DeskTop();
        computer2.typing();
    }
}
