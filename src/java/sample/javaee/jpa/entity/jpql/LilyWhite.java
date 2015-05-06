package sample.javaee.jpa.entity.jpql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lily_white")
public class LilyWhite {
    @Id
    private Long id;
    private String value;

    @Override
    public String toString() {
        return "LilyWhite{" + "id=" + id + ", value=" + value + '}';
    }
}
