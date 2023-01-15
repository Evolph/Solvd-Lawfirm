package com.solvd.business.enums;

public enum CriminalCaseTypes {

    VIOLATION("VIOLATION", 750, 10),
    MISDEMEANOR("MISDEMEANOR", 1500F, 20),
    FELONY("FELONY", 4000F, 50);

    private String description;
    private float fee;
    private int minimumHours;

    CriminalCaseTypes(String description, float fee, int minimumHours) {
        this.description = description;
        this.fee = fee;
        this.minimumHours = minimumHours;
    }

    public String getDescription() {
        return description;
    }

    public float getFee() {
        return fee;
    }

    public int getMinimumHours() {
        return minimumHours;
    }
}
