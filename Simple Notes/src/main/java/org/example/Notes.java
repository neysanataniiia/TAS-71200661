package org.example;

public abstract class Notes {
    public String notesName;
    public Notes(String notesName){
        this.notesName = notesName;
    }

    public abstract void addNotes(String Notes);

    public abstract void showNotes();

    public Notes loadNotes(String Notes) {

    }

    public void saveNotes(){}
}
