package com.example;

import java.util.Scanner;

import com.vehicle.Car;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello we are in Main.Java");

        Car car = new Car();
        // String carNm = car.getCarName();
        System.out.println("Which Car You Like");
        String cNM = scanner.nextLine();
        car.carName = cNM;
        System.out.println("which color you Like : ");
        car.color = scanner.nextLine();
        String carNm = car.getCarName();
        System.out.println(carNm + " and your fevorite color is " + car.color);
    }

}
