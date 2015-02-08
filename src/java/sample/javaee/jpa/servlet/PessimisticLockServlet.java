package sample.javaee.jpa.servlet;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sample.javaee.jpa.ejb.PessimisticLockEjb;

@WebServlet("/pessimistic-lock")
public class PessimisticLockServlet extends HttpServlet {

    @EJB
    private PessimisticLockEjb ejb;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        this.ejb.update(req.getParameter("value") + "_first");
        this.ejb.update(req.getParameter("value") + "_second");
    }
}
