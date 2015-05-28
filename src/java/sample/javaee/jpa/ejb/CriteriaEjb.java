package sample.javaee.jpa.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.Tuple;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Subquery;
import sample.javaee.jpa.entity.criteria.HijiriByakuren;
import sample.javaee.jpa.entity.criteria.HojuNue;
import sample.javaee.jpa.entity.criteria.HoshigumaYugi;
import sample.javaee.jpa.entity.criteria.KaenbyoRin;
import sample.javaee.jpa.entity.criteria.Kisume;
import sample.javaee.jpa.entity.criteria.KomeijiSatori;
import sample.javaee.jpa.entity.criteria.KumoiIchirin;
import sample.javaee.jpa.entity.criteria.KumoiUnzan;
import sample.javaee.jpa.entity.criteria.KurodaniYmame;
import sample.javaee.jpa.entity.criteria.MizuhashiParsee;
import sample.javaee.jpa.entity.criteria.MurasaMinamitsu;
import sample.javaee.jpa.entity.criteria.Nazrin;
import sample.javaee.jpa.entity.criteria.ReiujiUtsubo;
import sample.javaee.jpa.entity.criteria.TataraKogasa;
import sample.javaee.jpa.entity.criteria.TestTable;
import sample.javaee.jpa.entity.criteria.ToramaruShou;
import sample.javaee.jpa.entity.criteria.one.HojuNue_;
import sample.javaee.jpa.entity.criteria.one.HoshigumaYugi_;
import sample.javaee.jpa.entity.criteria.one.KaenbyoRin_;
import sample.javaee.jpa.entity.criteria.one.KomeijiKoishi_;
import sample.javaee.jpa.entity.criteria.one.KumoiIchirin_;
import sample.javaee.jpa.entity.criteria.one.KurodaniYmame_;
import sample.javaee.jpa.entity.criteria.one.MizuhashiParsee_;
import sample.javaee.jpa.entity.criteria.one.Nazrin_;
import sample.javaee.jpa.entity.criteria.one.ReiujiUtsubo_;
import sample.javaee.jpa.entity.criteria.one.TataraKogasa_;
import sample.javaee.jpa.entity.criteria.one.TestTable_;
import sample.javaee.jpa.entity.criteria.one.ToramaruShou_;
import sample.javaee.jpa.entity.criteria.two.HijiriByakuren_;
import sample.javaee.jpa.entity.criteria.two.KomeijiSatori_;
import sample.javaee.jpa.entity.criteria.two.KumoiUnzan_;
import sample.javaee.jpa.entity.criteria.two.MurasaMinamitsu_;

@Stateless
public class CriteriaEjb {

    @PersistenceContext(unitName = "SampleUnit")
    private EntityManager em;
    
    public void hojuNue() {
        CriteriaBuilder builder = this.em.getCriteriaBuilder();
        CriteriaDelete<HojuNue> delete = builder.createCriteriaDelete(HojuNue.class);
        
        Root<HojuNue> root = delete.from(HojuNue.class);
        
        delete.where(builder.equal(root.get(HojuNue_.id), 2L));
        
        Query q = this.em.createQuery(delete);
        q.executeUpdate();
    }
    
    public void hijiriByakuren() {
        CriteriaBuilder builder = this.em.getCriteriaBuilder();
        CriteriaUpdate<HijiriByakuren> update = builder.createCriteriaUpdate(HijiriByakuren.class);
        
        Root<HijiriByakuren> root = update.from(HijiriByakuren.class);
        
        update.set(root.get(HijiriByakuren_.value), "update!!")
              .where(root.get(HijiriByakuren_.id).in(1, 3));
        
        Query q = this.em.createQuery(update);
        q.executeUpdate();
    }
    
    public void murasaMinamitsu() {
        CriteriaBuilder builder = this.em.getCriteriaBuilder();
        CriteriaQuery<MurasaMinamitsu> query = builder.createQuery(MurasaMinamitsu.class);
        
        Subquery<Long> subquery = query.subquery(Long.class);
        Root<ToramaruShou> toramaru = subquery.from(ToramaruShou.class);
        subquery.select(toramaru.get(ToramaruShou_.id));
        
        Root<MurasaMinamitsu> murasa = query.from(MurasaMinamitsu.class);
        query.select(murasa)
             .where(murasa.get(MurasaMinamitsu_.id).in(subquery));
        
        TypedQuery<MurasaMinamitsu> q = this.em.createQuery(query);
        
        q.getResultList()
         .forEach(System.out::println);
    }
    
