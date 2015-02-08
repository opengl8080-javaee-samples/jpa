package sample.javaee.jpa.entity.mapping;

import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "kana_anaberaru")
public class KanaAnaberaru {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Embedded
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(
        name = "kana_anaberaru_list_value",
        joinColumns = @JoinColumn(name = "kana_anaberaru_id")
    )
    private List<EmbeddedKanaAnaberaru> embeddedKanaAnaberaruList;

    @Override
    public String toString() {
        return "KanaAnaberaru{" + "id=" + id + ", embeddedKanaAnaberaruList=" + embeddedKanaAnaberaruList + '}';
    }
}
