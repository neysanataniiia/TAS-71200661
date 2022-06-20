package org.example;

import java.util.Vector;

public abstract  class Virus  {
    private int resistance;
    private String m_dna;

    Virus(){

    }

    abstract void DoBorn();

    abstract Vector<Virus> DoClone();

    abstract void DoDie();

    public abstract void InitResistance();

    public void LoadADNInformation(){}

    public  void ReduceResistance(int resistance){

    }

    public int getResistance(){
        return this.resistance;
    }

    public void setResistance(int resistance){
        this.resistance = resistance;
    }

    public String getDna(){
        return this.m_dna;
    }

    public void setDna(String m_dna){
        this.m_dna = m_dna;
    }
}
