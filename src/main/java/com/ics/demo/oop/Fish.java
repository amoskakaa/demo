package com.ics.demo.oop;

public class Fish extends Animal implements AnimalInterface{
    private int noOfFins;

    public Fish(String name, TypeOfEye typeOfEye,int noOfFins) {
        super(name,typeOfEye);
        this.noOfFins = noOfFins;
    }

    public int getNoOfFins() {
        return noOfFins;
    }

    public void setNoOfFins(int noOfFins) {
        this.noOfFins = noOfFins;
    }

    @Override
    public String toString() {
        return "Fish{" + "name="+ name + "TypeOfEye="+ getTypeOfEye()+
                "noOfFins=" + noOfFins +
                '}';
    }

    @Override
    public void move() {
        System.out.println("Fish swim.....");
    }
}

