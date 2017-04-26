package edu.bertalt.nlsandbox.ui.auth

import edu.bertalt.nlsandbox.mvp.presenter.IBaseMvpPresenter
import edu.bertalt.nlsandbox.mvp.view.IBaseMvpView


interface AuthContract {
    interface View : IBaseMvpView {
        fun toggleAuth()
        fun goOnMainScreen()
    }

    interface Presenter : IBaseMvpPresenter<View> {
        fun requestAuth(email: String, password: String)

    }
}