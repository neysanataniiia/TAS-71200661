package org.example;

import java.util.ArrayList;

public class ListNotes extends Notes {
    private ArrayList<String> listNotes;

    public ListNotes(String notesname) {
        super(notesName);
    }

    public String ListNotes(String ListNotes) {
        return ListNotes;
    }

    public void showNotes() {
        System.out.println("1.beli kacang\n2.mengerjakan laporan\3.beli snack");
    }

    public ArrayList<String> findNotes(String ListNotes) throws NotesException {
        try {
            if (notesName == null || notesName.isEmpty()) {
                throw new NotesException("1");
            } else {
                System.out.println("Tidak kosong");
            }
        } catch (NotesException a) {
            System.out.println("Error : " + a.getMessage());
        }

    }
        public void addNotes (String ListNotes){
        }

}
