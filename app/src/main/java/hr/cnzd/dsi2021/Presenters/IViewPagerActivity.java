package hr.cnzd.dsi2021.Presenters;

public interface IViewPagerActivity {

    interface View {
        void init();
        void initViewPager();
        void initIndicator();
    }

    interface Presenter{
        void created();
    }
}
