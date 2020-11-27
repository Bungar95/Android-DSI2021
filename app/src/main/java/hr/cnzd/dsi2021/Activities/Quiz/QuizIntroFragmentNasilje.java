package hr.cnzd.dsi2021.Activities.Quiz;

import android.content.Intent;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import hr.cnzd.dsi2021.Activities.InfoActivity;
import hr.cnzd.dsi2021.Presenters.Quiz.IQuizIntro;
import hr.cnzd.dsi2021.R;

public class QuizIntroFragmentNasilje extends Fragment {

    private Unbinder unbinder;
    @OnClick(R.id.btnNasiljeOsnovna)
    public void onClickBtnNasiljeOsnovna(){
        Intent intent = new Intent(getActivity().getBaseContext(), QuizNasiljeActivity.class);
        intent.putExtra("vrsta", "razredna");
        startActivity(intent);
    }
    @OnClick(R.id.btnNasiljeSrednja)
    public void onClickBtnNasiljeSrednja(){
        Intent intent = new Intent(getActivity().getBaseContext(), QuizNasiljeActivity.class);
        intent.putExtra("vrsta", "stariji");
        startActivity(intent);
    }

    public QuizIntroFragmentNasilje() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragmentView = inflater.inflate(R.layout.fragment_quiz_intro_nasilje, container, false);
        WebView webView = fragmentView.findViewById(R.id.webViewKviz1);
        webView.loadUrl("file:///android_asset/upute_kviz__nasilje.html");
        unbinder = ButterKnife.bind(this, fragmentView);
        return fragmentView;
    }

    @Override public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}