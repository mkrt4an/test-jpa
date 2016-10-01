package com.mkrt4an.dao;

import com.mkrt4an.entity.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by 123 on 28.09.2016.
 */
public class DaoServ {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("NewPersistenceUnit");
        EntityManager em = emf.createEntityManager();
        UserEntity entity = em.find(UserEntity.class, 2);

        System.out.println(entity);


//        TypedQuery<UserEntity> typedQuery;
//        typedQuery = em.createQuery("SELECT u from UserEntity u", UserEntity.class);
//        List<UserEntity> resultList = typedQuery.getResultList();

//
//        System.out.println(resultList);
    }

}
