package com.chaimleib.servlets;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet
public class HomeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String version = req.getServletContext().getMajorVersion() + "." + req.getServletContext().getMinorVersion();
        req.setAttribute("servletVersion", version);
        RequestDispatcher disp = req.getRequestDispatcher("index.jsp");
        disp.forward(req, resp);
    }

    public void destroy() {
       // do nothing
    }

}
