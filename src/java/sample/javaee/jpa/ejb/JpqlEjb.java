package sample.javaee.jpa.ejb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;
import sample.javaee.jpa.entity.jpql.AkiShizuha;
import sample.javaee.jpa.entity.jpql.Chen;
import sample.javaee.jpa.entity.jpql.FujiwaranoMokou;
import sample.javaee.jpa.entity.jpql.InubashiriMomiji;
import sample.javaee.jpa.entity.jpql.KawashiroNitori;
import sample.javaee.jpa.entity.jpql.KonpakuYoumu;
import sample.javaee.jpa.entity.jpql.LilyWhite;
import sample.javaee.jpa.entity.jpql.LyricaPrismriver;
import sample.javaee.jpa.entity.jpql.MerlinPrismriver;
import sample.javaee.jpa.entity.jpql.NagaeIku;
import sample.javaee.jpa.entity.jpql.OnodukaKomachi;
import sample.javaee.jpa.entity.jpql.SaigyojiYuyuko;
import sample.javaee.jpa.entity.jpql.ShameimaruAya;
import sample.javaee.jpa.entity.jpql.YakumoRan;
import sample.javaee.jpa.entity.jpql.YasakaKanako;

@Stateless
public class JpqlEjb {
    
    @PersistenceContext(unitName = "SampleUnit")
    private EntityManager em;
    
    public void hinanaiTenshi() {
        TypedQuery<String> query = this.em.createNamedQuery("HinanaiTenshi.functions", String.class);
        
        query.getResultList()
             .forEach(System.out::println);
    }
    
    public void storedProcedure() {
        StoredProcedureQuery procedure = this.em.createNamedStoredProcedureQuery("sample-stored-procedure");
        
        procedure.setParameter("intParam", 100)
                 .setParameter("stringParam", "Hello Stored Procedure!!")
                 .execute();
        
        String outParam = (String)procedure.getOutputParameterValue("outParam");
        System.out.println("outParam = " + outParam);
    }
    
    public void nativeQuery() {
        Query query = this.em.createNamedQuery("native-query-simple");
        
        List<Object[]> list = query.getResultList();
        
        list.stream()
            .map(Arrays::toString)
            .forEach(System.out::println);
        
        String sql = "SELECT ID, VALUE FROM NAGAE_IKU WHERE ID=1";
        query = this.em.createNativeQuery(sql, NagaeIku.class);
        System.out.println(query.getSingleResult());
    }
    
    public void moriyaSuwako() {
        Query query = this.em.createNamedQuery("MoriyaSuwako.case");
        
        List<Object[]> list = query.getResultList();
        
        list.stream()
            .map(Arrays::toString)
            .forEach(System.out::println);
    }
    
    public void yasakaKanako() {
        YasakaKanako yasakaKanako = this.em.find(YasakaKanako.class, 2L);
        
        Query query = this.em.createNamedQuery("YasakaKanako.update");
        query.executeUpdate();
        
        System.out.println(yasakaKanako);
        
        query = this.em.createNamedQuery("YasakaKanako.delete");
        query.executeUpdate();
    }
    
    public void inubashiriMomiji() {
        TypedQuery<InubashiriMomiji> query;
        
        query = this.em.createNamedQuery("InubashiriMomiji.in", InubashiriMomiji.class);
        System.out.println("<<InubashiriMomiji.in>>");
        query.getResultList()
             .forEach(System.out::println);
        
        query = this.em.createNamedQuery("InubashiriMomiji.inSubquery", InubashiriMomiji.class);
        System.out.println("<<InubashiriMomiji.inSubquery>>");
        query.getResultList()
             .forEach(System.out::println);
        
        query = this.em.createNamedQuery("InubashiriMomiji.inParameter", InubashiriMomiji.class);
        System.out.println("<<InubashiriMomiji.inParameter>>");
        query.setParameter("inParam", Arrays.asList(222, 333));
        query.getResultList()
             .forEach(System.out::println);
        
        query = this.em.createNamedQuery("InubashiriMomiji.any", InubashiriMomiji.class);
        System.out.println("<<InubashiriMomiji.any>>");
        query.getResultList()
             .forEach(System.out::println);
        
        query = this.em.createNamedQuery("InubashiriMomiji.all", InubashiriMomiji.class);
        System.out.println("<<InubashiriMomiji.all>>");
        query.getResultList()
             .forEach(System.out::println);
    }
    
