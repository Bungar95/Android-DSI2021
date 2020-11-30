package hr.cnzd.dsi2021.Presenters.Quiz;

import android.content.Intent;

import java.util.List;

import hr.cnzd.dsi2021.Activities.Quiz.QuizResultActivity;
import hr.cnzd.dsi2021.Model.KvizPitanje;

public class QuizPresenter implements IQuizActivity.Presenter {

    private IQuizActivity.View mView;

    public QuizPresenter(IQuizActivity.View mView){
        this.mView = mView;
    }

    @Override
    public void created() {
        mView.init();
        mView.initListeners();
        mView.initPitanja();
    }

    @Override
    public boolean checkEndOfQuiz(int currentNum, int endNum) {
        if(currentNum==endNum) return true;
        else return false;
    }

    @Override
    public Intent zavrsiKviz(List<KvizPitanje> pitanja, Intent intent, String type) {
        int ukupno=0;
        for(KvizPitanje p : pitanja){
            ukupno+= p.isDaniOdgovor() ? 1 : 0;
        }

        int postotak = (int)(((float) ukupno/10)*100);
        intent.putExtra("postotak",postotak);
        intent.putExtra("kviz", type);
        return intent;
    }

}
