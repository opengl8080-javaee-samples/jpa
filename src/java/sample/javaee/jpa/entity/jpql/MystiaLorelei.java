package sample.javaee.jpa.entity.jpql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mystia_lorelei")
public class MystiaLorelei {
    @Id
    private Long id;

    @Override
    public String toString() {
        return "MystiaLorelei{" + "id=" + id + '}';
    }
}
