package sample.javaee.jpa.servlet;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sample.javaee.jpa.ejb.OptimisticLockEjb;

@WebServlet("/optimistic-lock/*")
public class OptimisticLockServlet extends HttpServlet {

    @EJB
    private OptimisticLockEjb ejb;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        this.ejb.update(req.getParameter("value") + "_first", 100);
        this.ejb.update(req.getParameter("value") + "_second", 10);
    }
}
