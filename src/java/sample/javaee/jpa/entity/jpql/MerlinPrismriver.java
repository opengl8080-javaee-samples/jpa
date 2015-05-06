package sample.javaee.jpa.entity.jpql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "merlin_prismriver")
public class MerlinPrismriver {
    @Id
    private Long id;

    @Override
    public String toString() {
        return "MerlinPrismriver{" + "id=" + id + '}';
    }
}
