package sample.javaee.jpa.servlet;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sample.javaee.jpa.ejb.BeanManagementEjb;

@WebServlet("/bmt")
public class BeanManagementServlet extends HttpServlet {
    
    @EJB
    private BeanManagementEjb ejb;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        this.ejb.method(Boolean.valueOf(req.getParameter("rollback")));
    }
}
