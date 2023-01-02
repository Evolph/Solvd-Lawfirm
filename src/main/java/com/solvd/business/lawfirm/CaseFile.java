package com.solvd.business.lawfirm;

import com.solvd.business.persons.Client;
import com.solvd.business.persons.Investigator;
import com.solvd.business.persons.Lawyer;
import com.solvd.business.persons.Paralegal;

public class CaseFile extends File {

    private Lawyer lawyer;
    private Client client;
    private Investigator pi;
    private Paralegal paralegal;
    private float currentCost;
    private boolean status;

    public CaseFile() {

    }

    public CaseFile(int id, String name, String description, Lawyer lawyer, Client client, Investigator pi, Paralegal paralegal) {
        super(id, name, description);
        this.lawyer = lawyer;
        this.client = client;
        this.pi = pi;
        this.paralegal = paralegal;
        status = true;
    }

    public Lawyer getLawyer() {
        return lawyer;
    }

    public void setLawyer(Lawyer lawyer) {
        this.lawyer = lawyer;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Investigator getPi() {
        return pi;
    }

    public void setPi(Investigator pi) {
        this.pi = pi;
    }

    public Paralegal getParalegal() {
        return paralegal;
    }

    public void setParalegal(Paralegal paralegal) {
        this.paralegal = paralegal;
    }

    public float getCurrentCost() {
        return currentCost;
    }

    public void setCurrentCost(float currentCost) {
        this.currentCost = currentCost;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void edit(float costs) {
        this.setCurrentCost(this.getCurrentCost() + costs);
    }


    @Override
    public String toString() {
        return super.toString() + '\'' +
                "CaseFile{" + '\'' +
                "lawyer=" + lawyer + '\'' +
                ", client=" + client + '\'' +
                ", pi=" + pi + '\'' +
                ", paralegal=" + paralegal + '\'' +
                ", currentCost=" + currentCost + '\'' +
                ", status=" + status + '\'' +
                '}';
    }
}
