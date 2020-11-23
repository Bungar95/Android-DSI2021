package hr.cnzd.dsi2021.Presenters;

public interface IInfoActivity {

    interface View {
        void init();
        void initWebview();
        void getMainActivityIntent();
    }

    interface Presenter {
        void created();
    }

}
