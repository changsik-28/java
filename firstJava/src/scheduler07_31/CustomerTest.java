package scheduler07_31;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        //Buy 인터페이스형인 buyer 에 대입하여 형 변환
        Buy buyer = customer;
        //buyer 는 Buy 인터페이스의 메서드만 호출 가능
        buyer.buy();// 구매하기
        buyer.order();//재정의된 메서드가 호출된다.

        Sell seller = customer;
        seller.sell();
        buyer.order();//재정의된 메서드가 호출된다.

        if(seller instanceof Customer){
            Customer customer2= (Customer)seller;
            customer2.buy();
            customer2.sell();
        }
    }
}
