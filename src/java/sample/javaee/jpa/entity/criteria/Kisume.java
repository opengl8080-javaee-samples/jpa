package sample.javaee.jpa.entity.criteria;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Kisume {
    @Id
    private Long id;

    @Override
    public String toString() {
        return "Kisume{" + "id=" + id + '}';
    }
}
