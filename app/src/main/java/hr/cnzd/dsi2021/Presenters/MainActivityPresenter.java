package hr.cnzd.dsi2021.Presenters;

import android.content.Intent;
import android.widget.ImageButton;

import hr.cnzd.dsi2021.R;

public class MainActivityPresenter implements IMainActivity.Presenter{

    public Intent infoButtonClicked(ImageButton button, Intent intent) {

        Intent activityIntent = intent;
        switch (button.getId()){
            case R.id.imgBtn1: {
                activityIntent.putExtra("url", "file:///android_asset/prepoznajmo.html");
                break;
            }
            case R.id.imgBtn2: {
                activityIntent.putExtra("url", "file:///android_asset/sto_je_nasilje.html");
                break;
            }
            case R.id.imgBtn4: {
                activityIntent.putExtra("url", "file:///android_asset/znakovi.html");
                break;
            }
            case R.id.imgBtn5: {
                activityIntent.putExtra("url", "file:///android_asset/pomoc.html");
                break;
            }
        }
        return activityIntent;
    }
}
