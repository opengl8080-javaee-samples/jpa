package sample.javaee.jpa.entity.criteria;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hoshiguma_yugi")
public class HoshigumaYugi {
    @Id
    private Long id;
    private String value;

    @Override
    public String toString() {
        return "HoshigumaYugi{" + "id=" + id + ", value=" + value + '}';
    }
}
