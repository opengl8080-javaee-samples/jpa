package sample.javaee.jpa.entity.mapping;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AsakuraRikakoKey {
    @Column(name = "embedded_key")
    private String key;

    @Override
    public String toString() {
        return "AsakuraRikakoKey{" + "key=" + key + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.key);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AsakuraRikakoKey other = (AsakuraRikakoKey) obj;
        if (!Objects.equals(this.key, other.key)) {
            return false;
        }
        return true;
    }
}
