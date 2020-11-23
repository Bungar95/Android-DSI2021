package hr.cnzd.dsi2021.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;
import butterknife.ButterKnife;
import butterknife.OnClick;
import hr.cnzd.dsi2021.Presenters.IMainActivity;
import hr.cnzd.dsi2021.Presenters.MainActivityPresenter;
import hr.cnzd.dsi2021.R;

public class MainActivity extends AppCompatActivity {

    private IMainActivity.Presenter mPresenter;

    @OnClick({R.id.imgBtn1, R.id.imgBtn2, R.id.imgBtn4, R.id.imgBtn5})
    public void onClick(ImageButton button) {
        Intent intent = new Intent(this, InfoActivity.class);
        mPresenter.infoButtonClicked(button, intent);
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