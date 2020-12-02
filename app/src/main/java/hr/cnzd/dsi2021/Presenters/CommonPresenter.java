package hr.cnzd.dsi2021.Presenters;

import android.content.Intent;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CommonPresenter {

    public void configureWebView(WebView webView){
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setAllowContentAccess(true);
        webView.getSettings().setAllowFileAccessFromFileURLs(true);
        webView.getSettings().setAllowUniversalAccessFromFileURLs(true);
    }

    public String stringTestRetrieveExtra(Intent intent, String extraName) {
        String extraValue = "";
        if (intent != null && extraName != null) {
             extraValue = extraName;
            Log.d("Intent ----->", "RADI: "+extraValue);
        }else{
            Log.d("Link ----->", "NE RADI");
        }
        return extraValue;
    }

    public int intTestRetrieveExtra(Intent intent, int extraName) {
        int extraValue = 0;
        if (intent != null && extraName != 0) {
            extraValue = extraName;
            Log.d("Link ----->", "RADI: "+extraValue);
        }else{
            Log.d("Link ----->", "NE RADI ILI VRAĆA 0");
        }
        return extraValue;
    }

}
