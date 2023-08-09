package test06;

import java.util.ArrayList;

public class Student {
//멤버변수 선언 (private) : 학생아이디(studentID), 학생네임 (studentName) , 수강과목리스트(subjectList) =>배열로
    private int studentID;
    private String studentName;
    private ArrayList<Subject> subjectList;
    //생성자를 만든다(아이디와 네임 ) 을 매개 변수로 가지고 온다
    public Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;

        subjectList = new ArrayList<Subject>();//ArrayList생성하기
    }
    //addSubject 함수를 만들자 : 만약 수강을 하면 이름과 점수를 매개변수로 받아
    //수강과목 생성하고, 과목이름 추가하고, 점수추가하고, 배열에 저장한다.
    public void addSubject(String name,int score){
        Subject subject = new Subject(); //Subject 생성하기
        subject.setName(name);//과목이름 추가하기
        subject.setScorePoint(score);//점수 추가하기

        subjectList.add(subject);//배열에 저장하기
    }

    //학생 정보를 보여주는 메서드를 만든다.
    public void showStudentInfo(){
        int total = 0;
        for(Subject subject : subjectList){
            total += subject.getScorePoint();//총점더하기
            System.out.println("학생 "+studentName +"님의 "+subject.getName()+"과목의 성적은 "+subject.getScorePoint()+"점 입니다");
        }
        System.out.println("학생 "+studentName+"님의 총점은 "+total+"점 입니다");
    }
}

