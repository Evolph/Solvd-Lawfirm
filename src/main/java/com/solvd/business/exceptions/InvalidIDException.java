package com.solvd.business.exceptions;

public class InvalidIDException extends Exception{
    private String desc;

    public InvalidIDException(String desc, String mess) {
        super(mess);
        this.desc = desc;
    }
}
