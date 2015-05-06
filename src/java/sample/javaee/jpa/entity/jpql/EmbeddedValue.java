package sample.javaee.jpa.entity.jpql;

import javax.persistence.Embeddable;

@Embeddable
public class EmbeddedValue {
    private int number;

    @Override
    public String toString() {
        return "EmbeddedValue{" + "number=" + number + '}';
    }
    
    @Override
    public int hashCode() {
        return this.number;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof EmbeddedValue)) return false;
        
        EmbeddedValue other = (EmbeddedValue)obj;
        
        return this.number == other.number;
    }
}