    public void kawashiroNitori() {
        TypedQuery<KawashiroNitori> query = this.em.createNamedQuery("KawashiroNitori.exists", KawashiroNitori.class);
        
        query.getResultList()
             .forEach(System.out::println);
    }
    
    public void kagiyamaHina() {
        TypedQuery<Integer> query = this.em.createNamedQuery("KagiyamaHina.distinct", Integer.class);
        
        query.getResultList()
             .forEach(System.out::println);
    }
    
    public void akiMinoriko() {
        Query query = this.em.createNamedQuery("AkiMinoriko.having");
        
        List<Object[]> list = query.getResultList();
        
        list.stream()
            .map(Arrays::toString)
            .forEach(System.out::println);
    }
    
    public void akiShizuha() {
        TypedQuery<AkiShizuha> query = this.em.createQuery("SELECT a FROM AkiShizuha a", AkiShizuha.class);
        
        query.getResultList()
             .forEach(System.out::println);
    }
    
    public void onodukaKomachi() {
        TypedQuery<OnodukaKomachi> query;
        
        System.out.println("<<notFetchJoin>>");
        query = this.em.createNamedQuery("OnodukaKomachi.notFetchJoin", OnodukaKomachi.class);
        query.getResultList()
             .forEach(o -> System.out.println(o.getShikiEiki()));
        
        System.out.println("<<fetchJoin>>");
        query = this.em.createNamedQuery("OnodukaKomachi.fetchJoin", OnodukaKomachi.class);
        query.getResultList()
             .forEach(o -> System.out.println(o.getShikiEiki()));
    }
    
    public void medicineMelancholy() {
        Query query = this.em.createNamedQuery("MedicineMelancholy.leftJoinOnCode");
        
        List<Object[]> list = query.getResultList();
        list.stream()
            .map(Arrays::toString)
            .forEach(System.out::println);
    }
    
    private void print(Query query) {
        List<Object[]> result = query.getResultList();
        result.stream().map(Arrays::toString).forEach(System.out::println);
    }
    
    public void shameimaruAya() {
        TypedQuery<ShameimaruAya> query = this.em.createNamedQuery("ShameimaruAya.findMax", ShameimaruAya.class);
        System.out.println(query.getSingleResult());
    }
    
    public void fujiwaranoMokou() {
        TypedQuery<FujiwaranoMokou> query = this.em.createNamedQuery("FujiwaranoMokou.findAll", FujiwaranoMokou.class);
        
        query.getResultList()
             .forEach(System.out::println);
        
        query = this.em.createNamedQuery("FujiwaranoMokou.findAllOrderByIdDesc", FujiwaranoMokou.class);
        
        query.getResultList()
             .forEach(System.out::println);
    }
    
    public void houraisanKaguya() {
        Query query = this.em.createNamedQuery("HouraisanKaguya.count");
        this.print("count", query);
        
        query = this.em.createNamedQuery("HouraisanKaguya.stringMax");
        this.print("stringMax", query);
        
        query = this.em.createNamedQuery("HouraisanKaguya.numberMax");
        this.print("numberMax", query);
        
        query = this.em.createNamedQuery("HouraisanKaguya.min");
        this.print("min", query);
        
        query = this.em.createNamedQuery("HouraisanKaguya.avg");
        this.print("avg", query);
        
        query = this.em.createNamedQuery("HouraisanKaguya.sum");
        this.print("sum", query);
    }
    
    private void print(String tag, Query query) {
        Object result = query.getSingleResult();
        System.out.println(tag + " : " + result + ", class : " + result.getClass());
    }
    
    public void yagokoroEirin() {
        Query query = this.em.createNamedQuery("YagokoroEirin.groupBy");
        
        List<Object[]> list = query.getResultList();
        
        list.stream()
            .map(Arrays::toString)
            .forEach(System.out::println);
        
        query = this.em.createNamedQuery("YagokoroEirin.groupByObject");
        
        list = query.getResultList();
        
        list.stream()
            .map(Arrays::toString)
            .forEach(System.out::println);
    }
    
