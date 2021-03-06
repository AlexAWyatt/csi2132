package com.example;

public class TreatmentApps {
    private String treatment_ID;
    private String treatment_type;
    private String tooth_involved;
    private String appointment_type;
    public String medication_rx_number;
    private String symptoms;
    private String comments;
    private boolean result;

    public String getAppointment_type() {
        return appointment_type;
    }

    public void setAppointment_type(String appointment_type) {
        this.appointment_type = appointment_type;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getMedication_rx_number() {
        return medication_rx_number;
    }

    public void setMedication_rx_number(String medication_rx_number) {
        this.medication_rx_number = medication_rx_number;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public boolean getResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getTooth_involved() {
        return tooth_involved;
    }

    public void setTooth_involved(String tooth_involved) {
        this.tooth_involved = tooth_involved;
    }

    public String getTreatment_ID() {
        return treatment_ID;
    }

    public void setTreatment_ID(String treatment_ID) {
        this.treatment_ID = treatment_ID;
    }

    public String getTreatment_type() {
        return treatment_type;
    }

    public void setTreatment_type(String treatment_type) {
        this.treatment_type = treatment_type;
    }
}