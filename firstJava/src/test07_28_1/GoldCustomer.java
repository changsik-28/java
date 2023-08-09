package test07_28_1;

public class GoldCustomer extends Customer{
    private double saleRatio;

    public GoldCustomer(int cutomerID,String customerName){
        super(cutomerID,customerName);
        customerGrade="GOLD";
        bonusRation = 0.02;
        saleRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price*bonusRation;//보너스 포인트 적립
        return price - (int)(price*saleRatio);//할인된 가겨을 계산하여 변환
    }
}
