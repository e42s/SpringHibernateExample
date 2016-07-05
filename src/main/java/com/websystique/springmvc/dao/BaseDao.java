package com.websystique.springmvc.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.criterion.Criterion;

public interface BaseDao<E> {

    public void deleteEntity(E e);

    public void deleteEntityById(Serializable id);

    public E loadEntity(final Class<E> class1, final Serializable id);

    public E loadEntityById(Serializable id);
}
