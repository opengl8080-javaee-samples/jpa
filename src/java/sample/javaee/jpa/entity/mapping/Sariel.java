package sample.javaee.jpa.entity.mapping;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Sariel {
    
    @EmbeddedId
    private SarielKey key;
    private String value;

    public void setKey(SarielKey key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Sariel{" + "key=" + key + ", value=" + value + '}';
    }
}
