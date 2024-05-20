package com.dicsstartup.devhelper.core.service;

import com.dicsstartup.devhelper.core.entitys.Archive;
import jakarta.persistence.EntityManager;

/**
 *
 * @author Didier Piracoca
 */
public class ArchiveService extends AbstractService<Archive> {

    public ArchiveService(EntityManager entityManager) {
        super(entityManager);
    }
}
