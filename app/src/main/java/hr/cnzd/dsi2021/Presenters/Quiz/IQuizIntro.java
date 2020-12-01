package hr.cnzd.dsi2021.Presenters.Quiz;

import android.content.Intent;
import android.webkit.WebView;

public interface IQuizIntro {

    interface View{
        void init();
        void initFragmentsAndTabLayout();
    }

    interface Presenter{
        void created();
        void configureWebView(WebView webView);
    }
}
