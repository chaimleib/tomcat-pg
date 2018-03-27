package com.chaimleib.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet//(urlPatterns={"/"})
public class HomeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String version = req.getServletContext().getMajorVersion() + "." + req.getServletContext().getMinorVersion();
        String body = "Hello World " + version;
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("  <head>");
        out.println("    <link type=\"text/css\" rel=\"stylesheet\" href=\"/css/main.css\"/>");
        out.println("  </head>");
        out.println("  <body>");
        out.println("    <div class=\"page\">");
        out.println("      <div class=\"content\">");
        out.println("        " + body);
        out.println("      </div>");
        out.println("    </div>");
        out.println("  </body>");
        out.println("</html>");
    }

    public void destroy() {
       // do nothing
    }

}