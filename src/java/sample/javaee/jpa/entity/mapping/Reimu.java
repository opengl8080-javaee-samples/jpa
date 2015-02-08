package sample.javaee.jpa.entity.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reimu {
    @Id
    private Long id;

    @Override
    public String toString() {
        return "Reimu{" + "id=" + id + '}';
    }
}
