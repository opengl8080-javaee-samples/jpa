package sample.javaee.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "optimistick_lock_entity")
public class OptimisticLockEntity {
    @Id
    private Long id;
    @Version
    private Long version;
    private String value;
    
    public void setValue(String value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return "OptimisticLockEntity{" + "id=" + id + ", version=" + version + ", value=" + value + '}';
    }
}
