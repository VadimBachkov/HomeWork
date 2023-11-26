package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String carBrand;
    private char carLevel;
    private int carWeight;
    private Driver driver;
    private Engine motor;
    public Car(String fio, String carBrand, char carLevel, int carWeight, int driverExperience, int enginePower, int capacity){
        this.carBrand = carBrand;
        this.setCarLevel(carLevel);
        this.setCarWeight(carWeight);
        this.setDriver(fio,driverExperience);
    }

    public Car(String carBrand, char carClass, int carWeight, Driver driver, Engine motor) {
        this.carBrand = carBrand;
        this.setCarLevel(carLevel);
        this.setCarWeight(carWeight);
        this.driver = driver;
        this.motor = motor;
    }



    public void start(){
        System.out.println("Поехали");
    }

    public void stop(){
        System.out.println("Останавливаемся");
    }

    public void turnRight(){
        System.out.println("Поворот направо");
    }

    public void turnLeft(){
        System.out.println("Поворот налево");
    }

   @Override
      public String toString(){
        String str = "Автомобиль марки " + carBrand + " класса " + carLevel + ", вес " + carWeight + ". " + driver.toString() + ". " + motor.toString();
        System.out.println(str);
        return str;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public char getCarLevel() {
        return carLevel;
    }

    public void setCarLevel(char carLevel) {
        switch (carLevel){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'S':
            case 'M':
            case 'X':{
                this.carLevel = carLevel;
                break;
        }
            default:{
                System.out.println("Выбран неверный класс автомобиля");
            }
        }
    }

    public int getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(int carWeight) {
        if (carWeight < 0){
            System.out.println("Вес указан неверно");
        }else {
            this.carWeight = carWeight;
        }
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(String fio, int driverExperience) {
        this.driver = new Driver(fio, driverExperience);
    }

    public Engine getMotor() {
        return motor;
    }

    public void setMotor(Engine motor) {
        this.motor = motor;
    }

    public void setMotor(int enginePower, int capacity) {
        this.motor = new Engine(enginePower, capacity);
    }
}
