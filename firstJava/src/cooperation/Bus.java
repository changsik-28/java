package cooperation;

public class Bus {
    //멤버 변수를 선언한다.
    //(버스번호(busNumber) , 승객수(passengerCount) , 버스가 받은 요금(money) )
    int busNumber;
    int passengerCount;
    int money;
    //버스번호를 매개변수로 받는 생성자를 생성한다.
    public Bus(int busNumber){
        this.busNumber = busNumber;
        this.passengerCount=0;
        this.money=0;
    }
    //승객이 버스에 탄 경우 버스 수입이 증가하고 승객수가 증가하는 메서드를 생성한다. ( take() )
    public void take(){
        this.money = this.money+ 1250;
        this.passengerCount++;
    }
    //버스 정보를 출력하는 메서드를 만든다. ( showInfo() )
    //버스 0000번의 승객은 00 명이고 , 수입은 00 입니다.
    public void showInfo(){
        System.out.println("버스 "+busNumber+"번의 승객은 "+passengerCount+"이고 , 수입은 "+money+"입니다");
    }
}
