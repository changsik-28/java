package singleton;

public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();

//        System.out.println(factory);
        Car mySonata = factory.createCar();
        Car yourSonata = factory.createCar();
        Car c1 = factory.createCar();

        System.out.println(mySonata.getCarNum());
        System.out.println(yourSonata.getCarNum());
        System.out.println(c1.getCarNum());
    }
}
