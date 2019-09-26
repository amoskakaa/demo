package com.ics.demo.oop;

public class Reptiles extends Animal implements AnimalInterface{
        int noOfScales;

    public Reptiles(String name, TypeOfEye typeOfEye, int noOfScales){
        super(name,typeOfEye);
        this.noOfScales = noOfScales;
    }

    public int getNoOfScales() {
        return noOfScales;
    }

    public void setNoOfScales(int noOfScales) {
        this.noOfScales = noOfScales;
    }

    @Override
    public String toString() {
        return "Reptiles{" +
                "noOfScales=" + noOfScales +
                ", name=" + name  +
                ", typeOfEye=" + typeOfEye +
                '}';
    }

    @Override
    public void move() {
        System.out.println("Reptiles crawl...");
    }
}
