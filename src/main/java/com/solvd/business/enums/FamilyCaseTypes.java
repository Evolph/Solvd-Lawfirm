package com.solvd.business.enums;

public enum FamilyCaseTypes {

    ADOPTION("ADOPTION", 5000F, 20),
    CHILDSUPPORT("CHILD SUPPORT", 4000F, 15),
    DIVORCE("DIVORCE", 2500F, 30),
    INHERITANCE("INHERITANCE",500F, 50);

    private String description;
    private Float fee;
    private Integer minimumHours;

    FamilyCaseTypes(String description, Float fee, Integer minimumHours){
        this.description= description;
        this.fee= fee;
        this.minimumHours= minimumHours;
    }

    public String getDescription(){
        return description;
    }

    public Float getFee() {
        return fee;
    }

    public Integer getMinimumHours() {
        return minimumHours;
    }
}
