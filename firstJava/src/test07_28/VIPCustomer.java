package test07_28;

public class VIPCustomer extends Customer{
    private double saleRatio;
    private int agentID;

    //VIP 고객의 경우
    public VIPCustomer(){
        customerGrade = "VIP";
        bonusRation = 0.05;
        saleRatio = 0.1;

    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price*bonusRation;//보너스 포인트 적립
        return price - (int)(price*saleRatio);//할인된 가겨을 계산하여 변환
    }

    public int getAgentID(){
        return agentID;
    }
}
