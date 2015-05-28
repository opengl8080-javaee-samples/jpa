package sample.javaee.jpa.entity.criteria;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mizuhashi_parsee")
public class MizuhashiParsee {
    @Id
    private Long id;
    private String value;

    @Override
    public String toString() {
        return "MizuhashiParsee{" + "id=" + id + ", value=" + value + '}';
    }
}
