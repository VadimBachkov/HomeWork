package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;
public class Lorry extends Car {
    private int liftingCapacity;

    public Lorry(String fio, String carBrand, char carLevel, int carWeight, int driverExperience, int enginePower, int capacity) {
        super(fio, carBrand, carLevel, carWeight, driverExperience, enginePower, capacity);
        this.setLiftingCapacity(liftingCapacity);
    }

    @Override
    public String toString() {
        String str = "Автомобиль марки " + this.getCarBrand() + " класса " + this.getCarLevel() + ", вес " + this.getCarWeight() + ", рузоподъемность " + liftingCapacity + ". " +
                this.getDriver().toString() + ". " + this.getMotor().toString();
        System.out.println(str);
        return str;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        if (liftingCapacity <= 0) {
            System.out.println("Грузоподъемность указана неверно");
        } else {
            this.liftingCapacity = liftingCapacity;
        }
    }
}
