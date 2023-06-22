package test01;

import java.util.Scanner;

public class Scan2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] aa= new int[4];
        int hap = 0;

//        System.out.println("첫번쨰 숫자 입력");
//        aa[0]=s.nextInt();
//
//        System.out.println("두번쨰 숫자 입력");
//        aa[1]=s.nextInt();
//
//        System.out.println("세번쨰 숫자 입력");
//        aa[2]=s.nextInt();
//
//        System.out.println("네번쨰 숫자 입력");
//        aa[3]=s.nextInt();

        for(int i=0;i<=3;i++){
            System.out.printf("%d번째 숫자를 입력하세요 =>", i+1);
            aa[i]=s.nextInt();
        }
        int k=0;
        while(k<=3){
            hap+= aa[k];
            k++;
        }

//        hap=aa[0]+aa[1]+aa[2]+aa[3];
        System.out.printf("합계 => %d \n",hap);

        s.close();

        int score=100;
        char grade;
        if(score>=90){
            grade = 'A';
        }else{
            grade = 'B';
        }
        //삼항연산자로 변경하기
        grade = (score>=90) ? 'A' : 'B' ;
    }
}
