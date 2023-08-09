package cooperation;

public class StudentTest {
    public static void main(String[] args) {
        Bus bus = new Bus(8190);
        Bus bus1 = new Bus(7200);
        Texi texi = new Texi("잘간다 운수");

        Student student = new Student("양창식",5000);
        Student student1 = new Student("유민정",100000);

        Subway subway = new Subway(2);

        student.takeBus(bus);
        student.takeBus(bus1);

        bus.showInfo();
        bus1.showInfo();

        student.takeSubway(subway);
        student1.takeSubway(subway);

        subway.showInfo();

        student.showInfo();
        student1.showInfo();

        student1.takeTexi(texi);
        texi.showTexi();
        student1.showInfo();

    }
}
