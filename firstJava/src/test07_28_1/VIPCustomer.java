package test07_28_1;

import test07_28_1.Customer;

public class VIPCustomer extends Customer {
    private double saleRatio;
    private int agentID;

    //VIP 고객의 경우
    public VIPCustomer(int customerID,String customerName,int agentID){
        super(customerID,customerName);
        customerGrade = "VIP";
        bonusRation = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;

    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price*bonusRation;//보너스 포인트 적립
        return price - (int)(price*saleRatio);//할인된 가겨을 계산하여 변환
    }
    public String showCustomerInfo(){

        return super.showCustomerInfo() + "담당 상담원의 번호는 " +agentID + "입니다";
    }

    public int getAgentID(){
        return agentID;
    }
}
