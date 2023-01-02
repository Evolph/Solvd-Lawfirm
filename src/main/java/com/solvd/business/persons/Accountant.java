package com.solvd.business.persons;

import com.solvd.business.interfaces.IAccount;
import com.solvd.business.lawfirm.CaseFile;

public class Accountant extends Person implements IAccount {

    public Accountant(int id, String name, String address) {
        super(id, name, address);
    }

    public void account(float costs, CaseFile casefile) {
        casefile.edit(costs);
    }
}
