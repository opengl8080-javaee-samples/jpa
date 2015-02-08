package sample.javaee.jpa.entity.mapping;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import sample.javaee.jpa.converter.LettyWhiterockConverter;

@Entity
@Table(name = "letty_whiterock")
public class LettyWhiterock {
    @Id
    private Long id;
    
    @Convert(converter = LettyWhiterockConverter.class)
    private String value;

    @Override
    public String toString() {
        return "LettyWhiterock{" + "id=" + id + ", value=" + value + '}';
    }
}
