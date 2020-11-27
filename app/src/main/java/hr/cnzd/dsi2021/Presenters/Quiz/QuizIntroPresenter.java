package hr.cnzd.dsi2021.Presenters.Quiz;

import hr.cnzd.dsi2021.Presenters.CommonPresenter;

public class QuizIntroPresenter extends CommonPresenter implements IQuizIntro.Presenter{

    IQuizIntro.View mView;

    public QuizIntroPresenter (IQuizIntro.View mView){
        this.mView = mView;
    }

    @Override
    public void created() {
        mView.initFragmentsAndTabLayout();
    }
}
