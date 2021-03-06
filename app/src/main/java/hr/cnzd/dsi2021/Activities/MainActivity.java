package hr.cnzd.dsi2021.Activities;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import butterknife.ButterKnife;
import butterknife.OnClick;
import hr.cnzd.dsi2021.Activities.Quiz.Introduction.QuizIntroActivity;
import hr.cnzd.dsi2021.Presenters.IMainActivity;
import hr.cnzd.dsi2021.Presenters.MainActivityPresenter;
import hr.cnzd.dsi2021.R;

public class MainActivity extends AppCompatActivity {

    private IMainActivity.Presenter mPresenter;

    @OnClick({R.id.imgBtn1, R.id.imgBtn2, R.id.imgBtn5, R.id.imgBtn6})
    public void onClick(ImageButton button) {
        Intent intent = new Intent(this, InfoActivity.class);
        mPresenter.mainActivityButtonClicked(button, intent);
        startActivity(intent);
    }

    @OnClick({R.id.imgBtn3, R.id.imgBtn4})
    public void onClick2(ImageButton button){
        Intent intent = new Intent(this, ViewPagerActivity.class);
        mPresenter.mainActivityButtonClicked(button, intent);
        startActivity(intent);
    }

    @OnClick(R.id.imgBtn7)
    public void onClick3(){
        Intent intent = new Intent(this, QuizIntroActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new MainActivityPresenter();
        ButterKnife.bind(this);
    }
}