package sample.javaee.jpa.entity.criteria;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="murasa_minamitsu")
public class MurasaMinamitsu {
    @Id
    private Long id;

    @Override
    public String toString() {
        return "MurasaMinamitsu{" + "id=" + id + '}';
    }
}
