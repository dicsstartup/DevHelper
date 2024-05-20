package com.dicsstartup.devhelper.core.service;

import com.dicsstartup.devhelper.core.entitys.Credential;
import jakarta.persistence.EntityManager;

/**
 *
 * @author Didier Piracoca
 */
public class CredentialService extends AbstractService<Credential> {

    public CredentialService(EntityManager entityManager) {
        super(entityManager);
    }
}
