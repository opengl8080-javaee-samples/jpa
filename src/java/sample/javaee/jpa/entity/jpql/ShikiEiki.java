package sample.javaee.jpa.entity.jpql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shiki_eiki")
public class ShikiEiki {
    @Id
    private Long id;
    private String value;

    @Override
    public String toString() {
        return "ShikiEiki{" + "id=" + id + ", value=" + value + '}';
    }
}
