package sample.javaee.jpa.entity.jpql;

import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "konpaku_youmu")
public class KonpakuYoumu {
    @Id
    private Long id;
    private int amount;
    private String value;
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "konpaku_youmu_list", joinColumns = @JoinColumn(name = "konpaku_youmu_id"))
    @Column(name = "value")
    private List<String> list;

    @Override
    public String toString() {
        return "KonpakuYoumu{" + "id=" + id + ", amount=" + amount + ", value=" + value + ", list=" + list + '}';
    }
}
