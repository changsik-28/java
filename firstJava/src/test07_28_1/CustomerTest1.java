package test07_28_1;

import test07_28_1.VIPCustomer;

import java.util.ArrayList;

public class CustomerTest1 {
    public static void main(String[] args) {
        ArrayList<Customer> cArray = new ArrayList<Customer>();
        Customer customerK = new Customer(1111,"김종국");
        Customer customerJ = new Customer(1112,"전소민");
        GoldCustomer goldH = new GoldCustomer(1113,"하하");
        GoldCustomer goldS = new GoldCustomer(1114,"송지효");
        VIPCustomer vip = new VIPCustomer(1115,"홍진경",12345);

        System.out.println("=======고객정보출력==========");

        cArray.add(customerK);
        cArray.add(customerJ);
        cArray.add(goldH);
        cArray.add(goldS);
        cArray.add(vip);
        for(Customer customer : cArray){
            System.out.println(customer.showCustomerInfo());
        }
        int price = 10000;
        System.out.println("==========할인율과 보너스 포인트 결과 =============");
        for(Customer customer : cArray){
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName()+"님이 "+cost+"를 지불하였습니다");
            System.out.println(customer.showCustomerInfo());
        }



    }
}
