package com.peter_reichelt.listofpersons;

public class Person {
    private String vorname;
    private String nachname;
    private int größe;
    private int alter;

    public Person(String vorname, String nachname, int größe, int alter){
        this.vorname =vorname;
        this.nachname=nachname;
        this.größe = größe;
        this.alter = alter;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }
}
