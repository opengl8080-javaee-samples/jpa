package sample.javaee.jpa.entity.jpql;

import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "ibuki_suika")
public class IbukiSuika {
    @Id
    private Long id;
    private double number;
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "ibuki_suika_list", joinColumns = @JoinColumn(name = "ibuki_suika_id"))
    @Column(name = "value")
    @OrderColumn(name = "order")
    private List<String> list;

    @Override
    public String toString() {
        return "IbukiSuika{" + "id=" + id + ", number=" + number + ", list=" + list + '}';
    }
}
