package hibernateDAO;

import models.Personnage;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Example;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class HibernateDAO {
    private SessionFactory sessionFactory;

    public HibernateDAO() {
    }
    public <T> T create(T entity) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(entity);
        transaction.commit();
        session.close();
        return entity;
    }
    public <T> T findById(Class<T> clazz, Serializable id) {
        Session session = this.sessionFactory.openSession();
        T entity = session.get(clazz, id);
        session.close();
        return entity;
    }

    public <T> List<T> findAll(Class<T> tClass) {
        Session session = this.sessionFactory.openSession();
        List<T> results = session.createCriteria(tClass).list();
        session.close();
        return results;
    }

    public <T> List<T> paginate(Class<T> clazz, int offset, int size) {
        Session session = this.sessionFactory.openSession();
        List<T> results = session.createCriteria(clazz).setFirstResult(offset).setMaxResults(size).list();
        session.close();
        return results;
    }
    public <T> List<T> findWhere(T entity){
        Session session = sessionFactory.openSession();
        Example example = Example.create(entity).ignoreCase();
        List<T> results = session.createCriteria(entity.getClass()).add(example).list();
        session.close();
        return results;
    }
    public <T> List<T> paginateWhere(T entity, int offset, int size) {
        Session session = this.sessionFactory.openSession();
        Example example = Example.create(entity).ignoreCase();
        List<T> results = session.createCriteria(entity.getClass()).add(example).setFirstResult(offset).setMaxResults(size).list();
        session.close();
        return results;
    }

    public <T> List<T> paginateW(Class <T> tClass, Criterion[] criteria, int offset, int size) {
        Session session = this.sessionFactory.openSession();
        Criteria criteria1=session.createCriteria(tClass).setFirstResult(offset).setMaxResults(size);
        for (int i = 0; i < criteria.length; i++) {
            criteria1.add(criteria[i]);
        }
        List<T> results =criteria1.list();
        session.close();
        return results;
    }
    public <T> List<T> findW(Class <T> tClass, Criterion[] criteria){
        Session session = sessionFactory.openSession();
        Criteria criteria1=session.createCriteria(tClass);
        for (int i = 0; i < criteria.length; i++) {
            criteria1.add(criteria[i]);
        }
        List<T> results=criteria1.list();
        session.close();
        return results;
    }
    public void deleteById(Class tClass, Serializable id) {
        this.delete(this.findById(tClass, id));
    }

    public void delete(Object entity) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(entity);
        transaction.commit();
        session.close();
    }
    public <T> T update(T entity) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(entity);
        transaction.commit();
        session.close();
        return entity;
    }
    /*public <T> Integer getLastId(Class<T> clazz) {
        Session session = this.sessionFactory.openSession();
        String query = "select max(id) from " + clazz.getName();
        Integer lastId = (Integer) session.createQuery(query).uniqueResult();
        session.close();
        return lastId != null ? lastId : 0;
    }*/
    public <T> Serializable getLastId(Class<T> clazz) {
        Session session = this.sessionFactory.openSession();
        Serializable lastId = (Serializable) session.createQuery("select max(id) from " + clazz.getName()).uniqueResult();
        session.close();
        return lastId;
    }

    public SessionFactory getSessionFactory() {
        return this.sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
