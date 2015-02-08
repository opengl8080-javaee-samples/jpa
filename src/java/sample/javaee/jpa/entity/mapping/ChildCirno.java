package sample.javaee.jpa.entity.mapping;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "child_cirno")
public class ChildCirno extends ParentCirno {
    
    private String value;

    public void setValue(String value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return "ChildCirno{" + "id=" + id + ", name=" + name + ", value=" + value + '}';
    }
}
