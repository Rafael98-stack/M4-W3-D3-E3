package org.example.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue

    private long Id;
    @Column
    private String nome;
    @Column
    private String cognome;
    @Column
    private String email;
    @Column
    private LocalDate dataNascita;
    @Enumerated(EnumType.STRING)
    private Genere genere;

    @OneToOne(mappedBy = "persona")
    private Partecipazione partecipazione;
    public Persona() {
    }

    public Persona(String nome, String cognome, String email, LocalDate dataNascita, Genere genere) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataNascita = dataNascita;
        this.genere = genere;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascita() {
        return this.dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public Genere getGenere() {
        return this.genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public Partecipazione getPartecipazione() {
        return partecipazione;
    }

    public void setPartecipazione(Partecipazione partecipazione) {
        this.partecipazione = partecipazione;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + Id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", data_di_nascita=" + dataNascita +
                ", sesso=" + genere +
                '}';
    }

}
