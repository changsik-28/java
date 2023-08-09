package classpart;

public class PersonTest {
    public static void main(String[] args) {
        Person personKim = new Person();
        personKim.name = "김유신";
        personKim.height = 180;
        personKim.weight = 85.5F;

        personKim.showPersonInfo();

        Person personLee = new Person("이순신",175,75);
        personLee.showPersonInfo();
    }
}
