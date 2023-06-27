package test02;

public class FunctionTest {
    public static void main(String[] args) {
         int n1=20;
         int n2=30;
         int sum=n1+n2;

         int total = addNum(n1,n2);
        System.out.println(total);

        sayHollo("안녕하세요");

        int num=calcSum();
        System.out.println("1부터 100 까지의 정수의 합 : "+num);
        int num2=calcSum(5,20);
        System.out.println("특정수의 합 : " + num2);

    }//main end
    private static int calcSum(int s,int e) {
        int sum=0;
        int i;
        for(i=s;i<=e;i++){
            sum+=i;
        }
        return sum;
    }

    private static int calcSum() {
        int sum=0;
        int i;
        for(i=0;i<=100;i++){
            sum+=i;
        }
        return sum;
    }

    private static void sayHollo(String s1) {
        System.out.println(s1);
    }

    private static int addNum(int n1, int n2) {
        int result=n1+n2;
        return  result;
    }
}
