package sample.javaee.jpa.entity.criteria;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Nazrin {
    @Id
    private Long id;
    private int number;

    @Override
    public String toString() {
        return "Nazrin{" + "id=" + id + ", number=" + number + '}';
    }
}
