package com.example.mesure_glycemie.controller;


import com.example.mesure_glycemie.model.Patient;

public class Controller {
    private static Controller instance = null;
    private Controller(){}
    public static final Controller getInstance(){
        if(Controller.instance ==null){
            Controller.instance = new Controller();
        }
        return Controller.instance;
    }

    private static Patient patient;
    public void createPatient(int age, float valeurMesuree, boolean isFasting){
        patient = new Patient(age, valeurMesuree, isFasting);
    }
    public String getReponse() {
        return patient.getReponse();
    }
}