package sample.javaee.jpa.entity.mapping;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Embeddable
public class SarielKey implements Serializable {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long key1;
    private String key2;

    public void setKey2(String key2) {
        this.key2 = key2;
    }
    
    @Override
    public String toString() {
        return "SarielKey{" + "key1=" + key1 + ", key2=" + key2 + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.key1);
        hash = 83 * hash + Objects.hashCode(this.key2);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SarielKey other = (SarielKey) obj;
        if (!Objects.equals(this.key1, other.key1)) {
            return false;
        }
        if (!Objects.equals(this.key2, other.key2)) {
            return false;
        }
        return true;
    }
}
