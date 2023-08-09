package array;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] array1 ={10,20,30,40,50};
        int[] array2 = new int[10];

        //기본형
        //System.arraycopy(src,srcPos,dest,destPos,length)
        //src : 복사할 배열이름
        //srcPos: 복사할 배열의 첫번째 위치
        //dest : 복사해서 붙여 넣을 대상 배열 이름
        //destPos : 복사해서 대상 배열에 붙여 넣기를 시작할 첫 번째 위치
        //length : src 에서 dest 로 자료를 복사할 요소 개수

        System.arraycopy(array1,0,array2,1,4);
        for(int i=0;i<array2.length;i++){
            System.out.println(array2[i]);
        }
    }
}
