package com.solvd.business.enums;

public enum CommercialCaseTypes {

    CONSUMERPROTECCTION("PROTECTION", 500F, 5),
    CONTRACT("CONTRACT", 1500F, 10),
    COPYRIGHT("COPYRIGHT", 2200F, 15);


    private String description;
    private Float fee;
    private Integer minimumHours;

    CommercialCaseTypes(String description, Float fee, Integer minimumHours){
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
