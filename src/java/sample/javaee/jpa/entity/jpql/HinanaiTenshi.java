package sample.javaee.jpa.entity.jpql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hinanai_tenshi")
public class HinanaiTenshi {
    @Id
    private Long id;
    private int number;

    @Override
    public String toString() {
        return "HinanaiTenshi{" + "id=" + id + ", number=" + number + '}';
    }
}
