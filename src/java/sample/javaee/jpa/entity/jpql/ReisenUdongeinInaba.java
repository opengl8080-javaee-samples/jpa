package sample.javaee.jpa.entity.jpql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "reisen_udongein_inaba")
public class ReisenUdongeinInaba {
    @Id
    private Long id;
    @JoinColumn(name = "inaba_tewi_id")
    private ParentInabaTewi inabaTewi;

    @Override
    public String toString() {
        return "ReisenUdongeinInaba{" + "id=" + id + ", inabaTewi=" + inabaTewi + '}';
    }
}
