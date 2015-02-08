package sample.javaee.jpa.servlet;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sample.javaee.jpa.ejb.EntityStateManagementEjb;

@WebServlet("/state")
public class EntityStateManagementServlet extends HttpServlet {

    @EJB
    private EntityStateManagementEjb ejb;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        this.ejb.test();
    }
}
