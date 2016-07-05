package com.websystique.springmvc.dao;
import javax.annotation.Resource;

import org.hibernate.SessionFactory;

public class AnotationDaoSupport<E> extends BaseDaoImpl<E>{
    @Resource(name="sessionFactory")
    public void setFinalSessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }
}
