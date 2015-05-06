package sample.javaee.jpa.entity.jpql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "yakumo_yukari")
public class YakumoYukari {
    @Id
    private Long id;
    
    private String string;

    @Override
    public String toString() {
        return "YakumoYukari{" + "id=" + id + ", string=" + string + '}';
    }
}
