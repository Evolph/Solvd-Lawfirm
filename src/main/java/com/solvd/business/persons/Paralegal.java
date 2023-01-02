package com.solvd.business.persons;

import com.solvd.business.interfaces.IWork;
import com.solvd.business.lawfirm.CaseFile;

public class Paralegal extends Person implements IWork {


    public Paralegal(int id, String name, String address) {
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
    }

    public void work(String update, CaseFile casefile) {
        casefile.edit(update);
    }

}
