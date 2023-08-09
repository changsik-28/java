package object07_31;

class Student {
    int studentID;
    String name;

    public Student(int studentID, String name) {
        this.name = name;
        this.studentID = studentID;
    }
    public class EqualsTest {

        public static void main(String[] args) {
            Student studentLee = new Student(100,"이상원");
            Student studentLee2 = studentLee;
            Student studentSang = new Student(100,"이상원");

            System.out.println(studentLee);
            System.out.println(studentLee2);
            System.out.println(studentSang);
        }
    }
}
