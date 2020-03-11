package com.bertamalfitano.teagenerator.dao;

import com.bertamalfitano.teagenerator.model.Tea;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class TeaDaoImplementation implements TeaDao {

    private static final Logger logger = LoggerFactory.getLogger("TeaDaoImplementation");

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    public void addTea(Tea tea) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(tea);
        logger.info("Tea successfully added. Tea details: " + tea);
    }

    public void updateTea(Tea tea) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(tea);
        logger.info("Tea successfully updated. Tea details: " + tea);
    }

    public void removeTea(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Tea tea = (Tea) session.load(Tea.class, id);

        if (tea != null) {
            session.delete(tea);
        }
        logger.info("Tea succesfully removed. Tea details: " + tea);
    }

    public Tea getTeaById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Tea tea = (Tea) session.load(Tea.class, id);
        logger.info("Tea successfully loaded. Tea details " + tea);

        return tea;
    }

    @SuppressWarnings("unchecked")
    public List<Tea> teaList() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Tea> teaList = session.createQuery("from Tea").list();

        for (Tea tea : teaList) {
            logger.info("Tea List : " + tea);
        }

        return teaList();
    }
}
