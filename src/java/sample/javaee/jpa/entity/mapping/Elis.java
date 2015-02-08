package sample.javaee.jpa.entity.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class Elis {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "elis_seq_generator")
    @TableGenerator(name = "elis_seq_generator",
                    table = "seq_generator",
                    pkColumnName = "table_name",
                    valueColumnName = "sequence_number",
                    pkColumnValue = "elis",
                    allocationSize = 1)
    private Long id;
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Elis{" + "id=" + id + ", value=" + value + '}';
    }
}
