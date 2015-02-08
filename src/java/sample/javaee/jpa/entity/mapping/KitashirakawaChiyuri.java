package sample.javaee.jpa.entity.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "kitashirakawa_chiyuri")
public class KitashirakawaChiyuri {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JoinColumn(name = "okazaki_yumemi_id")
    private OkazakiYumemi okazakiYumemi;

    @Override
    public String toString() {
        return "KitashirakawaChiyuri{" + "id=" + id + ", okazakiYumemi=" + okazakiYumemi + '}';
    }
}
