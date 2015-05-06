package sample.javaee.jpa.entity.jpql;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "yagokoro_eirin")
public class YagokoroEirin {
    @Id
    private Long id;
    private String value;
    @Embedded
    private EmbeddedValue embeddedValue;

    @Override
    public String toString() {
        return "YagokoroEirin{" + "id=" + id + ", value=" + value + '}';
    }
}
