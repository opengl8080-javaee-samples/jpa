package sample.javaee.jpa.entity.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(MimaKey.class)
public class Mima {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long key1;
    @Id
    private String key2;
    private String value;

    public void setKey2(String key2) {
        this.key2 = key2;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Mima{" + "key1=" + key1 + ", key2=" + key2 + ", value=" + value + '}';
    }
}
