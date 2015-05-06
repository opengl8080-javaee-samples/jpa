package sample.javaee.jpa.entity.jpql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kochiya_sanae")
public class KochiyaSanae {
    @Id
    private Long id;
    private int number;

    @Override
    public String toString() {
        return "KochiyaSanae{" + "id=" + id + ", number=" + number + '}';
    }
}
