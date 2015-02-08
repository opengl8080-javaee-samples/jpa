package sample.javaee.jpa.entity.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mai {
    @Id
    private Long id;
    
    private Yuki yuki;

    @Override
    public String toString() {
        return "Mai{" + "id=" + id + ", yuki.id=" + yuki.getId() + '}';
    }
}
