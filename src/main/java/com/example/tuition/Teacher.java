package com.example.tuition;

public class Teacher {
    private PL pl;
    private String value;
    public Teacher(PL pl) {
        this.pl = pl;
    }
    public Teacher(String value) {
        this.value =value;
    }
    public void start_class(){
        this.pl.Syntax();
    }
}
