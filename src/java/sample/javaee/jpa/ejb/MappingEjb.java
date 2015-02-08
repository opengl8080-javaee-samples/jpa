package sample.javaee.jpa.ejb;

import java.nio.charset.Charset;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.ejb.Stateless;
import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sample.javaee.jpa.entity.mapping.Alice;
import sample.javaee.jpa.entity.mapping.AsakuraRikako;
import sample.javaee.jpa.entity.mapping.ChildCirno;
import sample.javaee.jpa.entity.mapping.ChildDaiyousei;
import sample.javaee.jpa.entity.mapping.ChildHongMeiling;
import sample.javaee.jpa.entity.mapping.ChildRumia;
import sample.javaee.jpa.entity.mapping.Elis;
import sample.javaee.jpa.entity.mapping.Eren;
import sample.javaee.jpa.entity.mapping.Elliy;
import sample.javaee.jpa.entity.mapping.Genji;
import sample.javaee.jpa.entity.mapping.GenjiEnum;
import sample.javaee.jpa.entity.mapping.IzayoiSakuya;
import sample.javaee.jpa.entity.mapping.KanaAnaberaru;
import sample.javaee.jpa.entity.mapping.Kikuri;
import sample.javaee.jpa.entity.mapping.KirisameMarisa;
import sample.javaee.jpa.entity.mapping.KitashirakawaChiyuri;
import sample.javaee.jpa.entity.mapping.Koakuma;
import sample.javaee.jpa.entity.mapping.Konngara;
import sample.javaee.jpa.entity.mapping.Kotohime;
import sample.javaee.jpa.entity.mapping.Kurumi;
import sample.javaee.jpa.entity.mapping.LettyWhiterock;
import sample.javaee.jpa.entity.mapping.Luize;
import sample.javaee.jpa.entity.mapping.Mai;
import sample.javaee.jpa.entity.mapping.Meira;
import sample.javaee.jpa.entity.mapping.Mima;
import sample.javaee.jpa.entity.mapping.Mugetsu;
import sample.javaee.jpa.entity.mapping.Orange;
import sample.javaee.jpa.entity.mapping.ParentCirno;
import sample.javaee.jpa.entity.mapping.ParentDaiyousei;
import sample.javaee.jpa.entity.mapping.ParentHongMeiling;
import sample.javaee.jpa.entity.mapping.ParentRumia;
import sample.javaee.jpa.entity.mapping.PatchouliKnowledge;
import sample.javaee.jpa.entity.mapping.Reimu;
import sample.javaee.jpa.entity.mapping.Rika;
import sample.javaee.jpa.entity.mapping.RikaEnum;
import sample.javaee.jpa.entity.mapping.Sara;
import sample.javaee.jpa.entity.mapping.Sariel;
import sample.javaee.jpa.entity.mapping.SarielKey;
import sample.javaee.jpa.entity.mapping.Shinki;
import sample.javaee.jpa.entity.mapping.SinGyoku;
import sample.javaee.jpa.entity.mapping.Yuki;
import sample.javaee.jpa.entity.mapping.Yumeko;
import sample.javaee.jpa.entity.mapping.YuugenMagan;

@Stateless
public class MappingEjb {
    
    @PersistenceContext(unitName="SampleUnit")
    private EntityManager em;
    @PersistenceContext(unitName="OracleUnit")
    private EntityManager oracleEm;
    
    public void reimu() {
        Reimu reimu = this.em.find(Reimu.class, 1L);
        System.out.println(reimu);
    }
    
    public void kirisameMarisa() {
        KirisameMarisa marisa = this.em.find(KirisameMarisa.class, 1L);
        System.out.println(marisa);
    }
    
    public void sinGyoku() {
        SinGyoku sinGyoku = new SinGyoku();
        sinGyoku.setValue("test");
        
        this.em.persist(sinGyoku);
        
        System.out.println(sinGyoku);
        
        this.em.flush();
        
        System.out.println(sinGyoku);
    }
    
