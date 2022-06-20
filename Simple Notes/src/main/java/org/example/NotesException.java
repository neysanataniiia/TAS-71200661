package org.example;

public class NotesException extends Throwable {
    private String errorMessage;
    private String errorCode;

    public NotesException(String notes) {
        this.errorCode = errorCode;
        if (errorCode == "1") {
            this.errorMessage = "Note tidka boleh kosong";
        }
    }

    public String getMessage(){
        return errorMessage;
    }
}
