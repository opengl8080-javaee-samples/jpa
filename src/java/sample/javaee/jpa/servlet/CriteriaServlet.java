package sample.javaee.jpa.servlet;

import java.lang.reflect.Method;
import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sample.javaee.jpa.ejb.CriteriaEjb;

@WebServlet("/criteria/*")
public class CriteriaServlet extends HttpServlet {

    @EJB
    private CriteriaEjb ejb;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        String path = req.getPathInfo();
        
        try {
            Method method = this.ejb.getClass().getMethod(path.replace("/", ""));
            method.invoke(this.ejb);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
