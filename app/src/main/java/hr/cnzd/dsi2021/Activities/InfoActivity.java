package hr.cnzd.dsi2021.Activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import hr.cnzd.dsi2021.Presenters.IInfoActivity;
import hr.cnzd.dsi2021.Presenters.InfoActivityPresenter;
import hr.cnzd.dsi2021.R;

public class InfoActivity extends AppCompatActivity implements IInfoActivity.View {

    private IInfoActivity.Presenter mPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        mPresenter = new InfoActivityPresenter(this);
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
        WebView webView = findViewById(R.id.webview);
        String link = mPresenter.checkStringIntentExtra(getIntent(), getIntent().getStringExtra("url"));
        mPresenter.configureWebView(webView);
        webView.loadUrl(link);
    }
}