    public void yuugenMagan() {
        YuugenMagan yuugenMagan = new YuugenMagan();
        yuugenMagan.setValue("test");
        
        this.oracleEm.persist(yuugenMagan);
        System.out.println(yuugenMagan);
    }
    
    public void elis() {
        Elis elis = new Elis();
        elis.setValue("test");
        
        this.em.persist(elis);
        System.out.println(elis);
    }
    
    public void sariel() {
        SarielKey key = new SarielKey();
        key.setKey2("test");
        
        Sariel sariel = new Sariel();
        sariel.setKey(key);
        sariel.setValue("TEST");
        
        this.em.persist(sariel);
        
        this.em.flush();
        
        System.out.println(sariel);
    }
    
    public void mima() {
        Mima mima = new Mima();
        
        mima.setKey2("key2");
        mima.setValue("test");
        
        this.em.persist(mima);
        
        this.em.flush();
        
        System.out.println(mima);
    }
    
    public void kikuri() {
        Kikuri kikuri = new Kikuri();
        kikuri.setDate(new Date());
        
        this.em.persist(kikuri);
    }
    
    public void konngara() {
        Konngara konngara = new Konngara();
        konngara.setValue("test");
        konngara.setIgnore("この値は保存されない");
        
        this.em.persist(konngara);
    }
    
    public void genji() {
        Genji genji = new Genji();
        genji.setEnumValue(GenjiEnum.HOGE);
        
        this.em.persist(genji);
        
        genji = new Genji();
        genji.setEnumValue(GenjiEnum.FUGA);
        
        this.em.persist(genji);
    }
    
    public void rika() {
        Rika rika = new Rika();
        rika.setEnumValue(RikaEnum.HOGE);
        
        this.em.persist(rika);
        
        rika = new Rika();
        rika.setEnumValue(RikaEnum.FUGA);
        
        this.em.persist(rika);
    }
    
    public void meira() {
        Meira meira = this.em.find(Meira.class, 1L);
        System.out.println(meira);
        
        for (String value : meira.lazyList) {
            System.out.println(value);
        }
    }
    
    public void eren() {
        Eren eren = this.em.find(Eren.class, 1L);
        
        System.out.println(eren);
    }
    
    public void kotohime() {
        Kotohime kotohime = this.em.find(Kotohime.class, 1L);
        
        System.out.println(kotohime);
    }
    
    public void kanaAnaberaru() {
        KanaAnaberaru kotohime = this.em.find(KanaAnaberaru.class, 1L);
        
        System.out.println(kotohime);
    }
    
    public void asakuraRikako() {
        AsakuraRikako asakuraRikako = this.em.find(AsakuraRikako.class, 1L);
        
        System.out.println(asakuraRikako);
    }
    
    public void kitashirakawaChiyuri() {
        KitashirakawaChiyuri kitashirakawaChiyuri = this.em.find(KitashirakawaChiyuri.class, 1L);
        
        System.out.println(kitashirakawaChiyuri);
    }
    
    public void orangeKurumi() {
        Orange orange = this.em.find(Orange.class, 1L);
        System.out.println(orange);
        
        Kurumi kurumi = this.em.find(Kurumi.class, 2L);
        System.out.println(kurumi);
    }
    
    public void elliyYuuka() {
        Elliy elliy = this.em.find(Elliy.class, 1L);
        System.out.println(elliy);
    }
    
    public void mugetsuGengetsu() {
        Mugetsu mugetsu = this.em.find(Mugetsu.class, 1L);
        System.out.println(mugetsu);
    }
    
    public void saraLuize() {
        Sara sara = this.em.find(Sara.class, 1L);
        System.out.println(sara);
        
        Luize luize = this.em.find(Luize.class, 1L);
        System.out.println(luize);
    }
    
