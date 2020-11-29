package hr.cnzd.dsi2021.Activities.Quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import java.util.UUID;

import hr.cnzd.dsi2021.Activities.Quiz.Introduction.QuizIntroActivity;
import hr.cnzd.dsi2021.R;

public class QuizResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_result);

        Intent i = getIntent();
        int postotak = i.getIntExtra("postotak",0);
        String vrsta = i.getStringExtra("vrsta");

        TextView txtPostotak = findViewById(R.id.postotak);
        txtPostotak.setText("Hvala vam što ste sudjelovali u kvizu! \n\n Uspješno ste riješili "
                + String.valueOf(postotak) + " % kviza!");

        TextView txtNaputak= findViewById(R.id.naputak);

        if(vrsta == "prepoznajmo_nasilje") {
            Snackbar.make(findViewById(R.id.resultLayout), vrsta, BaseTransientBottomBar.LENGTH_LONG).show();
            if (postotak >= 80) {

                String uniqueID = UUID.randomUUID().toString();

                TextView uuid = findViewById(R.id.uuid);
                uuid.setText(uniqueID);

                txtNaputak.setText(Html.fromHtml("Molimo da napravite screenshot (uslikate zaslon mobitela) Vašeg koda i pošaljete na mail <br />" +
                        "<b>kviz2020@dansigurnijeginterneta.org</b> <br />" +
                        "i ako isti bude izvučen za neku od nagrada, " +
                        "zatražite od roditelja ili skrbnika da nas kontaktira na broj 0800 606 606"));
            } else {
                txtNaputak.setText("Žao nam je, niste uspješno riješili dovoljan postotak kviza," +
                        " ali uvijek možete ponovno probati!"); }
        } else {
            txtNaputak.setText(Html.fromHtml("Drago nam je što sudjelujete u Danu sigurnijeg interneta! Probajte ponovno ili riješite kviz 'Fake News' za " +
                    "pokušaj osvajanja nagrade."));
        }

        Button b = findViewById(R.id.pocetak);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kraj();
            }
        });
    }

    private void kraj(){
        Intent i = new Intent(this, QuizIntroActivity.class);
        startActivity(i);
        finish();
    }
}