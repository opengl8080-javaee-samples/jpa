package sample.javaee.jpa.entity.mapping;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class ChildDaiyousei extends ParentDaiyousei {
}
