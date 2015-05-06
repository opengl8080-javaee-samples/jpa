package sample.javaee.jpa.entity.jpql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kamishirasawa_keine")
public class KamishirasawaKeine {
    @Id
    private Long id;
}
