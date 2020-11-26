package hr.cnzd.dsi2021.Presenters.Quiz;

import android.content.Intent;

public interface IQuizIntro {

    interface View{

    }

    interface Presenter{
        void checkQuizIntent(Intent intent);
    }
}
