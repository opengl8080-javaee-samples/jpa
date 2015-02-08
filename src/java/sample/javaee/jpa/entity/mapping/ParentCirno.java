package sample.javaee.jpa.entity.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "parent_cirno")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class ParentCirno {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ParentCirno{" + "id=" + id + ", name=" + name + '}';
    }
}
