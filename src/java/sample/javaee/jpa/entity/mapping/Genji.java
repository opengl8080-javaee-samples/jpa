package sample.javaee.jpa.entity.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Genji {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "enum_value")
    private GenjiEnum enumValue;

    public void setEnumValue(GenjiEnum enumValue) {
        this.enumValue = enumValue;
    }
}
