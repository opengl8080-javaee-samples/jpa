package sample.javaee.jpa.entity.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "remilia_scarlet")
public class RemiliaScarlet {
    @Id
    private Long id;

    @Override
    public String toString() {
        return "RemiliaScarlet{" + "id=" + id + '}';
    }
}
