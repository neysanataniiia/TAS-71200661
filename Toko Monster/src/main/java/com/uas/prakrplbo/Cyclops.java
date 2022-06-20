package com.uas.prakrplbo;

public class Cyclops extends Monster{
    public Cyclops(String nama){
        super(nama);
    }

    public String bergerak(){
        return "Berjalan";
    }

    public String bersuara(){
        return "Hohohoho";
    }
}
