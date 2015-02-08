package sample.javaee.jpa.servlet;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sample.javaee.jpa.ejb.ManualRollbackEjb;

@WebServlet("/manual-rollback")
public class ManualRollbackServlet extends HttpServlet {

    @EJB
    private ManualRollbackEjb ejb;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        this.ejb.method();
    }
}
