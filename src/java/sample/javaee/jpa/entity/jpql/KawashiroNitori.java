package sample.javaee.jpa.entity.jpql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kawashiro_nitori")
public class KawashiroNitori {
    @Id
    private Long id;
    private String value;

    @Override
    public String toString() {
        return "KawashiroNitori{" + "id=" + id + ", value=" + value + '}';
    }
}
