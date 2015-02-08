package sample.javaee.jpa.ejb;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.transaction.TransactionSynchronizationRegistry;

@Stateless
public class DefaultTxEjb {
    
    @Resource
    private TransactionSynchronizationRegistry tx;
    
    public void method() {
        System.out.println("[DefaultTxEjb] tx.key=" + tx.getTransactionKey());
    }
}
