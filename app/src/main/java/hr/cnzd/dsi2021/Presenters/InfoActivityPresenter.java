package hr.cnzd.dsi2021.Presenters;

public class InfoActivityPresenter implements IInfoActivity.Presenter {

    IInfoActivity.View mView;

    public InfoActivityPresenter(IInfoActivity.View mView){
        this.mView = mView;
    }

    @Override
    public void created() {
        mView.init();
    }
}
