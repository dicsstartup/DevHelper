package com.dicsstartup.devhelper.core.service;

import com.dicsstartup.devhelper.core.entitys.Person;
import jakarta.persistence.EntityManager;

/**
 *
 * @author Didier Piracoca
 */
public class PersonService extends AbstractService<Person> {

    public PersonService(EntityManager entityManager) {
        super(entityManager);
    }
}
