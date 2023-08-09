package binary;

public class BinaryTest {
    public static void main(String[] args) {
        //숫자 10 을 10진수, 16진수 , 8진수로 출력하기
        int num=10;
        //이진수, 0B(제로 ,B)라고 쓰면 2진수라는 뜻이다
        int bNum = 0B1010;
        //8진수
        int oNum=012;
        //16진수
        int hNum=0XA;

        System.out.println(num);
        System.out.println(bNum);
        System.out.println(oNum);
        System.out.println(hNum);
    }
}
