package com.solvd.business.lawfirm;

import java.util.ArrayList;

public class LawFirm {
    private String name;
    private ArrayList<Department> departments;

    public LawFirm(String name) {

        this.name = name;
        departments = new ArrayList<Department>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }

    public void addDepartment(Department d) {
        this.departments.add(d);
    }

    @Override
    public String toString() {
        return "LawFirm{" +
                "name='" + name + '\'' +
                ", departments=" + departments +
                '}';
    }
}
