package sample.javaee.jpa.entity.criteria;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tatara_kogasa")
public class TataraKogasa {
    @Id
    private Long id;
    private String string;
    private int number;

    @Override
    public String toString() {
        return "TataraKogasa{" + "id=" + id + ", string=" + string + ", number=" + number + '}';
    }
}