    public void reisenUdongeinInaba() {
        Query query = this.em.createNamedQuery("ReisenUdongeinInaba.parent");
        System.out.println(query.getSingleResult());
        
        query = this.em.createNamedQuery("ReisenUdongeinInaba.child");
        System.out.println(query.getSingleResult());
    }
    
    public void kamishirasawaKeine() {
        Query query = this.em.createNamedQuery("KamishirasawaKeine.currentDate");
        Object result = query.getSingleResult();
        System.out.println("class = " + result.getClass() + ", value = " + result);
        
        query = this.em.createNamedQuery("KamishirasawaKeine.currentTime");
        result = query.getSingleResult();
        System.out.println("class = " + result.getClass() + ", value = " + result);
        
        query = this.em.createNamedQuery("KamishirasawaKeine.currentTimestamp");
        result = query.getSingleResult();
        System.out.println("class = " + result.getClass() + ", value = " + result);
    }
    
    public void wriggleNightbug() {
        Query query = this.em.createNamedQuery("WriggleNightbug.inQuery");
        System.out.println(query.getResultList());
        
        query = this.em.createNamedQuery("WriggleNightbug.innerJoin");
        System.out.println(query.getResultList());
    }
    
    public void ibukiSuika() {
        Query query = this.em.createNamedQuery("IbukiSuika.abs");
        System.out.println(query.getSingleResult());
        
        query = this.em.createNamedQuery("IbukiSuika.sqrt");
        System.out.println(query.getSingleResult());
        
        query = this.em.createNamedQuery("IbukiSuika.mod");
        System.out.println(query.getSingleResult());
        
        query = this.em.createNamedQuery("IbukiSuika.size");
        System.out.println(query.getSingleResult());
        
        query = this.em.createNamedQuery("IbukiSuika.index");
        System.out.println(query.getSingleResult());
    }
    
    public void yakumoYukari() {
        TypedQuery<String> queryStr;
        TypedQuery<Integer> queryInt;
        
        queryStr = this.em.createNamedQuery("YakumoYukari.concat", String.class);
        System.out.println(queryStr.getSingleResult());
        
        queryStr = this.em.createNamedQuery("YakumoYukari.trimDefault", String.class);
        System.out.println("[" + queryStr.getSingleResult() + "]");
        
        queryStr = this.em.createNamedQuery("YakumoYukari.trimLeading", String.class);
        System.out.println("[" + queryStr.getSingleResult() + "]");
        
        queryStr = this.em.createNamedQuery("YakumoYukari.trimAsterisk", String.class);
        System.out.println("[" + queryStr.getSingleResult() + "]");
        
        queryStr = this.em.createNamedQuery("YakumoYukari.substringStart", String.class);
        System.out.println(queryStr.getSingleResult());
        
        queryStr = this.em.createNamedQuery("YakumoYukari.substringStartLength", String.class);
        System.out.println(queryStr.getSingleResult());
        
        queryStr = this.em.createNamedQuery("YakumoYukari.lower", String.class);
        System.out.println(queryStr.getSingleResult());
        
        queryStr = this.em.createNamedQuery("YakumoYukari.upper", String.class);
        System.out.println(queryStr.getSingleResult());
        
        queryInt = this.em.createNamedQuery("YakumoYukari.length", Integer.class);
        System.out.println(queryInt.getSingleResult());
        
        queryInt = this.em.createNamedQuery("YakumoYukari.locate", Integer.class);
        System.out.println(queryInt.getSingleResult());
    }
    
    public void yakumoRan() {
        TypedQuery<YakumoRan> query;
        
        query = this.em.createNamedQuery("YakumoRan.findById", YakumoRan.class);
        query.setParameter("id", 2L);
        System.out.println(query.getSingleResult());
        
        query = this.em.createNamedQuery("YakumoRan.findByDate", YakumoRan.class);
        query.setParameter("date", this.createDate("2014-01-01"), TemporalType.DATE);
        System.out.println(query.getSingleResult());
    }
    
