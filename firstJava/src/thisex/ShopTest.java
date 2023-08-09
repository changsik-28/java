package thisex;

class Shop{
    long userNumber;
    String userID;
    String date;
    String userName;
    String goodsNumber;
    String address;

    public void showShopInfo(){
        System.out.println("주문번호 : "+userNumber);
        System.out.println("주문자 아이디 : "+userID);
        System.out.println("주문 날짜 : "+date);
        System.out.println("주문자 이름 : "+userName);
        System.out.println("주문 상품 번호 : "+goodsNumber);
        System.out.println("배송 주소 : "+address);
    }
}

public class ShopTest {
    public static void main(String[] args) {
        Shop shop=new Shop();
        shop.userNumber = 202303120001L;
        shop.date = "2023년 3월 12일";
        shop.userID = "abc123";
        shop.userName = "홍길순";
        shop.goodsNumber="PD0345-1";
        shop.address = "경기도 성남시 중원구 ";

        shop.showShopInfo();
    }
}
