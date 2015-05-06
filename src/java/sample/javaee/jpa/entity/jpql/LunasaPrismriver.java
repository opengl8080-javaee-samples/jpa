package sample.javaee.jpa.entity.jpql;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "lunasa_prismriver")
public class LunasaPrismriver {
    @Id
    private Long id;
    
    @JoinColumn(name = "merlin_prismriver_id")
    private MerlinPrismriver merlinPrismriver;
    
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "lunasa_prismriver_id")
    private List<LyricaPrismriver> lyricaPrismriverList;
}