    public void yukiMai() {
        Yuki yuki = this.em.find(Yuki.class, 1L);
        System.out.println(yuki);
        
        Mai mai = this.em.find(Mai.class, 1L);
        System.out.println(mai);
    }
    
    public void aliceYumeko() {
        Alice alice = this.em.find(Alice.class, 1L);
        System.out.println(alice);
        
        Yumeko yumeko = this.em.find(Yumeko.class, 1L);
        System.out.println(yumeko);
    }
    
    public void shinki() {
        Shinki shinki = this.em.find(Shinki.class, 1L);
        System.out.println(shinki);
    }
    
    public void rumia() {
        ParentRumia parentRumia = new ParentRumia();
        parentRumia.setName("parent name");
        
        this.em.persist(parentRumia);
        
        ChildRumia childRumia = new ChildRumia();
        childRumia.setName("child name");
        childRumia.setValue("child value");
        
        this.em.persist(childRumia);
    }
    
    public void cirno() {
        ParentCirno parentCirno = new ParentCirno();
        parentCirno.setName("parent name");
        
        this.em.persist(parentCirno);
        
        ChildCirno childCirno = new ChildCirno();
        childCirno.setName("child name");
        childCirno.setValue("child value");
        
        this.em.persist(childCirno);
    }
    
    public void daiyousei() {
        ParentDaiyousei parentDaiyousei = new ParentDaiyousei();
        parentDaiyousei.setValue("parent value");
        
        this.em.persist(parentDaiyousei);
        
        ChildDaiyousei childDaiyousei = new ChildDaiyousei();
        childDaiyousei.setValue("child value");
        
        this.em.persist(childDaiyousei);
    }
    
    public void hongMeiling() {
        ParentHongMeiling parentHongMeiling = new ParentHongMeiling();
        parentHongMeiling.setName("parent name");
        
        this.em.persist(parentHongMeiling);
        
        ChildHongMeiling childHongMeiling = new ChildHongMeiling();
        childHongMeiling.setName("child name");
        childHongMeiling.setValue("child value");
        
        this.em.persist(childHongMeiling);
    }
    
    public void koakuma() {
        Koakuma koakuma = new Koakuma();
        koakuma.setName("name");
        koakuma.setValue("value");
        
        this.em.persist(koakuma);
    }
    
    public void patchouliKnowledge() {
        PatchouliKnowledge patchouliKnowledge = new PatchouliKnowledge();
        patchouliKnowledge.setBlobValue("blob text".getBytes(Charset.forName("UTF-8")));
        patchouliKnowledge.setClobValue("clob text");
        
        this.em.persist(patchouliKnowledge);
    }
    
    public void sakuyaScarlet() {
        // デフォルト
        IzayoiSakuya izayoiSakuya = this.em.find(IzayoiSakuya.class, 1L);
        System.out.println(izayoiSakuya);
        
        // Entity Graph を指定
        EntityGraph graph = this.em.getEntityGraph("IzayoiSakuya.remiliaScarletList");
        
        Map<String, Object> hint = new HashMap<>();
        hint.put("javax.persistence.fetchgraph", graph);
        
        izayoiSakuya = this.em.find(IzayoiSakuya.class, 2L, hint);
        System.out.println(izayoiSakuya);
        
        // Entity Graph を動的に作成する
        EntityGraph dynamicGraph = this.em.createEntityGraph(IzayoiSakuya.class);
        dynamicGraph.addAttributeNodes("frandreScarletList");
        
        hint = new HashMap<>();
        hint.put("javax.persistence.fetchgraph", dynamicGraph);
        
        izayoiSakuya = this.em.find(IzayoiSakuya.class, 3L, hint);
        System.out.println(izayoiSakuya);
    }
    
    public void lettyWhiterock() {
        LettyWhiterock lettyWhiterock = this.em.find(LettyWhiterock.class, 1L);
        System.out.println(lettyWhiterock);
    }
}
