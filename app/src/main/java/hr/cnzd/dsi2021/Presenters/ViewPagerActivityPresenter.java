package hr.cnzd.dsi2021.Presenters;

import android.view.View;

public class ViewPagerActivityPresenter implements IViewPagerActivity.Presenter {

    IViewPagerActivity.View mView;

    public ViewPagerActivityPresenter (IViewPagerActivity.View mView) {
        this.mView = mView;
    }

    @Override
    public void created() {
        mView.init();
    }
}
