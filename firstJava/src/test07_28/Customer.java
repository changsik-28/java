package test07_28;
//상속의 경우 private 을 사용하지말고
//protected 를 사용하면된다.
public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRation;
    
    public Customer(){
        customerGrade="SILVER";
        bonusRation = 0.01;

    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRation;
        return price;
    }
    public String showCustomerInfo(){
        return customerName+"님의 등급은 "+customerGrade+"이며 보너스 포인트는 "+bonusPoint+"입니다";
    }

}
