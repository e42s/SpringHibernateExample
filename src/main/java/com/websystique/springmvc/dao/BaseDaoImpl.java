package com.websystique.springmvc.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class BaseDaoImpl<E> extends HibernateDaoSupport implements BaseDao<E> {

    private Class cls;

    public BaseDaoImpl(){
        this.cls =  (Class<E>)((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];

    }

    @Transactional
    public void deleteEntity(E e) {
        this.getHibernateTemplate().delete(e);

    }

    public E loadEntity(final Class<E> class1,final Serializable id){
        return this.getHibernateTemplate().get(class1, id);

    }

    public void deleteEntityById(Serializable id) {
        deleteEntity(loadEntityById(id));
    }

    @SuppressWarnings("unchecked")
    public E loadEntityById(Serializable id) {
        return (E) loadEntity(cls,id);
    }
}
