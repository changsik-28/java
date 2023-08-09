package singleton;

public class CarFactory {
    public CarFactory(){};

    private static CarFactory instance = new CarFactory();

    public static CarFactory getInstance() {
        return instance;
    }

    public static int createCarNumer=10000;

    public Car createCar() {
        createCarNumer++;
        Car car = new Car();
        return car;
    }


    public static int getCreateCarNumer() {
        return createCarNumer;
    }
}
