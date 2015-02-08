package sample.javaee.jpa.entity.mapping;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Kotohime {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String value;
    @Embedded
    private EmbeddedKotohime embeddedKotohime;

    @Override
    public String toString() {
        return "Kotohime{" + "id=" + id + ", value=" + value + ", embeddedKotohime=" + embeddedKotohime + '}';
    }
}
