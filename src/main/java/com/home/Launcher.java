package com.home;

import com.home.dao.ConfoDaoImpl;
import com.home.domain.Confo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 29.09.13
 * Time: 2:43
 * To change this template use File | Settings | File Templates.
 */
public class Launcher {

    private static final Logger LOG = LoggerFactory.getLogger(Launcher.class);

    public static final void main(String[] args) {
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("spring/app-context.xml");
        ConfoDaoImpl confoDao = appCtx.getBean("ConfoDaoImpl", ConfoDaoImpl.class);
        Confo c = confoDao.loadConfoById(2);
        Confo c1 = confoDao.loadConfoById(3);
        LOG.debug("c.name={}", c.getName());

    }
}
