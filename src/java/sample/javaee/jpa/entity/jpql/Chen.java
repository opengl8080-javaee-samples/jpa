package sample.javaee.jpa.entity.jpql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Chen.findAll", query = "SELECT c FROM Chen c")
public class Chen {
    @Id
    private Long id;
    private String value;

    @Override
    public String toString() {
        return "Chen{" + "id=" + id + ", value=" + value + '}';
    }
}

