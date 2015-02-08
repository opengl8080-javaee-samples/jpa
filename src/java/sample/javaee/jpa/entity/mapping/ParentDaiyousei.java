package sample.javaee.jpa.entity.mapping;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "daiyousei")
@DiscriminatorColumn(name = "entity_type", discriminatorType = DiscriminatorType.INTEGER)
@DiscriminatorValue("1")
public class ParentDaiyousei {
    @Id
    private Long id;
    private String value;

    public void setValue(String value) {
        this.value = value;
    }
}
