package com.solvd.business.persons;


public class Client extends Person {

    float funds;

    public Client(int id, String name, String address, float funds) {
        super(id, name, address);
        this.funds = funds;
    }

    public float getFunds() {
        return funds;
    }

    public void setFunds(float funds) {
        if (funds < 0) throw new IllegalArgumentException(); //Revisar esto
        this.funds = funds;
    }

    public void pay(float costs) {
        this.funds -= costs;
    }

    public void aquireFunds(float hours, float payment) {
        this.funds += hours * payment;
    }

    @Override
    public String toString() {
        return super.toString() + '\'' +
                "Client{" +
                "funds= " + funds + '\'' +
                '}';
    }
}
