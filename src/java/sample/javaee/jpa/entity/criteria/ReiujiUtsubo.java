package sample.javaee.jpa.entity.criteria;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reiuji_utsubo")
public class ReiujiUtsubo {
    @Id
    private Long id;
    private int number;

    @Override
    public String toString() {
        return "ReiujiUtsubo{" + "id=" + id + ", number=" + number + '}';
    }
}
