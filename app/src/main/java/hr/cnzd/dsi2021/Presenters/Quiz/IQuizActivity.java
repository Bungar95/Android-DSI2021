package hr.cnzd.dsi2021.Presenters.Quiz;

public interface IQuizActivity {

    interface View{
        void init();
        void initListeners();
        void initPitanja();
    }

    interface Presenter {
        void created();
        void daniOdgovor();
        void ucitajPitanje();
        void zavrsiKviz();
    }
}
