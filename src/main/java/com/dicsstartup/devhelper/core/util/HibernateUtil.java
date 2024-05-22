package com.dicsstartup.devhelper.core.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author Didier Piracoca
 */
public class HibernateUtil {

    private static EntityManagerFactory entityManagerFactory;

    private static HibernateUtil instance;

    private HibernateUtil() {
        entityManagerFactory = Persistence.createEntityManagerFactory("com.devhelper");
    }

    public static HibernateUtil getInstance() {
        if (instance == null) {
            instance = new HibernateUtil();
        }
        return instance;
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public void shutdown() {
        if (entityManagerFactory != null && entityManagerFactory.isOpen()) {
            entityManagerFactory.close();
        }
    }
}
