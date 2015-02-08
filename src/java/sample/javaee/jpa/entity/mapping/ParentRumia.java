package sample.javaee.jpa.entity.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rumia")
public class ParentRumia {
    @Id
    protected Long id;
    
    protected String name;

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "ParentRumia{" + "id=" + id + ", name=" + name + '}';
    }
}
