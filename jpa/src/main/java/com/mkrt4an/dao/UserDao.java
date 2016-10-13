package com.mkrt4an.dao;

import com.mkrt4an.entity.UserEntity;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by 123 on 28.09.2016.
 */

public class UserDao {
    private EntityManager em;

    public UserDao (){}

    public UserDao(EntityManager em){
        this.em = em;
    }


    // Find by id
    public UserEntity findUserById(int id) {
        UserEntity cg = em.find(UserEntity.class, id);
        return cg;
    }

    //Get all cargo list
    public List<UserEntity> getAllUsers () {
        List<UserEntity> cgl;
        cgl = em.createQuery("select c from UserEntity c", UserEntity.class).getResultList();
        return cgl;
    }

    //Create
    public void createUser(UserEntity cg){
        em.getTransaction().begin();
        em.persist(cg);
        em.getTransaction().commit();
        System.out.printf("New User is: %s\n", em.find(UserEntity.class, cg.getId()));

    }

    //Update
    public void updateUser(UserEntity cg){
        em.getTransaction().begin();
        em.persist(cg);
        em.getTransaction().commit();
        System.out.printf("New user is: %s\n", em.find(UserEntity.class, cg.getId()));
    }

    //Delete
    public void deleteUser (UserEntity cg){
        em.getTransaction().begin();
        em.remove(cg);
        em.getTransaction().commit();
    }

}

