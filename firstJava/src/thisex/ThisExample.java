package thisex;

class Birthday{
    int day;
    int month;
    int year;   // <- 이것을 말한다.

    public void setYear(int year){
        //여기에서의 this 는 멤버 변수에 있는 year 를 말한다.
        this.year = year;
    }
    public void printThis(){
        System.out.println(this);
    }
}


public class ThisExample {
    public static void main(String[] args) {
        Birthday b1 = new Birthday();
        System.out.println(b1);//b1 의 주소값을 출력해 본다
        b1.printThis();//b1에서 this 가 가르키는 주소값
    }
}
