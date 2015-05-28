package sample.javaee.jpa.entity.criteria;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kaenbyo_rin")
public class KaenbyoRin {
    @Id
    private Long id;
    private int number;
    private String string;

    @Override
    public String toString() {
        return "KaenbyoRin{" + "id=" + id + ", number=" + number + ", string=" + string + '}';
    }
}
