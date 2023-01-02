package com.solvd.business;

import com.solvd.business.lawfirm.Department;
import com.solvd.business.lawfirm.LawFirm;
import com.solvd.business.persons.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;


public class Main {

    private final static Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {



        Client client = new Client(1, "Fernando Bordon", "Jose Cubas 123", 3000);
        Lawyer familyLawyer1 = new Lawyer(100, "Guido Birato", "Venezuela 2231", "Family Law", 150);
        Lawyer familyLawyer2 = new Lawyer(101, "Carlos Puccio", "Concordia 456", "Family Law", 250);
        Lawyer commercialLawyer1 = new Lawyer(200, "Judith Fraga", "Libertad 656", "Commercial Law", 200);
        Lawyer commercialLawyer2 = new Lawyer(201, "Esther Strauss", "Arieta 89", "Commercial Law", 350);
        Lawyer criminalLawyer1 = new Lawyer(300, "Jaime Noriega", "Corrientes 2322", "Criminal Law", 350);
        Lawyer criminalLawyer2 = new Lawyer(302, "Lemmy Reyes", "Cabildo 500", "Criminal Law", 500);
        Accountant accountant = new Accountant(400, "Martin Tesoro", "San Martin 43");
        Paralegal paralegal1 = new Paralegal(500, "Roberto Sosa", "Calle 5 3456");
        Paralegal paralegal2 = new Paralegal(501, "Marta Kent", "Florio 2154");
        Paralegal paralegal3 = new Paralegal(502, "Alicia Flowers", "Gaona 865");
        Investigator investigator = new Investigator(600, "Carla Rivera", "Pozos 958", 100);
        ArrayList<Person> familyEmployees = new ArrayList<>();
        ArrayList<Person> commercialEmployees = new ArrayList<>();
        ArrayList<Person> criminalEmployees = new ArrayList<>();
        ArrayList<Person> accountingEmployees = new ArrayList<>();
        ArrayList<Person> investigationEmployees = new ArrayList<>();
        Department familyLaw = new Department(700, "Family Law", familyEmployees);
        Department commercialLaw = new Department(700, "Commercial Law", commercialEmployees);
        Department criminalLaw = new Department(700, "Criminal Law", criminalEmployees);
        Department accounting = new Department(800, "Accounting", accountingEmployees);
        Department investigations = new Department(900, "Investigations", investigationEmployees);
        familyLaw.hire(familyLawyer1);
        familyLaw.hire(familyLawyer2);
        familyLaw.hire(paralegal1);
        commercialLaw.hire(commercialLawyer1);
        commercialLaw.hire(commercialLawyer2);
        familyLaw.hire(paralegal2);
        criminalLaw.hire(criminalLawyer1);
        criminalLaw.hire(criminalLawyer2);
        familyLaw.hire(paralegal3);
        accounting.hire(accountant);
        investigations.hire(investigator);
        LawFirm law = new LawFirm("Kilmister Law");
        law.addDepartment(commercialLaw);
        law.addDepartment(criminalLaw);
        law.addDepartment(accounting);
        law.addDepartment(investigations);

        LOGGER.info("Prueba 26/12");

    }
}