    public void kumoiIchirin1() {
        CriteriaBuilder builder = this.em.getCriteriaBuilder();
        CriteriaQuery<KumoiIchirin> query = builder.createQuery(KumoiIchirin.class);
        
        Root<KumoiIchirin> root = query.from(KumoiIchirin.class);
        Join<KumoiIchirin, KumoiUnzan> join = root.join(KumoiIchirin_.unzanList);

        query.select(root)
             .distinct(true)
             .where(builder.like(join.get(KumoiUnzan_.value), "%e%"));
        
        TypedQuery<KumoiIchirin> q = this.em.createQuery(query);
        
        q.getResultList()
         .forEach(System.out::println);
    }
    
    public void kumoiIchirin2() {
        CriteriaBuilder builder = this.em.getCriteriaBuilder();
        CriteriaQuery<KumoiIchirin> query = builder.createQuery(KumoiIchirin.class);
        
        Root<KumoiIchirin> root = query.from(KumoiIchirin.class);

        query.select(root)
             .distinct(true);
        
        TypedQuery<KumoiIchirin> q = this.em.createQuery(query);
        
        q.getResultList()
         .forEach(System.out::println);
    }
    
    public void kumoiIchirin3() {
        CriteriaBuilder builder = this.em.getCriteriaBuilder();
        CriteriaQuery<KumoiIchirin> query = builder.createQuery(KumoiIchirin.class);
        
        Root<KumoiIchirin> root = query.from(KumoiIchirin.class);
        root.fetch(KumoiIchirin_.unzanList);

        query.select(root)
             .distinct(true);
        
        TypedQuery<KumoiIchirin> q = this.em.createQuery(query);
        
        q.getResultList()
         .forEach(System.out::println);
    }
    
    public void tataraKogasa1() {
        CriteriaBuilder builder = this.em.getCriteriaBuilder();
        CriteriaQuery<Tuple> query = builder.createQuery(Tuple.class);
        
        Root<TataraKogasa> root = query.from(TataraKogasa.class);
        Path<String> string = root.get(TataraKogasa_.string);
        Expression<Integer> sum = builder.sum(root.get(TataraKogasa_.number));
        
        query.select(builder.tuple(string, sum))
             .groupBy(string);
        
        TypedQuery<Tuple> q = this.em.createQuery(query);
        
        q.getResultList()
         .stream()
         .map(tuple -> tuple.get(string) + " -> " + tuple.get(sum))
         .forEach(System.out::println);
    }
    
    public void tataraKogasa2() {
        CriteriaBuilder builder = this.em.getCriteriaBuilder();
        CriteriaQuery<Tuple> query = builder.createQuery(Tuple.class);
        
        Root<TataraKogasa> root = query.from(TataraKogasa.class);
        Path<String> string = root.get(TataraKogasa_.string);
        Expression<Integer> sum = builder.sum(root.get(TataraKogasa_.number));
        
        query.select(builder.tuple(string, sum))
             .groupBy(string)
             .having(builder.greaterThan(sum, 100));
        
        TypedQuery<Tuple> q = this.em.createQuery(query);
        
        q.getResultList()
         .stream()
         .map(tuple -> tuple.get(string) + " -> " + tuple.get(sum))
         .forEach(System.out::println);
    }
    
    public void nazrin() {
        CriteriaBuilder builder = this.em.getCriteriaBuilder();
        CriteriaQuery<Nazrin> query = builder.createQuery(Nazrin.class);
        
        Root<Nazrin> root = query.from(Nazrin.class);
        query.select(root)
             .orderBy(builder.desc(root.get(Nazrin_.number)));
        
        TypedQuery<Nazrin> q = this.em.createQuery(query);
        q.getResultList().forEach(System.out::println);
    }
    
    public void reiujiUtsubo() {
        CriteriaBuilder builder = this.em.getCriteriaBuilder();
        CriteriaQuery<Integer> query = builder.createQuery(Integer.class);
        
        Root<ReiujiUtsubo> root = query.from(ReiujiUtsubo.class);
        query.select(builder.sum(root.get(ReiujiUtsubo_.number)));
        
        TypedQuery<Integer> q = this.em.createQuery(query);
        System.out.println(q.getSingleResult());
    }
    
    public void kaenbyoRin1() {
        CriteriaBuilder builder = this.em.getCriteriaBuilder();
        CriteriaQuery<String> query = builder.createQuery(String.class);
        
        Root<KaenbyoRin> root = query.from(KaenbyoRin.class);
        query.select(root.get(KaenbyoRin_.string));
        
        TypedQuery<String> q = this.em.createQuery(query);
        System.out.println(q.getResultList());
    }
    
