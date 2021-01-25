package hr.cnzd.dsi2021.Presenters.Quiz;

import android.content.Intent;

public interface IQuizResult {

    interface View{
        void init();
        void setResultText(int postotak, String kviz, String vrsta);
    }
    interface Presenter{
        void created();
        int intTestRetrieveExtra(Intent intent, int extraName);
        String stringTestRetrieveExtra(Intent intent, String extraName);
    }
}
