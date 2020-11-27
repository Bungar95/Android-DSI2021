package hr.cnzd.dsi2021.Presenters.Quiz;

public class QuizPresenter implements IQuizActivity.Presenter {

    private IQuizActivity.View mView;

    public void QuizPresenter(IQuizActivity.View mView){
        this.mView = mView;
    }

    @Override
    public void created() {
        mView.init();
    }

    @Override
    public void daniOdgovor() {

    }

    @Override
    public void ucitajPitanje() {

    }

    @Override
    public void zavrsiKviz() {

    }

}
