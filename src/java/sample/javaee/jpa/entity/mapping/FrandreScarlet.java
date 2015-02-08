package sample.javaee.jpa.entity.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "frandre_scarlet")
public class FrandreScarlet {
    @Id
    private Long id;

    @Override
    public String toString() {
        return "FrandreScarlet{" + "id=" + id + '}';
    }
}
