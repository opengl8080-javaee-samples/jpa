package sample.javaee.jpa.entity.mapping;

import javax.persistence.Entity;

@Entity
public class ChildRumia extends ParentRumia {
    
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ChildRumia{id=" + id + ", name=" + name + ", value=" + value + '}';
    }
}
