package sample.javaee.jpa.entity.jpql;

import javax.persistence.Embeddable;

@Embeddable
public class EmbeddedSaigyojiYuyuko {
    private int number;

    @Override
    public String toString() {
        return "{ " + this.number + " }";
    }
}
