package hr.cnzd.dsi2021.Presenters.Quiz;

import hr.cnzd.dsi2021.Presenters.CommonPresenter;

public class QuizResultPresenter extends CommonPresenter implements IQuizResult.Presenter {

    IQuizResult.View mView;

    public QuizResultPresenter(IQuizResult.View mView){
        this.mView = mView;
    }

    @Override
    public void created() {
        mView.init();
    }
}
