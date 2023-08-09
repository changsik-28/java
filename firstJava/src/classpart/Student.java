package classpart;

public class Student {

    int studentID;//학번
    String studentName;//학생이름
    int grade;  //학년
    String address; //사는곳

    //이름, 주소 출력 메서드
    //메서드이름은 소문자로 시작한다.
    //클래스 내부에서 멤버 변수를 사용하여 클래스 기능을 구현하는 것을 '멤버함수' 또는 '메서드'라고 한다.
    public void showStudentInfo(){
        System.out.println(studentName+" , "+address);

    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
