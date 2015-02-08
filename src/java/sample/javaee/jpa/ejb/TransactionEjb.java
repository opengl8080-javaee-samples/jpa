package sample.javaee.jpa.ejb;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.transaction.TransactionSynchronizationRegistry;

@Stateless
public class TransactionEjb {
    
    @Resource
    private TransactionSynchronizationRegistry tx;
    @EJB
    private DefaultTxEjb defaultTxEjb;
    @EJB
    private RequiresNewTxEjb requiresNewTxEjb;
    @EJB
    private SupportsTxEjb supportsTxEjb;
    @EJB
    private MandatoryTxEjb mandatoryTxEjb;
    @EJB
    private NeverTxEjb neverTxEjb;
    @EJB
    private NotSupportedTxEjb notSupportedTxEjb;
    
    public void defaultTransactionManagement() {
        this.printTxId();
        this.defaultTxEjb.method();
    }
    
    public void requiresNew() {
        this.printTxId();
        this.requiresNewTxEjb.method();
    }
    
    public void supports() {
        this.printTxId();
        this.supportsTxEjb.method();
    }
    
    public void mandatory() {
        this.printTxId();
        this.mandatoryTxEjb.method();
    }
    
    public void never() {
        this.printTxId();
        this.neverTxEjb.method();
    }
    
    public void notSupported() {
        this.printTxId();
        this.notSupportedTxEjb.method();
    }
    
    private void printTxId() {
        System.out.println("[TransactionEjb] tx.key=" + tx.getTransactionKey());
    }
}
