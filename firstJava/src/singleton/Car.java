package singleton;

import static singleton.CarFactory.createCarNumer;

public class Car {
    private int carNum;

    public int getCarNum() {
        return carNum;
    }

    public Car(){
        carNum = CarFactory.getCreateCarNumer();
    }
}
