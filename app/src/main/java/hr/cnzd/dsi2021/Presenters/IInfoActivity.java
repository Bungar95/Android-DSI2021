package hr.cnzd.dsi2021.Presenters;

import android.content.Intent;
import android.webkit.WebView;

public interface IInfoActivity {

    interface View {
        void init();
    }

    interface Presenter {
        void created();
        void configureWebView(WebView webView);
        String checkStringIntentExtra(Intent intent, String extraName);
    }

}
