package binary;

public class ExplicitConversion {
    public static void main(String[] args) {
        //바이트가 큰 자료형에서 작은 자료형으로 대입하는 경우
        //변환해주는걸 선언해주는 것이 명시적 형변환이다.
        int iNum =1000;
        System.out.println(iNum);

        byte bNum = (byte)iNum;
        //1바이트 안에 표시할 수 없으므로 손실이 일어난다. 잘림
        System.out.println(bNum);

        //더 정밀한 자료형에서 덜 정밀한 자료형으로 대입되는 경우
        double dNum = 3.14;
        iNum = (int)dNum;
        System.out.println(iNum);//소수부분이 잘리고 정수만 출력됨

        float fNum = 0.9f;
        int num1 = (int)dNum + (int)fNum ;//3+0=3
        int num2 = (int)(dNum + fNum);//3.14+0.9 = 4.04 이므로  4가 나온다
        System.out.println(num1);
        System.out.println(num2);
    }
}
