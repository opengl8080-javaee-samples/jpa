package sample.javaee.jpa.ejb;

import javax.ejb.Asynchronous;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sample.javaee.jpa.entity.OptimisticLockEntity;

@Stateless
public class OptimisticLockEjb {
    @PersistenceContext(unitName="SampleUnit")
    private EntityManager em;
    
    @Asynchronous
    public void update(String value, long time) {
        OptimisticLockEntity entity = this.em.find(OptimisticLockEntity.class, 1L);
        entity.setValue(value);
        
        try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {}
    }
}
