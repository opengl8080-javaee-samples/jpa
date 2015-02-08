package sample.javaee.jpa.entity.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "parent_hong_meiling")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class ParentHongMeiling {
    @Id
    private Long id;
    
    private String name;

    public void setName(String name) {
        this.name = name;
    }
}
