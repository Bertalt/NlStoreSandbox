package edu.bertalt.nlsandbox.mvp.presenter

import edu.bertalt.nlsandbox.mvp.view.IBaseMvpView


interface IBaseMvpPresenter<in V : IBaseMvpView> {

    fun attachView(view: V)
    fun detachView()
}