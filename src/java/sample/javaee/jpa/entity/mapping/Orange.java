package sample.javaee.jpa.entity.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orange {
    @Id
    private Long id;
    
    private Kurumi kurumi;

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Orange{" + "id=" + id + ", kurumi.id=" + kurumi.getId() + '}';
    }
}
