package sample.javaee.jpa.entity.mapping;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OrderColumn;

@Entity
public class Shinki {
    @Id
    private Long id;
    
    @ElementCollection(fetch = FetchType.EAGER)
    @Column(name = "value")
    @OrderColumn(name = "order")
    private List<String> list;

    @Override
    public String toString() {
        return "Shinki{" + "id=" + id + ", list=" + list + '}';
    }
}
