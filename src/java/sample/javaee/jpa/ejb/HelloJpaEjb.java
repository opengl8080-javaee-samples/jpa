package sample.javaee.jpa.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sample.javaee.jpa.entity.Sample;

@Stateless
public class HelloJpaEjb {
    
    @PersistenceContext(unitName="SampleUnit")
    private EntityManager em;
    
    public void persist(String value) {
        Sample sample = new Sample();
        sample.setValue(value);

        this.em.persist(sample);
        
        System.out.println("persist : " + sample);
    }
    
    public void remove(long id) {
        Sample sample = this.em.find(Sample.class, id);
        this.em.remove(sample);
        
        System.out.println("remove : " + sample);
    }
    
    public void print(long id) {
        Sample sample = this.em.find(Sample.class, id);
        
        System.out.println(sample);
    }
    
    public void update(long id, String value) {
        Sample sample = this.em.find(Sample.class, id);
        sample.setValue(value);
        
        System.out.println("update : " + sample);
    }
}
