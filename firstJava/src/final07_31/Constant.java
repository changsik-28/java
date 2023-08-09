package final07_31;

public class Constant {
    //상수 선언, 상수를 건언할 때는 일반 변수와 구분하기 위해 대문자를 쓴다.
    int num = 10;
    final int NUM = 100;

    public static void main(String[] args) {
        Constant cons = new Constant();
        cons.num = 50;
        //cons.NUM = 200;   상수에 값을 대입하여 오류가 발생

        System.out.println(cons.num);
        System.out.println(cons.NUM);

    }
}
