package hr.cnzd.dsi2021.Presenters.Quiz;

import android.content.Intent;

import java.util.List;

import hr.cnzd.dsi2021.Model.KvizPitanje;

public interface IQuizActivity {

    interface View{
        void init();
        void initListeners();
        void initPitanja();
        void ucitajPitanje();
    }

    interface Presenter {
        void created();
    }
}
