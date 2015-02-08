package sample.javaee.jpa.entity.mapping;

import java.util.Map;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;

@Entity
public class Eren {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "eren_map_value")
    @MapKeyColumn(name = "key")
    @Column(name = "value")
    private Map<String, String> map;

    @Override
    public String toString() {
        return "Eren{" + "id=" + id + ", map=" + map + '}';
    }
}
