package sample.javaee.jpa.entity.criteria;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="kumoi_ichirin")
public class KumoiIchirin {
    @Id
    private Long id;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name="ichirin_id")
    private List<KumoiUnzan> unzanList;

    @Override
    public String toString() {
        return "KumoiIchirin{" + "id=" + id + ", unzanList=" + unzanList + '}';
    }
}
