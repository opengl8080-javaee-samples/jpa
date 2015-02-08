package sample.javaee.jpa.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sample.javaee.jpa.entity.Sample;
import sample.javaee.jpa.exception.MyRollbackException;

@Stateless
public class ExceptionRollbackEjb {
    
    @PersistenceContext(unitName="SampleUnit")
    private EntityManager em;
    
    public void throwException() throws Exception {
        this.insertEntity("exception");
        throw new Exception("test exception");
    }
    
    public void throwRuntimeException() {
        this.insertEntity("runtime exception");
        throw new RuntimeException("test runtime exception");
    }
    
    public void throwMyRollbackException() throws MyRollbackException {
        this.insertEntity("my rollback exception");
        throw new MyRollbackException();
    }
    
    private void insertEntity(String value) {
        Sample sample = new Sample();
        sample.setValue(value);
        this.em.persist(sample);
    }
}
