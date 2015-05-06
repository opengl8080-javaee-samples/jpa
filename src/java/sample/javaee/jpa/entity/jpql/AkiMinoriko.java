package sample.javaee.jpa.entity.jpql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aki_minoriko")
public class AkiMinoriko {
    @Id
    private Long id;
    private int number;

    @Override
    public String toString() {
        return "AkiMinoriko{" + "id=" + id + ", number=" + number + '}';
    }
}
