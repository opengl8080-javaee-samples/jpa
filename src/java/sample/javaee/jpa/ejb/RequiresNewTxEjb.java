package sample.javaee.jpa.ejb;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.transaction.TransactionSynchronizationRegistry;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class RequiresNewTxEjb {
    
    @Resource
    private TransactionSynchronizationRegistry tx;
    
    public void method() {
        System.out.println("[RequiresNewTxEjb] tx.key=" + tx.getTransactionKey());
    }
}
