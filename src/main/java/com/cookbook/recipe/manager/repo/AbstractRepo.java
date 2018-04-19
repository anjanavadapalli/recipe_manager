package com.cookbook.recipe.manager.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class AbstractRepo {

    private final SessionFactory sessionFactory;

    public AbstractRepo(final SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

}
