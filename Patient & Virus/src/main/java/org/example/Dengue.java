package org.example;

import java.util.Vector;

public class Dengue extends Virus{
    private String  protein;

    public Dengue(){}

    public Dengue(Dengue){}

    void DoBorn(){}

    Vector<Virus> DoClone(){}

    void DoDie(){}

    void InitResistance(){}

    public String getProtein(){
        return this.protein;
    }

    public String setProtein(){
        this.protein = protein;
    }


}
