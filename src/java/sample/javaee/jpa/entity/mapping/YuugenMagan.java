package sample.javaee.jpa.entity.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "yuugen_magan")
public class YuugenMagan {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "yuugen_magan_seq_gen")
    @SequenceGenerator(name = "yuugen_magan_seq_gen", sequenceName = "yuugen_magan_seq", allocationSize = 1)
    private Long id;
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "YuugenMagan{" + "id=" + id + ", value=" + value + '}';
    }
}
