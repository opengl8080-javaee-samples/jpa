package sample.javaee.jpa.entity.criteria;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="test_table")
public class TestTable {
    @Id
    private Long id;
    private String value;
    
    @Override
    public String toString() {
        return "Chen [id=" + id + ", value=" + value + "]";
    }
}
