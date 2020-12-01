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
        o = new KvizOdgovor();
        o.setTocno(true);
        o.setTekst("Milijuni Rumunja i Bugara spremaju se izbjegavati Ujedinjeno Kravljevstvo 'poput kuge'");
        o.setPodtekst("'Ipak ću ostati ovdje - vrijeme je daleko ljepše i čujem kako ima posla u lokalnoj mesnici.' kaže 25-godišnja maturantica." );
        o.setLink("https://bit.ly/3mksBz7");
        p.getOdgovori().add(o);
        o = new KvizOdgovor();
        o.setTocno(false);
        o.setTekst("Covid: U požaru u Rumunjskoj stradalo najmanje 10 zaraženih pacijenata");
        o.setPodtekst("Jedan od doktora koji je pokušao spasiti pacijente je u kritičnom stanju nakon pretrpljenih ozbiljnih opeklina.");
        o.setLink("https://bbc.in/3mm4YWN");
        p.getOdgovori().add(o);
        o = new KvizOdgovor();
        o.setTocno(false);
        o.setTekst("Više od 14 000 ovaca se utopilo nakon prevrtanja broda pred Rumunjskom");
        o.setPodtekst("Spasioci su spasili samo 33 ovce i posadu nakon što se Kraljica Hind prevrnula u Crnom moru nedugo nakon napuštanja rumunjske luke Midia.");
        o.setLink("https://bit.ly/3fKUH3S");
        p.getOdgovori().add(o);
        pitanja.add(p);

        // gotovo pitanje

        p = new KvizPitanje();
        p.setVrsta("fakeNews");
        p.setTema("McDonald's");
        o = new KvizOdgovor();
        o.setTocno(true);
        o.setTekst("Zaposlenik McDonald'sa otpušten zbog stavljanja svog hip hop albuma u dječje Happy Mealove ");
        o.setPodtekst("'Ne samo da je bilo potpuno neprikladno, već su to bile i najslabije rime koje sam ikad čuo' kaže roditelj." );
        o.setLink("https://bit.ly/37gcU5L");
        p.getOdgovori().add(o);
        o = new KvizOdgovor();
        o.setTocno(false);
        o.setTekst("McDonald's ima plan kako ubrzati svoj 'drive-thru'");
        o.setPodtekst("McDonald's želi poboljšati svoj 'drive-thru' - naravno, kako bi pomogao kupcima, ali i u nadi da će ih natjerati da se češće pojavljuju i više troše.");
        o.setLink("https://cnn.it/2JuCLhO");
        p.getOdgovori().add(o);
        o = new KvizOdgovor();
        o.setTocno(false);
        o.setTekst("McDonald's prodaje metar dugačak chicken nugget jastuk za 69 funti (~90 dolara)");
        o.setPodtekst("'Ako mislite da ću kupiti jastuk za tijelo u iznosu od 90 dolara u obliku McDonald'sova pilećeg grumenca, potpuno ste u pravu', navodi korisnik Twittera");
        o.setLink("https://bit.ly/33uulOG");
        p.getOdgovori().add(o);
        pitanja.add(p);

        // gotovo pitanje

        p = new KvizPitanje();
        p.setVrsta("fakeNews");
        p.setTema("mobilna igra Flappy Bird");
        o = new KvizOdgovor();
        o.setTocno(true);
        o.setTekst("Tvorac igre 'Flappy Bird' počinio samoubojstvo nakon uklanjanja igre iz svih trgovina aplikacija (popraćeno samoubojstvima širom svijeta)");
        o.setPodtekst("Programer Flappy Birda, Dong Nguyen, je upravo jutros sklonio Flappy Bird iz trgovina aplikacija i vjeruje se da je uzrok samoubojstava.");
        o.setLink("https://bit.ly/39q11g9");
        p.getOdgovori().add(o);
        o = new KvizOdgovor();
        o.setTocno(false);
        o.setTekst("Najnovija igra tvorca Flappy Bird sada je dostupna u Trgovini Play");
        o.setPodtekst("Ninja Spinki Challenges!! je najnovija igra Dong Nguyena, čovjeka koji stoji iza viralne senzacije, Flappy Bird.");
        o.setLink("https://bit.ly/3o0U21c");
        p.getOdgovori().add(o);
        o = new KvizOdgovor();
        o.setTocno(false);
        o.setTekst("Fall Out Boy odaje počast 'Flappy Bird' s 'Fall Out Bird'");
        o.setPodtekst("'Morate razmišljati o tome kako ss u internetskoj kulturi svi koji su voljeni mrze' kaže Pete Wentz za Rolling Stone.");
        o.setLink("https://bit.ly/36hSGJq");
        p.getOdgovori().add(o);
        pitanja.add(p);

        // gotovo pitanje

        p = new KvizPitanje();
        p.setVrsta("fakeNews");
        p.setTema("Cristiano Ronaldo");
        o = new KvizOdgovor();
        o.setTocno(true);
        o.setTekst("Poznati nogometaš Cristiano Ronaldo pretvorit će svoje hotele u bolnice kako bi se brinuli za zaražene koronavirusom, što je potvrđeno.");
        o.setPodtekst("Ronaldo (35) je vlasnik lanaca luksuznih hotela, uključujući Pestana CR7 u Lisabonu, kao i na portugalskom otoku Madeira, iako tamo još uvijek nije bilo slučajeva.");
        o.setLink("https://bit.ly/2VeWIfx");
        p.getOdgovori().add(o);
        o = new KvizOdgovor();
        o.setTocno(false);
        o.setTekst("Usain Bolt vjeruje da bi ga 'Super sportaš' Cristiano Ronaldo pobijedio u utrci");
        o.setPodtekst("Jamajčanin je 100 metara pretrčao za rekordnih 9,58 sekundi na Svjetskom atletskom prvenstvu u Berlinu 2009. godine, ali nije toliko posvećen treninzima od umirovljenja iz atletike 2017. godine.");
        o.setLink("https://bit.ly/3qeUSt2");
        p.getOdgovori().add(o);
        o = new KvizOdgovor();
        o.setTocno(false);
        o.setTekst("Cristiano Ronaldo kaže da je njegov posljednji pozitivan test na koronavirus 'glupost' nakon što je bio prisiljen propustiti najveću utakmicu sezone Juventusa");
        o.setPodtekst("Ronaldo je početkom mjeseca bio pozitivan na COVID-19.");
        o.setLink("https://bit.ly/3fUqvn5");
        p.getOdgovori().add(o);
        pitanja.add(p);

        // gotovo pitanje

        p = new KvizPitanje();
        p.setVrsta("fakeNews");
        p.setTema("glumac Johnny Depp");
        o = new KvizOdgovor();
        o.setTocno(true);
        o.setTekst("Johnny Depp namjerava kupiti zemljište Wounded Knee masakra i darovati ga natrag indijanskom narodu");
        o.setPodtekst("Podijelio je da je spreman potrošiti milijune kako bi vratio kontrolu onima koji su trebali naslijediti zemlju i pomoći u ispravljanju onoga što je pošlo po zlu davne 1890. godine.");
        o.setLink("https://bit.ly/3fLZFNU");
        p.getOdgovori().add(o);
        o = new KvizOdgovor();
        o.setTocno(false);
        o.setTekst("Johnny Depp izgubio je slučaj klevete protiv britanskih novina Sun");
        o.setPodtekst("Depp je tužio News Group Newspapers i Dan Woottona - izvršnog urednika Suna - zbog članka koji je tvrdio da je zvijezda Pirati s Kariba bila nasilna prema Amber Heardu dok su bili zajedno.");
        o.setLink("https://cnn.it/3qbDTrz");
        p.getOdgovori().add(o);
        o = new KvizOdgovor();
        o.setTocno(false);
        o.setTekst("Johnny Depp napušta filmsku franšizu Fantastic Beasts");
        o.setPodtekst("Johnny Depp napustio je filmsku franšizu Fantastične zvijeri, nekoliko dana nakon što je izgubio slučaj za klevetu zbog novinskog članka koji ga je prozvao nasilnikom.");
        o.setLink("https://bbc.in/3mlVxXw");
        p.getOdgovori().add(o);
        pitanja.add(p);

        // gotovo pitanje

        p = new KvizPitanje();
        p.setVrsta("fakeNews");
        p.setTema("mobilna igra Pokemon GO");
        o = new KvizOdgovor();
        o.setTocno(true);
        o.setTekst("PokemonGO: Tinejdžer ubija brata jer mu je izbrisao Pokemone");
        o.setPodtekst("'Shvatio bih da je imao Dragonita ili Gyaradosa ili nešto slično, ali za bijednog Ratattu? Zapravo sam čak i uhvatio Ratattu na mjestu događaja.' kaže medicinski ispitivač.");
        o.setLink("https://bit.ly/37kUnVW");
        p.getOdgovori().add(o);
        o = new KvizOdgovor();
        o.setTocno(false);
        o.setTekst("Zaštitar osuđen za ubojstvo djeda koji igra Pokemon Go");
        o.setPodtekst("Žrtva, kineski imigrant, krenuo je u igru kao način da se poveže sa svojim nećakinjama, nećacima i unucima.");
        o.setLink("https://nbcnews.to/2VfFC0V");
        p.getOdgovori().add(o);
        o = new KvizOdgovor();
        o.setTocno(false);
        o.setTekst("Žena upucuna i ubijena nakon što je svjedočila pljački dok je igrala Pokémon Go, kaže policija");
        o.setPodtekst("Policija u Novom Meksiku traga za ljudima koji su smrtno pucali na 21-godišnjakinju dok je igrala Pokémon Go u blizini svoje kuće.");
        o.setLink("https://bit.ly/3fUu0Kf");
        p.getOdgovori().add(o);
        pitanja.add(p);

        // gotovo pitanje

        p = new KvizPitanje();
        p.setVrsta("fakeNews");
        p.setTema("Elon Musk");
        o = new KvizOdgovor();
        o.setTocno(true);
        o.setTekst("Elon Musk žuri pomoći prevrnutom Tesli prikvačenom za dijete");
        o.setPodtekst("Djelujući brzo kako bi spasio svoju voljenu kreaciju, milijarder poduzetnik i inženjer Elon Musk priskočio je u pomoć prevrnutom Teslinom modelu 3 u četvrtak koji je ostao imobiliziran na vrhu 9-godišnjeg djeteta.");
        o.setLink("https://bit.ly/37yObKb");
        p.getOdgovori().add(o);
        o = new KvizOdgovor();
        o.setTocno(false);
        o.setTekst("Elon Musk kaže da 'najvjerojatnije' ima umjereni slučaj COVID-19");
        o.setPodtekst("Milijarder i izvršni direktor Tesle i SpaceX-a kaže da su njegovi simptomi simptomi 'lagane prehlade'.");
        o.setLink("https://bit.ly/36l7NSq");
        p.getOdgovori().add(o);
        o = new KvizOdgovor();
        o.setTocno(false);
        o.setTekst("Neuralink: Elon Musk predstavio svinju s čipom u mozgu");
        o.setPodtekst("Elon Musk predstavio je svinju Gertrude s računalnim čipom veličine kovanice u mozgu kako bi demonstrirao svoje ambiciozne planove za stvaranje funkcionalnog mozak-stroj sučelja.");
        o.setLink("https://bbc.in/3lnZBFc");
        p.getOdgovori().add(o);
        pitanja.add(p);

        // gotovo pitanje

        p = new KvizPitanje();
        p.setVrsta("fakeNews");
        p.setTema("Kanada");
        o = new KvizOdgovor();
        o.setTocno(true);
        o.setTekst("Kanada legalizirala ljekoviti kokain.");
        o.setPodtekst("'Nekad smo bili najkul mjesto u Sjevernoj Americi. Ali u današnje vrijeme ako se želite nadrogirati i skijati, idete u Aspen (SAD), a ne u Whistler. To se mora promijeniti.");
        o.setLink("https://bit.ly/39qVh5U");
        p.getOdgovori().add(o);
        o = new KvizOdgovor();
        o.setTocno(false);
        o.setTekst("Kanada zabranila jurišne puške uslijed masovne pucnjave");
        o.setPodtekst("Gotovo dva tjedna nakon najsmrtonosnije masovne pucnjave u povijesti Kanade, premijer Justin Trudeau u petak je uveo trenutnu zabranu onoga što je opisao kao 'napadno oružje u vojnom stilu'.");
        o.setLink("https://nyti.ms/3oaEBDA");
        p.getOdgovori().add(o);
        o = new KvizOdgovor();
        o.setTocno(false);
        o.setTekst("Kanada u nestašici kanabisa nakon što je legalizirala marihuanu, trgovine prijavljuju probleme s opskrbom");
        o.setPodtekst("Samo nekoliko dana nakon što su postali najveća država na svijetu koja je legalizirala marihuanu, vlasnici trgovina diljem Kanade kažu da nema dovoljno kanabisa kako bi se udovoljilo potražnji i bore se da naruče još.");
        o.setLink("https://ab.co/3ml0AHr");
        p.getOdgovori().add(o);
        pitanja.add(p);

        // gotovo pitanje

        p = new KvizPitanje();
        p.setVrsta("fakeNews");
        p.setTema("političarka Alexandria Ocasio-Cortez");
        o = new KvizOdgovor();
        o.setTocno(true);
        o.setTekst("Ocasio-Cortez predlaže nacionalnu zabranu motocikala");
        o.setPodtekst("Trebala bih usporiti svoj Prius kako biste vi, kao, prolazili pored svih i pravili buku? Mislim, neki od nas imaju termin za sređivanje noktiju, ljudi.");
        o.setLink("https://bit.ly/3loUuEF");
        p.getOdgovori().add(o);
        o = new KvizOdgovor();
        o.setTocno(false);
        o.setTekst("Ocasio-Cortez osvaja 2. mandat u skupom gubitku za republikance");
        o.setPodtekst("Njezin izazivač prikupio je 10 milijuna američkih dolara, ali gospođa Ocasio-Cortez ipak je ostvarila laganu pobjedu, stvarajući nagađanja o svojim budućim političkim ambicijama.");
        o.setLink("https://nyti.ms/39lCrNw");
        p.getOdgovori().add(o);
        o = new KvizOdgovor();
        o.setTocno(false);
        o.setTekst("Alexandria Ocasio-Cortezinu partiju igre 'Among Us' gledalo 400 000 korisnika");
        o.setPodtekst("Prijenos uživo kongresnice Alexandrije Ocasio-Cortez kako igra popularnu igru 'Among Us' postao je jedan od najgledanijih videozapisa na Twitchu.");
        o.setLink("https://bbc.in/3occUup");
        p.getOdgovori().add(o);
        pitanja.add(p);

        // gotovo pitanje

        p = new KvizPitanje();
        p.setVrsta("fakeNews");
        p.setTema("Pfizer/COVID-19 cjepivo");
        o = new KvizOdgovor();
        o.setTocno(true);
        o.setTekst("Pfizer najavljuje da će prva serija cjepiva protiv koronavirusa biti kolekcijsko izdanje ograničeno na 2.000 doza");
        o.setPodtekst("'Pfizer je ponosan što može ponuditi ekskluzivno rano izdanje našeg novog cjepiva u kristalnoj, po mjeri izrađenoj Swarovski štrcaljki s 24-karatnom zlatnom iglom.'");
        o.setLink("https://bit.ly/37gOglv");
        p.getOdgovori().add(o);
        o = new KvizOdgovor();
        o.setTocno(false);
        o.setTekst("Koronavirus: EU kupuje 300 milijuna doza cjepiva od BioNTech-Pfizer");
        o.setPodtekst("Europska unija pristala je kupiti do 300 milijuna doza cjepiva protiv koronavirusa od BioNTech-Pfizer, nakon što je pokazala dobre rezultate u ispitivanjima.");
        o.setLink("https://bbc.in/39qUfqD");
        p.getOdgovori().add(o);
        o = new KvizOdgovor();
        o.setTocno(false);
        o.setTekst("Pfizerova najava ukazuje na obećanje cjepiva na genskoj osnovi");
        o.setPodtekst("'Mislim da ovo mijenja čitavu igru', kaže imunolog Kedl. 'Ne bih se iznenadio da, u sljedećih 10 godina, vidimo kako se ovo uvodi u cjepivo protiv gripe.'");
        o.setLink("https://bit.ly/2JkUF6N");
        p.getOdgovori().add(o);
        pitanja.add(p);

        // gotovo pitanje

        return pitanja;
    }
}
