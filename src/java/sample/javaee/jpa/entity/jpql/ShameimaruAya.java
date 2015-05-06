package sample.javaee.jpa.entity.jpql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shameimaru_aya")
public class ShameimaruAya {
    @Id
    private Long id;
    private int number;

    @Override
    public String toString() {
        return "ShameimaruAya{" + "id=" + id + ", number=" + number + '}';
    }
}
