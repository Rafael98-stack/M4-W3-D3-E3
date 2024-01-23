package org.example.DAO;

import org.example.entities.Gestione_Eventi;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class Event_DAO {
    private final EntityManager em;

    public Event_DAO(EntityManager em) {
        this.em = em;
    }

    public void Save(Gestione_Eventi eventi) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(eventi);
        transaction.commit();
        System.out.println("Event: " + eventi.getTitle() + " Aggiunto Correttamente");
    }

    public Gestione_Eventi findById(long id) {
        return em.find(Gestione_Eventi.class, id);
    }

    public  void Delete(long id) {
        Gestione_Eventi found = this.findById(id);
        if (found != null) {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.remove(found);
            transaction.commit();
            System.out.println("Evento " + found.getTitle() + " Cancellato");
        } else {
            System.out.println("Evento non trovato");
        }

    }
}


