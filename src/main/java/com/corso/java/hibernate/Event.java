package com.corso.java.hibernate;

import java.util.Date;

//POJO
//Importante ricordarsi che ci vuole sia il costruttore vuoto che i getter e setter
//Hibernate senza di essi non riesce a far il setting di tutte le variabili
public class Event {

    //Hibernate:
    //Un file di mapping per mappare questa classe in tabella DB
    //Un file di configurazione-> diciamo ad Hibernate quali sono le info che servono per fare le connessioni
    //Il file di configurazione ci permette di connetterci alle classi

    private Long id;
    private Date date;
    private String title;
    private String description;

    public Event(){

    }

    public Event(String title, String description, Date date){
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
