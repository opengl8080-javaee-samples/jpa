package sample.javaee.jpa.entity.jpql;

import javax.persistence.Entity;

@Entity
public class ChildInabaTewi extends ParentInabaTewi {

    @Override
    public String toString() {
        return "ChildInabaTewi{" + "id=" + id + '}';
    }
}
