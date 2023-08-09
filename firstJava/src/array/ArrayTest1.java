package array;
//배열의 길이만큼 출력하기
public class ArrayTest1 {
    public static void main(String[] args) {

        double[] num = new double[5];
        int size = 0;//유효한 값이 저장된 배열 요소 개수를 저장할 변수 선언

        num[0] = 10.0; size++;
        num[1] = 20.0; size++;
        num[2] = 30.0; size++;

        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }

        double total = 1.0;
        for(int i=0;i<size; i++){
            total *= num[i];
        }
        System.out.println(total);

    }
}
