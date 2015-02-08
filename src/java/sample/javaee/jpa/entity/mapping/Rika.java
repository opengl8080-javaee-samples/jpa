package sample.javaee.jpa.entity.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rika {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "enum_value")
    @Enumerated(EnumType.STRING)
    private RikaEnum enumValue;

    public void setEnumValue(RikaEnum enumValue) {
        this.enumValue = enumValue;
    }
}
