package com.solvd.business.lawfirm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LawFirm <T extends Collection<Department>>{
    private String name;
    private T departments;

    public LawFirm(String name) {

        this.name = name;
        departments = (T) new ArrayList<Department>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getDepartments() {
        return departments;
    }

    public void setDepartments(T departments) {
        this.departments = departments;
    }

    public void addDepartment(Department d) {
        this.departments.add(d);
    }

    public Department getDepartmentByID(int id){
        for(Department d : departments){
            if(d.getId()==id){
                return d;
            }
        }
        return null;
    }



    @Override
    public String toString() {
        return "LawFirm{" +
                "name='" + name + '\'' +
                ", departments=" + departments +
                '}';
    }
}
