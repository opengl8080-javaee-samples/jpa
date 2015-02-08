package sample.javaee.jpa.servlet;

import java.util.HashMap;
import java.util.Map;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sample.javaee.jpa.ejb.MappingEjb;

@WebServlet("/mapping/*")
public class MappingServlet extends HttpServlet {

    @EJB
    private MappingEjb ejb;
    
    private Map<String, Process> mapping = new HashMap<>();

    @Override
    public void init() throws ServletException {
        this.def("/reimu", () -> {
            this.ejb.reimu();
        });
        
        this.def("/kirisame_marisa", () -> {
            this.ejb.kirisameMarisa();
        });
        
        this.def("/singyoku", () -> {
            this.ejb.sinGyoku();
        });
        
        this.def("/yuugen_magan", () -> {
            this.ejb.yuugenMagan();
        });
        
        this.def("/elis", () -> {
            this.ejb.elis();
        });
        
        this.def("/sariel", () -> {
            this.ejb.sariel();
        });
        
        this.def("/mima", () -> {
            this.ejb.mima();
        });
        
        this.def("/kikuri", () -> {
            this.ejb.kikuri();
        });
        
        this.def("/konngara", () -> {
            this.ejb.konngara();
        });
        
        this.def("/genji", () -> {
            this.ejb.genji();
        });
        
        this.def("/rika", () -> {
            this.ejb.rika();
        });
        
        this.def("/meira", () -> {
            this.ejb.meira();
        });
        
        this.def("/eren", () -> {
            this.ejb.eren();
        });
        
        this.def("/kotohime", () -> {
            this.ejb.kotohime();
        });
        
        this.def("/kanaAnaberaru", () -> {
            this.ejb.kanaAnaberaru();
        });
        
        this.def("/asakuraRikako", () -> {
            this.ejb.asakuraRikako();
        });
        
        this.def("/kitashirakawaChiyuri", () -> {
            this.ejb.kitashirakawaChiyuri();
        });
        
        this.def("/orangeKurumi", () -> {
            this.ejb.orangeKurumi();
        });
        
        this.def("/elliyYuuka", () -> {
            this.ejb.elliyYuuka();
        });
        
        this.def("/mugetsuGengetsu", () -> {
            this.ejb.mugetsuGengetsu();
        });
        
        this.def("/saraLuize", () -> {
            this.ejb.saraLuize();
        });
        
        this.def("/yukiMai", () -> {
            this.ejb.yukiMai();
        });
        
        this.def("/aliceYumeko", () -> {
            this.ejb.aliceYumeko();
        });
        
        this.def("/shinki", () -> {
            this.ejb.shinki();
        });
        
        this.def("/rumia", () -> {
            this.ejb.rumia();
        });
        
        this.def("/cirno", () -> {
            this.ejb.cirno();
        });
        
        this.def("/daiyousei", () -> {
            this.ejb.daiyousei();
        });
        
        this.def("/hongMeiling", () -> {
            this.ejb.hongMeiling();
        });
        
        this.def("/koakuma", () -> {
            this.ejb.koakuma();
        });
        
        this.def("/patchouliKnowledge", () -> {
            this.ejb.patchouliKnowledge();
        });
        
        this.def("/sakuyaScarlet", () -> {
            this.ejb.sakuyaScarlet();
        });
        
        this.def("/lettyWhiterock", () -> {
            this.ejb.lettyWhiterock();
        });
    }
    
    private void def(String path, Process process) {
        this.mapping.put(path, process);
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        String path = req.getPathInfo();
        
        this.mapping.get(path).execute();
    }
    
    private static interface Process {
        void execute();
    }
}
