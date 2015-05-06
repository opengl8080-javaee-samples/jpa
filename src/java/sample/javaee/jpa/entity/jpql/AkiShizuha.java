package sample.javaee.jpa.entity.jpql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aki_shizuha")
public class AkiShizuha {
    @Id
    private Long id;
    private String value;

    @Override
    public String toString() {
        return "AkiShizuha{" + "id=" + id + ", value=" + value + '}';
    }
}
