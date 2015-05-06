package sample.javaee.jpa.entity.jpql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kazami_yuka")
public class KazamiYuka {
    @Id
    private Long id;
    private String code;
    private String value;

    @Override
    public String toString() {
        return "KazamiYuka{" + "id=" + id + ", code=" + code + ", value=" + value + '}';
    }
}
