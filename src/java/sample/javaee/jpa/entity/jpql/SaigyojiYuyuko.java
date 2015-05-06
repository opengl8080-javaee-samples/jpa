package sample.javaee.jpa.entity.jpql;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "saigyoji_yuyuko")
public class SaigyojiYuyuko {
    @Id
    private Long id;
    @Embedded
    private EmbeddedSaigyojiYuyuko embeddedSaigyojiYuyuko;

    @Override
    public String toString() {
        return "SaigyojiYuyuko{" + "id=" + id + ", embeddedSaigyojiYuyuko=" + embeddedSaigyojiYuyuko + '}';
    }
}
