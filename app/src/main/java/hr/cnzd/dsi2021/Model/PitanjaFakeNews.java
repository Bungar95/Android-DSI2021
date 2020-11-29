package hr.cnzd.dsi2021.Model;

import android.text.Html;

import java.util.ArrayList;
import java.util.List;

public class PitanjaFakeNews {

    public static List<KvizPitanje> napuniPitanja(){

        List<KvizPitanje> pitanja = new ArrayList<>();

        KvizPitanje p;
        KvizOdgovor o;

        p = new KvizPitanje();
        p.setVrsta("fakeNews");
        p.setTema("država Rumunjska");
        p.setTekst("prvo");
        o = new KvizOdgovor();
        o.setTocno(true);
        o.setTekst("Milijuni Rumunja i Bugara spremaju se izbjegavati Ujedinjeno Kravljevstvo 'poput kuge'");
        o.setPodtekst("'Ipak ću ostati ovdje - vrijeme je daleko ljepše i čujem kako ima posla u lokalnoj mesnici.' kaže 25-godišnja maturantica." );
        o.setLink("http://www.newsbiscuit.com/2016/11/02/millions-of-romanians-bulgarians-preparing-to-avoid-uk-like-the-plague/");
        p.getOdgovori().add(o);
        o = new KvizOdgovor();
        o.setTocno(false);
        o.setTekst("Covid: U požaru u Rumunjskoj stradalo najmanje 10 zaraženih pacijenata");
        o.setPodtekst("Jedan od doktora koji je pokušao spasiti pacijente je u kritičnom stanju nakon pretrpljenih ozbiljnih opeklina.");
        o.setLink("https://www.bbc.com/news/world-europe-54947530");
        p.getOdgovori().add(o);
        o = new KvizOdgovor();
        o.setTocno(false);
        o.setTekst("Više od 14 000 ovaca se utopilo nakon prevrtanja broda pred Rumunjskom");
        o.setPodtekst("Spasioci su spasili samo 33 ovce i posadu nakon što se Kraljica Hind prevrnula u Crnom moru nedugo nakon napuštanja rumunjske luke Midia.");
        o.setLink("https://www.aljazeera.com/news/2019/11/25/more-than-14000-sheep-drown-after-ship-capsizes-off-romania");
        p.getOdgovori().add(o);
        pitanja.add(p);



        return pitanja;
    }
}
