package hr.cnzd.dsi2021.Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.Data;

@Data
public class KvizPitanje {

        private String tekst;
        private String vrsta;
        private String tema;
        private List<KvizOdgovor> odgovori;
        private boolean daniOdgovor;


        public KvizPitanje() {
            this.odgovori=new ArrayList<>();
        }

        public static List<KvizPitanje> getPitanja(String vrsta, int ukupno){
            List<KvizPitanje> pitanja ;

            // RAZREDNA
            if(vrsta.equals("razredna")){
                pitanja = PitanjaMladi.napuniPitanja();
            }else if (vrsta.equals("stariji")){
                pitanja = PitanjaStariji.napuniPitanja();
            }else{
                pitanja = PitanjaFakeNews.napuniPitanja();
            }

            Collections.shuffle(pitanja);
            List<KvizPitanje> vrati = new ArrayList<>();
            for(int i=0;i<ukupno;i++){
                Collections.shuffle(pitanja.get(i).getOdgovori());
                vrati.add(pitanja.get(i));
            }
            return vrati;
        }
}
