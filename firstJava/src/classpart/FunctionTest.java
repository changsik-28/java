package classpart;

public class FunctionTest {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int sum = addNum(num1,num2);
        int sum1 = addNum1(num1,num2);
        int sum2 = addNum2(num1,num2);
        double sum3 = addNum3(num1,num2);
        System.out.println(num1+" + "+num2+" = "+sum+"입니다");
        System.out.println(num1+" - "+num2+" = "+sum1+"입니다");
        System.out.println(num1+" * "+num2+" = "+sum2+"입니다");
        System.out.println(num1+" / "+num2+" = "+sum3+"입니다");
    }

    public static int addNum(int n1,int n2){
        int result = n1 + n2;
        return result;
    }
    public static int addNum1(int n1,int n2){
        int result = n1 - n2;
        return result;
    }
    public static int addNum2(int n1,int n2){
        int result = n1 * n2;
        return result;
    }
    public static double addNum3(double n1,double n2){
        double result = n1 / n2;
        return result;
    }
}
