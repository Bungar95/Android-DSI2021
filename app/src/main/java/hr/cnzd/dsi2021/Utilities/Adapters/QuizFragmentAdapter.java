package hr.cnzd.dsi2021.Utilities.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import hr.cnzd.dsi2021.Activities.Quiz.Introduction.QuizIntroFragmentNasilje;
import hr.cnzd.dsi2021.Activities.Quiz.Introduction.QuizIntroFragmentNews;

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
