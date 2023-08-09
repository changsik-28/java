package binary;

public class ByterVariable {
    public static void main(String[] args) {
        //byte -128 ~ 127
        byte bData = -128;
        System.out.println(bData);

//        byte bData1 = 128;    타입오류 byte 의 수의 범위를 초과했음

        //int -2의31승 ~ 2의 31승 -1

        //자바는 모든 정수 값을 int 형으로 처리하가ㅣ 때문이다.
        //이런 경우 숫자는 long 으로 처리하라고 컴파일러에게 알려줘야된다.
        //식별자 L을 붙이면 이 데이터는  8byte 로 저장해라. long 형인라는 것을 알려준다.
        long num = 12345678910L;
        // int 범위를 넘어서지 않을경우 long 으로 선언을 해도 뒤에 식별자를 사용하지 않아도된다.
        long num1 = 1000;

        //자료형이 다른 정수끼리 더하면 어떻게 될까?
        short sVal = 10;
        byte bVal = 20;
        System.out.println(sVal + bVal);

        //프로그램이 실행되어 정수 값을 연산할 때 4바이트를 기본 단위로 사용하기 때문에,
        //두정수를 더하기 전에 두 정수는 모두 int 형으로 변환된다.
        //또한 더한 결과 값도 int 형으로 저장된다.

        char ch = 'A';
        System.out.println(ch);
        System.out.println((int)ch);

        int ch2= 67;
        System.out.println(ch2);
        System.out.println((char)ch2);

        char ch4=68;
        System.out.println(ch4);

        //음수에 char 는 표햔할 수 없다.
//        char ch3 = -68;
//        System.out.println(ch3);
    }
}
