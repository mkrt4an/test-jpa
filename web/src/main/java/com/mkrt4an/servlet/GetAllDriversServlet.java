package com.mkrt4an.servlet; /**
 * Created by 123 on 04.10.2016.
 */

import com.mkrt4an.dao.DriverDao;
import com.mkrt4an.entity.DriverEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import static com.mkrt4an.utils.EManagerFactory.getEntityManager;

public class GetAllDriversServlet extends HttpServlet {

    static final Logger logger = LogManager.getLogger(GetAllDriversServlet.class.getName());

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        DriverDao drd = new DriverDao(getEntityManager());


        List<DriverEntity> drl = new ArrayList<DriverEntity>();

        drl = drd.getAllDrivers();

        out.println("<link rel=\"stylesheet\" href=\"styles.css\" />");
        out.println("<table border=2 width=2 cellspacing=2 cellpadding=2>");
        out.println("<thead>");
        out.println("</thead>");
        out.println("<tbody>");
        out.println("<tr>");
        out.println("<th>id</th>");
        out.println("<th>FirstName</th>");
        out.println("<th>LastName</th>");
        out.println("<th>WorkerHours</th>");
        out.println("<th>Status</th>");
        out.println("<th>current city</th>");
        out.println("<th>current truck</th>");
        out.println("</tr>");


        for(DriverEntity dre : drl){
//            out.println(drd.getAllDrivers());

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
            out.println(dre.getCurrentCity().getName());
            out.println("</td>");

            out.println("<td>");
            out.println(dre.getCurrentTruck().getRegNumber());
            out.println("</td>");

            out.println("<td>");
            out.println(dre.getStatus());
            out.println("</td>");

            out.println("<td>");
            out.print("<a href=/UpdateDriverServlet?id=");
            out.print(dre.getId().toString());
            out.println(" onclick=\"return confirm('Are you sure?')\">update</a>");
            out.println("</td>");

            out.println("<td>");
            out.print("<a href=/DeleteDriverServlet?id=");
            out.print(dre.getId().toString());
            out.println(" onclick=\"return confirm('Are you sure?')\">delete</a>");
            out.println("</td>");

            out.println("</tr>");
//            out.println(drd.getAllDrivers());
//            out.println(drd.getAllDrivers());
//            out.println(drd.getAllDrivers());
        }

        out.println("</tbody>");
        out.println("</table>");

//        out.println("<script>var goDetele = confirm(\"Delete record?\"); alert( isAdmin );</script>");

//        out.println();

    }
}