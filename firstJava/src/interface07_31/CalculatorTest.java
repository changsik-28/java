package interface07_31;

public class CalculatorTest {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int[] arr = {1,2,3,4,5};

        CompleteCalc calc = new CompleteCalc();
        System.out.println(calc.add(num1,num2));
        System.out.println(calc.substract(num1,num2));
        System.out.println(calc.times(num1,num2));
        System.out.println(calc.divide(num1,num2));
        calc.showInfo();
        calc.description();
        System.out.println(Calc.total(arr));//정적 메소드 사용 이기 때문에 Calc 대문자
        System.out.println(calc.square(num1));
    }
}
