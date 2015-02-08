package sample.javaee.jpa.entity.mapping;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Mugetsu {
    @Id
    private Long id;
    
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn
    private List<Gengetsu> gengetsuList;

    @Override
    public String toString() {
        return "Mugetsu{" + "id=" + id + ", gengetsuList=" + gengetsuList + '}';
    }
}
