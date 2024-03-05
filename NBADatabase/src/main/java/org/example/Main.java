package org.example;

import jakarta.persistence.EntityManager;
import model.Daos.EquipoDao;
import model.Daos.JugadorDao;
import model.EMF;

public class Main {
    public static void main(String[] args) {
        EntityManager em = EMF.get().createEntityManager();
        if (em.isOpen()) {
            System.out.println("Connected to database");
        } else {
            System.out.println("Failed to connect to database");
        }
        EquipoDao equipoDao = new EquipoDao(em);
        JugadorDao jugadorDao = new JugadorDao(em);
        System.out.println(jugadorDao.getAll());
        //System.out.println(equipoDao.getAll());
    }
}