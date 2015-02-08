package sample.javaee.jpa.entity.mapping;

import java.util.Map;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "asakura_rikako")
public class AsakuraRikako {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Embedded
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(
        name = "asakura_rikako_map_values",
        joinColumns = @JoinColumn(name = "asakura_rikako_id")
    )
    private Map<AsakuraRikakoKey, AsakuraRikakoValue> map;

    @Override
    public String toString() {
        return "AsakuraRikako{" + "id=" + id + ", map=" + map + '}';
    }
}
