package sample.javaee.jpa.entity.mapping;

import javax.persistence.Entity;

@Entity
public class Koakuma extends MappedKoakuma {
    
    private String value;

    public void setValue(String value) {
        this.value = value;
    }
}
