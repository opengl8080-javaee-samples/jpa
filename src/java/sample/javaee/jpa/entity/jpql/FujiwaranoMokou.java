package sample.javaee.jpa.entity.jpql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fujiwarano_mokou")
public class FujiwaranoMokou {
    @Id
    private Long id;

    @Override
    public String toString() {
        return "FujiwaranoMokou{" + "id=" + id + '}';
    }
}
