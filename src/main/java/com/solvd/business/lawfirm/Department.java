package com.solvd.business.lawfirm;

import com.solvd.business.interfaces.IHire;
import com.solvd.business.persons.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Department <T extends Collection<Person>> implements IHire{
    private int id;
    private String name;
    private T employees;

    private ArrayList<File> files;


    public Department(int id, String name, T employees) {
        this.id = id;
        this.name = name;
        this.employees = employees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getEmployees() {
        return employees;
    }

    public void setEmployees(T employees) {
        this.employees = employees;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }


    public void hire(Person employee) {
        employees.add(employee);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department that)) return false;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employees=" + employees +
                ", files=" + files +
                '}';
    }
}
