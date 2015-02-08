package sample.javaee.jpa.ejb;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.transaction.TransactionSynchronizationRegistry;

@Stateless
@TransactionAttribute(TransactionAttributeType.NEVER)
public class NeverTxEjb {
    
    @Resource
    private TransactionSynchronizationRegistry tx;
    
    public void method() {
        System.out.println("[NeverTxEjb] tx.key=" + tx.getTransactionKey());
    }
}
