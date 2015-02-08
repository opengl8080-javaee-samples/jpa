package sample.javaee.jpa.entity.mapping;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EmbeddedKotohime {
    
    @Column(name = "embedded_value")
    private String embeddedValue;

    @Override
    public String toString() {
        return "EmbeddedKotohime{" + "embeddedValue=" + embeddedValue + '}';
    }
}
