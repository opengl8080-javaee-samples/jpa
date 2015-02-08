package sample.javaee.jpa.entity;

import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hoge {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String unuse;
    @ElementCollection
    @CollectionTable(name="hoge_values")
    @Column(name="value")
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Hoge{" + "id=" + id + ", unuse=" + unuse + ", list=" + list + '}';
    }
}
