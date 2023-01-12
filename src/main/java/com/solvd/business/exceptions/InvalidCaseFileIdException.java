package com.solvd.business.exceptions;

public class InvalidCaseFileIdException extends Exception {

    private String desc;

    public InvalidCaseFileIdException(String desc, String mess) {
        super(mess);
        this.desc = desc;
    }
}
