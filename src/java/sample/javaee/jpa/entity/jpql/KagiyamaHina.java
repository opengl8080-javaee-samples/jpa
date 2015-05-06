package sample.javaee.jpa.entity.jpql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kagiyama_hina")
public class KagiyamaHina {
    @Id
    private Long id;
    private int number;

    @Override
    public String toString() {
        return "KagiyamaHina{" + "id=" + id + ", number=" + number + '}';
    }
}
