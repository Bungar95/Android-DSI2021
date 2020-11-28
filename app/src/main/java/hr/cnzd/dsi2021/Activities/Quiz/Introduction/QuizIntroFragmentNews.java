package hr.cnzd.dsi2021.Activities.Quiz.Introduction;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import hr.cnzd.dsi2021.Activities.Quiz.QuizFakeNewsActivity;
import hr.cnzd.dsi2021.R;

public class QuizIntroFragmentNews extends Fragment {

    private Unbinder unbinder;

    @OnClick(R.id.btnFakeNews)
    public void onClickBtnFakeNews(){
        Intent intent = new Intent(getActivity().getBaseContext(), QuizFakeNewsActivity.class);
        startActivity(intent);
    }

    public QuizIntroFragmentNews() {
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
        View fragmentView = inflater.inflate(R.layout.fragment_quiz_intro_news, container, false);
        WebView webView = fragmentView.findViewById(R.id.webViewKviz2);
        webView.loadUrl("file:///android_asset/upute_kviz__fakenews.html");
        unbinder = ButterKnife.bind(this, fragmentView);
        return fragmentView;
    }

    @Override public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}