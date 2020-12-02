package hr.cnzd.dsi2021.Presenters;

import android.content.Intent;

public class InfoActivityPresenter extends CommonPresenter implements IInfoActivity.Presenter {

    IInfoActivity.View mView;

    public InfoActivityPresenter(IInfoActivity.View mView){
        this.mView = mView;
    }

    @Override
    public void created() {
        mView.init();
    }
}
