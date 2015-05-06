package sample.javaee.jpa.entity.jpql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="moriya_suwako")
public class MoriyaSuwako {
    @Id
    private Long id;
    private int number;

    @Override
    public String toString() {
        return "MoriyaSuwako{" + "id=" + id + ", number=" + number + '}';
    }
}
