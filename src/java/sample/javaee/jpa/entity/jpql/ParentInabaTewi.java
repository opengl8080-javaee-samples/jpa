package sample.javaee.jpa.entity.jpql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inaba_tewi")
public class ParentInabaTewi {
    @Id
    protected Long id;

    @Override
    public String toString() {
        return "ParentInabaTewi{" + "id=" + id + '}';
    }
}
