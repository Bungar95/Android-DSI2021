package hr.cnzd.dsi2021.Presenters;

import android.webkit.WebView;

public interface IInfoActivity {

    interface View {
        void init();
        void initWebView(WebView webView);
        void getMainActivityIntent();
    }

    interface Presenter {
        void created();
    }

}
