package thisex;
//생성자에서 다른 생성자를 호출하는 this
class Person{
    //멤버 변수를 만듬
    String name;
    int age;

    //디폴트 생성자를 만듬
    public Person(){
        this("이름없음",1);
    }

    //Person 생성자를 만들 때 name 과 age 를 변수로 받겠다.
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public Person returnSelf(){
        return this;
    }
}

public class CallAnotherConst {
    public static void main(String[] args) {
        //Person 을 호출한다
        Person p1 = new Person();

        System.out.println(p1.name);
        //기본값일 때(파라미터에 아무것도 쓰지 않은 경우 "이름없음"이라고 출력하고 싶음)
        System.out.println(p1.returnSelf());


    }
}
