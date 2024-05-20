package com.dicsstartup.devhelper.core.service;

import com.dicsstartup.devhelper.core.entitys.Reminder;
import jakarta.persistence.EntityManager;

/**
 *
 * @author Didier
 */
public class ReminderService extends AbstractService<Reminder> {

    public ReminderService(EntityManager entityManager) {
        super(entityManager);
    }
}
