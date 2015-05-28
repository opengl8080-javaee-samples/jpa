package sample.javaee.jpa.entity.criteria;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="komeiji_koishi")
public class KomeijiKoishi {
    @Id
    private Long id;
    private String value;

    @Override
    public String toString() {
        return "KomeijiKoishi{" + "id=" + id + ", value=" + value + '}';
    }
}