    public void kaenbyoRin2() {
        CriteriaBuilder builder = this.em.getCriteriaBuilder();
        CriteriaQuery<Tuple> query = builder.createTupleQuery();
        
        Root<KaenbyoRin> root = query.from(KaenbyoRin.class);
        Path<Integer> number = root.get(KaenbyoRin_.number);
        Path<String> string = root.get(KaenbyoRin_.string);
        
        query.select(builder.tuple(number, string));
        
        TypedQuery<Tuple> q = this.em.createQuery(query);
        
        q.getResultList()
         .stream()
         .map(tuple -> "{" + tuple.get(number) + ", " + tuple.get(string) + "}")
         .forEach(System.out::println);
    }
    
    public void komeijiSatori() {
        CriteriaBuilder builder = this.em.getCriteriaBuilder();
        CriteriaQuery<KomeijiSatori> query = builder.createQuery(KomeijiSatori.class);
        
        Root<KomeijiSatori> root = query.from(KomeijiSatori.class);
        
        query.select(root)
             .where(
                 builder.equal(
                     root.get(KomeijiSatori_.komeijiKoishi)
                         .get(KomeijiKoishi_.value),
                     "fuga"
                 )
             );
        
        TypedQuery<KomeijiSatori> q = this.em.createQuery(query);
        System.out.println(q.getResultList());
    }
    
    public void hoshigumaYugi() {
        CriteriaBuilder builder = this.em.getCriteriaBuilder();
        CriteriaQuery<HoshigumaYugi> query = builder.createQuery(HoshigumaYugi.class);
        
        Root<HoshigumaYugi> root = query.from(HoshigumaYugi.class);
        
        ParameterExpression<Long> id = builder.parameter(Long.class);
        ParameterExpression<String> value = builder.parameter(String.class);
        
        query.select(root)
             .where(
                 builder.or(
                     builder.equal(root.get(HoshigumaYugi_.id), id),
                     builder.equal(root.get(HoshigumaYugi_.value), value)
                 )
             );
        
        TypedQuery<HoshigumaYugi> q = this.em.createQuery(query);
        q.setParameter(id, 2L);
        q.setParameter(value, "piyo");
        
        System.out.println(q.getResultList());
    }
    
    public void mizuhashiParsee1() {
        CriteriaBuilder builder = this.em.getCriteriaBuilder();
        CriteriaQuery<MizuhashiParsee> query = builder.createQuery(MizuhashiParsee.class);
        
        Root<MizuhashiParsee> root = query.from(MizuhashiParsee.class);
        
        query.select(root)
             .where(
                 builder.or(
                     builder.equal(root.get(MizuhashiParsee_.id), 1L),
                     builder.equal(root.get(MizuhashiParsee_.id), 3L)
                 )
             );
        
        TypedQuery<MizuhashiParsee> q = this.em.createQuery(query);
        System.out.println(q.getResultList());
    }
    
    public void mizuhashiParsee2() {
        CriteriaBuilder builder = this.em.getCriteriaBuilder();
        CriteriaQuery<MizuhashiParsee> query = builder.createQuery(MizuhashiParsee.class);
        
        Root<MizuhashiParsee> root = query.from(MizuhashiParsee.class);
        
        query.select(root)
             .where(root.get(MizuhashiParsee_.id).isNotNull());
        
        TypedQuery<MizuhashiParsee> q = this.em.createQuery(query);
        System.out.println(q.getResultList());
    }
    
    public void kurodaniYamame() {
        CriteriaBuilder builder = this.em.getCriteriaBuilder();
        CriteriaQuery<KurodaniYmame> query = builder.createQuery(KurodaniYmame.class);
        
        Root<KurodaniYmame> root = query.from(KurodaniYmame.class);
        
        query.select(root)
             .where(
                 builder.greaterThanOrEqualTo(root.get(KurodaniYmame_.number), 200),
                 builder.like(root.get(KurodaniYmame_.string), "%o%")
             );
        
        TypedQuery<KurodaniYmame> q = this.em.createQuery(query);
        System.out.println(q.getResultList());
    }
    
    public void hello() {
        CriteriaBuilder builder = this.em.getCriteriaBuilder();
        CriteriaQuery<Kisume> query = builder.createQuery(Kisume.class);
        
        Root<Kisume> root = query.from(Kisume.class);
        query.select(root)
             .where(builder.lessThan(root.get("id"), 3L));
        
        TypedQuery<Kisume> q = this.em.createQuery(query);
        System.out.println(q.getResultList());
    }
    
    public void metamodel() {
        CriteriaBuilder builder = this.em.getCriteriaBuilder();
        CriteriaQuery<TestTable> query = builder.createQuery(TestTable.class);
        
        Root<TestTable> root = query.from(TestTable.class);
        query.select(root);
        
        Predicate idEqual2 = builder.equal(root.get(TestTable_.id), 2L);
        query.where(idEqual2);
        
        this.em.createQuery(query).getResultList().forEach(System.out::println);
    }
}
