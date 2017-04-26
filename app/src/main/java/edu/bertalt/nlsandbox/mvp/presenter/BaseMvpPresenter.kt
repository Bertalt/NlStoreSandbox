package edu.bertalt.nlsandbox.mvp.presenter

import edu.bertalt.nlsandbox.mvp.view.IBaseMvpView


open class BaseMvpPresenter<V : IBaseMvpView> : IBaseMvpPresenter<V> {

    protected var mView: V? = null

    override fun attachView(view: V) {
        mView = view
    }

    override fun detachView() {
        mView = null
    }
}