package abstractex07_28;

public class CarTest {
    public static void main(String[] args) {
        System.out.println("====자율 주행 하는 자동차===");
        Car myCar = new AICar();
        myCar.run();
        System.out.println("++++++++++++++++++++");
        Car car = new ManualCar();
        car.run();
    }
}
