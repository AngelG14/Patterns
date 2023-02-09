package prototypePattern;

import java.util.ArrayList;

public class CarStore {

    private ArrayList<Car> cars;

    public CarStore() {
        this.cars = new ArrayList<Car>();
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public void removeCar(int pos){
        cars.remove(pos);
    }

    public void printCars(){
        for (Car car: cars){
            car.printDetails();
        }
    }

}