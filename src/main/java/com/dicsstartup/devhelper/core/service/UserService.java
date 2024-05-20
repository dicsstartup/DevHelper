package com.dicsstartup.devhelper.core.service;

import com.dicsstartup.devhelper.core.entitys.User;
import jakarta.persistence.EntityManager;

/**
 *
 * @author Didier Piracoca
 */
public class UserService extends AbstractService<User> {

    public UserService(EntityManager entityManager) {
        super(entityManager);
    }
}
