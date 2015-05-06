package sample.javaee.jpa.entity.jpql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "houraisan_kaguya")
public class HouraisanKaguya {
    @Id
    private Long id;
    private String string;
    private short number;
}
