package com.mkrt4an.servlet;

/**
 * Created by 123 on 04.10.2016.
 */

import com.mkrt4an.dao.TruckDao;
import com.mkrt4an.entity.TruckEntity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static com.mkrt4an.utils.EManagerFactory.getEntityManager;

public class AddNewTruckServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

//        request.getRequestDispatcher("link.html").include(request, response);

//        Cookie ck=new Cookie("name","");
//        ck.setMaxAge(0);
//        response.addCookie(ck);

        Integer dutySize = Integer.parseInt(request.getParameter("dutySize"));
        Integer capasity = Integer.parseInt(request.getParameter("capasity"));
        String regNumber = request.getParameter("regNumber");
        Integer status = Integer.parseInt(request.getParameter("status"));
//        String[] roles = request.getParameterValues("role");
//        String countryCode = request.getParameter("countryCode");
//        String[] animalIds = request.getParameterValues("animalId")
//        String message = request.getParameter("message");
        boolean submitButtonPressed = request.getParameter("submit") != null;

        TruckDao tkd = new TruckDao(getEntityManager());

        TruckEntity tke;
        tke = new TruckEntity(dutySize, capasity, status, regNumber);

        tkd.createTruck(tke);

//        System.out.println(drd.getAllDrivers());

        out.println("<h1> Succsesfully added new truck </h1>");
        out.println(tke);
    }
}