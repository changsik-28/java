package test04;

public class StudentTest {
    public static void main(String[] args) {
        Student kim = new Student(1011,"김가나");
        Student Lee = new Student(1012,"이지금");

        kim.addSubject("국어",100);
        kim.addSubject("수학",80);

        Lee.addSubject("국어",100);
        Lee.addSubject("수학",80);
        Lee.addSubject("영어",80);

        kim.showStudentInfo();
        System.out.println("-----------------------------");
        Lee.showStudentInfo();
    }
}
