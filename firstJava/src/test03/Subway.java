package test03;

public class Subway {

    int lineNumber;
    int money;
    int passengerCount;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }
    public void take(int money){
        this.money+= money;
        passengerCount++;
    }
    public void showSubwayInfo(){
        System.out.println(lineNumber+"의 승객은 "+passengerCount+"명 이고, 수입 "+money+"입니다");

    }
}
