package classpart;

public class Person {
    String name;
    float height;
    float weight;
    //생성자 오버로드
    //필요에 의해 생성자 추가하는 경우 여러 개의 생성자가 하나의 클래스에 있음

    public Person(){}

    //사람 이름을 매개 변수로 입력 받아서 Person 클래스를 생성하는 생성자
    public Person(String pname,float pheight,float pweight){
        name = pname;
        height = pheight;
        weight = pweight;
    }

    public void showPersonInfo(){
        System.out.println("이름 : "+name+" , "+"키 : "+height+" , "+"몸무계 : "+weight);
    }
}

