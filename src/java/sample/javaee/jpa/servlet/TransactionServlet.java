package sample.javaee.jpa.servlet;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.TransactionSynchronizationRegistry;
import sample.javaee.jpa.ejb.MandatoryTxEjb;
import sample.javaee.jpa.ejb.NeverTxEjb;
import sample.javaee.jpa.ejb.NotSupportedTxEjb;
import sample.javaee.jpa.ejb.SupportsTxEjb;
import sample.javaee.jpa.ejb.TransactionEjb;

@WebServlet("/transaction/*")
public class TransactionServlet extends HttpServlet {

    @EJB
    private TransactionEjb ejb;
    @EJB
    private SupportsTxEjb supportsTxEjb;
    @EJB
    private MandatoryTxEjb mandatoryTxEjb;
    @EJB
    private NeverTxEjb neverTxEjb;
    @EJB
    private NotSupportedTxEjb notSupportedTxEjb;
    
    @Resource
    private TransactionSynchronizationRegistry tx;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        String path = req.getRequestURI();
        
        System.out.println("[TransactionServlet] tx.id=" + this.tx.getTransactionKey());
        
        if (path.endsWith("/default")) {
            this.ejb.defaultTransactionManagement();
        } else if (path.endsWith("/requires-new")) {
            this.ejb.requiresNew();
        } else if (path.endsWith("/supports")) {
            this.ejb.supports();
            this.supportsTxEjb.method();
        } else if (path.endsWith("/mandatory")) {
            this.ejb.mandatory();
            this.mandatoryTxEjb.method();
        } else if (path.endsWith("/never")) {
            this.neverTxEjb.method();
            this.ejb.never();
        } else if (path.endsWith("/not-supported")) {
            this.ejb.notSupported();
            this.notSupportedTxEjb.method();
        }
    }
}
