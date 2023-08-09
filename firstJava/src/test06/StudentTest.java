package test06;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(1001,"Lee");
        studentLee.addSubject("국어",100);
        studentLee.addSubject("수학",90);

        studentLee.showStudentInfo();

        System.out.println("====================================");

        Student studentKim = new Student(1002,"Kim");
        studentKim.addSubject("국어",100);
        studentKim.addSubject("수학",90);
        studentKim.addSubject("영어",80);

        studentKim.showStudentInfo();
    }
    //1.studentLee 학생의 국어점수는 100, 수학90
    //2.studentLee 의 정보출력
    //3.studentKim 학생의 국어점수는 100, 수학 90 , 영어 80
    //4.studentKim 의 정보 출력
}
