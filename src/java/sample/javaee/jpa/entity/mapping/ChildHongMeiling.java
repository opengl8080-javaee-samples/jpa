package sample.javaee.jpa.entity.mapping;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "child_hong_meiling")
public class ChildHongMeiling extends ParentHongMeiling {
    private String value;

    public void setValue(String value) {
        this.value = value;
    }
}
