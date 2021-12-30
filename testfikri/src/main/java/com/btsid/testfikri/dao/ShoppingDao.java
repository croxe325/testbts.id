package com.btsid.testfikri.dao;

import com.btsid.testfikri.model.Shopping;
import com.btsid.testfikri.services.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

@Service
public class ShoppingDao implements ShoppingService {

    private EntityManagerFactory emf;

    @Autowired
    public void setEmf(EntityManagerFactory emf){
        this.emf = emf;
    }
    @Override
    public List<Shopping> listShopping() {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("from Shopping", Shopping.class).getResultList();
    }
    @Override
    public Shopping saveOrUpdate(Shopping shopping) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction() .begin();
        Shopping saved = em.merge(shopping);
        em.getTransaction() .commit();
        return saved;
    }
    //implements method update
    @Override
    public Shopping getIdShopping(Integer id) {
        EntityManager em = emf.createEntityManager();
        return em.find(Shopping.class, id);
    }

    @Override
    public String hapus(Integer id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction() .begin();
        em.remove(em.find(Shopping.class, id));
        em.getTransaction() .commit();
        return null;
    }
}
