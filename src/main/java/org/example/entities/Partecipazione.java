package org.example.entities;

import javax.persistence.*;

@Entity
@Table(name = "partecipazione")
public class Partecipazione {
    @Id
    @GeneratedValue
    private Long Id;
    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;
    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Gestione_Eventi evento;

    @Enumerated(EnumType.STRING)
    private Stato_Partecipazione stato;
    public Partecipazione(){

    }
    public Partecipazione(Persona persona, Gestione_Eventi evento){
        this.persona = persona;
        this.evento = evento;
        this.stato = Stato_Partecipazione.DA_CONFERMARE;
    }

    public Gestione_Eventi getEvento() {
        return evento;
    }

    public void setEvento(Gestione_Eventi evento) {
        this.evento = evento;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Stato_Partecipazione getStato() {
        return stato;
    }

    public void setStato(Stato_Partecipazione stato) {
        this.stato = stato;
    }
    @Override
    public String toString() {
        return "Partecipazione{" +
                "id=" + Id +
                ", persona=" + persona +
                ", evento=" + evento +
                ", stato=" + stato +
                '}';
    }
}
