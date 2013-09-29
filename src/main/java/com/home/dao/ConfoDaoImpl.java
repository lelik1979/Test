package com.home.dao;

import com.home.domain.Confo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 29.09.13
 * Time: 0:42
 * To change this template use File | Settings | File Templates.
 */
@Repository("ConfoDaoImpl")
@Transactional
public class ConfoDaoImpl {

    private static final Logger LOG = LoggerFactory.getLogger(ConfoDaoImpl.class);

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    public Confo loadConfoById(int id) {
        Session session = sessionFactory.openSession();
        return (Confo) session.load(Confo.class, id);
    }

    public void save(Confo confo) {
        Session session = sessionFactory.getCurrentSession();
        org.hibernate.Transaction tx = session.getTransaction();
        tx.begin();
        session.save(confo);
        tx.commit();
    }

}
