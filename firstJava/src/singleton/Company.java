package singleton;

public class Company {
    //2단계 : 클래스 내부에  static 으로 유일한 인스턴스 생성하기
    private static Company instance = new Company();

    //1단계 : 생성자를 private 으로 만들기
    private Company(){};

    //3단계 : 외부에서 참조할 수 있는 public 메서드 만들기
    //여기에서 static 은 객체를 생성하지 않고 그냥 사용하기 위하여 이 메서드는 static 으로 선언해주면 된다.
    public static Company getInstance() {
        return instance;
    }
}
