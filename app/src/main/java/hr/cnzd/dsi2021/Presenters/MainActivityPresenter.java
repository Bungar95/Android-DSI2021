package hr.cnzd.dsi2021.Presenters;

import android.content.Intent;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

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
            case R.id.imgBtn5: {
                activityIntent.putExtra("url", "file:///android_asset/znakovi.html");
                break;
            }
            case R.id.imgBtn6: {
                activityIntent.putExtra("url", "file:///android_asset/pomoc.html");
                break;
            }
        }
        return activityIntent;
    }

    @Override
    public Intent viewPagerButtonClicked(ImageButton button, Intent intent) {
        Intent activityIntent = intent;
        List<Integer> sliderItems = new ArrayList<>();
        switch (button.getId()) {
            case R.id.imgBtn3: {
                sliderItems.add(R.drawable.djeca01);
                sliderItems.add(R.drawable.djeca02);
                sliderItems.add(R.drawable.djeca03);
                sliderItems.add(R.drawable.djeca04);
                activityIntent.putIntegerArrayListExtra("list", (ArrayList<Integer>) sliderItems);
                break;
            }
            case R.id.imgBtn4: {
                sliderItems.add(R.drawable.roditelji01);
                sliderItems.add(R.drawable.roditelji02);
                sliderItems.add(R.drawable.roditelji03);
                sliderItems.add(R.drawable.roditelji04);
                activityIntent.putIntegerArrayListExtra("list", (ArrayList<Integer>) sliderItems);
                break;
            }
        }
        return activityIntent;
    }
}
