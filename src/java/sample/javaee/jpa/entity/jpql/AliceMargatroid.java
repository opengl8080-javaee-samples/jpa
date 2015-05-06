package sample.javaee.jpa.entity.jpql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alice_margatroid")
public class AliceMargatroid {
    @Id
    private Long id;
    private String name;
    private String value;

    @Override
    public String toString() {
        return "AliceMargatroid{" + "id=" + id + ", name=" + name + ", value=" + value + '}';
    }
}
