package hr.cnzd.dsi2021.Presenters.Quiz;

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

}
