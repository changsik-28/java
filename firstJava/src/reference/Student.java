package reference;

public class Student {
    int studentID;
    String studentName;

    //Subject 형을 사용하여 국어과목과 수학 과목을 추가하여 선언한다
    //이것이 참조자료형이다.
    Subject korea;
    Subject math;

    //Student.생성자 추가하기
    public Student(){
        korea = new Subject();
        math = new Subject();
    }

    public Student(int id, String name){
        studentID = id;
        studentName = name;
        korea = new Subject();
        math = new Subject();
    }

    public void setKorea(String name, int score){
        korea.setSubjectName(name);
        korea.setScore(score);
    }
    public void setMath(String name, int score){
        math.setSubjectName(name);
        math.setScore(score);
    }

    //듣는 과목의 총점을 출력하고 싶다, 정보를 꺼내주는 메서드
    public void showStudentInfo(){
        int total = korea.getScore() + math.getScore();
        System.out.println(studentName + "학생의 총점은 "+total+"점 입니다.");
    }
}
