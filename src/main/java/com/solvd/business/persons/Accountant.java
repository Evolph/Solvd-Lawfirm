package com.solvd.business.persons;

import com.solvd.business.interfaces.IAccount;
import com.solvd.business.lawfirm.CaseFile;

public class Accountant extends Person implements IAccount {

    public Accountant(int id, String name, String address) {
        super(id, name, address);
    }

    public void account(int minHours, float minWork, float hourlyRate,  CaseFile casefile){
        float costs = (minHours * hourlyRate) + minWork;
        casefile.edit(costs);
    }
}
