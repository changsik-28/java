package classpart;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee= new Student();
        Student studentYang = new Student();
        studentYang.studentName = "양창식";
        studentYang.address = "성남시 중원구";
        studentYang.showStudentInfo();
        studentLee.studentName = "이순신";
        studentLee.address = "강남구 논현동";
        studentLee.showStudentInfo();
    }
}
