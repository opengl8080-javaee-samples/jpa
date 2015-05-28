package sample.javaee.jpa.entity.criteria;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hojo_nue")
public class HojuNue {
    @Id
    private Long id;
}
