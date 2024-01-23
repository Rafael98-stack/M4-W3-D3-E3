package org.example.entities;

import javax.persistence.*;

@Entity
@Table (name="event")
public class Gestione_Eventi {
    @Id
    @GeneratedValue
    private Long Id;
    @Column(name="titolo")
    private String title;
    @Column(name="descrizione")
    private String description;
    @Column(name="dataEvento")
    private int eventDay;
    @Column(name="numeroPartecipanti")
    private int numberGuest;

    @Enumerated(EnumType.STRING)
    private TipoEvento event;

    public Gestione_Eventi(){}

    public Gestione_Eventi(String title,String description,int eventDay,int numberGuest,TipoEvento event){
        this.title=title;
        this.numberGuest=numberGuest;
        this.description=description;
        this.event=event;
        this.eventDay=eventDay;
    }

    public Long getId(){
        return this.Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public int getNumberGuest() {
        return numberGuest;
    }

    public void setNumberGuest(int numberGuest) {
        this.numberGuest = numberGuest;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEventDay() {
        return eventDay;
    }

    public void setEventDay(int eventDay) {
        this.eventDay = eventDay;
    }

    public TipoEvento getEvent() {
        return event;
    }

    public void setEvent(TipoEvento event) {
        this.event = event;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString(){
        return "Evento{" +
                "id=" + Id +
                ", titolo='" + title + '\'' +
        ", descrizione=" + description +
                ", giorno evento='" + eventDay + '\'' +
        ", tipoEvento=" + event +
                ", numeroMassimoPartecipanti=" + numberGuest +
                '}';
    }
}
