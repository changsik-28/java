package test07_28_1;

import test07_28_1.Customer;
import test07_28_1.VIPCustomer;

public class CustomerTest {
    public static void main(String[] args) {
        test07_28_1.Customer customer1 = new test07_28_1.Customer();
        customer1.setCustomerName("강호동");
        customer1.setCustomerID(10010);
        customer1.bonusPoint = 1000;

//        System.out.println(customer1.showCustomerInfo());

        //상위 클래스로의 묵시적 형 변환 (업케스팅)
        Customer customer2 = new VIPCustomer(10002,"김종국",12345);
//        customer2.setCustomerID(10020);
//        customer2.setCustomerName("김종국");
        customer2.bonusPoint=10000;
        System.out.println(customer2.showCustomerInfo());

        int price = 10000;
//        System.out.println(customer2.showCustomerInfo());
        System.out.println(customer1.getCustomerName()+"님이 지불해야 하는 금액은 "+customer1.calcPrice(price)+"원입니다");
        System.out.println(customer2.getCustomerName()+"님이 지불해야 하는 금액은 "+customer2.calcPrice(price)+"원입니다");
    }

}
