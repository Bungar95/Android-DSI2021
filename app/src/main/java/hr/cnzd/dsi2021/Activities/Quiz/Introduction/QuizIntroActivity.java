package hr.cnzd.dsi2021.Activities.Quiz.Introduction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import hr.cnzd.dsi2021.Activities.MainActivity;
import hr.cnzd.dsi2021.Presenters.Quiz.IQuizIntro;
import hr.cnzd.dsi2021.Presenters.Quiz.QuizIntroPresenter;
import hr.cnzd.dsi2021.R;
import hr.cnzd.dsi2021.Utilities.Adapters.QuizFragmentAdapter;

public class QuizIntroActivity extends AppCompatActivity implements IQuizIntro.View {

    IQuizIntro.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_intro_quiz);
        } catch (Exception e) {
            if (e.getMessage() != null && e.getMessage().contains("webview")) {
                Log.d("QuizIntroActivity", "Ne radi, preskačemo");
                Intent i = new Intent(this, MainActivity.class);
                Toast.makeText(this, "Dogodila se greška, vraćamo na glavni izbornik", Toast.LENGTH_LONG).show();
                startActivity(i);
                finish();
            }
        }
        mPresenter = new QuizIntroPresenter(this);
        mPresenter.created();
    }

    @Override
    public void init() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_baseline_chevron_left_24));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void initFragmentsAndTabLayout() {
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager2 viewPager2 = findViewById(R.id.quizViewPager);
        viewPager2.setAdapter(new QuizFragmentAdapter(this));

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(
                tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch (position){
                    case 0: {
                        tab.setText("Prepoznajmo nasilje");
                        break;
                    }
                    case 1: {
                        tab.setText("'Fake news'");
                        break;
                    }
                }
            }
        }
        );
        tabLayoutMediator.attach();
    }
}
