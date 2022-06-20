package org.example;

import java.util.Vector;

public class Flu extends Virus{
    static int BLUE = 0x0000ff;
    private int color;

    public Flu(){}

    public Flu(Flu flu){

    }

    void DoBorn(){}

    Vector<Virus> DoClone(){}

    void DoDie(){}

    void InitResistance(){}

    public int getColor(){
        return this.color;
    }

    public void setColor(int color){
        this.color = color;
    }
}
