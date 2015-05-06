package sample.javaee.jpa.entity.jpql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicine_melancholy")
public class MedicineMelancholy {
    @Id
    private Long id;
    private String code;
    private String value;

    @Override
    public String toString() {
        return "MedicineMelancholy{" + "id=" + id + ", code=" + code + ", value=" + value + '}';
    }
}
