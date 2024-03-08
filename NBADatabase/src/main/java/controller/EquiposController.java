package controller;

import jakarta.persistence.EntityManager;
import model.Daos.EquipoDao;
import model.EMF;
import model.Entities.Equipo;

import java.util.List;

public class EquiposController {
    EntityManager entityManager;
    EquipoDao equipoDao;

    public EquiposController( ) {
        this.entityManager = EMF.get().createEntityManager();
        equipoDao = new EquipoDao(entityManager);
    }


    public List<Equipo> buscarEquipos() {
        return equipoDao.getAll();
    }
}
