package sample.javaee.jpa.entity.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Kurumi {
    @Id
    private Long id;
    @OneToOne(mappedBy = "kurumi")
    private Orange orange;

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Kurumi{" + "id=" + id + ", orange.id=" + orange.getId() + '}';
    }
}
