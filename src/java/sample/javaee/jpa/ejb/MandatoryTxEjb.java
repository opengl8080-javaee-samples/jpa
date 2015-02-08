package sample.javaee.jpa.ejb;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.transaction.TransactionSynchronizationRegistry;

@Stateless
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public class MandatoryTxEjb {
    
    @Resource
    private TransactionSynchronizationRegistry tx;
    
    public void method() {
        System.out.println("[MandatoryTxEjb] tx.key=" + tx.getTransactionKey());
    }
}
