package org.example;

import org.example.DAO.Event_DAO;
import org.example.entities.Gestione_Eventi;
import org.example.entities.TipoEvento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App
{
       public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");



    public static void main( String[] args )
    {

        EntityManager em = emf.createEntityManager();
        Event_DAO ev = new Event_DAO(em);
        Gestione_Eventi evento1 =new Gestione_Eventi("Matrimonio","Festa",2025,150, TipoEvento.PRIVATO);
        Gestione_Eventi evento2 =new Gestione_Eventi("Laurea","Festa",2024,100, TipoEvento.PUBLICO);
        ev.Save(evento1);
        ev.Save(evento2);
        long id = 1;
        Gestione_Eventi eventoFromDb= ev.findById(id);
        if(eventoFromDb != null){
            System.out.println(eventoFromDb);
        } else {System.out.println("Evento "+id+" non trovato");
        }
        ev.findById(1);
        ev.Delete(2);
        em.close();
        emf.close();
    }
}
