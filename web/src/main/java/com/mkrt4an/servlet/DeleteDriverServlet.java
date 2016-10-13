package com.mkrt4an.servlet;

import com.mkrt4an.dao.DriverDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static com.mkrt4an.utils.EManagerFactory.getEntityManager;

/**
 * Created by 123 on 12.10.2016.
 */
public class DeleteDriverServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        DriverDao drd = new DriverDao(getEntityManager());

        Integer id;
        id = Integer.parseInt(request.getParameter("id"));

        drd.deleteDriver(drd.findDriverById(id));

//        request.getRequestDispatcher("/GetAllDriversServlet.jsp").forward(request, response);

        response.sendRedirect("/GetAllDriversServlet");

//        out.print(request.getParameter("id"));
    }
}


