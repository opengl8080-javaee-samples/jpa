package sample.javaee.jpa.entity.criteria;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hijiri_byakuren")
public class HijiriByakuren {
    @Id
    private Long id;
    private String value;
}
