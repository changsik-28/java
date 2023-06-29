package test03;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int arr2[] = new int[10];
        int[] numbers = new int[]{10,20,30}; // 개수 생략해야 함
        int[] numbers2 = {10,20,30};    // new int[] 생락가능

        int[] ids;
        ids = new int[]{10,20,30};  //선언후 배열을 생성하는 경우

        int[] arr = new int[10];
        int total = 0;
        for(int i=0,num=1; i<arr.length;i++,num++){
            arr[i] = num;
        }
        for(int i = 0; i< arr.length; i++){
            total += arr[i];
        }
        System.out.println(total);

        int count=0;

        double[] dArr = new double[5];

        dArr[0] = 1.1; count++;
        dArr[1] = 2.1; count++;
        dArr[2] = 3.1; count++;
        //dArr[3] = 3.1; dArr[4] = 3.1;
        //int 배열은 0 , double 은 0.0 객채는 null 이 초기값
        double mtotal = 1;
        for(int i = 0; i< dArr.length; i++) {
            mtotal *= dArr[i];
        }
        //값을 다 넣지 않아서 0 이 나온다.
        System.out.println(mtotal);

    }
}
