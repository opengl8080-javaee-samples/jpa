package sample.javaee.jpa.entity.criteria;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kumoi_unzan")
public class KumoiUnzan {
    @Id
    private Long id;
    private String value;

    @Override
    public String toString() {
        return "KumoiUnzan{" + "id=" + id + ", value=" + value + '}';
    }
}
