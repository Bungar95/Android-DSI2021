package hr.cnzd.dsi2021.Activities.Quiz.Introduction;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import hr.cnzd.dsi2021.Presenters.Quiz.IQuizIntro;
import hr.cnzd.dsi2021.Presenters.Quiz.QuizIntroPresenter;
import hr.cnzd.dsi2021.R;
import hr.cnzd.dsi2021.Utilities.Adapters.QuizFragmentAdapter;

public class QuizIntroActivity extends AppCompatActivity implements IQuizIntro.View {

    IQuizIntro.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_quiz);
        mPresenter = new QuizIntroPresenter(this);
        mPresenter.created();
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
