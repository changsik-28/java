package binary;

public class binaryTest2 {
    public static void main(String[] args) {
        //이진수 2, 32bit 로 표현 ,5
        int num1 = 0B00000000000000000000000000000101;
        System.out.println(num1);
        //이진수 -5
        int num2 = 0B11111111111111111111111111111011;
        System.out.println(num2);

        System.out.println(num1+num2);
    }
}
