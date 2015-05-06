package sample.javaee.jpa.entity.jpql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="onoduka_komachi")
public class OnodukaKomachi {
    @Id
    private Long id;
    @JoinColumn(name="shiki_eiki_id")
    private ShikiEiki shikiEiki;

    public ShikiEiki getShikiEiki() {
        return shikiEiki;
    }
    
    @Override
    public String toString() {
        return "OnodukaKomachi{" + "id=" + id + ", shikiEiki=" + shikiEiki + '}';
    }
}
