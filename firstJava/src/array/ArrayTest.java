package array;

public class ArrayTest {
    //배열 초기화 하고 출력하기
    public static void main(String[] args){
        int[] numbers = new int[]{0,1,2};

        for(int i=0; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

        //배열의 개수를 선언하고 값은 안넣은경우
        int[] studentID = new int[5];

        for(int i=0;i<studentID.length;i++){
            System.out.println(studentID[i]);
        }


    }
}
