package sample.javaee.jpa.servlet;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sample.javaee.jpa.ejb.ExceptionRollbackEjb;

@WebServlet("/ex-rollback/*")
public class ExceptionRollbackServlet extends HttpServlet {

    @EJB
    private ExceptionRollbackEjb ejb;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        String path = req.getRequestURI();
        
        try {
            if (path.endsWith("/runtime")) {
                this.ejb.throwRuntimeException();
            } else if (path.endsWith("/my-exception")) {
                this.ejb.throwMyRollbackException();
            } else {
                this.ejb.throwException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
