package sample.javaee.jpa.entity.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Konngara {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String value;
    @Transient
    private String ignore;

    public void setValue(String value) {
        this.value = value;
    }

    public void setIgnore(String ignore) {
        this.ignore = ignore;
    }
}
