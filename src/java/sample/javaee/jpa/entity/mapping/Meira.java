package sample.javaee.jpa.entity.mapping;

import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OrderBy;

@Entity
public class Meira {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "meira_list_value")
    @Column(name = "value")
    @OrderBy("DESC")
    private List<String> list;
    
    @ElementCollection
    @CollectionTable(name = "meira_list_value")
    @Column(name = "value")
    public List<String> lazyList;

    @Override
    public String toString() {
        return "Meira{" + "id=" + id + ", list=" + list + ", lazyList=" + lazyList + '}';
    }
}
