package sample.javaee.jpa.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sample.javaee.jpa.entity.Sample;

@Stateless
public class EntityStateManagementEjb {
    
    @PersistenceContext(unitName="SampleUnit")
    private EntityManager em;
    
    public void test() {
        Sample sample = new Sample();
        
        this.em.persist(sample);
        
        this.em.flush();
        
        this.em.clear();
        
        Sample managed = this.em.merge(sample);
        managed.setValue("こちらの値が反映される");
        sample.setValue("こちらの値は反映されない");
        
        Sample hoge = this.em.find(Sample.class, 1L);
        hoge.setValue("test");
        
        this.em.refresh(hoge);
        
        System.out.println("hoge=" + hoge);
    }
}