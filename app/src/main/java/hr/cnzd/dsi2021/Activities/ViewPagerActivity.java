package hr.cnzd.dsi2021.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import hr.cnzd.dsi2021.R;
import hr.cnzd.dsi2021.Utilities.Adapters.ViewPagerAdapter;

public class ViewPagerActivity extends AppCompatActivity {

    List<Integer> sliderItems = new ArrayList<>();
    private ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        sliderItems = getIntent().getIntegerArrayListExtra("list");

        viewPager2 = findViewById(R.id.view_pager2);
        viewPager2.setAdapter(new ViewPagerAdapter(sliderItems, this));
    }
}