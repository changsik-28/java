package cooperation;

public class Subway {
    //멤버변수 선언하기 ( 지하털 노선 (lineNumber) , 승객수 (passengerCount), 수입액(money) )
    int lineNumber;
    int passengerCount;
    int money;
    //지하털 노선을 매개변수로 받는 Subway 생성자 함수만들기
    public Subway(int lineNumber){
        this.lineNumber = lineNumber;
        this.passengerCount = 0;
        this.money = 0;
    }
    //take() 메서드는 승객이 탄 경우 지하털 수입이 증가하고, 승객수가 증가한다.
    public void take(){
        this.money += 1250;
        this.passengerCount++;
    }
    //지하털 정보를 출력하는 메서드 ( showInfo() )
    //00의 승객은 00 명이고 , 수입은 00 입니다.
    public void showInfo(){
        System.out.println("지하철 "+lineNumber+"호선의 승객은 "+passengerCount+"이고 , 수입은 "+money+"입니다");
    }
}
