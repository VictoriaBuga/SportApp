package com.example.sportapp;

import androidx.appcompat.app.AppCompatActivity;

public class IntrebariQuiz extends AppCompatActivity
{

    public String vectIntreb[]={
            "Care oras nu face parte din Judetul Arges?","Ce oras face parte din judetul Arges?","Ce obiectiv turistic se regaseste in Judetul Arges?",

    };
    public String vectRasp[][]={
            {"Mioveni","Sibiu","Pitesti","Curtea de Arges"},{"Sibiu", "Bucuresti","Brasov","Pitesti"},
            {"Transfagarasan","Barajul Vidraru","Cascada Vaii Rele","Toate cele de mai sus"},

    };
    public String raspCorecte[]={"Sibiu","Pitesti","Toate cele de mai sus"};
    public String getIntrebare(int i){
        return vectIntreb[i];
    }
    public String getRaspA(int i){
        return vectRasp[i][0];
    }
    public String getRaspB(int i){
        return vectRasp[i][1];
    }
    public String getRaspC(int i){
        return vectRasp[i][2];
    }
    public String getRaspD(int i){
        return vectRasp[i][3];
    }
    public String getRaspCorect(int i){
        return raspCorecte[i];
    }
}

