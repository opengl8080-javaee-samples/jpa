package sample.javaee.jpa.entity.mapping;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Elliy {
    @Id
    private Long id;
    
    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(inverseJoinColumns = @JoinColumn(name = "yuuka_id"))
    private List<Yuuka> yuukaList;

    @Override
    public String toString() {
        return "Elliy{" + "id=" + id + ", yuukaList=" + yuukaList + '}';
    }
}
