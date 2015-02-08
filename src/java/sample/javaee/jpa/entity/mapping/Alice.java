package sample.javaee.jpa.entity.mapping;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Alice {
    @Id
    private Long id;
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        joinColumns = @JoinColumn(name = "alice_id"),
        inverseJoinColumns = @JoinColumn(name = "yumeko_id")
    )
    private List<Yumeko> yumekoList;

    public Long getId() {
        return id;
    }
    
    @Override
    public String toString() {
        List<String> ids = new ArrayList<>();
        
        for (Yumeko yumeko : this.yumekoList) {
            ids.add(String.valueOf(yumeko.getId()));
        }
        
        return "Alice{" + "id=" + id + ", yumekoList=" + String.join(", ", ids) + '}';
    }
}
