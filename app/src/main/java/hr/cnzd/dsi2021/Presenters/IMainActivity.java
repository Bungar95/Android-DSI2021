package hr.cnzd.dsi2021.Presenters;

import android.content.Intent;
import android.widget.ImageButton;

public interface IMainActivity {

    interface Presenter{
        Intent infoButtonClicked(ImageButton button, Intent intent);
        Intent viewPagerButtonClicked(ImageButton button, Intent intent);
    }
}
