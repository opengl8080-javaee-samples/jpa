package sample.javaee.jpa.entity.mapping;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class MappedKoakuma {
    @Id
    private Long id;
    
    private String name;

    public void setName(String name) {
        this.name = name;
    }
}
