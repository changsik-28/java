package array;

public class TowDimensionArray {

    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{4,5,6}};

        //행의수 :
        System.out.println("행의 수 : "+arr.length);
        //0행의 열의수 :
        System.out.println("0행의 열의수 : "+arr[0].length);
        //1행의 열의수 :
        System.out.println("1행의 열의수 : "+arr[1].length);
        //for문으로 출력하기
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println("...........");
        }

        char[][] arr1 = new char[2][13];
        char input = 'a';
        for(int j=0;j<arr1.length;j++) {
            for(int i=0;i<arr1[j].length;i++) {
                arr1[i][j] = input++;
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

    }
}
