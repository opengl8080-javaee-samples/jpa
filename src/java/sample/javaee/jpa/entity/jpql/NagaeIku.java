package sample.javaee.jpa.entity.jpql;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NagaeIku {
    @Id
    private Long id;
    private String value;

    @Override
    public String toString() {
        return "NagaeIku{" + "id=" + id + ", value=" + value + '}';
    }
}
