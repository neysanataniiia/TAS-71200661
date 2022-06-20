package org.example;

public class TextNotes extends Notes{
    private StringBuilder notes;

    public TextNotes(String notes){
        super(notes);
    }

    public void showNotes(){
        System.out.println("Hello nama saya Sczhny. Saya berkuliah di UKDW");
    }

    public int findNotes(String notes) throws NotesException{
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

    public void addNotes(String notes){}
}
