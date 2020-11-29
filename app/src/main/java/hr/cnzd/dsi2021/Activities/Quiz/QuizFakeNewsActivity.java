package hr.cnzd.dsi2021.Activities.Quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import hr.cnzd.dsi2021.Model.KvizPitanje;
import hr.cnzd.dsi2021.Presenters.Quiz.IQuizActivity;
import hr.cnzd.dsi2021.Presenters.Quiz.QuizPresenter;
import hr.cnzd.dsi2021.R;

public class QuizFakeNewsActivity extends AppCompatActivity implements IQuizActivity.View {

    private static int BROJ_PITANJA = 1;
    IQuizActivity.Presenter mPresenter;
    String quiz = "fake_news";
    private List<KvizPitanje> pitanja;
    private int trenutnoPitanje;
    private Intent resultIntent;

    private TextView txtTema,
            naslov1, naslov2, naslov3,
            podnaslov1, podnaslov2, podnaslov3,
            link1, link2, link3;

    private Button o1,o2,o3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_fake_news);
        mPresenter = new QuizPresenter(this);
        mPresenter.created();
        ucitajPitanje();
    }

    private void daniOdgovor(View view) {
        pitanja.get(trenutnoPitanje).setDaniOdgovor(Boolean.parseBoolean(view.getTag().toString()));
        trenutnoPitanje++;
        if(mPresenter.checkEndOfQuiz(trenutnoPitanje, BROJ_PITANJA)) {
            mPresenter.zavrsiKviz(pitanja, resultIntent, quiz);
            startActivity(resultIntent);
        }else ucitajPitanje();
    }

    @Override
    public void init() {
        resultIntent = new Intent(this, QuizResultActivity.class);
        txtTema = findViewById(R.id.tvTema);
        link1 = findViewById(R.id.tvLink1);
        link2 = findViewById(R.id.tvLink2);
        link3 = findViewById(R.id.tvLink3);
        naslov1 = findViewById(R.id.tvNaslov1);
        naslov2 = findViewById(R.id.tvNaslov2);
        naslov3 = findViewById(R.id.tvNaslov3);
        podnaslov1 = findViewById(R.id.tvPodnaslov1);
        podnaslov2 = findViewById(R.id.tvPodnaslov2);
        podnaslov3 = findViewById(R.id.tvPodnaslov3);
        o1=findViewById(R.id.o1);
        o2=findViewById(R.id.o2);
        o3=findViewById(R.id.o3);
    }

    @Override
    public void initListeners() {
        o1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                daniOdgovor(view);
            }
        });

        o2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                daniOdgovor(view);
            }
        });

        o3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                daniOdgovor(view);
            }
        });
    }

    @Override
    public void initPitanja() {
        Intent i = getIntent();
        String vrsta = i.getStringExtra("vrsta");

        pitanja = KvizPitanje.getPitanja(vrsta,BROJ_PITANJA);
        trenutnoPitanje=0;
    }

    @Override
    public void ucitajPitanje() {

        setTitle("Pitanje " + String.valueOf(trenutnoPitanje+1) + "/" + BROJ_PITANJA);

        KvizPitanje p = pitanja.get(trenutnoPitanje);

        txtTema.setText(p.getTema());

        link1.setText(p.getOdgovori().get(0).getLink());
        link2.setText(p.getOdgovori().get(1).getLink());
        link3.setText(p.getOdgovori().get(2).getLink());

        naslov1.setText(p.getOdgovori().get(0).getTekst());
        podnaslov1.setText(p.getOdgovori().get(0).getPodtekst());
        o1.setTag(p.getOdgovori().get(0).isTocno());

        naslov2.setText(p.getOdgovori().get(1).getTekst());
        podnaslov2.setText(p.getOdgovori().get(1).getPodtekst());
        o2.setTag(p.getOdgovori().get(1).isTocno());

        naslov3.setText(p.getOdgovori().get(2).getTekst());
        podnaslov3.setText(p.getOdgovori().get(2).getPodtekst());
        o3.setTag(p.getOdgovori().get(2).isTocno());

    }
}