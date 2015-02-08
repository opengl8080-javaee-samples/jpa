package sample.javaee.jpa.entity.mapping;

import java.io.Serializable;
import java.util.Objects;

public class MimaKey implements Serializable {
    
    private Long key1;
    private String key2;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.key1);
        hash = 19 * hash + Objects.hashCode(this.key2);
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
        final MimaKey other = (MimaKey) obj;
        if (!Objects.equals(this.key1, other.key1)) {
            return false;
        }
        if (!Objects.equals(this.key2, other.key2)) {
            return false;
        }
        return true;
    }
}
