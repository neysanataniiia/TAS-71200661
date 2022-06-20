package org.example;

import java.util.Vector;

public class Patient extends Virus{
    static int DIE = 0;
    static int ALIVE = 0;
    private int m_state;
    private int m_resistance;

    public Patient(){}

    public void  InitResistance(){}

    public void DoStart(){}

    public  void TakeMedicine(int ){}

    public void DoDie(){
    }

    public int getState(int m_state){
        return  m_state;
    }

    public int getResistance(){}

     void public int setResistance(int m_resistance) {
        this.m_resistance = m_resistance;
    }

    private Vector<Virus> getVirusList(){}

    private void setVirusList(Vector<Virus>){}

}

