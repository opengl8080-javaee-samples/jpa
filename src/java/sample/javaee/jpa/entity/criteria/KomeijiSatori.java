package sample.javaee.jpa.entity.criteria;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="komeiji_satori")
public class KomeijiSatori {
    @Id
    private Long id;
    @JoinColumn(name="komeiji_koishi_id")
    private KomeijiKoishi komeijiKoishi;

    @Override
    public String toString() {
        return "KomeijiSatori{" + "id=" + id + ", komeijiKoishi=" + komeijiKoishi + '}';
    }
}
