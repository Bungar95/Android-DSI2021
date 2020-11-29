package hr.cnzd.dsi2021.Activities.Quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import hr.cnzd.dsi2021.Model.KvizPitanje;
import hr.cnzd.dsi2021.Presenters.Quiz.IQuizActivity;
import hr.cnzd.dsi2021.Presenters.Quiz.QuizPresenter;
import hr.cnzd.dsi2021.R;

public class QuizNasiljeActivity extends AppCompatActivity implements IQuizActivity.View {

    private static int BROJ_PITANJA = 10;
    IQuizActivity.Presenter mPresenter;
    String quiz = "prepoznajmo_nasilje";
    private List<KvizPitanje> pitanja;
    private int trenutnoPitanje;
    private Intent resultIntent;

    private TextView txtPitanje;
    private Button o1,o2,o3,o4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_nasilje);
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
        txtPitanje = findViewById(R.id.pitanje);
        o1=findViewById(R.id.o1);
        o2=findViewById(R.id.o2);
        o3=findViewById(R.id.o3);
        o4=findViewById(R.id.o4);
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

        o4.setOnClickListener(new View.OnClickListener() {
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

        txtPitanje.setText(p.getTekst());
        o1.setText(p.getOdgovori().get(0).getTekst());
        o1.setTag(p.getOdgovori().get(0).isTocno());

        o2.setText(p.getOdgovori().get(1).getTekst());
        o2.setTag(p.getOdgovori().get(1).isTocno());

        o3.setText(p.getOdgovori().get(2).getTekst());
        o3.setTag(p.getOdgovori().get(2).isTocno());

        o4.setText(p.getOdgovori().get(3).getTekst());
        o4.setTag(p.getOdgovori().get(3).isTocno());
    }
}