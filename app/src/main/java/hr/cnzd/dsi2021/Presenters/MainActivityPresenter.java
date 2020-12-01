package hr.cnzd.dsi2021.Presenters;

import android.content.Intent;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

import hr.cnzd.dsi2021.R;

public class MainActivityPresenter implements IMainActivity.Presenter{

    public Intent mainActivityButtonClicked(ImageButton button, Intent intent) {

        List<Integer> sliderItems = new ArrayList<>();
        switch (button.getId()){
            case R.id.imgBtn1: {
                intent.putExtra("url", "file:///android_asset/prepoznajmo.html");
                break;
            }
            case R.id.imgBtn2: {
                intent.putExtra("url", "file:///android_asset/sto_je_nasilje.html");
                break;
            }
            case R.id.imgBtn3: {
                sliderItems.add(R.drawable.djeca01);
                sliderItems.add(R.drawable.djeca02);
                sliderItems.add(R.drawable.djeca03);
                sliderItems.add(R.drawable.djeca04);
                sliderItems.add(R.drawable.djeca05);
                sliderItems.add(R.drawable.djeca06);
                sliderItems.add(R.drawable.djeca07);
                sliderItems.add(R.drawable.djeca08);
                intent.putIntegerArrayListExtra("list", (ArrayList<Integer>) sliderItems);
                break;
            }
            case R.id.imgBtn4: {
                sliderItems.add(R.drawable.roditelji01);
                sliderItems.add(R.drawable.roditelji02);
                sliderItems.add(R.drawable.roditelji03);
                sliderItems.add(R.drawable.roditelji04);
                sliderItems.add(R.drawable.roditelji05);
                sliderItems.add(R.drawable.roditelji06);
                sliderItems.add(R.drawable.roditelji07);
                sliderItems.add(R.drawable.roditelji08);
                intent.putIntegerArrayListExtra("list", (ArrayList<Integer>) sliderItems);
                break;
            }
            case R.id.imgBtn5: {
                intent.putExtra("url", "file:///android_asset/znakovi.html");
                break;
            }
            case R.id.imgBtn6: {
                intent.putExtra("url", "file:///android_asset/pomoc.html");
                break;
            }
        }
        return intent;
    }
}
