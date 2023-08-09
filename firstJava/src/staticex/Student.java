package staticex;

public class Student {
    int studentID;
    String studentName;
    private static int serialNum = 10000;

    public Student(){
        serialNum++;
        studentID = serialNum;
    }
}
