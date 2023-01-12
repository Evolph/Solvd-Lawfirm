package com.solvd.business.exceptions;

public class NoAvailableLawyerException extends Exception {

    private String desc;

    public NoAvailableLawyerException(String desc, String mess) {
        super(mess);
        this.desc = desc;
    }
}
