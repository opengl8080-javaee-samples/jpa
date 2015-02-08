package sample.javaee.jpa.entity.mapping;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Yumeko {
    @Id
    private Long id;
    
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "yumekoList")
    private List<Alice> aliceList;

    public Long getId() {
        return id;
    }
    
    @Override
    public String toString() {
        List<String> ids = new ArrayList<>();
        
        for (Alice alice : this.aliceList) {
            ids.add(String.valueOf(alice.getId()));
        }
        
        return "Yumeko{" + "id=" + id + ", aliceList=" + String.join(", ", ids) + '}';
    }
}
