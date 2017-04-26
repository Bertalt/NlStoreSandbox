package edu.bertalt.nlsandbox.ui.auth

import edu.bertalt.nlsandbox.mvp.presenter.BaseMvpPresenter

class AuthPresenter : BaseMvpPresenter<AuthContract.View>(),
        AuthContract.Presenter {
    override fun requestAuth(email: String, password: String) {
        mView?.goOnMainScreen()
    }
}