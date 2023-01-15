package com.solvd.business;

import com.solvd.business.enums.CommercialCaseTypes;
import com.solvd.business.enums.CriminalCaseTypes;
import com.solvd.business.enums.FamilyCaseTypes;
import com.solvd.business.exceptions.InvalidIDException;
import com.solvd.business.lawfirm.CaseFile;
import com.solvd.business.lawfirm.Department;
import com.solvd.business.lawfirm.LawFirm;
import com.solvd.business.persons.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;


public class Main {

    private final static Logger LOGGER = LogManager.getLogger(Main.class);
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {



        Client client = new Client(1, "Fernando Bordon", "Jose Cubas 123", 50000);
        Lawyer familyLawyer1 = new Lawyer(100, "Guido Birato", "Venezuela 2231", "Family Law", 150);
        Lawyer familyLawyer2 = new Lawyer(101, "Carlos Puccio", "Concordia 456", "Family Law", 250);
        Lawyer commercialLawyer1 = new Lawyer(200, "Judith Fraga", "Libertad 656", "Commercial Law", 200);
        Lawyer commercialLawyer2 = new Lawyer(201, "Esther Strauss", "Arieta 89", "Commercial Law", 350);
        Lawyer criminalLawyer1 = new Lawyer(300, "Jaime Noriega", "Corrientes 2322", "Criminal Law", 350);
        Lawyer criminalLawyer2 = new Lawyer(301, "Lemmy Reyes", "Cabildo 500", "Criminal Law", 500);
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
        ArrayList<Person> paralegalEmployees = new ArrayList<>();
        Department familyLaw = new Department(700, "Family Law", familyEmployees);
        Department commercialLaw = new Department(701, "Commercial Law", commercialEmployees);
        Department criminalLaw = new Department(702, "Criminal Law", criminalEmployees);
        Department accounting = new Department(703, "Accounting", accountingEmployees);
        Department investigations = new Department(704, "Investigations", investigationEmployees);
        Department paralegals = new Department(705, "Paralegals", paralegalEmployees);
        CaseFile clientCase = new CaseFile();
        familyLaw.hire(familyLawyer1);
        familyLaw.hire(familyLawyer2);
        commercialLaw.hire(commercialLawyer1);
        commercialLaw.hire(commercialLawyer2);
        criminalLaw.hire(criminalLawyer1);
        criminalLaw.hire(criminalLawyer2);
        accounting.hire(accountant);
        investigations.hire(investigator);
        paralegals.hire(paralegal1);
        paralegals.hire(paralegal2);
        paralegals.hire(paralegal3);
        LawFirm law = new LawFirm("Kilmister Law");
        law.addDepartment(familyLaw);
        law.addDepartment(commercialLaw);
        law.addDepartment(criminalLaw);
        law.addDepartment(accounting);
        law.addDepartment(investigations);
        String type;

        LOGGER.info("Welcome to "+law.getName());
        LOGGER.info("How can we help you?");
        Collection<Department> cp = law.getDepartments();
        for(Department d: cp){
            if(d.getId()<703) LOGGER.info("ID: "+ d.getId()+ " - Name: " +d.getName());
        }
        LOGGER.info("Choose Department by ID: ");
        try{
            int deptID = scanner.nextInt();
            Department chosenDept= chooseDepartment(law, deptID);
            LOGGER.info("Choose a Lawyer from the" + chosenDept.getName() + "Department: ");
            Collection<Lawyer> cl = chosenDept.getEmployees();
            for(Lawyer l : cl){
                LOGGER.info("ID: "+ l.getId() + "- Name: "+l.getName() + " - Hourly Rate: " + l.getHourlyRate());
            }
            LOGGER.info("Choose Lawyer by ID: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            Lawyer chosenLawyer = chooseLawyer(cl, option);
            LOGGER.info("Choose type of assistance: ");
            switch(deptID){
                case 700:
                    for(FamilyCaseTypes f: FamilyCaseTypes.values())
                    {
                        LOGGER.info(f.getDescription() + ": "+ f.getFee()+"$ fee. Minimum work: "+ f.getMinimumHours()+ " hours");
                    }
                    type= scanner.nextLine();
                    for(FamilyCaseTypes f: FamilyCaseTypes.values()){
                     if(type.toUpperCase().equals(f.getDescription())){
                         paralegal1.work(1, client.getName()+"'s Case", f.getDescription(), option, client.getId(), paralegal1.getId(), clientCase);
                         accountant.account(f.getMinimumHours(),f.getFee(), chosenLawyer.getHourlyRate(), clientCase);
                     }
                    }

                    break;
                case 701:
                    for(CommercialCaseTypes f: CommercialCaseTypes.values())
                    {
                        LOGGER.info(f.getDescription() + ": "+ f.getFee()+"$ fee. Minimum work: "+ f.getMinimumHours()+ " hours");
                    }
                    type= scanner.nextLine();
                    for(CommercialCaseTypes f: CommercialCaseTypes.values()){
                        if(type.toUpperCase().equals(f.getDescription())){
                            paralegal2.work(1, client.getName()+"'s Case", f.getDescription(), option, client.getId(), paralegal2.getId(), clientCase);
                            accountant.account(f.getMinimumHours(),f.getFee(), chosenLawyer.getHourlyRate(), clientCase);
                        }
                    }
                    break;
                case 702:
                    for(CriminalCaseTypes f: CriminalCaseTypes.values())
                    {
                        LOGGER.info(f.getDescription() + ": "+ f.getFee()+"$ fee. Minimum work: "+ f.getMinimumHours()+ " hours");
                    }
                    type= scanner.nextLine();
                    for(CriminalCaseTypes f: CriminalCaseTypes.values()){
                        if(type.toUpperCase().equals(f.getDescription())){
                            paralegal3.work(1, client.getName()+"'s Case", f.getDescription(), option, client.getId(), paralegal3.getId(), clientCase);
                            accountant.account(f.getMinimumHours(),f.getFee(), chosenLawyer.getHourlyRate(), clientCase);
                        }
                    }
                    break;
            }
            LOGGER.info("Working on your case will cost you: " + clientCase.getCurrentCost());


        }catch(InvalidIDException e){
            LOGGER.error("Caught exception " + e);
        }



    }

    public static Department chooseDepartment(LawFirm law, int option) throws InvalidIDException {
        Department d = law.getDepartmentByID(option);
        if(d == null){
            throw  new InvalidIDException("Invalid Department ID", "Invalid Department ID");
        }

        return d;
    }

    public static Lawyer chooseLawyer(Collection<Lawyer> lawyers, int option) throws InvalidIDException {
        Lawyer l = null;
        for(Lawyer x: lawyers){
            if(x.getId()==option){
                l = x;
            }
        }

        if(l == null){
            throw new InvalidIDException("Invalid Lawyer ID", "Invalid Lawyer ID");
        }
        return l;
    }

}

