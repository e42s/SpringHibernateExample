package com.websystique.springmvc.dao;

import com.websystique.springmvc.model.Employee;
import org.springframework.stereotype.Repository;

@Repository("com.websystique.springmvc.dao.Employee2Dao")
public class Employee2DaoImpl extends AnotationDaoSupport<Employee> implements Employee2Dao {

}
