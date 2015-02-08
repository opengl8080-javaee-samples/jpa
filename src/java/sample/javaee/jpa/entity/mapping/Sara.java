package sample.javaee.jpa.entity.mapping;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Sara {
    @Id
    private Long id;
    
    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
        inverseJoinColumns = @JoinColumn(name = "luize_id")
    )
    private List<Luize> luizeList;

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Sara{" + "id=" + id + ", luizeList=" + luizeList + '}';
    }
}
