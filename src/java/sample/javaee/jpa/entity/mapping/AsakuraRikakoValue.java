package sample.javaee.jpa.entity.mapping;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AsakuraRikakoValue {
    @Column(name = "embedded_value")
    private String value;

    @Override
    public String toString() {
        return "AsakuraRikakoValue{" + "value=" + value + '}';
    }
}
