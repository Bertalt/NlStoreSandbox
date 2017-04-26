package edu.bertalt.nlsandbox.ui.main

import edu.bertalt.nlsandbox.mvp.presenter.IBaseMvpPresenter
import edu.bertalt.nlsandbox.mvp.view.IBaseMvpView

interface MainContract {
    interface View : IBaseMvpView {

    }

    interface Presenter : IBaseMvpPresenter<View> {

    }
}