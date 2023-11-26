package com.company.details;

public class Engine {

    private int enginePower;
    private int capacity;

    public Engine(int enginePower, int capacity){
        this.setEnginePower(enginePower);
        this.capacity = capacity;
    }

    @Override

    public String toString(){
        return  String.format("Мощность двигателя %s, производительность %s", enginePower, capacity);
    }


    public int getEnginePower(){
        return enginePower;
    }
    public void setEnginePower(int enginePower){
        if(enginePower<0){
            System.out.println("Мощность указана неверно");
        }else{
        this.enginePower = enginePower;
        }
    }

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

}
