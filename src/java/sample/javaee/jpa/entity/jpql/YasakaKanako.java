package sample.javaee.jpa.entity.jpql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="yasaka_kanako")
public class YasakaKanako {
    @Id
    private Long id;
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "YasakaKanako{" + "id=" + id + ", value=" + value + '}';
    }
}
