package com.websystique.springmvc.context;

import com.websystique.springmvc.dao.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;

public class DaoProvider {

    public static Object getDao(Class E) {
        return ApplicationContextProvider.getApplicationContextInstance().getBean(E.getName(), E);
    }
}
