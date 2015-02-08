package sample.javaee.jpa.ejb;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;
import sample.javaee.jpa.entity.Sample;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class BeanManagementEjb {
    
    @PersistenceContext(unitName="SampleUnit")
    private EntityManager em;
    @Resource
    private UserTransaction tx;
    
    public void method(boolean rollback) {
        try {
            this.tx.begin();
            
            Sample sample = new Sample();
            sample.setValue("BMT");
            
            this.em.persist(sample);
            
            if (rollback) {
                this.tx.rollback();
                System.out.println("rollback");
            } else {
                this.tx.commit();
                System.out.println("commit");
            }
        } catch (NotSupportedException
                | SystemException
                | RollbackException
                | HeuristicMixedException
                | HeuristicRollbackException ex) {
            ex.printStackTrace();
        }
    }
}
