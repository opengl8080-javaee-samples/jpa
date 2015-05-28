package sample.javaee.jpa.entity.criteria;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="toramaru_shou")
public class ToramaruShou {
    @Id
    private Long id;

    @Override
    public String toString() {
        return "ToramaruShou{" + "id=" + id + '}';
    }
}
