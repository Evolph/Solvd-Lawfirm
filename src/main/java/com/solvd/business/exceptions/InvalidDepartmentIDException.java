package com.solvd.business.exceptions;

public class InvalidDepartmentIDException extends Exception{
    private String desc;

    public InvalidDepartmentIDException(String desc, String mess) {
        super(mess);
        this.desc = desc;
    }
}
