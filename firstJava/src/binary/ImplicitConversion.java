package binary;

public class ImplicitConversion {
    public static void main(String[] args) {
        //바이트 기가 작은 자료형에서 큰 자료형으로 대입하는 경우
        //묵시적 형변환
        byte bNum = 10;//1바이트
        System.out.println(bNum);   //byte 형
        int num = bNum;//4바이트
        System.out.println(num);    //int 형

        //덜 정밀한 자료형에서 더 정밀한 자료형으로 대입하는 경우
        int iNum2 = 20;
        System.out.println(iNum2);
        float fNum = iNum2;
        System.out.println(fNum);

        //연산 중에 자동 변환되는 경우
        double dNum;
        dNum=fNum + iNum2;  //float 형 + int 형
        System.out.println(dNum);//float 형으로 변환해서 계산


    }
}
