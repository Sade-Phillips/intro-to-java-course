package com.cbfacademy;

import com.cbfacademy.cars.Showroom;
import com.cbfacademy.cars.Car;
import java.util.List;

public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        Showroom showroom = new Showroom();
            List<Car> cars = showroom.getCars();
                for (Car car : cars) {
                    System.out.println(car.getDetails());
                }
            
    }
}
