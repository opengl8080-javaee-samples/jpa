package sample.javaee.jpa.entity.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "patchouli_knowledge")
public class PatchouliKnowledge {
    @Id
    private Long id;
    @Lob
    @Column(name = "blob_value")
    private byte[] blobValue;
    @Lob
    @Column(name = "clob_value")
    private String clobValue;

    public void setBlobValue(byte[] blobValue) {
        this.blobValue = blobValue;
    }

    public void setClobValue(String clobValue) {
        this.clobValue = clobValue;
    }
}
