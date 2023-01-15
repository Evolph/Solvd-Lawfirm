package com.solvd.business.lawfirm;

import com.solvd.business.persons.Client;
import com.solvd.business.persons.Investigator;
import com.solvd.business.persons.Lawyer;
import com.solvd.business.persons.Paralegal;

public class CaseFile extends File {

    private int lawyerID;
    private int clientID;
    private int piID;
    private int paralegalID;
    private float currentCost;
    private boolean status;

    public CaseFile() {
        this.status = true;
    }

    public CaseFile(int id, String name, String description, int lawyerID, int clientID, int piID, int paralegalID) {
        super(id, name, description);
        this.lawyerID = lawyerID;
        this.clientID = clientID;
        this.piID = piID;
        this.paralegalID = paralegalID;
        status = true;
    }

    public CaseFile(int id, String name, String description, int lawyerID, int clientID, int paralegalID){
        super(id, name, description);
        this.lawyerID = lawyerID;
        this.clientID = clientID;
        this.paralegalID = paralegalID;
        status = true;
    }

    public int getLawyer() {
        return lawyerID;
    }

    public void setLawyer(int lawyerID) {
        this.lawyerID = lawyerID;
    }

    public int getClient() {
        return clientID;
    }

    public void setClient(int clientID) {
        this.clientID = clientID;
    }

    public int getPi() {
        return piID;
    }

    public void setPi(int piID) {
        this.piID = piID;
    }

    public int getParalegal() {
        return paralegalID;
    }

    public void setParalegal(int paralegalID) {
        this.paralegalID = paralegalID;
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

    public void edit(int id, String name, String description, int lawyerID, int clientID, int paralegalID) {
        super.setId(id);
        super.setName(name);
        super.setDescription(description);
        this.setLawyer(lawyerID);
        this.setClient(clientID);
        this.setParalegal(paralegalID);

    }

    public void edit(float cost){
        currentCost+=cost;
    }

    @Override
    public String toString() {
        return super.toString() + '\'' +
                "CaseFile{" + '\'' +
                "lawyer=" + lawyerID + '\'' +
                ", client=" + clientID + '\'' +
                ", pi=" + piID + '\'' +
                ", paralegal=" + paralegalID + '\'' +
                ", currentCost=" + currentCost + '\'' +
                ", status=" + status + '\'' +
                '}';
    }


}
