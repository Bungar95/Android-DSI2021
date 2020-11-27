package hr.cnzd.dsi2021.Utilities.Adapters;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import hr.cnzd.dsi2021.Activities.Quiz.QuizIntroFragmentNasilje;
import hr.cnzd.dsi2021.Activities.Quiz.QuizIntroFragmentNews;

public class QuizFragmentAdapter extends FragmentStateAdapter {


    public QuizFragmentAdapter(@NonNull FragmentActivity fragmentActivity){
        super(fragmentActivity);

    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new QuizIntroFragmentNasilje();
            case 1:
                return new QuizIntroFragmentNews();
            default:
                return null;
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
