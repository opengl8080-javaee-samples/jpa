package sample.javaee.jpa.entity.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Yuuka {
    @Id
    private Long id;

    @Override
    public String toString() {
        return "Yuuka{" + "id=" + id + '}';
    }
}