    private Date createDate(String date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return format.parse(date);
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public void saigyojiYuyuko() {
        TypedQuery<SaigyojiYuyuko> query;
        List<SaigyojiYuyuko> list;
        
        System.out.println("[SaigyojiYuyuko.orderByIdDesc]");
        query = this.em.createNamedQuery("SaigyojiYuyuko.orderByIdDesc", SaigyojiYuyuko.class);
        list = query.getResultList();
        list.forEach(System.out::println);
        
        System.out.println("[SaigyojiYuyuko.orderByNumberDesc]");
        query = this.em.createNamedQuery("SaigyojiYuyuko.orderByNumberDesc", SaigyojiYuyuko.class);
        list = query.getResultList();
        list.forEach(System.out::println);
    }
    
    public void konpakuYoumu() {
        TypedQuery<KonpakuYoumu> query;
        
        query = this.em.createNamedQuery("KonpakuYoumu.equal", KonpakuYoumu.class);
        System.out.println("Equal (=) : " + query.getSingleResult());
        
        query = this.em.createNamedQuery("KonpakuYoumu.notEqual", KonpakuYoumu.class);
        System.out.println("Not Equal (<>) : " + query.getResultList());
        
        query = this.em.createNamedQuery("KonpakuYoumu.lessThan", KonpakuYoumu.class);
        System.out.println("Less Than (<) : " + query.getResultList());
        
        query = this.em.createNamedQuery("KonpakuYoumu.lessThanEqual", KonpakuYoumu.class);
        System.out.println("Less Than Equal (<=) : " + query.getResultList());
        
        query = this.em.createNamedQuery("KonpakuYoumu.greaterThan", KonpakuYoumu.class);
        System.out.println("Greater Than (>) : " + query.getResultList());
        
        query = this.em.createNamedQuery("KonpakuYoumu.greaterThanEqual", KonpakuYoumu.class);
        System.out.println("Greater Than Equal (>=) : " + query.getResultList());
        
        query = this.em.createNamedQuery("KonpakuYoumu.or", KonpakuYoumu.class);
        System.out.println("OR : " + query.getResultList());
        
        query = this.em.createNamedQuery("KonpakuYoumu.between", KonpakuYoumu.class);
        System.out.println("BETWEEN : " + query.getResultList());
        
        query = this.em.createNamedQuery("KonpakuYoumu.like", KonpakuYoumu.class);
        System.out.println("LIKE : " + query.getResultList());
        
        query = this.em.createNamedQuery("KonpakuYoumu.isNull", KonpakuYoumu.class);
        System.out.println("IS NULL : " + query.getResultList());
        
        query = this.em.createNamedQuery("KonpakuYoumu.isEmpty", KonpakuYoumu.class);
        System.out.println("IS EMPTY : " + query.getResultList());
        
        query = this.em.createNamedQuery("KonpakuYoumu.memberOf", KonpakuYoumu.class);
        System.out.println("MEMBER OF : " + query.getResultList());
    }
    
    public void lunasaPrismriver() {
        TypedQuery<MerlinPrismriver> q1 = this.em.createNamedQuery("LunasaPrismriver.getMerlin", MerlinPrismriver.class);
        List<MerlinPrismriver> l1 = q1.getResultList();
        System.out.println(l1);
        
        TypedQuery<LyricaPrismriver> q2 = this.em.createNamedQuery("LunasaPrismriver.getLyrica", LyricaPrismriver.class);
        List<LyricaPrismriver> l2 = q2.getResultList();
        System.out.println(l2);
    }
    
    public void lilyWhite() {
        TypedQuery<LilyWhite> query = this.em.createNamedQuery("LilyWhite.findSingle", LilyWhite.class);
        LilyWhite lilyWhite = query.getSingleResult();
        
        System.out.println(lilyWhite);
    }
    
    public void chen() {
        TypedQuery<Chen> query = this.em.createNamedQuery("Chen.findAll", Chen.class);
        List<Chen> list = query.getResultList();
        
        System.out.println(list);
    }
    
    public void aliceMargatroid() {
        TypedQuery<String> getNameQuery = this.em.createNamedQuery("AliceMargatroid.getName", String.class);
        List<String> names = getNameQuery.getResultList();
        
        System.out.println(names);
        
        
        Query getNameAndValueQuery = this.em.createNamedQuery("AliceMargatroid.getNameAndValue");
        List<Object[]> list = getNameAndValueQuery.getResultList();
        
        list.stream()
            .map(Arrays::toString)
            .forEach(System.out::println);
    }
}
