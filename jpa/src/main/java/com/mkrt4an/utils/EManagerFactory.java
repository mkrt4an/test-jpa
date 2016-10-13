package com.mkrt4an.utils;

import com.mkrt4an.entity.RoutePointEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by 123 on 28.09.2016.
 */
public class EManagerFactory {

    public static EntityManager getEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("NewPersistenceUnit");

        return emf.createEntityManager();
    }



    public static void main(String[] args)  {
        EntityManager em = getEntityManager();
        RoutePointEntity entity = em.find(RoutePointEntity.class, 1);

        System.out.println("=======*====*=======*======*===");
        System.out.println(entity);

//        TypedQuery<DriverEntity> typedQuery;
//        typedQuery = em.createQuery("SELECT u from DriverEntity u ", DriverEntity.class);
//        List<DriverEntity> resultList = typedQuery.getResultList();
//
//
//        System.out.println(resultList);

    }

}


//TTD
// ThreadLocal<EntityManagerFactory>

//        private static volatile EManagerFactory emf;
//
//        public static EManagerFactory getInstance() {
//            EManagerFactory localInstance = emf;
//            if (localInstance == null) {
//                synchronized (EManagerFactory.class) {
//                    localInstance = emf;
//                    if (localInstance == null) {
//                        emf = localInstance = new EManagerFactory();
//                    }
//                }
//            }
//            return localInstance;
//        }
