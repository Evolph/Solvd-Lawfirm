package com.solvd.business.interfaces;

import com.solvd.business.lawfirm.CaseFile;

public interface IWork {

    public void work(int id, String name, String description, int lawyerID, int clientID, int paralegalID, CaseFile casefile);
}
