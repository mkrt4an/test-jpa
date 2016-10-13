package com.mkrt4an.servlet;

/**
 * Created by 123 on 04.10.2016.
 */

import com.mkrt4an.dao.DriverDao;
import com.mkrt4an.entity.DriverEntity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static com.mkrt4an.utils.EManagerFactory.getEntityManager;

public class AddNewDriverServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

//        request.getRequestDispatcher("link.html").include(request, response);

//        Cookie ck=new Cookie("name","");
//        ck.setMaxAge(0);
//        response.addCookie(ck);

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        Integer workedHours = Integer.parseInt(request.getParameter("workedHours"));
        Integer status = Integer.parseInt(request.getParameter("status"));
//        String[] roles = request.getParameterValues("role");
//        String countryCode = request.getParameter("countryCode");
//        String[] animalIds = request.getParameterValues("animalId")
//        String message = request.getParameter("message");
        boolean submitButtonPressed = request.getParameter("submit") != null;

        DriverDao drd = new DriverDao(getEntityManager());

        DriverEntity dre;
        dre = new DriverEntity(firstName, lastName, workedHours, status);

        drd.createDriver(dre);

//        System.out.println(drd.getAllDrivers());

        String st = "sdfsdfsdf";

        out.println("<h1> Succsesfully added new driver </h1>");
        out.println("<table border=2 width=2 cellspacing=2 cellpadding=2>");
        out.println("<thead>");
//        out.println("<h3> title </h3>");
        out.println("</thead>");
        out.println("<tbody>");
        out.println("<tr>");
        out.println("<th> Id </th>");
        out.println("<th> FirstName </th>");
        out.println("<th> LastName </th>");
        out.println("<th> WorkedHours </th>");
        out.println("<th> Status </th>");
        out.println("</tr>");


        out.println("<tr>");
        out.println("<td>");
        out.println(dre.getId());
        out.println("</td>");

        out.println("<td>");
        out.println(dre.getFirstName());
        out.println("</td>");

        out.println("<td>");
        out.println(dre.getLastName());
        out.println("</td>");

        out.println("<td>");
        out.println(dre.getWorkedHours());
        out.println("</td>");

        out.println("<td>");
        out.println(dre.getStatus());
        out.println("</td>");

        out.println("</tr>");

        out.println("</tbody>");
        out.println("</table>");




//        out.println(dre);
    }
}