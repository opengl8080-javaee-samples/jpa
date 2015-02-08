package sample.javaee.jpa.ejb;

import javax.ejb.Asynchronous;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import javax.persistence.PersistenceContext;
import sample.javaee.jpa.entity.PessimisticLockEntity;

@Stateless
public class PessimisticLockEjb {
    @PersistenceContext(unitName="SampleUnit")
    private EntityManager em;
    
    @Asynchronous
    public void update(String value) {
        System.out.println("start update(" + value + ")");
        
        PessimisticLockEntity entity = this.em.find(PessimisticLockEntity.class, 1L);
        
        System.out.println("found entity : " + value);
        
        this.em.lock(entity, LockModeType.PESSIMISTIC_READ);
        
        System.out.println("lock entity : " + value);
        
        entity.setValue(value);
        
        System.out.println("end update(" + value + ")");
    }
}
