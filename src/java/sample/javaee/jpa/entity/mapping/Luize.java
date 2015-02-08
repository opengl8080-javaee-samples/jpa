package sample.javaee.jpa.entity.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;

@Entity
public class Luize {
    @Id
    private Long id;

    @JoinTable(name="sara_luize")
    private Sara sara;

    @Override
    public String toString() {
        return "Luize{" + "id=" + id + ", sara.id=" + sara.getId() + '}';
    }
}
