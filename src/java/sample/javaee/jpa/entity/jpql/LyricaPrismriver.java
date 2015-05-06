package sample.javaee.jpa.entity.jpql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lyrica_prismriver")
public class LyricaPrismriver {
    @Id
    private Long id;

    @Override
    public String toString() {
        return "LyricaPrismriver{" + "id=" + id + '}';
    }
}
