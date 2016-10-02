<!doctype html public "-//w3c//dtd html 4.0 transitional//en">

<%@ page contentType="text/html; charset=windows-1251" %>
<%@ page import="com.mkrt4an.dao.DaoServ, com.mkrt4an.entity.UserEntity" %>
<%@ page import="javax.persistence.EntityManager" %>
<%--<%@ page import="static com.mkrt4an.dao.DaoServ.doGet" %>--%>
<%@ page import="javax.persistence.EntityManagerFactory" %>
<%@ page import="javax.persistence.Persistence" %>
<%@ page import="javax.persistence.TypedQuery" %>

<%@ page import="java.util.List" %>

<html>
    <body>
        <h2>
            Добро пожаловать! Сегодня <%= new DaoServ().doGetMore() %>
        </h2>
    </body>
</html>

<%--<%!--%>
    <%--List<UserEntity> getFormattedDate () <%= new DaoServ().doGetMore() %>{--%>
        <%--EntityManagerFactory emf = Persistence.createEntityManagerFactory("NewPersistenceUnit");--%>
        <%--EntityManager em = emf.createEntityManager();--%>
        <%--TypedQuery<UserEntity> typedQuery;--%>
        <%--typedQuery = em.createQuery("SELECT u from UserEntity u", UserEntity.class);--%>
        <%--List<UserEntity> resultList = typedQuery.getResultList();--%>
        <%--return resultList;--%>
    <%--}--%>
<%--%>--%>
