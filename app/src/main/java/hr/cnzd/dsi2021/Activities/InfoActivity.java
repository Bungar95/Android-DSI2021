package hr.cnzd.dsi2021.Activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import hr.cnzd.dsi2021.Presenters.IInfoActivity;
import hr.cnzd.dsi2021.Presenters.InfoActivityPresenter;
import hr.cnzd.dsi2021.R;

public class InfoActivity extends AppCompatActivity implements IInfoActivity.View {

    private IInfoActivity.Presenter mPresenter;
    private String link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        mPresenter = new InfoActivityPresenter(this);
        mPresenter.created();
    }

    @Override
    public void init() {
        WebView webView = findViewById(R.id.webview);
        mPresenter.configureWebView(webView);
        getMainActivityIntent();
        webView.loadUrl(link);
    }

    @Override
    public void getMainActivityIntent() {
        if(getIntent() != null && getIntent().getStringExtra("url") != null) {
            link = getIntent().getStringExtra("url");
            Log.i("radi", getIntent().getStringExtra("url"));
        }
    }
}
