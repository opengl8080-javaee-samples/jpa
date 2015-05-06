package sample.javaee.jpa.entity.jpql;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "wriggle_nightbug")
public class WriggleNightbug {
    @Id
    private Long id;
    @JoinColumn(name = "wriggle_nightbug_id")
    private List<MystiaLorelei> mystiaLoreleiList;

    @Override
    public String toString() {
        return "WriggleNightbug{" + "id=" + id + ", mystiaLoreleiList=" + mystiaLoreleiList + '}';
    }
}
