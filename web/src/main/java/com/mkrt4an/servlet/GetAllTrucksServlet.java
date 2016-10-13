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
import java.util.ArrayList;
import java.util.List;

import static com.mkrt4an.utils.EManagerFactory.getEntityManager;

public class GetAllTrucksServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        TruckDao tkd = new TruckDao(getEntityManager());


        List<TruckEntity> tkl = new ArrayList<TruckEntity>();

        tkl = tkd.getAllTrucks();

        out.println("<table border=2 width=2 cellspacing=2 cellpadding=2>");
        out.println("<thead>");
        out.println("</thead>");
        out.println("<tbody>");
        out.println("<tr>");
        out.println("<th>id</th>");
        out.println("<th>Duty Size</th>");
        out.println("<th>capasity</th>");
        out.println("<th>Status</th>");
        out.println("<th>reg Number</th>");
        out.println("<th>current city</th>");
        out.println("</tr>");


        for(TruckEntity tke : tkl){
//            out.println(drd.getAllDrivers());

            out.println("<tr>");
            out.println("<td>");
            out.println(tke.getId());
            out.println("</td>");

            out.println("<td>");
            out.println(tke.getDutySize());
            out.println("</td>");

            out.println("<td>");
            out.println(tke.getCapasity());
            out.println("</td>");

            out.println("<td>");
            out.println(tke.getStatus());
            out.println("</td>");

            out.println("<td>");
            out.println(tke.getRegNumber());
            out.println("</td>");


            out.println("<td>");
            out.println(tke.getCurrentCity().getName());
            out.println("</td>");

            out.println("</tr>");
//            out.println(drd.getAllDrivers());
//            out.println(drd.getAllDrivers());
//            out.println(drd.getAllDrivers());
        }

        out.println("</tbody>");
        out.println("</table>");


    }
}