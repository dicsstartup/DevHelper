package com.dicsstartup.devhelper.core.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author Didier Piracoca
 */
public class HibernateUtil {

    private static EntityManagerFactory entityManagerFactory;

    private HibernateUtil() {
        // Constructor privado para evitar instanciación
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        if (entityManagerFactory == null) {
            synchronized (HibernateUtil.class) {
                if (entityManagerFactory == null) {
                    entityManagerFactory = Persistence.createEntityManagerFactory("com.devhelper");
                }
            }
        }
        return entityManagerFactory;
    }

    public static void shutdown() {
        if (entityManagerFactory != null) {
            entityManagerFactory.close();
        }
    }
}
