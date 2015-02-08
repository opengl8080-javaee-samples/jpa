package sample.javaee.jpa.entity.mapping;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.Table;

@Entity
@Table(name = "izayoi_sakuya")
@NamedEntityGraph(
    name = "IzayoiSakuya.remiliaScarletList",
    attributeNodes = @NamedAttributeNode("remiliaScarletList")
)
public class IzayoiSakuya {
    @Id
    private Long id;
    @JoinColumn(name = "izayoi_sakuya_id")
    private List<RemiliaScarlet> remiliaScarletList;
    @JoinColumn(name = "izayoi_sakuya_id")
    private List<FrandreScarlet> frandreScarletList;

    @Override
    public String toString() {
        return "IzayoiSakuya{" + "id=" + id + ", remiliaScarletList=" + remiliaScarletList + ", frandreScarletList=" + frandreScarletList + '}';
    }
}
