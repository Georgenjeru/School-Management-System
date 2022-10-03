package com.cohort10.example;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Home extends HttpServlet {

    ServletConfig config = null;

    public void init(ServletConfig config) throws ServletException{
        this.config = config;
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.getWriter().print("<!DOCTYPE html>"
            + "<html> "
                + "<head> "
                    + "<h1>" + config.getServletContext().getInitParameter("applicationLabel") + "</h1>"
                    + "<h2> Welcome: " + req.getParameter("username") + "</h2>"
                + "</head>"
                + "<body>"
                    + "<span style=\"color:green;font-size: 24px;font-weight:bold\">Logged In</span>"
                    + "<br/>Logout <a href='./'>Login</a><br/>"
                + "</body>"
            + "</html>");
    }
}
