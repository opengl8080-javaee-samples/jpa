package sample.javaee.jpa.entity.jpql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="inubashiri_momiji")
public class InubashiriMomiji {
    @Id
    private Long id;
    private int number;

    @Override
    public String toString() {
        return "InubashiriMomiji{" + "id=" + id + ", number=" + number + '}';
    }
}
