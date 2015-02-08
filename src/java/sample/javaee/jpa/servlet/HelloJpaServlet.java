package sample.javaee.jpa.servlet;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sample.javaee.jpa.ejb.HelloJpaEjb;

@WebServlet("/hello/*")
public class HelloJpaServlet extends HttpServlet {
    
    @EJB
    private HelloJpaEjb ejb;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        String path = req.getRequestURI();
        
        if (path.endsWith("/persist")) {
            this.ejb.persist(this.getValue(req));
            
        } else if (path.endsWith("/remove")) {
            this.ejb.remove(this.getId(req));
            
        } else if (path.endsWith("/update")) {
            this.ejb.update(this.getId(req), this.getValue(req));
            
        } else {
            this.ejb.print(this.getId(req));
            
        }
    }
    
    private String getValue(HttpServletRequest req) {
        return req.getParameter("value");
    }
    
    private long getId(HttpServletRequest req) {
        return Long.parseLong(req.getParameter("id"));
    }
}
