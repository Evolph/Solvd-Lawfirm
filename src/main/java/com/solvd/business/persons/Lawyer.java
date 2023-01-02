package com.solvd.business.persons;

import com.solvd.business.interfaces.IRepresent;

public class Lawyer extends Person implements IRepresent {

    private String expertise;
    private byte numCases;
    private float hourlyRate;

    public Lawyer() {
        super();
    }

    public Lawyer(int id, String name, String address, String expertise, float hourlyRate) {
        super(id, name, address);
        this.expertise = expertise;
        this.hourlyRate = hourlyRate;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public byte getNumCases() {
        return numCases;
    }

    public void setNumCases(byte numCases) {
        this.numCases = numCases;
    }

    public float getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public float represent(float hours) {
        return this.hourlyRate * hours;
    }


    @Override
    public String toString() {
        return super.toString() + '\'' +
                "Lawyer{" +
                "expertise= " + expertise + '\'' +
                ", numCases= " + numCases + '\'' +
                ", hourlyRate= " + hourlyRate + '\'' +
                '}';
    }
}
