package com.dicsstartup.devhelper.core.service;

import com.dicsstartup.devhelper.core.entitys.Project;
import jakarta.persistence.EntityManager;

/**
 *
 * @author Didier Piracoca
 */
public class ProjectService extends AbstractService<Project> {

    public ProjectService(EntityManager entityManager) {
        super(entityManager);
    }
}
