package sample.javaee.jpa.entity.jpql;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "yakumo_ran")
public class YakumoRan {
    @Id
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date date;

    @Override
    public String toString() {
        return "YakumoRan{" + "id=" + id + ", date=" + date + '}';
    }
}
