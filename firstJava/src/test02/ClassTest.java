package test02;

public class ClassTest {
    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println(s1.studentId);
        int studentId = s1.studentId;
        Order o1=new Order();
        System.out.println(o1.orderDate);
        Student s2=new Student(10,"원빈",100,1);
        Student s3=new Student(10,"창식");
        s3.showStudentInfo();
        System.out.println(s2.toString());
        //s1,s2,s3 -> 인스턴스 변스

    }
}//ClassTest end

class Student {

    int studentId=100;
    String studentName;
    int majorCode;
    int grade;

    public Student(int studentId, String studentName, int majorCode, int grade){
        this.studentId= studentId;
        this.studentName = studentName;
        this.majorCode = majorCode;
        this.grade = grade;
        System.out.println("매개변수가 있는 생성자 호출됨");
    }
    //매소드 오버로딩 - 함수명은 같은데 매개변수가 다른메소드
    public Student(int studentId, String studentName){
        this.studentId= studentId;
        this.studentName = studentName;
        this.majorCode = majorCode;
        this.grade = grade;
        System.out.println("매개변수가 있는 생성자 호출됨 - 2");
    }


    //기본생성자
    public Student(){
        System.out.println("기본 생성자 호출됨");
    }
    //멤버함수
    void showStudentInfo(){
        System.out.println(studentName + " : " + studentId);
    }

    //오버라이드 : 부모로부터 물려받은 메소드를 재정의
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", majorCode=" + majorCode +
                ", grade=" + grade +
                '}';
    }
}
//@GetterSetter
//@Constructor -> 롬복 라이브러리 (LOMBOK)
class Order {

    private int orderId;
    String buyerId;
    String sellerId;
    int productId;
    String orderDate = "2022-11-01";
}

class UserInfo {

    String userId;
    String userPassWord;
    String userName;
    String userAddress;
    int phoneNumber;
}



//private public protect default
