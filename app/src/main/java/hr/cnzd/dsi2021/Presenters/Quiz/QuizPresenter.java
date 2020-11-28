package hr.cnzd.dsi2021.Presenters.Quiz;

import android.widget.Toast;

import java.util.List;

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
    public int zavrsiKviz(List<KvizPitanje> pitanja) {
        int ukupno=0;
        for(KvizPitanje p : pitanja){
            ukupno+= p.isDaniOdgovor() ? 1 : 0;
        }

        int postotak = (int)(((float) ukupno/10)*100);

        //Intent intent = new Intent(this, KvizKraj.class);
        //intent.putExtra("postotak",postotak);
        //startActivity(intent);
        //finish();
        return postotak;

    }

}
