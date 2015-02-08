package sample.javaee.jpa.entity.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kirisame_marisa")
public class KirisameMarisa {
    @Id
    @Column(name = "id_column")
    private Long id;

    @Override
    public String toString() {
        return "KirisameMarisa{" + "id=" + id + '}';
    }
}
