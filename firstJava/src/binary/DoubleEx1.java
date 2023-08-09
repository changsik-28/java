package binary;

public class DoubleEx1 {
    public static void main(String[] args) {
        double dNum = 3.14;
        System.out.println(dNum);

        float fNum= 3.14F;
        System.out.println(fNum);

        //자바에서 실수는 dobule을 기본으로 한다.

        boolean isMarried = false;
        System.out.println(isMarried);

        //자료형 추론
        //지역 변수에서만 사용가능
        //전역변수에서는 사용불가능
        var num = 10;
        System.out.println(num);
        var fnum = 3.14;
        System.out.println(fnum);

//        num = 3.14;
        //int 형으로 먼저 사용되었으므로 실수를 넣을 수 없음
        //한번 형이 정해지면 다른 형을 대입할 수 없다.

        //상수, 관용적으로 대문자로 사용
        final int MAX_NUM = 100;
        final float PI = 3.14f;
        //PI = 3.15f;
        //3.14 값으로 상수가 대입되어있으므로 값을 변경할 수 없다는 에러가 남

    }
}
