package com.dicsstartup.devhelper.core.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

/**
 *
 * @author Didier Piracoca
 */
public class AbstractService<T> {

    protected EntityManager entityManager;

    public AbstractService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void guardar(T entidad) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(entidad);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            throw e;
        }
    }

    public T buscar(Class<T> claseEntidad, Object id) {
        return entityManager.find(claseEntidad, id);
    }

    public void actualizar(T entidad) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.merge(entidad);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            throw e;
        }
    }

    public void eliminar(T entidad) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.remove(entityManager.contains(entidad) ? entidad : entityManager.merge(entidad));
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            throw e;
        }
    }

}
