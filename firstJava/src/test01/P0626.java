package test01;

public class P0626 {
    public static void main(String[] args) {
        int num = 10;
        int bNum = 0B1010; //2진수
        int oNum = 012; //8진수
        int hNum = 0XA; //16진수

        System.out.println(num);
        System.out.println(bNum);
        System.out.println(oNum);
        System.out.println(hNum);

        int cNum = 0b01000001;
        System.out.println(cNum);   //65
        System.out.println((char)cNum); //A

        //int num2 = 12345678900; //숫자가 너무 커서 오류
        //long lnum = 12345678900; //L 을 사용하지 않아서 오류
        long lnumber = 12345678900L; // ok

        double dnum = 3.14;
        float fnum = 3.14F;

        System.out.println(dnum);
        System.out.println(fnum);

        //부동소수점 방식의 오류
        double dnum2 = 1;
        for(int i = 0; i<10000; i++) {
            dnum2 = dnum2 + 0.1;
        }
        System.out.println(dnum2);//그래서 뒤에 소수점을 없애기 위해 int 형으로 변환 (int)dnum2

        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1);

        char ch2 = 66;
        System.out.println(ch2);

        int ch3 = 67;
        System.out.println(ch3);
        System.out.println((char)ch3);

        //char ch4 = -66;  음수는 대입 할 수 없음

        char ch5 = '한';
        char ch6 = '\uD55C';

        System.out.println(ch5);
        System.out.println(ch6);

        boolean isMarried = true;
        System.out.println(isMarried);


        final int MAX_NUM =100; //상수는 대문자로 적는다
        final int MIN_NUM;

        MIN_NUM = 0;

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

        //MAX_NUM = 1000;

        byte bNum1 = 10;
        int iNum = bNum1; //자동형변환

        int iNum2 = 20;
        float fNum = iNum2;

        int iNum3 = 10;
        byte bNum4 = (byte)iNum3;//강제형변환

        double dNum = 3.14;
        int iNum4 = (int)dNum;


    }
}
