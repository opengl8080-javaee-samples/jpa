package sample.javaee.jpa.ejb;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sample.javaee.jpa.entity.Sample;

@Stateless
public class ManualRollbackEjb {
    
    @PersistenceContext(unitName="SampleUnit")
    private EntityManager em;
    @Resource
    private SessionContext context;
    
    public void method() {
        Sample sample = this.em.find(Sample.class, 2L);
        sample.setValue("update");
        
        this.context.setRollbackOnly();
    }
}
