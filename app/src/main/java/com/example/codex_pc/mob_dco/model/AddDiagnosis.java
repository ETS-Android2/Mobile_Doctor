package com.example.codex_pc.mob_dco.model;

/**
 * Created by CODEX_PC on 07-02-2018.
 */

public class AddDiagnosis {

    public String symptoms_problems;
    public String fever;
    public String BP;
    public String OtherDetails;
    public String Prescription;
    public String date;
    public String DocName;

    public AddDiagnosis() {
    }

    public AddDiagnosis(String symptoms_problems, String date, String fever, String BP, String otherDetails, String Docnmae, String prescription) {
        this.fever = fever;
        this.symptoms_problems = symptoms_problems;
        DocName = Docnmae;
        this.date=date;
        this.BP = BP;
        OtherDetails = otherDetails;
        Prescription = prescription;
    }
}

