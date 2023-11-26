package com.company.professions;

public class Driver {

    private String fio;
    private int driverExperience;

    public Driver(String fio, int drivingExperience) {
        this.fio = fio;
        this.setDriverExperience(drivingExperience);
    }

    @Override

    public String toString(){
        return String.format("Водитель %s со стажем %s лет", fio, driverExperience);
    }
    public String getFio(){
        return fio;
    }
    public void setFio(String fio){
        this.fio = fio;
    }

    public int getDriverExperience() {
        return driverExperience;
    }

    public void setDriverExperience(int driverExperience) {
        if (driverExperience < 0) {
            System.out.println("Стаж указан неверно");
        } else {
            this.driverExperience = driverExperience;
        }
    }
}

