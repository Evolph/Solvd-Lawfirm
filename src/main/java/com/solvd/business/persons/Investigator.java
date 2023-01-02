package com.solvd.business.persons;

public class Investigator extends Person {
    private byte numCases;
    private float hourlyRate;

    public Investigator() {

    }


    public Investigator(int id, String name, String address, float hourlyRate) {
        super(id, name, address);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return super.toString() + '\'' +
                "Investigator{" +
                "numCases= " + numCases + '\'' +
                ", hourlyRate= " + hourlyRate + '\'' +
                '}';
    }
}
