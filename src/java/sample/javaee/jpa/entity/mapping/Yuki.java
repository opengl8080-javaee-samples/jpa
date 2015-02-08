package sample.javaee.jpa.entity.mapping;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Yuki {
    @Id
    private Long id;
    
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "yuki_id")
    private List<Mai> maiList;

    public Long getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "Yuki{" + "id=" + id + ", maiList=" + maiList + '}';
    }
}
