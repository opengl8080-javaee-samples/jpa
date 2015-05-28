package sample.javaee.jpa.entity.criteria;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kurodani_yamame")
public class KurodaniYmame {
    @Id
    private Long id;
    private String string;
    private int number;

    @Override
    public String toString() {
        return "KurodaniYmame{" + "id=" + id + ", string=" + string + ", number=" + number + '}';
    }
}
