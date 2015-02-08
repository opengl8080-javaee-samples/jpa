package sample.javaee.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pessimistic_lock_entity")
public class PessimisticLockEntity {
    @Id
    private Long id;
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PessimisticLockEntity{" + "id=" + id + ", value=" + value + '}';
    }
}
