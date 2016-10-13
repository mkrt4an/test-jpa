package com.mkrt4an.servlet;

import com.mkrt4an.dao.DriverDao;
import com.mkrt4an.entity.DriverEntity;

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
public class UpdateDriverServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        DriverDao drd = new DriverDao(getEntityManager());

        Integer id = 0;


        DriverEntity dre;



        if (request.getParameter("update") != null){

            dre = drd.findDriverById(id);

            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            Integer workedHours = Integer.parseInt(request.getParameter("workedHours"));
            Integer status = Integer.parseInt(request.getParameter("status"));

            dre.setFirstName(firstName);
            dre.setLastName(lastName);
            dre.setWorkedHours(workedHours);
            dre.setStatus(status);

            drd.updateDriver(dre);

            request.getRequestDispatcher("/GetAllDriversServlet").forward(request, response);

//            out.println(request.getParameter("update"));
//            out.println(request.getParameter("firstName"));
//            out.println(request.getParameter("lastName"));
        }

        id = Integer.parseInt(request.getParameter("id"));
        dre = drd.findDriverById(id);


        request.setAttribute("id", dre.getId());
        request.setAttribute("firstName", dre.getFirstName());
        request.setAttribute("lastName", dre.getLastName());
        request.setAttribute("workedHours", dre.getWorkedHours());
        request.setAttribute("status", dre.getStatus());

        request.getRequestDispatcher("/UpdateDriver.jsp").forward(request, response);

    }
}
